package pages.SearchPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tests.BaseTest;

public class SearchPage extends BaseTest {
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
    private By searchButton = By.xpath("//div[@class='search_top\"]");
    private By clickInSearchBar = By.id("Search");
    private By typelumanare = By.id("Search");
    private By enterButton = By.id("Enterbtn");
    private By selectProduct = By.xpath("//span[@class=product-image-wrapper']");
    private By adaugatiInCos = By.id("Product addtocart button");


    public void clickSearchButton(String search) {
        LOG.info("Click 'Search' button");
        driver.findElement(clickSearchButton).click();
    }
    public void clickInSearchBar(){
        LOG.info("Click in 'SearchBar'button");
        driver.findElement(clickInSearchBar).click();
    }
    public void typeLumanareInSearchField(String lumanare){
        LOG.info("Typing lumanare in 'Search' field");
        driver.findElement(searchField).sendKeys(searchButton);
    }
    public void clickEnterButton(){
        LOG.info("Click Enter button");
        driver.findElement(enterButton).click();
    }
    public void clickSelectProduct(){
        LOG.info("Click select product");
        driver.findElement(clickSelectProduct).click();
    }
    public void adaugatiInCos(){
        LOG.info("Click 'Adaugati in cos' button");
        driver.findElement(clickAdaugatiInCos).click();
    }

}
