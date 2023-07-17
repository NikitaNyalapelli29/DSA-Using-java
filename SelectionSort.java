import java.util.*;
public class SelectionSort{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
    int n = sc.nextInt();
    
    int arr[] = new int[n];
    // taking values from input
    System.out.printf("Enter %d values: ", n);
    for(int i =0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    
    // selection sorting
    for(int i =0; i<arr.length-1; i++){
      int minPosition =i;
      for(int j=i+1; j<arr.length; j++){
        if(arr[minPosition]>arr[j]){
          minPosition = j;
        }
      }
      int temp = arr[minPosition];
      arr[minPosition] = arr[i];
      arr[i] = temp;
    }
    System.out.print("Sorted Array is: ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
  }
}
