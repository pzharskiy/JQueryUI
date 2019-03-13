package pages.interaction_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.MainPage;

public class SortablePage extends MainPage {

    @FindBy(id = "sortable")
    WebElement sortableItems;
    @FindBy(xpath = "//*[@id=\"content\"]/iframe")
    private WebElement iFrame;

    private final static String URL = BASE_URL+"sortable/";

    public SortablePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public SortablePage open()
    {
        driver.get(URL);
        return this;
    }

    public void sortItems(String item, String replacableItem) {
        driver.switchTo().frame(iFrame);
        WebElement movableItem= sortableItems.findElement(By.xpath("//li[text()='"+item+"']"));
        WebElement targetPlace= sortableItems.findElement(By.xpath("//li[text()='"+replacableItem+"']"));
        action.dragAndDrop(movableItem, targetPlace).build().perform();
        driver.switchTo().defaultContent();
    }
}
