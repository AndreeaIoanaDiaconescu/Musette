package pages.NewsLetterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
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
    private By inputFirstNameField = By.id("input-firstname");
    private By inputLastNameField = By.id("input-lastname");
    private By EmailNewsLetter = By.id("input-emailnewsletter");
    private By selectDay = By.id("input-dobday<select value='17'></option>");
    private By selectMonth = By.id("input-dobmonth<select value='5'><option>");
    private By selectYear = By.id("input-dobyear<select value='1990'><option>");
    private By acceptaPoliticaDeConfidentialitate = By.id("input-privacy");
    private By clickAbonare = By.xpath("//div[@class='cr_button custom-btn'");

    public void clickaboneazateLaNewsLetter() {
        LOG.info("Click 'Aboneazate la newsletter' button");
        driver.findElement(aboneazateLaNewsLetter).click();
    }
    public void insertFullName(String firstNameField, String lastNameField){
        LOG.info("inserting FirstName and LastName");
        driver.findElement(inputFirstNameField).sendKeys(firstNameField);
        driver.findElement(inputLastNameField).sendKeys(lastNameField);
    }

    public void clickEmailNewsLetter(String EmailNewsLetters){
        LOG.info("Type 'ciascai.andreea@gmail.com' email");
        driver.findElement(EmailNewsLetter).sendKeys(EmailNewsLetters);
    }
    public void setDayOfBirth(String day, String month, String year){
        LOG.info("Selecting date of birth");
        Select newDay = new Select(driver.findElement(selectDay));
        newDay.selectByValue(day);
        Select newMonth = new Select(driver.findElement(selectMonth));
        newMonth.selectByValue(month);
        Select newYear = new Select(driver.findElement(selectYear));
        newYear.selectByValue(year);
    }
    public void clickAcceptaPoliticaDeConfidentialitate() {
        LOG.info("Click 'Accepta politica de confidentialitate'");
        driver.findElement(acceptaPoliticaDeConfidentialitate).click();
    }
    public void clickAbonare(){
        LOG.info("Click Abonare");
        driver.findElement(clickAbonare).click();
    }
}
