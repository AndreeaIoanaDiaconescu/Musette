package tests.SearchTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SearchTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchTest.class);

    @Test
    public void SearchTest(){

        LOG.info("Click 'Search' button");
        searchPage.clickSearchButton();

        LOG.info("Click in search bar button");
        searchPage.clickInSearchBar();

        LOG.info("Type 'Lumanare' product ");
        searchPage.typeLumanareInSearchField();

        LOG.info("Click Enter button");
        searchPage.clickEnterButton();

        LOG.info("Click Select Product");
        searchPage.clickSelectProduct();

        LOG.info("Click Adaugati in cos");
        searchPage.clickAdaugatiInCos();

    }
}
