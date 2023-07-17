import java.util.*;
public class BubbleSort{
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
    
    // Bubble sorting
    for(int i =0; i<arr.length-1; i++){
      for(int j = 0; j<arr.length-i; j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
    }
    System.out.print("Sorted Array is: ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
  }
}
}
