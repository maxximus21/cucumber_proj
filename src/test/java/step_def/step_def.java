package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooks;

public class step_def {
	
	WebDriver driver = hooks.driver;
	
	@Given("user navigated to homepage")
	public void user_navigated_to_homepage() throws InterruptedException {
	    
		driver.get("http://elearningm1.upskills.in/");
		Thread.sleep(1000);
	    
	}

	@Then("user enters valid username and password")
	public void user_enters_valid_username_and_password() throws InterruptedException {
	    
		driver.findElement(By.name("login")).sendKeys("ashmaxx21");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("Ashmaxx@21");
		
	    
	}

	@Then("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
	    
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='submitAuth']")).click();
		
	    
	}

	@Then("user lands on homepage")
	public void user_lands_on_homepage() {
	    
		driver.getTitle();
	   
	}


	@Then("click on edit profile")
	public void click_on_edit_profile() throws InterruptedException {
	    
		Thread.sleep(1000);
		driver.findElement(By.linkText("Edit profile")).click();
		
	
	}

	@Given("user is on edit profile page")
	public void user_is_on_edit_profile_page() {
	    
		driver.getTitle();
	   
	}

	@When("user clicks on pass field")
	public void user_clicks_on_pass_field() {
	    
	    
	}

	@When("user enters valid pass")
	public void user_enters_valid_pass() throws InterruptedException {
	    
		driver.findElement(By.name("password0")).sendKeys("Ashmaxx@21");
		Thread.sleep(1000);
	   
	}

	@Then("user clicks on new password")
	public void user_clicks_on_new_password() {
	    

	}

	@Then("user enters valid new password")
	public void user_enters_valid_new_password() throws InterruptedException {
	    
		driver.findElement(By.name("password1")).sendKeys("newpass");
		Thread.sleep(1000);
	   
	}

	@Then("user clicks on confirm password")
	public void user_clicks_on_confirm_password() {
	    
	    
	}

	@Then("user enters valid confirm password")
	public void user_enters_valid_confirm_password() throws InterruptedException {
	    
		driver.findElement(By.name("password2")).sendKeys("newpass");
		Thread.sleep(1000);
	    
	}

	@Then("user clicks on save settings")
	public void user_clicks_on_save_settings() {
	    
		driver.findElement(By.xpath("//button[@name='apply_change']")).click();
	   
	}

	@Then("validation message appears")
	public void validation_message_appears() {
	    
		System.out.println("Changes have been saved");
	   
	}

	@When("user clicks on change language drop down")
	public void user_clicks_on_change_language_drop_down() throws InterruptedException {
		
		driver.findElement(By.xpath("//label[contains(text(),'Language')]/following-sibling::div/div")).click();
		Thread.sleep(1000);
		
	}

	@When("user inputs valid language")
	public void user_inputs_valid_language() throws InterruptedException {
	    
		driver.findElement(By.xpath("//label[contains(text(),'Language')]/following-sibling::div/div/div/ul/li[6]")).click();
		Thread.sleep(1000);
		    
	}

	@Then("press enter key")
	public void press_enter_key() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("user click on new invitation drop dowm")
	public void user_click_on_new_invitation_drop_dowm() throws InterruptedException {
	    
		driver.findElement(By.xpath("//label[contains(text(),'Notify by mail on new invitation')]/following-sibling::div/div/button")).click();
		Thread.sleep(1000);
		
	}
	
	@When("user selects once a day")
	public void user_selects_once_a_day() {
		
		driver.findElement(By.xpath("//label[contains(text(),'Notify by mail on new invitation')]/following-sibling::div/div/div/ul/li[2]")).click();
		System.out.println("new invitation changed to once a day");
	  
	}

	@When("user click on personal message drop dowm")
	public void user_click_on_personal_message_drop_dowm() throws InterruptedException {
	    
		driver.findElement(By.xpath("//label[contains(text(),'Notify by mail on new personal')]/following-sibling::div/div/button")).click();
		Thread.sleep(1000);
		
	}

	@When("user selects no")
	public void user_selects_no() {
	    
		driver.findElement(By.xpath("//label[contains(text(),'Notify by mail on new personal')]/following-sibling::div/div/div/ul/li[3]")).click();
		System.out.println("new personal message changed to no");
	   
	}

	@When("user clicks on message in group drop down")
	public void user_clicks_on_message_in_group_drop_down() throws InterruptedException {
	    
		driver.findElement(By.xpath("//label[contains(text(),'Notify by mail on new message')]/following-sibling::div/div/button")).click();
		Thread.sleep(1000);
	   
	}

	@When("user selects upon reception")
	public void user_selects_upon_reception() {
		
		driver.findElement(By.xpath("//label[contains(text(),'Notify by mail on new message')]/following-sibling::div/div/div/ul/li[1]")).click();
		System.out.println("new group message changed to upon reception");
	   
	}

}
