import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by idolice on 15-11-23.
 */
public class OutputResultText
{
    @Test
    public void should_return_congraduation_when_result_right()
    {
      //given
      String right_result="4A0B";

      //when
      int outputstring=OutputResult.if_getresult_right(right_result);

      //then
      assertThat(outputstring,equalTo(1));
      }
    @Test
    public void should_return_exact_AB_when_result_wrong()
    {
      //given
      String wrong_result="2A2B";

      //when
      int outputstring=OutputResult.if_getresult_right(wrong_result);

      //then
        assertThat(outputstring,equalTo(0));
      }

}
