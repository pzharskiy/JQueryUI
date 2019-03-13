package pages.menu_pages;

import org.openqa.selenium.WebDriver;
import pages.Page;

public class APIDocumentationPage extends Page {

    private final static String URL = "https://api.jqueryui.com/";

    public APIDocumentationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public APIDocumentationPage open() {
        driver.get(URL);
        return this;
    }
}
