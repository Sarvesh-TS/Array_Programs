//Input and output elements of an array.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("Array elements:");
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
