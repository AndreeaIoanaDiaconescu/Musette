package tests.NewsLetterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class NewsLetterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(NewsLetterTest.class);
    String firstName = "Diaconescu";
    String lastName = "Andreea";
    String email = "ciascai.andreea@gmail.com";
    String day = "17";
    String month = "5";
    String year = "1990";


    @Test
    public void NewsLetterPage(){

        LOG.info("Click aboneazate la newsletter");
        newsLetterPage.clickaboneazateLaNewsLetter();

        LOG.info("Typing full name");
        newsLetterPage.insertFullName(firstName, lastName);

        LOG.info("Type email");
        newsLetterPage.clickEmailNewsLetter(email);

        LOG.info("Select date of birth");
        newsLetterPage.setDayOfBirth(day, month, year);

        LOG.info("Click 'Accepta politica de confidentialitate'");
        newsLetterPage.clickAcceptaPoliticaDeConfidentialitate();

        LOG.info("Click abonare");
        newsLetterPage.clickAbonare();

    }
}
