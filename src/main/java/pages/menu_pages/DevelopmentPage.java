package pages.menu_pages;

import org.openqa.selenium.WebDriver;
import pages.Page;

public class DevelopmentPage extends Page {

    private final static String URL = BASE_URL+"development/";

    public DevelopmentPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DevelopmentPage open() {
        driver.get(URL);
        return this;
    }
}
