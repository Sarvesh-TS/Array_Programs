//Count even and odd numbers in an array.
class EvenOddArray {
    public static void main(String[] args) {
        int a[]= {10,20,30,40,50};
        
        int even = 0;
        int odd = 0;
        
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Total even numbers:"+even);
        System.out.println("Total odd numbers:"+odd);
    }
}
