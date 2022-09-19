package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest 
{
    @Test
    public void Demo()
    {
    	Reporter.log("This is Demo",true);
    }
    
    @ Test
    public void demoRegression()
    {
    	Reporter.log("This is DemoRegression",true);
    }
}
