import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrollmentPage3 extends PageObject {

    //Enrolment third page Course Options

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseOptionSpanText;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[1]/label")
    private WebElement manualTesterCertificateLabel;

    @FindBy(xpath = "//*[@id=\"flexRadioButton1\"]")
    private WebElement manualTesterCertificateCheck;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[2]/label")
    private WebElement automationTesterCertificateLabel;

    @FindBy(xpath = "//*[@id=\"flexRadioButton2\"]")
    private WebElement automationTesterCertificateCheck;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[3]/label")
    private WebElement automationManualTesterCertificateLabel;

    @FindBy(xpath = "//*[@id=\"flexRadioButton3\"]")
    private WebElement automationManualTesterCertificateCheck;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/div[4]/label")
    private WebElement securityTesterCertificateLabel;

    @FindBy(xpath = "//*[@id=\"flexRadioButton4\"]")
    private WebElement securityTesterCertificateCheck;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement clickOnNextButton3;

    //----- Select Option ------//

    public void inputManualTesterCertificateCheck() { this.manualTesterCertificateCheck.click();}
    public void inputAutomationTesterCertificateCheck() { this.automationTesterCertificateCheck.click();}
    public void inputAutomationManualTesterCertificateCheck() { this.automationManualTesterCertificateCheck.click();}
    public void inputSecurityTesterCertificateCheck() { this.securityTesterCertificateCheck.click();}

    //--------

    public String getManualTesterCertificateLabel() { return this.manualTesterCertificateLabel.getText();}
    public String getAutomationTesterCertificateLabel() { return this.automationTesterCertificateLabel.getText();}
    public String getAutomationManualTesterCertificateLabel() { return this.automationManualTesterCertificateLabel.getText();}
    public String getSecurityTesterCertificationLabel() { return this.securityTesterCertificateLabel.getText();}

    public EnrollmentPage3(WebDriver driver) { super(driver); }

    public String getCourseOptionsSpanText() {return this.courseOptionSpanText.getText();}


    public void clickOnNextPage3() { this.clickOnNextButton3.click();}
}
