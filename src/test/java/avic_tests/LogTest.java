package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LogTest extends BaseTest{

    private  static final String log = "MyName";
    private  static final String pass = "MyName@gmail.com";

    @Test
    public void logCheck(String log, String pass){
        System.out.println(log+ pass);
    }
}
