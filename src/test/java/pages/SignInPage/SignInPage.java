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
    private By signInPage = By.id("");

}
