package pages.menu_pages;

import org.openqa.selenium.WebDriver;
import pages.Page;

public class ThemesPage extends Page {

    private final static String URL = BASE_URL+"themeroller/";

    public ThemesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ThemesPage open() {
        driver.get(URL);
        return this;
    }
}
