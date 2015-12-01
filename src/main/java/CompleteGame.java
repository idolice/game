
import java.util.Scanner;

/**
 * Created by idolice on 15-11-24.
 */
public class CompleteGame
{
    public static void main(String[] args)
    {
        int taotal_chance=6;
        String output_words="input your number";
        String randomnum=GenerateNumber.produce_random();
        System.out.print(randomnum);
        System.out.print(output_words+"("+taotal_chance+")");

        while(taotal_chance!=0)
        {
            Scanner s=new Scanner(System.in);
            String input_num=s.nextLine();
            String compare_result=Game.compare(randomnum,input_num);
            int output_result=OutputResult.if_getresult_right(compare_result);
            if (output_result==1)
            {
                System.out.print("congraduation!");

            }
            else if (output_result==0)
            {
                taotal_chance--;
                System.out.print(compare_result);
                System.out.print("input your number"+"("+taotal_chance+")");
            }
        }
        System.out.print("You Failed");





    }
}
