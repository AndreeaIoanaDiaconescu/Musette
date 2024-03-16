package pages.BrowsePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class BrowsePage extends BasePage {

    public static final Logger LOG = LoggerFactory.getLogger(pages.BrowsePage.BrowsePage.class);
    public static pages.BrowsePage.BrowsePage instance;

    private BrowsePage(){
    }

    public static pages.BrowsePage.BrowsePage getInstance(){
        if (instance == null) {
            instance = new pages.BrowsePage.BrowsePage();
        }
        return instance;
    }
    private By acceptConsent = By.xpath("//button[@class='amgdprcookie-button -allow -save']");
    private By selectdescopera = By.xpath("//button[@class='section01_button']");
    private By selectFirstProduct = By.xpath("//a[@href='https://musette.ro/velvet-a126-f00030426.html']");
    private By selectImage1 = By.id("musette-small-3");
    private By zoomImage = By.xpath("//img[@src='https://static.musette.ro/pub/media/catalog/product/cache/e596adad1e4c228f16e662aca7115cbf/2/0/20230915-dscf9053.jpg']");
    private By selectBej = By.xpath("//a[@href='https://musette.ro/velvet-a126-f00029827.html']");
    private By selectSize = By.xpath("//div[@class='mstte-config-option-custom']");
    private By selectSize38 = By.id("mstteoption-38");
    private By addToWish = By.xpath("//a[@class='action towishlist']");
    private By typeEmail = By.id("email");
    private By typePass = By.id("pass");
    private By selectLogin = By.id("send2");
    private By viewWishList = By.xpath("//img[@src='https://static.musette.ro/pub/media/theme/__musette_menu_icons/x2/__04_wishlist_icon.png']");
    private By openWish = By.xpath("//button[contains(text(),'Vezi Wishlist')]");

    public void clickAcceptConsent() {
        LOG.info("Accept consent");
        driver.findElement(acceptConsent).click();
        sleep( 1000L);
    }

    public void clickDescopera() {
        LOG.info("Click 'Descopera' button");
        driver.findElement(selectdescopera).click();
        sleep( 1000L);
    }

    public void clickFirstProduct(){
        LOG.info("Click on first product");
        driver.findElement(selectFirstProduct).click();
        sleep( 1000L);
    }
    public void clickImage1(){
        LOG.info("Slick Image");
        driver.findElement(selectImage1).click();
        sleep( 1000L);
    }

    public void clickZoom(){
        LOG.info("See Image");
        driver.findElement(zoomImage).click();
        sleep( 1000L);
    }

    public void clickBej(){
        LOG.info("Select Bej version");
        driver.findElement(selectBej).click();
        sleep( 1000L);
    }

    public void clickSize(){
        LOG.info("Select size");
        driver.findElement(selectSize).click();
        sleep( 1000L);
    }

    public void click38(){
        LOG.info("Select size 38");
        driver.findElement(selectSize38).click();
        sleep( 1000L);
    }

    public void clickAddToWish(){
        LOG.info("Add toWish List");
        driver.findElement(addToWish).click();
        sleep( 1000L);
    }

    public void typeInSignInEmailField(String email) {
        LOG.info("Typing email address in 'Email' field");
        driver.findElement(typeEmail).sendKeys(email);
    }

    public void typeInSignInPasswordField(String password){
        LOG.info("Typing password in 'Password field'");
        driver.findElement(typePass).sendKeys(password);
    }

    public void clickConnectare(){
        LOG.info("Click 'Enter' button");
        driver.findElement(selectLogin).click();
    }

    public void clickViewWish(){
        LOG.info("Click 'ViewWish List' button");
        driver.findElement(viewWishList).click();
        sleep( 3000L);
    }
    public void clickOpenWish(){
        LOG.info("Click 'Open Wish List' button");
        driver.findElement(openWish).click();
        sleep( 5000L);
    }
}
