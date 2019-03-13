package pages.interfaces;

import pages.interaction_pages.*;

public interface SideBar {

    DraggablePage clickButtonDraggable();

    DroppablePage clickButtonDroppable();

    ResizablePage clickButtonResizablee();

    SelectablePage clickButtonSelectable();

    SortablePage clickButtonSortable();
}
