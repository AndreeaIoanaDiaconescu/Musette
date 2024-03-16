package tests.BrowseTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class BrowseTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(BrowseTest.class);

    @Test
    public void BrowseTest() {

        String email = "ciascai.andreea@gmail.com";
        String password = "Ciascai90!1";

        LOG.info("Click Accept Cookies");
        browsePage.clickAcceptConsent();

        LOG.info("Click open catalog");
        browsePage.clickDescopera();

        LOG.info("Click Select Product");
        browsePage.clickFirstProduct();

        LOG.info("Click 3rd image");
        browsePage.clickImage1();

        LOG.info("Click Zoom image");
        browsePage.clickZoom();

        LOG.info("Click Bej variant");
        browsePage.clickBej();

        LOG.info("Click Selectati marimea");
        browsePage.clickSize();

        LOG.info("Marimea 38");
        browsePage.click38();

        LOG.info("Click 'Add to Wish List'");
        browsePage.clickAddToWish();

        LOG.info("Complete the fields");
        signInPage.typeInSignInEmailField(email);
        signInPage.typeInSignInPasswordField(password);

        LOG.info("Click 'Conectare'");
        browsePage.clickConnectare();

        LOG.info("Click 'Wish List'");
        browsePage.clickViewWish();

        LOG.info("Click 'Open Wish List'");
        browsePage.clickOpenWish();
    }
}
