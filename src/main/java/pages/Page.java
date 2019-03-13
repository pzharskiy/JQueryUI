package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.menu_pages.*;

public abstract class Page {

    protected WebDriver driver;
    protected final static String BASE_URL = "https://jqueryui.com/";
    protected WebDriverWait wait;
    protected Actions action;

    @FindBy(id = "logo-events")
    WebElement logoEvents;
    @FindBy(id = "main")
    WebElement menu;
    @FindBy(xpath = "//a[text()='Demos']")
    WebElement demos;
    @FindBy(xpath = "//a[text()='Download']")
    WebElement download;
    @FindBy(xpath = "//a[text()='API Documentation']")
    WebElement apiDocumentation;
    @FindBy(xpath = "//a[text()='Themes']")
    WebElement themes;
    @FindBy(xpath = "//a[text()='Development']")
    WebElement development;
    @FindBy(xpath = "//a[text()='Support']")
    WebElement support;
    @FindBy(xpath = "//a[text()='Blog']")
    WebElement blog;
    @FindBy(xpath = "//a[text()='About']")
    WebElement about;
    @FindBy(xpath = "//input[@name='s']")
    WebElement search;


    public Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        action = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public abstract Page open();

    public DemosPage clickButtonDemos() {
        wait.until(ExpectedConditions.elementToBeClickable(demos)).click();
        return PageFactory.initElements(driver, DemosPage.class);
    }

    public DownloadPage clickButtonDownload() {
        wait.until(ExpectedConditions.elementToBeClickable(download)).click();
        return PageFactory.initElements(driver, DownloadPage.class);
    }

    public APIDocumentationPage clickButtonAPIDocumentation() {
        wait.until(ExpectedConditions.elementToBeClickable(apiDocumentation)).click();
        return PageFactory.initElements(driver, APIDocumentationPage.class);
    }

    public ThemesPage clickButtonThemes() {
        wait.until(ExpectedConditions.elementToBeClickable(themes)).click();
        return PageFactory.initElements(driver, ThemesPage.class);
    }

    public DevelopmentPage clickButtonDevelopment() {
        wait.until(ExpectedConditions.elementToBeClickable(development)).click();
        return PageFactory.initElements(driver, DevelopmentPage.class);
    }

    public SupportPage clickButtonSupport() {
        wait.until(ExpectedConditions.elementToBeClickable(support)).click();
        return PageFactory.initElements(driver, SupportPage.class);
    }

    public BlogPage clickButtonBlog() {
        wait.until(ExpectedConditions.elementToBeClickable(blog)).click();
        return PageFactory.initElements(driver, BlogPage.class);
    }

    public AboutPage clickButtonAbout() {
        wait.until(ExpectedConditions.elementToBeClickable(about)).click();
        return PageFactory.initElements(driver, AboutPage.class);
    }

    public void search(String query) {
        wait.until(ExpectedConditions.elementToBeClickable(search)).sendKeys(query);
        search.submit();
    }
}
