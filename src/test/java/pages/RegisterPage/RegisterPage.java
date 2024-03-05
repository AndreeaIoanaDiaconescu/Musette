package pages.RegisterPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import pages.SignInPage.SignInPage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static RegisterPage instance;
    private RegisterPage(){

    }
    public static RegisterPage getInstance() {
        if (instance == null){
            instance = new RegisterPage();
        }
        return instance;
    }
}
