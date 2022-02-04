package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Steps {
    WebDriver driver;

    @Given("navigate to url")
    public void navigate_to_url() {
        WebDriverManager.chromedriver().setup();
        // System.setProperty("webdriver.chrome.driver", "/Users/ummert/Downloads");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/finance/");
    }

    @When("go to ASM stock")
    public void go_to_asm_stock() throws InterruptedException {
        // driver.switchTo().frame("apiproxy99024582d049f724b3fed3c37ab187530bb4875b0.3394745533");
        WebElement searchButton = driver.findElement(By.xpath("//c-wiz[@jsrenderer='NDJNP']//div//input[2]"));
        System.out.println("driver.getTitle() = " + driver.getTitle());
        searchButton.sendKeys("ASM");
        Thread.sleep(2000);
        searchButton.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("Check the months financial performance")
    public void check_the_months_financial_performance() throws InterruptedException {

        System.out.println("DECEMBER INFO");
        WebElement dec = driver.findElement(By.xpath("//span[text()='Dec 2020']"));
        dec.click();
        List<WebElement> sectionDecember = driver.findElements(By.xpath("//tr[@class='roXhBd']"));
        for (WebElement each : sectionDecember) {
            System.out.print(each.getText());
        }
        Thread.sleep(2000);

        System.out.println("MARCH INFO");
        WebElement mar = driver.findElement(By.xpath("//span[text()='Mar 2021']"));
        mar.click();
        List<WebElement> sectionMar = driver.findElements(By.xpath("//tr[@class='roXhBd']"));
        for (WebElement each : sectionMar) {
            System.out.print(each.getText());
        }
        Thread.sleep(2000);

        System.out.println("JUN INFO");
        WebElement jun = driver.findElement(By.xpath("//span[text()='Jun 2021']"));
        jun.click();
        List<WebElement> sectionJun = driver.findElements(By.xpath("//tr[@class='roXhBd']"));
        for (WebElement each : sectionJun) {
            System.out.print(each.getText());
        }
        Thread.sleep(2000);
        System.out.println("SEP INFO");
        WebElement sep = driver.findElement(By.xpath("//span[text()='Sep 2021']"));
        sep.click();
        List<WebElement> sectionSep = driver.findElements(By.xpath("//tr[@class='roXhBd']"));
        for (WebElement each : sectionSep) {
            System.out.print(each.getText());
        }

            }


        }




