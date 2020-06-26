package jar;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestTimeConversionParameterized extends TimeConversion{
    private String inputTime;
    private String expectedTime;

   public TestTimeConversionParameterized(String inputTime, String expectedTime){
        this.inputTime = inputTime;
        this.expectedTime = expectedTime;
    }

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {"09:23 pm","21:23"},
            {"12:00 pm","12:00"},
            {"12:00 am","00:00"},
            {"11:59 am","11:59"},
            {"11:59 pm","23:59"},
            {"01:35 pm","13:35"}

        });
    }
    
    @Test
    public void timeConversionShouldReturnExpectedTime(){
        assertEquals(expectedTime,TimeConversion.timeConversion(inputTime));
    }

   
}