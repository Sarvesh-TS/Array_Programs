//Print elements at odd indices in an array.
class OddIndices {
    public static void main(String[] args) {
        int a[]= {10,20,30,40,50};
        
        System.out.println("Element at even indices:");
        
        for(int i=1;i<a.length;i+=2){
            System.out.println("odd indicess:"+a[i]);
        }
    }
}
