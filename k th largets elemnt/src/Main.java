import java.sql.Array;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            System.out.println("enter elements");
            int ele=sc.nextInt();
            arr.add(ele);
        }
        System.out.println("enter the k");
        int k=sc.nextInt();




        for(int i=0; i<size;i++)
        {
            for (int j = 0; j < size - 1 - i; j++)
            {
                if (arr.get(j) < arr.get(j + 1))
                {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);

                }
            }
        }


        ArrayList<Integer> new_arr=new ArrayList<>();
        for(int i : arr)
        {
            if (! new_arr.contains(i))
            {
                new_arr.add(i);
            }

        }


        System.out.println(new_arr);

        System.out.println("the "+ k + "th largest element in the array list is");
        System.out.println(new_arr.get(k-1));

    }
}