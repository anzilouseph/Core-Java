import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();    // for hectrogenious arraylist =>  ArrayList<object> arr-new ArrayList,.();
        for(int i=0;i<size;i++)
        {
            System.out.println("enter the "+ i + "th element");
            int ele=sc.nextInt();
            arr.add(ele);
        }
        System.out.println(arr);


        System.out.println(arr.get(3));   // to acess the element in a particular index


        arr.set(1,100);   //to change or modify value in a particualr index
        System.out.println(arr);


        arr.remove(1);
        System.out.println(arr);  //to reove a vaue at a particluar index


        System.out.println(arr.indexOf(35));  //to get the index of an element



        System.out.println(arr.contains(12));  //to check if an object is present in the array or not


        System.out.println(arr.size()); //return the size of the array


        System.out.println(arr.isEmpty());  //return true or false if the list is empty



        arr.clear();   //clears the list

    }
}