package pages.menu_pages;

import org.openqa.selenium.WebDriver;
import pages.Page;

public class BlogPage extends Page {

    private final static String URL = "https://blog.jqueryui.com/";

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BlogPage open() {
        driver.get(URL);
        return this;
    }
}
