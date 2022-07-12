package avic_tests;

import org.testng.annotations.Test;

public class LogginTest extends BaseTest{
    private static final String login = "MyName";
    private static final String password = "MyName@gmail.com";
    @Test
    public void logging(){
        System.out.println( getHomePage().login(login, password) );

    }
}
