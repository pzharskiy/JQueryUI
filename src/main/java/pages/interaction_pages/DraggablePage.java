package pages.interaction_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.MainPage;

public class DraggablePage extends MainPage {

    @FindBy(id = "draggable")
    WebElement draggableElement;
    @FindBy(xpath = "//*[@id=\"content\"]/iframe")
    private WebElement iFrame;

    private final static String URL = BASE_URL + "draggable/";

    public DraggablePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DraggablePage open() {
        driver.get(URL);
        return this;
    }

    public void dragItemAround(int x, int y) {
        driver.switchTo().frame(iFrame);
        action.dragAndDropBy(draggableElement, x, y).build().perform();
        driver.switchTo().defaultContent();
    }
}
