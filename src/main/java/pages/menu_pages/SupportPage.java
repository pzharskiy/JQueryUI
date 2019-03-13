package pages.menu_pages;

import org.openqa.selenium.WebDriver;
import pages.Page;

public class SupportPage extends Page {

    private final static String URL = BASE_URL+"support/";

    public SupportPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public SupportPage open() {
        driver.get(URL);
        return this;
    }
}
