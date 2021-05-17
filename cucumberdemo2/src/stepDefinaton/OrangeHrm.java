package stepDefinaton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHrm 
{
	WebDriver driver;
	@Given("^open chrome browser$")
	public void open_chrome_browser() throws Throwable 
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\webdriver\\chromedriver.exe");
	 driver=new ChromeDriver();
	}

	@Then("^get valid url$")
	public void get_valid_url() throws Throwable 
	{
	  System.out.println("url is enter");
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	}

	@When("^login with valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_with_valid_and(String uname, String pass) throws Throwable {
	  System.out.println("login with username and password"); 
	  driver.findElement(By.name("txtUsername")).sendKeys(uname);
	  driver.findElement(By.name("txtPassword")).sendKeys(pass);
	  driver.findElement(By.name("Submit")).click();
	}

	@Then("^user login succesfully and home page should be diplayed$")
	public void user_login_succesfully_and_home_page_should_be_diplayed() throws Throwable {
	  System.out.println("user is login succesfully");  
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   System.out.println("close the browser"); 
	   driver.quit();
	}



}
