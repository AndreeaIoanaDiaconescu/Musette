package pages.SearchPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import tests.BaseTest;

public class SearchPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SearchPage.class);
    public static SearchPage instance;

    private SearchPage(){

    }
    public static SearchPage getInstance(){
        if (instance == null) {
            instance = new SearchPage();
        }
        return instance;
    }
    private By searchBar = By.id("Search_top");
    private By searchButton = By.xpath("//div[@class='amsearch-wrapper-input -left-position -bottom-position']");
    private By typelumanare = By.id("Search");
    private By enterButton = By.id("Enterbtn");
    private By selectProduct = By.xpath("//span[@class=product-image-wrapper']");
    private By adaugatiInCos = By.id("Product addtocart button");


    public void clickSearchBar () {
        LOG.info("Click 'Search' bar");
        driver.findElement(searchBar).click();
    }
    public void clickSearchButton(){
        LOG.info("Click in 'Search button");
        driver.findElement(searchButton).click();
    }
    public void typeLumanareInSearchField(){
        LOG.info("Typing lumanare in 'Search' field");
        driver.findElement(typelumanare).click();
    }
    public void clickEnterButton(){
        LOG.info("Click Enter button");
        driver.findElement(enterButton).click();
    }
    public void clickSelectProduct(){
        LOG.info("Click select product");
        driver.findElement(selectProduct).click();
    }
    public void clickAdaugatiInCos(){
        LOG.info("Click 'Adaugati in cos' button");
        driver.findElement(adaugatiInCos).click();
    }

}
