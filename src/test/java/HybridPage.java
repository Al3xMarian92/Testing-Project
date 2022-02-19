import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HybridPage extends PageObject {

    @FindBy(xpath = "/html/body/h1")
    private WebElement hybridHeader;
    @FindBy(xpath = "/html/body/a")
    private WebElement hybridReturnButton;

    public HybridPage(WebDriver driver) { super(driver); }

    public String getHybridHeader() {
        return hybridHeader.getText();
    }
}
