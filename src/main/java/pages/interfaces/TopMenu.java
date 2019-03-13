package pages.interfaces;

import pages.menu_pages.*;

public interface TopMenu {

    public DemosPage clickButtonDemos();

    public DownloadPage clickButtonDownload();

    public APIDocumentationPage clickButtonAPIDocumentation();

    public ThemesPage clickButtonThemes();

    public DevelopmentPage clickButtonDevelopment();

    public SupportPage clickButtonSupport();

    public BlogPage clickButtonBlog();

    public AboutPage clickButtonAbout();

    public void search(String query);
}
