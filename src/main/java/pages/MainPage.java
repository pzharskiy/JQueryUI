package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.interaction_pages.*;

public class MainPage extends Page {

    @FindBy(xpath = "//a[text()='Draggable']")
    WebElement draggableInteractionsItem;
    @FindBy(xpath = "//a[text()='Droppable']")
    WebElement droppableInteractionsItem;
    @FindBy(xpath = "//a[text()='Resizable']")
    WebElement resizableInteractionsItem;
    @FindBy(xpath = "//a[text()='Selectable']")
    WebElement selectableInteractionsItem;
    @FindBy(xpath = "//a[text()='Sortable']")
    WebElement sortableInteractionsItem;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public MainPage open() {
        driver.get(BASE_URL);
        return this;
    }

    public DraggablePage clickButtonDraggable() {
        wait.until(ExpectedConditions.elementToBeClickable(draggableInteractionsItem)).click();
        return PageFactory.initElements(driver, DraggablePage.class);
    }

    public DroppablePage clickButtonDroppable() {
        wait.until(ExpectedConditions.elementToBeClickable(droppableInteractionsItem)).click();
        return PageFactory.initElements(driver, DroppablePage.class);
    }

    public ResizablePage clickButtonResizable() {
        wait.until(ExpectedConditions.elementToBeClickable(resizableInteractionsItem)).click();
        return PageFactory.initElements(driver, ResizablePage.class);
    }

    public SelectablePage clickButtonSelectable() {
        wait.until(ExpectedConditions.elementToBeClickable(selectableInteractionsItem)).click();
        return PageFactory.initElements(driver, SelectablePage.class);
    }

    public SortablePage clickButtonSortable() {
        wait.until(ExpectedConditions.elementToBeClickable(sortableInteractionsItem)).click();
        return PageFactory.initElements(driver, SortablePage.class);
    }

    //Весь остальной контекнт на странице делать приватным.
}
