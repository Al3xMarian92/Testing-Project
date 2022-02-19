import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class Homepage extends PageObject {

    //-------- Virtual Page Test --------//

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement clickOnVirtualReadMore;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualHeader;


    //----------- Hybrid Page Test ---------------//

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement readMoreHybrid;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybridHeader;


    //-------- In Person Page Test ------//

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement clickOnPersonReadMore;
    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/h3")
    private WebElement inPersonHeader;


    //----------Fundamental Page Test-------------//

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement readMoreFundamental;
    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement fundamentalHeader;


    //----------Selenium Page Test-----------//

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/a")
    private WebElement readMoreSelenium;
    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/h2")
    private WebElement seleniumHeader;


    //------------- BackToTop Button Page Test -----------//

    @FindBy(xpath = "/html/body/footer/div/a")
    private WebElement backToTopButton;


    //--------- Start The Enrollment Test -------//

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement clickOnStartTheEnrollmentPage;

    //-------- Personal Info Next Page Test -----//

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement clickOnNextButton;

    //-------- Contact Information Next Page --------//

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement clickOnNextButton2;

    //-------- Courses Option Next Page ---------//

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private  WebElement clickOnNextButton3;

    //------ What you'll learn Scroll Test --------//
    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement clickOnWhatYouLearn;





    public Homepage(WebDriver driver) {
        super(driver);
    }

    public void ClickOnStartTheEnrollmentPage() {
        this.clickOnStartTheEnrollmentPage.click();
    }
    public void ClickOnNextButton() {
        this.clickOnNextButton.click();
    }
    public void ClickOnNextButton2() { this.clickOnNextButton2.click();}

    public void ClickOnVirtualReadMore() {
        Utils.scrollToElement(driver, this.virtualHeader);
        this.clickOnVirtualReadMore.click();
    }

    public void ClickOnHybridReadMore() {
        Utils.scrollToElement(driver, this.hybridHeader);
        this.readMoreHybrid.click();
    }

    public void ClickOnInPersonReadMore() {
        Utils.scrollToElement(driver, this.inPersonHeader);
        this.clickOnPersonReadMore.click();
    }

    public void ClickOnFundamentalReadMore() {
        Utils.scrollToElement(driver, this.fundamentalHeader);
        this.readMoreFundamental.click();
    }

    public void ClickOnSeleniumReadMore() {
        Utils.scrollToElement(driver, this.seleniumHeader);
        this.readMoreSelenium.click();
    }

    public void ClickBackToTopButton() {
        Utils.scrollToElement(driver, this.backToTopButton);
        this.backToTopButton.click();
    }

    public void ClickWhatYouLearn() {
        Utils.scrollToElement(driver, this.clickOnWhatYouLearn);
        this.clickOnWhatYouLearn.click();
    }



}