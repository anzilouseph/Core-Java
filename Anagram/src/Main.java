import java.util.Scanner;
public class Main
{


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to check it is anagram or not");
        String word=sc.nextLine();
        String new_word="";
        int size=word.length();
        for(int i=size-1;i>-1;--i)
        {
            new_word+=word.charAt(i);
;
        }
        if(new_word.equals(word))
        {
            System.out.println("anagaram");
        }
        else {
            System.out.println("not anagaram");
        }



    }


}