import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FundamentalPage extends PageObject{

    @FindBy(xpath = "/html/body/h1")
    private WebElement fundamentalHeader;
    @FindBy(xpath = "/html/body/a")
    private WebElement clickFundamentalReturn;

    public FundamentalPage(WebDriver driver) { super(driver); }

    public String getFundamentalHeader() {
        return fundamentalHeader.getText();
    }
}
