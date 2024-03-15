package pages.SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
    private By searchButton = By.xpath("//img[@src='https://static.musette.ro/pub/media/theme/__musette_menu_icons/x2/__06_search_icon.png']");
    private By searchBar = By.xpath("//input[@placeholder='Ce anume cautati?']");
//    private By typelumanare = By.xpath("//a[@text()='Lumanare']");
    private By insertLumanare = By.xpath("//input[@role='combobox']");
//    private By enterButton = By.xpath("//button[@title='Cautare']");
    private By acceptConsent = By.xpath("//button[@class='amgdprcookie-button -allow -save']");
    private By selectProduct = By.xpath("//a[@href='https://musette.ro/lumanare-spring-250-ml-20b39p160831.html']");
    private By adaugatiInCos = By.xpath("//button[@title='Adaugati in cos']");
    private By veziCosul = By.xpath("//img[@src='https://static.musette.ro/pub/media/theme/__musette_menu_icons/x2/__05_cos_cumparaturi_icon.png']");
    private By cosulFinal = By.xpath("//a[@href='https://musette.ro/checkout/cart/']");



    public void clickSearchButton(){
        LOG.info("Click in 'Search button");
        driver.findElement(searchButton).click();
        sleep( 3000L);
    }
    public void clickSearchBar () {
        LOG.info("Click 'Search' bar");
        driver.findElement(searchBar).click();
    }
    public void typeLumanareInSearchBar(String toTypeInsearchBox){
        LOG.info("Typing lumanare in 'Search' field");
        driver.findElement(insertLumanare).sendKeys(toTypeInsearchBox);
        sleep( 1000L);
    }
    public void clickEnterButton(){
        LOG.info("Click Enter button");
        driver.findElement(insertLumanare).sendKeys(Keys.ENTER);
        sleep( 3000L);
    }
    public void clickAcceptConsent() {
        LOG.info("Accept consent");
        driver.findElement(acceptConsent).click();
    }
    public void clickSelectProduct(){
        LOG.info("Click select product");
        driver.findElement(selectProduct).click();
    }
    public void clickAdaugatiInCos(){
        LOG.info("Click 'Adaugati in cos' button");
        driver.findElement(adaugatiInCos).click();
        sleep( 5000L);
    }
    public void clickVeziCosul(){
        LOG.info("Click 'Vezi cosul' button");
        driver.findElement(veziCosul).click();
        sleep( 5000L);
    }
    public void clickCosulFinal(){
        LOG.info("Click 'Vezi cosul' final");
        driver.findElement(cosulFinal).click();
        sleep( 5000L);
    }


}
