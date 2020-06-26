package jar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestTimeConversionNotParameterized extends TimeConversion{
    
    @Test
    public void timeConversionShouldReturnMessageForInvalidInput()
    {
         //Arrange
        
        String time = "13:27 PM";
        String expectedMessage = " Entered time is not valid. Please enter a valid 12 hour clock format";
        
        //Act
        String actual = timeConversion(time);
        
        //Assert
        assertEquals(expectedMessage, actual);
    } 
}
