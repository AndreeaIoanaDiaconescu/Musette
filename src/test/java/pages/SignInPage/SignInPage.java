package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage(){
    }

    public static SignInPage getInstance(){
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }
    private By loginInButon = By.id("Login");
    private By emailField = By.xpath(" ");
    private By passwordField = By.xpath("//input name=login[password]");
    private By enterButton = By.id("enter");

    public void clickSignInButton() {
        LOG.info("Click 'Login' Button");
        driver.findElement(signInButton).click();
    }

    public void typeSignInEmailField(String email);{
        LOG.info("Typing email address in 'Email' field");
        driver.findElement(emailField).sendKeys(email);
    }

    public void typeInSignInPasswordField(String password){
        LOG.info("Typing password in 'Password field'");
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickEnterButton(){
        LOG.info("Click 'Enter' button");
        driver.findElement(enterButton).click();
    }

}
