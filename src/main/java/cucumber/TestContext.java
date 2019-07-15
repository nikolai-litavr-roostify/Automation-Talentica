package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
    private static WebDriverManager webDriverManager;
    private static PageObjectManager pageObjectManager;

    public TestContext(){
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
        pageObjectManager = new PageObjectManager(webDriverManager.getUrl());
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }



}