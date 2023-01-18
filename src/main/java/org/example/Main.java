package org.example;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Nova fascikla\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.navigate().to("https://automationexercise.com/");
        WebElement signupLoginOption = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        signupLoginOption.click();
        Faker faker = new Faker(new Locale("en-CA"));  // Nije hteo u Mavenu da mi ucita dependecy za English Canadian.
        String name = faker.name().username();
        String email = faker.internet().emailAddress();
        WebElement enterNameField = driver.findElement(By.name("name"));
        enterNameField.sendKeys(name);
        WebElement enterEmailField = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
        enterEmailField.sendKeys(email);
        WebElement singunButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
        singunButton.click();
        WebElement checkbox0 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[1]/div[1]/label"));
        checkbox0.click();
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("vrika69");
        WebElement selectDay = driver.findElement(By.id("days"));
        Select category0 = new Select(selectDay);
        category0.selectByIndex(10);
        WebElement selectMonth = driver.findElement(By.id("months"));
        Select category1 = new Select(selectMonth);
        category1.selectByIndex(10);
        WebElement selectYear = driver.findElement(By.id("years"));
        Select category2 = new Select(selectYear);
        category2.selectByIndex(26);
        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[6]"));
        checkbox1.click();
        WebElement checkbox2 = driver.findElement(By.id("optin"));
        checkbox2.click();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800)", "");
        WebElement firstNameTextField = driver.findElement(By.id("first_name"));
        firstNameTextField.sendKeys(faker.name().firstName());
        WebElement lastNameTextField = driver.findElement(By.id("last_name"));
        lastNameTextField.sendKeys(faker.name().lastName());
        WebElement companyTextField = driver.findElement(By.id("company"));
        companyTextField.sendKeys(faker.company().name());
        WebElement addressTextField = driver.findElement(By.id("address1"));
        addressTextField.sendKeys(faker.address().fullAddress());
        WebElement addressTextField2 = driver.findElement(By.id("address2"));
        addressTextField2.sendKeys(faker.address().fullAddress());
        WebElement selectCountry = driver.findElement(By.id("country"));
        Select category4 = new Select(selectCountry);
        category4.selectByIndex(2);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement stateTextField = driver.findElement(By.id("state"));
        stateTextField.sendKeys(faker.address().country());
        WebElement cityTextField = driver.findElement(By.id("city"));
        cityTextField.sendKeys(faker.address().city());
        WebElement zipcodeTextField = driver.findElement(By.id("zipcode"));
        zipcodeTextField.sendKeys(faker.address().zipCode());
        WebElement mobileNumberTextField = driver.findElement(By.id("mobile_number"));
        mobileNumberTextField.sendKeys(faker.phoneNumber().cellPhone());
        WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        createAccountButton.click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
        continueButton.click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement deleteAccountButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
        deleteAccountButton.click();
        WebElement continueButton1 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
        continueButton1.click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
        driver.quit();
    }
}