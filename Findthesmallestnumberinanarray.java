import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=scan.nextInt();
        System.out.println("Enter the elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The smallest element in the array is :"+arr[0]);
    }
}
