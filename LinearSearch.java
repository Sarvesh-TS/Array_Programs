//Search an element in an array (Linear search)
import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a[] = {40,10,20,18,15};
        System.out.println("Enter the target value:");
        
        int target = sc.nextInt();
        
        boolean found = false;
        
        for(int i=0; i<a.length;i++){
            if(a[i]==target){
                System.out.println("Element found at index:"+i);
                found = true;
                break;
            }
        }
        
        if(!found){
            System.out.println("Element not found");
        }
    }      
}
