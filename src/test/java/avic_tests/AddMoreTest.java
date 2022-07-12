package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddMoreTest extends BaseTest{

    private  static final String SEARCH_KEYWORD = "macbook";


    @Test
    public void addMore(){
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        int count = getHomePage().addMoreElements(SEARCH_KEYWORD);
        Assert.assertEquals(count, 12);

    }
}
