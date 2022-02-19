import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrollmentPage extends PageObject {


    // Personal Information
    @FindBy(xpath = "/html/body/div/div/h2/span")
    private WebElement softwareTestingSpanText;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationField;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[1]/div[1]/label")
    private WebElement firstNameLabel;

    @FindBy (xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[1]/div[2]/label")
    private WebElement lastNameLabel;

    @FindBy (xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[1]/div[3]/label")
    private WebElement userNameLabel;

    @FindBy (xpath = "//*[@id=\"username\"]")
    private WebElement userNameField;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[1]/div[4]/label")
    private WebElement passwordLabel;

    @FindBy (xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[1]/div[5]/label")
    private WebElement confirmPasswordLabel;

    @FindBy (xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordField;

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement clickOnNextButton;

    //Personal Information SendKeys Test
    public void inputFirstNameLabel() {
        this.firstNameField.sendKeys("Marinescu");
        Utils.waitForElementToLoad(1);
    }
    public void inputLastNameLabel() {
        this.lastNameField.sendKeys("Andreea");
        Utils.waitForElementToLoad(1);
    }
    public void inputUserNameLabel() {
        this.userNameField.sendKeys("Andreea96");
        Utils.waitForElementToLoad(1);
    }
    public void inputPasswordLabel() {
        this.passwordField.sendKeys("nuamparola96");
        Utils.waitForElementToLoad(1);
    }
    public void inputConfirmPasswordLabel() {
        this.confirmPasswordField.sendKeys("nuamparola96");
        Utils.waitForElementToLoad(1);
    }
    //Input Personal Information Page Test
    public void inputFirstNameToFirstNameField() { this.firstNameField.sendKeys("Andreea"); }
    public void inputLastNameToLastNameField() { this.lastNameField.sendKeys("Marinescu"); }
    public void inputUserNameToUserNameField() { this.userNameField.sendKeys("Andreea96"); }
    public void inputPasswordToPasswordField() { this.passwordField.sendKeys("nuamparola23"); }
    public void inputConfirmPasswordToConfirmPasswordField() { this.confirmPasswordField.sendKeys("nuamparola23"); }

    //-------------------------------//

    public String getPersonalInformationText() { return this.personalInformationField.getText(); }
    public String getFirstNameLabel() { return this.firstNameLabel.getText(); }
    public String getLastNameLabel() { return this.lastNameLabel.getText(); }
    public String getUserNameLabel() { return this.userNameLabel.getText(); }
    public String getPasswordLabel() { return this.passwordLabel.getText(); }
    public String getConfirmPasswordLabel() { return this.confirmPasswordLabel.getText(); }

    //---------------------------------//



    public EnrollmentPage(WebDriver driver) { super(driver); }

    public String getSoftwareTestingSpanText() {
        return this.softwareTestingSpanText.getText(); }

    public void ClickOnNextButton() {
        this.clickOnNextButton.click();
    }

    public void PopulatePersonalInformationPage() {
        inputFirstNameToFirstNameField();
        inputLastNameToLastNameField();
        inputUserNameToUserNameField();
        inputPasswordToPasswordField();
        inputConfirmPasswordLabel();
        ClickOnNextButton();
    }
}
