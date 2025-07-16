//Copy an array.
public class CopyArray{
    public static void main(String[] args){
    
        int original[] = {10,20,30,40,50};
        
        System.out.print("Original array: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        int copy[] =new int[original.length];
        
        for(int i=0;i<original.length;i++){
            copy[i] = original[i];
        }
        System.out.println();
        System.out.println("Copied array:");
        for(int i=0; i<copy.length;i++){
            System.out.print(copy[i]+" ");
        }
    }
}
