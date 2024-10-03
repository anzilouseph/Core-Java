import javax.swing.table.TableRowSorter;
import java.util.Scanner;

public class Main
{
    public static boolean perfect(int leng)
    {
        int sum=0;
        int k=leng;
        for(int i=1;i<k;++i)
        {
            if (k%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==leng)
        {
            return (false);
        }
        else
        {
            return (true);

        }

    }

    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to check the length od that string is a perfect or not");
        String s=sc.nextLine();
        int leng;
        leng=s.length();
//        System.out.println(leng);
        while (perfect(leng))
        {
            s+="*";
            leng=leng+1;
            perfect(leng);
        }
        System.out.println(s);
        System.out.println(s.length());
//        int sum= perfect(leng);
//
//        if(sum==leng)
//        {
//            System.out.println(s);
//        }
//        else
//        {
//            s+="*";
//            leng+=1;
//            sum=perfect(leng);
//        }


    }
}