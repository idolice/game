import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class GameText {
    @Test
    public void should_return4A0B_when_two_number_equal() throws Exception {
        //given
        String number = "1234";
        String input = "1234";

        //when
        String output = Game.compare(number, input);

        //then
        assertThat(output, equalTo("4A0B"));

    }
    @Test
    public void should_return_0A0B_when_two_number_have_no_number_equal() throws Exception{
        //given
        String number="1234";
        String input="5678";

        //when
        String output = Game.compare(number, input);

        //then
        assertThat(output, equalTo("0A0B"));
    }
    @Test
    public void should_return_2A2B_when_two_number_have_some_number_equal() throws Exception{
        //given
        String number="1234";
        String input="1243";

        //when
        String output = Game.compare(number, input);

        //then
        assertThat(output, equalTo("2A2B"));
    }
    @Test
    public void should_return_0A4B_when_two_number_have_same_number_in_wrong_place() throws Exception{
        //given
        String number="1234";
        String input="4321";

        //when
        String output = Game.compare(number, input);

        //then
        assertThat(output, equalTo("0A4B"));
    }



}
