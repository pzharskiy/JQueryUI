package pages.interaction_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.MainPage;

public class ResizablePage extends MainPage {

    @FindBy(id = "resizable")
    WebElement resizableElement;
    @FindBy(xpath = "//*[@id=\"content\"]/iframe")
    private WebElement iFrame;
    @FindBy(xpath="//*[@id=\"resizable\"]/div[3]")
    WebElement resizablePart;


    private final static String URL = BASE_URL+"resizable/";

    public ResizablePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ResizablePage open()
    {
        driver.get(URL);
        return this;
    }

    public void resizeElement(int x, int y)
    {
        driver.switchTo().frame(iFrame);
        action.dragAndDropBy(resizablePart, x, y).build().perform();
        driver.switchTo().defaultContent();
    }
}
