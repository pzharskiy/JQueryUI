package pages.menu_pages;

import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class DemosPage extends MainPage {

    private static String URL = BASE_URL+"demos/";

    public DemosPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public MainPage open() {
        driver.get(URL);
        return this;
    }
}
