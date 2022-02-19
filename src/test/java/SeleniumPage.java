import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumPage extends PageObject {

    @FindBy(xpath = "/html/body/h1")
    private WebElement seleniumHeader;
    @FindBy(xpath = "/html/body/a")
    private WebElement clickSeleniumReturn;

    public SeleniumPage(WebDriver driver) { super(driver); }

    public String getSeleniumHeader() { return seleniumHeader.getText(); }
}
