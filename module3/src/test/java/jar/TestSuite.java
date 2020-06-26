package jar;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    TestTimeConversionParameterized.class,
    TestTimeConversionNotParameterized.class
 
})

public class TestSuite {
}  	
