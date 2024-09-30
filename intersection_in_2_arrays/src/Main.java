import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> arr3=new ArrayList<>();


        System.out.println("enter the size of the first array");
        int size1=sc.nextInt();
        for(int i=0;i<size1;i++)
        {
            System.out.println("enter the elemnt");
            int ele=sc.nextInt();
            arr1.add(ele);
        }

        System.out.println("enter the size of the second array");
        int size2=sc.nextInt();
        for(int i=0;i<size2;i++)
        {
            System.out.println("enter the elemnt");
            int ele=sc.nextInt();
            arr2.add(ele);
        }

        System.out.println("the first array is "+ arr1);
        System.out.println("the second array is "+ arr2);
        System.out.println();

        for(int i:arr1)
        {
            if(arr2.contains(i))
            {
                arr3.add(i);
            }
        }
        System.out.println("the intersection points are "+ arr3);

    }
}