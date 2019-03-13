package pages.menu_pages;

import org.openqa.selenium.WebDriver;
import pages.Page;

public class DownloadPage extends Page {

    private final static String URL = BASE_URL+"download/";

    public DownloadPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DownloadPage open() {
        driver.get(URL);
        return this;
    }
}
