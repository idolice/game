import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by idolice on 15-11-24.
 */
public class InputStringTest
{
   @Test
   public void num_of_number_should_be_4()
   {
     //given


     //when
     String inp=InputString.getinput();
       int num=inp.length();
     //then
       assertThat(num,equalTo(4));
     }
}
