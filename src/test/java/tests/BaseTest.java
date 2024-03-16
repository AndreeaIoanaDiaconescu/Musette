package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.NewsLetterPage.NewsLetterPage;
import pages.SearchPage.SearchPage;
import pages.SignInPage.SignInPage;
import pages.BrowsePage.BrowsePage;
import tests.SearchTest.SearchTest;
import static pages.BasePage.*;



public class BaseTest {
    public SignInPage signInPage = SignInPage.getInstance();
    public NewsLetterPage newsLetterPage = NewsLetterPage.getInstance();
    public SearchPage searchPage = SearchPage.getInstance();
    public BrowsePage browsePage = BrowsePage.getInstance();

    @BeforeSuite
    public void init() {

        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {

        BasePage.tearDown();
    }
}
