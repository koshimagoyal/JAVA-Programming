class ArrayFunc {

    public static void main(String[] args)
    {
        int A[] ={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
        int min=A[0],sum=0,avg=0;
        System.out.print("The array elements are");
        for(int i=0;i<18;i++)
        {
            System.out.print(" "+A[i]);
        }
        for(int i=0;i<15;i++)
        {
            sum+=A[i];
            if(A[i]<min)
                min=A[i];
        }
        avg=sum/14;
        A[15] = sum;
        A[16] = avg;
        A[17] = min;
        System.out.println();
        System.out.print("New array elements are");
        for(int i=0;i<18;i++)
        {
            System.out.print(" "+A[i]);
        }
    }
}
