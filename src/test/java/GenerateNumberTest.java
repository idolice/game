import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by idolice on 15-11-24.
 */
public class GenerateNumberTest
{
    @Test
    public void should_be_4_number()
    {
      //given


      //when
      String resultnum=GenerateNumber.produce_random();
        int len=resultnum.length();

      //then
        assertThat(len,equalTo(4));
      }
}
