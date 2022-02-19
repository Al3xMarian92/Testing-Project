import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrollmentPage2 extends PageObject {


    // Enrollment second page Contact Information

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationSpanText;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[1]/label")
    private WebElement emailLabel;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[2]/label")
    private WebElement phoneLabel;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement phoneField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[3]/label")
    private WebElement countryLabel;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement countryField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[4]/label")
    private WebElement cityLabel;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement cityField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/div[5]/label")
    private WebElement postCodeLabel;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postCodeField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement clickOnNextButton2;

    /* Input Contact Information Page Field Test */

    public void inputEmailToEmailField() {
        this.emailField.sendKeys("marinescuandreea96@gmail.com");
    }
    public void inputPhoneToPhoneField() {
        this.phoneField.sendKeys("0750745576");
    }
    public void inputCountryToCountryField() {
        this.countryField.sendKeys("Romania");
    }
    public void inputCityToCityField() { this.cityField.sendKeys("Brasov"); }
    public void inputPostCodeToPostCodeField() {
        this.postCodeField.sendKeys("250123");
    }

    //---------------

    public String getEmailLabel() {
        return this.emailLabel.getText();
    }
    public String getPhoneLabel() {
        return this.phoneLabel.getText();
    }
    public String getCountryLabel() {
        return this.countryLabel.getText();
    }
    public String getCityLabel() {
        return this.cityLabel.getText();
    }
    public String getPostCodeLabel() {
        return this.postCodeLabel.getText();
    }

    //---------------

    public EnrollmentPage2(WebDriver driver) {
        super(driver);
    }

    public String getContactInformationSpanText() {
        return this.contactInformationSpanText.getText();
    }

    public void ClickOnNextButton2() {
        this.clickOnNextButton2.click();
    }

    public void PopulateContactInformationPage() {
        inputEmailToEmailField();
        inputPhoneToPhoneField();
        inputCountryToCountryField();
        inputCityToCityField();
        inputPostCodeToPostCodeField();
        ClickOnNextButton2();
    }
}
