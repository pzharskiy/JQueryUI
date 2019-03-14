package pages.interaction_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.MainPage;

public class SelectablePage extends MainPage {

    @FindBy(id = "selectable")
    WebElement selectableItems;
    @FindBy(xpath = "//*[@id=\"content\"]/iframe")
    private WebElement iFrame;


    private final static String URL = BASE_URL + "selectable/";

    public SelectablePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public SelectablePage open() {
        driver.get(URL);
        return this;
    }

    public void selectItem(int location) {
        driver.switchTo().frame(iFrame);
        selectableItems.findElement(By.xpath("//li[text()='Item " + location + "']")).click();
        driver.switchTo().defaultContent();
    }
}
