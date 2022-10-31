package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.MyReusableMethods;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static utilities.Driver.getDriver;
import static utilities.MyReusableMethods.*;

public class JaguarUIPage {

    public JaguarUIPage() {
        PageFactory.initElements(getDriver(), this);
    }

    static Actions action = new Actions(getDriver());

    @FindBy(xpath = "//*[@class='navigation__title-holder']")
    public List<WebElement> sevenHeaders;

    @FindBy(xpath = "//*[@class='navigation__item'][2]")
    public WebElement brandServiceButton;

    @FindBy(xpath = "//*[@class='navigation__mega-left']")
    public List<WebElement> brandService;

    @FindBy(xpath = "//*[@class='navigation__item'][7]")
    public WebElement newsMediaButton;

    @FindBy(xpath = "(//*[@href='https://twitter.com/JLR_News'])[2]")
    public WebElement twitterButton;

    @FindBy(xpath = "(//*[@class='css-901oao css-16my406 css-1hf3ou5 r-poiln3 r-a023e6 r-rjixqe r-bcqeeo r-qvutc0'])[3]")
    public WebElement twitterCookies;

    @FindBy(xpath = "(//*[@href='/search/news'])[2]")
    public WebElement newsButton;

    @FindBy(xpath = "//*[@href='/contact-us']")
    public WebElement contactUsButton;


    public void homepage() {
        getDriver().get(ConfigurationReader.getProperty("jaguarUrl"));
    }

    public void homepageIsDisplayed() throws IOException {
        String expectedResult = "https://www.jaguarlandrover.com";
        String actualResult = getDriver().getCurrentUrl();
        assertEquals(expectedResult, actualResult);

        MyReusableMethods.getScreenshot("homepage");
    }

    public void sevenMainHeadersDisplay() {

        for (WebElement w : sevenHeaders
        ) {
            Assert.assertTrue(w.isDisplayed());
            System.out.println(w.getText());
        }
    }

    public void sevenMainHeadersClickable() {

        for (WebElement w : sevenHeaders
        ) {
            Assert.assertTrue(w.isEnabled());
        }
    }

    public void brandsServicesMenu() {
        action.clickAndHold(brandServiceButton).perform();

    }

    public void brandServiceOptions() {

        for (WebElement w : brandService
        ) {
            Assert.assertTrue(w.isEnabled());
        }
    }

    public void newsMediaMenu() {
        action.clickAndHold(newsMediaButton).perform();
    }

    public void clickTwitterButton() {
        twitterButton.click();
        waitFor(2);
    }

    public void twitterPageDisplayed() throws IOException {
        String expectedResult = "https://twitter.com/JLR_News";
        String actualResult = getDriver().getCurrentUrl();
        assertEquals(expectedResult, actualResult);

        twitterCookies.click();
        MyReusableMethods.getScreenshot("twitterPage");
    }

    public void scrollHomePage() {
        waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,2750)");
    }

    public void clickNewsButton() {
        waitFor(2);
        newsButton.click();
    }

    public void newsPageDisplayed() throws IOException {
        String expectedResult = "https://www.jaguarlandrover.com/search/news";
        String actualResult = getDriver().getCurrentUrl();
        assertEquals(expectedResult, actualResult);
        MyReusableMethods.getScreenshot("newsPage");
    }

    public void scrollofBottomPage() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,3200)");
    }

    public void clickContactUsButton() {
        MyReusableMethods.waitFor(2);
        contactUsButton.click();
    }

    public void customerInfoDisplayed() throws IOException {
        String expectedResult = "https://www.jaguarlandrover.com/contact-us";
        String actualResult = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedResult, actualResult);

        MyReusableMethods.getScreenshot("customerServiceInfo");
    }

    public void closeBrowser() {
        Driver.closeDriver();
    }
}
