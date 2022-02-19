import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.junit.jupiter.api.Assertions;
import org.testng.asserts.Assertion;
import org.yaml.snakeyaml.scanner.Constant;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTests {
    protected static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    // Enrolment Personal Information Page
    @Test
    @DisplayName("Ensure all elements from first form are displayed")
    public void verifyRegistrationForm() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickOnStartTheEnrollmentPage();
        EnrollmentPage enrollmentPage = new EnrollmentPage(driver);
        Assertions.assertAll(
                () -> assertEquals(enrollmentPage.getSoftwareTestingSpanText(), Constants.SOFTWARE_TESTING_HEADER),
                () -> assertEquals(enrollmentPage.getPersonalInformationText(), Constants.PERSONAL_INFORMATION_HEADER),
                () -> assertEquals(enrollmentPage.getFirstNameLabel(), Constants.FIRST_NAME_HEADER),
                () -> assertEquals(enrollmentPage.getLastNameLabel(), Constants.LAST_NAME_HEADER),
                () -> assertEquals(enrollmentPage.getUserNameLabel(), Constants.USER_NAME_HEADER),
                () -> assertEquals(enrollmentPage.getPasswordLabel(), Constants.PASSWORD),
                () -> assertEquals(enrollmentPage.getConfirmPasswordLabel(), Constants.CONFIRM_PASSWORD)
        );
    }

    // Fill Enrolment Personal Information Page
    @Test
    public void inputDataPersonalInformation() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickOnStartTheEnrollmentPage();
        EnrollmentPage enrollmentPage = new EnrollmentPage(driver);
        enrollmentPage.inputFirstNameToFirstNameField();
        enrollmentPage.inputLastNameToLastNameField();
        enrollmentPage.inputUserNameToUserNameField();
        enrollmentPage.inputPasswordToPasswordField();
        enrollmentPage.inputConfirmPasswordToConfirmPasswordField();
        Utils.waitForElementToLoad(2);
        enrollmentPage.ClickOnNextButton();
    }

    //Contact Information Page Test
    @Test
    @DisplayName("Ensure all elements from second page are displayed")
    public void verifyContactInformation() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickOnStartTheEnrollmentPage();
        EnrollmentPage enrollmentPage = new EnrollmentPage(driver);
        enrollmentPage.PopulatePersonalInformationPage();
        EnrollmentPage2 enrollmentPage2 = new EnrollmentPage2(driver);
        Assertions.assertAll(
                () -> assertEquals(enrollmentPage2.getContactInformationSpanText(), Constants.CONTACT_INFORMATION_HEADER),
                () -> assertEquals(enrollmentPage2.getEmailLabel(), Constants.EMAIL_HEADER),
                () -> assertEquals(enrollmentPage2.getPhoneLabel(), Constants.PHONE_HEADER),
                () -> assertEquals(enrollmentPage2.getCountryLabel(), Constants.COUNTRY_HEADER),
                () -> assertEquals(enrollmentPage2.getCityLabel(), Constants.CITY_HEADER),
                () -> assertEquals(enrollmentPage2.getPostCodeLabel(), Constants.POSTCODE_HEADER)
        );
    }

    //Fill Contact Information Page Test
    @Test
    public void inputContactInformation() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickOnStartTheEnrollmentPage();
        EnrollmentPage enrollmentPage = new EnrollmentPage(driver);
        enrollmentPage.PopulatePersonalInformationPage();
        EnrollmentPage2 enrollmentPage2 = new EnrollmentPage2(driver);
        enrollmentPage2.inputEmailToEmailField();
        enrollmentPage2.inputPhoneToPhoneField();
        enrollmentPage2.inputCountryToCountryField();
        enrollmentPage2.inputCityToCityField();
        enrollmentPage2.inputPostCodeToPostCodeField();
        Utils.waitForElementToLoad(2);
        enrollmentPage2.ClickOnNextButton2();
    }

    // Course Options Page Test
    @Test
    @DisplayName("Ensure the Course Option is selectable")
    public void verifyCourseOptions() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickOnStartTheEnrollmentPage();
        EnrollmentPage enrollmentPage = new EnrollmentPage(driver);
        enrollmentPage.PopulatePersonalInformationPage();
        EnrollmentPage2 enrollmentPage2 = new EnrollmentPage2(driver);
        enrollmentPage2.PopulateContactInformationPage();
        enrollmentPage2.ClickOnNextButton2();
        EnrollmentPage3 enrollmentPage3 = new EnrollmentPage3(driver);
        Assertions.assertAll(
                () -> assertEquals(enrollmentPage3.getCourseOptionsSpanText(), Constants.COURSE_OPTIONS_HEADER),
                () -> assertEquals(enrollmentPage3.getManualTesterCertificateLabel(), Constants.MANUAL_TESTER_CERTIFICATE_HEADER),
                () -> assertEquals(enrollmentPage3.getAutomationTesterCertificateLabel(), Constants.AUTOMATION_TESTER_CERTIFICATE_HEADER),
                () -> assertEquals(enrollmentPage3.getAutomationManualTesterCertificateLabel(), Constants.AUTOMATION_MANUAL_TESTER_CERTIFICATE_HEADER),
                () -> assertEquals(enrollmentPage3.getSecurityTesterCertificationLabel(), Constants.SECURITY_TESTER_CERTIFICATE_HEADER)
        );
    }

    // Course Options Check Test
    @Test
    public void inputCourseOptionsCheck() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickOnStartTheEnrollmentPage();
        EnrollmentPage enrollmentPage = new EnrollmentPage(driver);
        enrollmentPage.PopulatePersonalInformationPage();
        EnrollmentPage2 enrollmentPage2 = new EnrollmentPage2(driver);
        enrollmentPage2.PopulateContactInformationPage();
        enrollmentPage2.ClickOnNextButton2();
        EnrollmentPage3 enrollmentPage3 = new EnrollmentPage3(driver);
        enrollmentPage3.inputManualTesterCertificateCheck();
        enrollmentPage3.inputAutomationTesterCertificateCheck();
        enrollmentPage3.inputAutomationManualTesterCertificateCheck();
        enrollmentPage3.inputSecurityTesterCertificateCheck();
        Utils.waitForElementToLoad(1);
        enrollmentPage3.clickOnNextPage3();
    }


    // VirtualPage Test
    @Test(testName = "Verify functionality for Read More in Virtual section")
    public void VerifyVirtual() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickOnVirtualReadMore();
        VirtualPage virtualPage = new VirtualPage(driver);
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(virtualPage.getVirtualHeader(), Constants.VIRTUAL_HEADER);
    }

    // HybridPage Test
    @Test(testName = "Verify functionality for Read More in Hybrid section")
    public void VerifyHybrid() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickOnHybridReadMore();
        HybridPage hybridPage = new HybridPage(driver);
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(hybridPage.getHybridHeader(), Constants.HYBRID_HEADER);
    }

    // InPersonPage Test
    @Test(testName = "Verify functionality for Read More In Person section")
    public void VerifyInPerson() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickOnInPersonReadMore();
        InPersonPage inPersonPage = new InPersonPage(driver);
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(inPersonPage.getPersonHeader(), Constants.PERSON_HEADER);
    }

    // Learn The Fundamentals Test
    @Test(testName = "Verify functionality for Read More Learn The Fundamentals section")
    public void VerifyFundamental() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickOnFundamentalReadMore();
        FundamentalPage fundamentalPage = new FundamentalPage(driver);
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(fundamentalPage.getFundamentalHeader(), Constants.FUNDAMENTAL_HEADER);
    }

    // Learn Selenium Test
    @Test(testName = "Verify Functionality for Read More Learn Selenium section")
    public void VerifySelenium() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickOnSeleniumReadMore();
        SeleniumPage seleniumPage = new SeleniumPage(driver);
        Utils.waitForElementToLoad(2);
        Assert.assertEquals(seleniumPage.getSeleniumHeader(), Constants.SELENIUM_HEADER);
    }

    // Back To Top Test
    @Test(testName = "Verify Functionality for BackToTop button")
    public void BackToTopButton() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickBackToTopButton();
    }

    // What You'll Learn Test
    @Test(testName = "Verify functionality for What you'll learn click to scroll")
    public void VerifyWhatYouLearn() {
        driver.get(Utils.BASE_URL);
        Homepage homePageTests = new Homepage(driver);
        homePageTests.ClickWhatYouLearn();
    }

        @AfterSuite
        public static void cleanUp () {
            driver.manage().deleteAllCookies();
            driver.close();
            driver.quit();
        }


    private static void clickOnStartTheEnrollmentPage() {

    }
}
