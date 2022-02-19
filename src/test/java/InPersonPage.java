import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InPersonPage extends PageObject {

    @FindBy(xpath = "/html/body/h1")
    private WebElement personHeader;
    @FindBy(xpath = "/html/body/a")
    private WebElement returnInPersonButton;

    public InPersonPage(WebDriver driver) { super(driver); }

    public String getPersonHeader() {
        return personHeader.getText();
    }
}
