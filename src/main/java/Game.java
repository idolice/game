import java.util.Random;

/**
 * Created by idolice on 15-11-21.
 */
public class Game {

    public static String compare(String number, String input) {
        int number_of_A=0;
        int number_of_B=0;
        String result_string=null;
        if (input == number)
        {
            return "4A0B";
        }
        for(int len=0;len<4;len++)
        {
            if(number.charAt(len)==input.charAt(len))
            {
                number_of_A++;
            }
        }
        result_string=number_of_A+"A";
        for(int first_cycle=0;first_cycle<4;first_cycle++)
            for(int second_cycle=0;second_cycle<4;second_cycle++)
            {
                if(number.charAt(first_cycle)==input.charAt(second_cycle))
                {
                    number_of_B++;
                }
            }
        result_string=result_string+number_of_B;
        result_string=result_string+"B";
        return  result_string;


    }
}
