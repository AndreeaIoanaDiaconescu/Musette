package pages.NewsLetterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class NewsLetterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(NewsLetterPage.class);
    public static NewsLetterPage instance;

    private NewsLetterPage(){
    }

    public static NewsLetterPage getInstance(){
        if (instance == null) {
            instance = new NewsLetterPage();
        }
        return instance;
    }
    private By aboneazateLaNewsLetter = By.xpath("//div[@class='footer-newsletter-button']");
    private By firstNameField = By.id("input-firstname");
    private By LastNameField = By.id("input-lastname");
    private By inputEmailNewsLetter = By.id("input-emailnewsletter");
    private By selectDay = By.id("input-dobday<select value='17'></option>");
    private By selectMonth = By.id("input-dobmonth<select value='5'><option>");
    private By selectYear = By.id("input-dobyear<select value='1990'><option>");
    private By acceptaPoliticaDeConfidentialitate = By.id("input-privacy");
    private By clickAbonare = By.id("")

    public void clickaboneazateLaNewsLetter() {
        LOG.info("Click 'Aboneazate la newsletter' button");
        driver.findElement(aboneazateLaNewsLetter).click();
    }
    public void typeInFirstNameField(){
        LOG.info("Type 'Diaconescu' in first name field");
        driver.findElement(firstNameField).sendKeys(firstNameField);
    }
    public void typeLastNameField(){
        LOG.info("Type 'Andreea' in last name field");
        driver.findElement(lastNameField).sendKeys(lastNameField);
    }
    public void inputEmailNewsLetter(){
        LOG.info("Type 'ciascai.andreea@gmail.com' email");
        driver.findElement(inputEmailNewsLetter).sendKeys(inputEmailNewsLetter);
    }
    public void setSelectDay(){
        LOG.info("Type '17'");
        driver.findElements(selectDay).sendKeys(selectDay);
    }
    public void setSelectMonth(){
        LOG.info("Type '5'");
        driver.findElements(selectMonth).sendKeys(selectMonth);
    }
    public void setSelectYear(){
        LOG.info("Type '1990'");
        driver.findElements(selectYear).sendKeys(selectYear);
    }
    public void acceptaPoliticaDeConfidentialitate(){
        LOG.info("Click 'Accepta politica de confidentialitate'");
        driver.findElement(acceptaPoliticaDeConfidentialitate).click();
    }
    public void clickAbonare(){
        LOG.info("Click Abonare");
        driver.findElements(clickAbonare).click();
    }
}
