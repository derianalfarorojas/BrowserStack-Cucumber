import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.VirtualDevices;

import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    WebDriver driver;
    VirtualDevices virtualDevices;

    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable
    {
        ///WebDriver///
      //  System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
      //  driver = new ChromeDriver();
      //  driver.manage().window().maximize();
      //  driver.get("http://demo.guru99.com/v4");

        ///BrowserStack///
        virtualDevices = new VirtualDevices();
        driver = virtualDevices.device();
        driver.get("http://demo.guru99.com/v4");


    }
    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable
    {
        driver.findElement(By.name("uid")).sendKeys("username12");
        driver.findElement(By.name("password")).sendKeys("password12");
    }
    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable
    {
        driver.findElement(By.name("btnReset")).click();
    }
}