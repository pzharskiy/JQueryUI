package pages.menu_pages;

import org.openqa.selenium.WebDriver;
import pages.Page;

public class AboutPage extends Page {

    private final static String URL = BASE_URL+"about/";

    public AboutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AboutPage open() {
        driver.get(URL);
        return this;
    }
}
