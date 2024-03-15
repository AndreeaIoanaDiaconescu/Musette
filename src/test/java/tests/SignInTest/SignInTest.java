package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {

        String email = "ciascai.andreea@gmail.com";
        String password = "Ciascai90!1";

        LOG.info("Click 'Login' button");
        signInPage.clickSignInButton();

        LOG.info("Complete the fields");
        signInPage.typeInSignInEmailField(email);
        signInPage.typeInSignInPasswordField(password);

        LOG.info("Click Enter button");
        signInPage.clickEnterButton();



    }
}