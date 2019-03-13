import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MainPage;

public class TestSample {

    WebDriver driver;

    @BeforeClass
    public void init()
    {
        driver = DriverSingleton.getDriver();
        MainPage page = new MainPage(driver);
        page.open();
    }

    @Test
    public void dragItemTest() throws InterruptedException {

       MainPage page = new MainPage(driver);
       page.clickButtonDemos()
               .clickButtonDraggable()
               .dragItemAround(128, 60);

    }


    @Test
    public void dropItemTest() throws InterruptedException {

        MainPage page = new MainPage(driver);
        page.clickButtonDemos()
                .clickButtonDroppable()
                .dropElementToDroppableSpace();

    }


    @Test
    public void resizeItemTest() throws InterruptedException {

        MainPage page = new MainPage(driver);
        page.clickButtonDemos()
                .clickButtonResizable().resizeElement(100,60);

    }

    @Test
    public void clickItemTest() throws InterruptedException {

        MainPage page = new MainPage(driver);
        page.clickButtonDemos()
                .clickButtonSelectable().selectItem(3);

    }

    @Test
    public void sortItemsTest() throws InterruptedException {

        // 5 -> 2 работает
        // 2 -> 5 не работает
        MainPage page = new MainPage(driver);
        page.clickButtonDemos()
                .clickButtonSortable()
                .sortItems("Item 6", "Item 2");

    }

    @AfterClass
    public void closeBrowser()
    {
        DriverSingleton.closeDriver();
    }
}
