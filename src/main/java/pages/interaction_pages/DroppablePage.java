package pages.interaction_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.MainPage;
import reporting.MyLogger;

public class DroppablePage extends MainPage {

    @FindBy(id = "draggable")
    WebElement draggableElement;

    @FindBy(id = "droppable")
    WebElement droppablePlace;

    @FindBy(xpath = "//*[@id=\"content\"]/iframe")
    private WebElement iFrame;

    private final static String URL = BASE_URL + "droppable/";

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DroppablePage open() {
        driver.get(URL);
        return this;
    }

    public void dropElementToDroppableSpace() {
        driver.switchTo().frame(iFrame);
        action.dragAndDrop(draggableElement, droppablePlace).build().perform();
        MyLogger.info("Drop Item successfully!");
        driver.switchTo().defaultContent();
    }
}
