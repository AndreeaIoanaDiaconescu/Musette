package tests.SearchTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SearchTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchTest.class);

    @Test
    public void SearchTest(){
        
        String toTypeInsearchBox = "Lumanare";

        LOG.info("Click 'Search' button");
        searchPage.clickSearchButton();


        LOG.info("Click in search bar button");
        searchPage.clickSearchBar();

        LOG.info("Type 'Lumanare' product ");
        searchPage.typeLumanareInSearchBar(toTypeInsearchBox);

        LOG.info("Click Enter button");
        searchPage.clickEnterButton();

        LOG.info("Click Accept Cookies");
        searchPage.clickAcceptConsent();

        LOG.info("Click Select Product");
        searchPage.clickSelectProduct();

        LOG.info("Click Adaugati in cos");
        searchPage.clickAdaugatiInCos();

        LOG.info("Click Vezi cosul");
        searchPage.clickVeziCosul();

        LOG.info("Click Vezi cosul final");
        searchPage.clickCosulFinal();

    }
}
