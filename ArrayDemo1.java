
class ArrayDemo1
{
    public static void main(String A[])
    {
        int arr1[] ={10,20,30,40};    //static
        
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1.length);

        int arr2[] = new int[4];     //dynamic memory allocation
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;

        System.out.println(arr2.length);

    }
}