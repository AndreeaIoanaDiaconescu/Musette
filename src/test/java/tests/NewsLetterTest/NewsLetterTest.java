package tests.NewsLetterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class NewsLetterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(NewsLetterTest.class);

    @Test
    public void NewsLetterPage(){

        LOG.info("Click aboneazate la newsletter");
        newsLetterPage.clickAboneazateLaNewsLetter();

        LOG.info("Type first name");
        newsLetterPage.clickFirstNameField();

        LOG.info("Type last name");
        newsLetterPage.clickLastNameField();

        LOG.info("Type email");
        newsLetterPage.clickInputEmailNewsLetter();

        LOG.info("Type 17");
        newsLetterPage.clickSelectDay();

        LOG.info("Type 5");
        newsLetterPage.clickSelectMonth();

        LOG.info("Type 1990");
        newsLetterPage.clickSelectYear();

        LOG.info("Click 'Accepta politica de confidentialitate'");
        newsLetterPage.clickAcceptaPoliticaDeConfidentialitate();

        LOG.info("Click abonare");
        newsLetterPage.clickAbonare();

    }
}
