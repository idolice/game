import java.util.Random;

/**
 * Created by idolice on 15-11-21.
 */
public class GenerateNumber {

    public static String produce_random() {
            Random first_ram=new Random();
            String random_string="";
            int[] random_num=new int[4];
            for (int i=0;i<4;i++)
            {
                random_num[i]=first_ram.nextInt(9);
                int j=i;
                while(j--!=0)
                {
                    if (random_num[i]==random_num[j])
                    {
                        i--;
                    }
                }

            }

            for (int i=0;i<4;i++)
            {
                random_string = random_string + random_num[i];
            }

       return random_string;
    }
}
