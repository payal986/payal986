package SearchTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

    WebDriver driver;

    @Given("I'm on homepage ("http://www.habitate.co.uk")")
    public void OpenHomepage()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }
    @When ("I enter specific product name in search term")
    public void enterSearchterm(String productname )
    {
         driver.findElement(By.LinkText("")).Sendkeys(productname);

    }
    @When(" I click on Search button")
    public void clickOnsearch()
    {$ git config --global user.name "John Doe"


        driver.findElement(By.id("")).click();
    }
    @Then(" I should see the list of specific product")
    public void listOfproduct()
            {
                searchIcon.click();
            })


}
