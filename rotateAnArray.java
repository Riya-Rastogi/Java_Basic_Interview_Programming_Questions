public class rotateAnArray {
    static void RightRotate(int array[],int n ,int k)
    {
        k=k%n;
        for(int i=0;i<n;i++)
        {
            if(i<k)
            {
                System.out.print(array[n+i-k]+" ");
            }else{
                System.out.print(array[i-k]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int N=array.length;
        int k=2;
        RightRotate(array, N, k);
    }
    
}
