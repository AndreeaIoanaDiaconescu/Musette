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
    private By loginInButton = By.id("Account_top");
    private By emailField = By.id("login[username]");
    private By passwordField = By.id("login[password]");
    private By enterButton = By.id("Conectare");

    public void clickSignInButton() {
        LOG.info("Click 'Login' Button");
        driver.findElement(loginInButton).click();
    }

    public void typeInSignInEmailField(String email) {
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
