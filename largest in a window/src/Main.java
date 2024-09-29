import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static  void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
//        int[] arr=new int[size];
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> new_arr=new ArrayList<>();

        for(int i=0;i<size;i++)
        {
            System.out.println("enter the element in the "+i+"th postion");
            int ele=sc.nextInt();
//            arr[i]=ele;
            arr.add(ele);
//            System.out.println(arr[ele]);
        }

        System.out.println("enter the window size to find the largest");
        int k=sc.nextInt();
        for(int i=0;i<=size-k;i++)
        {
            int temp=arr.get(i);
            for(int j=i;j<i+k;j++)
            {
//                temp=arr.get(j);
                if(arr.get(j)>temp)
                {
                    temp=arr.get(j);
                }
            }
            new_arr.add(temp);
        }


        System.out.println(new_arr);

    }

}