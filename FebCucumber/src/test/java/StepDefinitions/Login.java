package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static WebDriver driver;

    @Before
    public void before(){
        System.out.println("This is Before Scenario");
    }

    @After
    public void after(){
        System.out.println("This is after scenario");
    }


    @Given("The user is in Login page")
    public void the_user_is_in_login_page() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://www.whiteboxqa.com/login.php");
    }

    @When("^The user enters (.*) and (.*)$")
    public void the_user_enters_username_and_password(String uname, String pwd) {
        driver.findElement(By.id("username")).sendKeys(uname);
        driver.findElement(By.id("password")).sendKeys(pwd);
    }

    @And("click on Login Button")
    public void click_on_login_button() {
        driver.findElement(By.id("login")).click();
    }

    @Then("The user should be logged In")
    public void the_user_should_be_logged_in() {
        System.out.println(driver.getTitle());
    }


}
