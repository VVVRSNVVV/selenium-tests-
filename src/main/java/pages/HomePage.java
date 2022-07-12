package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage{

    private static final String SEARCH_INPUT = "//input[@id='input_search']";
    private static final String SEARCH_BUTTON = "//button[@class='button-reset search-btn']";
    //2
    private static final String ADD_MORE_ELEMENTS =    "//a[@class='btn-see-more js_show_more']" ;
    private static final String ELEM_LIST =    "//div[@class='prod-cart__descr']" ;
    //3
    private static final String LOGIND_INPUT =    "//input[@placeholder='Ваше имя']" ;
    private static final String PASSWORD_INPUT =   "//input[@placeholder='Ваш email']" ;
    private static final String LOGIN_CLICK =   "//button[@class='button-reset main-btn main-btn--green']" ;
    private static final String LOGIN_CHECK =   "//div[@class='ttl js_title']" ;




    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void searchByKeyword(final String keyword){
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyword);
        driver.findElement(By.xpath(SEARCH_BUTTON)).click();
    }

    // test 2
    public int addMoreElements(final String keyword){
        driver.findElement(By.xpath(ADD_MORE_ELEMENTS)).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyword);
        List<WebElement> elementsList = driver.findElements(By.xpath(ELEM_LIST));
        int count = elementsList.size();
        return count;
    }
    public String login(final String log,final String pass){
        driver.findElement(By.xpath(LOGIND_INPUT)).sendKeys(log);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(PASSWORD_INPUT)).sendKeys(pass);
        driver.findElement(By.xpath(LOGIN_CLICK)).click();
        return driver.findElement(By.xpath(LOGIN_CHECK)).getText();


    }
}
