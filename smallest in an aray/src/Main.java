import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();

//        int array[] = new
//        for(int i=0;i<n;++i)
//        {
//            System.out.println("enter the " + i +"th element of the array");
//            int ele=sc.nextInt();
//        }

        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;++i)
        {
            System.out.println("enter the " + i +"th element of the array");
            int ele=sc.nextInt();
            arr.add(ele);
        }

        System.out.println(arr);
        for(int i : arr)
        {
            System.out.println(i);
        }
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr.get(j)>arr.get(j+1))
                {
                    int temp=arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);

                }
            }
        }
        System.out.println();
        System.out.println(arr.get(0));

    }

}