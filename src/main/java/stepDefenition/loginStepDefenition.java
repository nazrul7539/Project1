package stepDefenition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class loginStepDefenition {
	
	WebDriver driver;
	
	 @Given("^User already in the login page$")
	public void User_already_in_the_login_page(){
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shohagh\\Desktop\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://ui.cogmento.com/");
		 driver.manage().window().maximize();
	}
	 
	 @When("^User veryfy the CRM title$")
	 public void User_veryfy_the_CRM_title(){
		String title = driver.getTitle();
		System.out.println("The page title is : "+title);
		Assert.assertEquals(title,"Cogmento CRM");
			 
	 }
	 
	 @Then("^User enter valid username and password$")
	 public void User_enter_valid_username_and_password(){
		 
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nishohagh@yahoo.com");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sareea123@");
	 
	 }
	 
	 @Then("^User able to click on login Button$")
	 public void User_able_to_click_on_login_Button(){
		 driver.findElement(By.xpath("//div[text()='Login']")).click();
		 String loginTitile = driver.getTitle();
		 
	 }
}
