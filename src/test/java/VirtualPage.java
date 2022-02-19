import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class VirtualPage extends PageObject {

    @FindBy(xpath = "/html/body/h1")
    private WebElement virtualHeader;
    @FindBy(xpath = "/html/body/a")
    private WebElement returnVirtualButton;

    public VirtualPage(WebDriver driver) { super(driver); }

    public String getVirtualHeader() {
        return virtualHeader.getText();
    }
}
