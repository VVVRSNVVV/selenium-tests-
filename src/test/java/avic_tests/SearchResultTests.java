package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultTests extends BaseTest{

    private  static final String SEARCH_KEYWORD = "macbook";
    private  static final String EXPECTED_KEYWORD = "mac";

    @Test
    public void CheckThatURL(){
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_KEYWORD));
    }
}
