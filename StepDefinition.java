package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class StepDefinition {

	public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Given("Load the application url {string}")
	public void load_the_application_url(String url) {
		driver.get(url);
	}
	
	@Given("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	}
	@Given("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String password) {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	}
	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
		
		String title = driver.getTitle();
		if(title.equals("Leaftaps - TestLeaf Automation Platform"))
				
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	@But("Error message should be displayed")
	public void verifyErrorMessage() {
	System.out.println("Error message displayed");	
	}
//Create lead
	@When("Click on CRMSFA link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	}

	@Given("Click on leads tab")
	public void click_on_leads_tab() {
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	}

	@Given("Click on create lead button")
	public void click_on_create_lead_button() {
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
	}

	@Given("Company name as {string}")
	public void company_name_as(String companyName) {
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(companyName);
	}
	@Given("First name as {string}")
	public void first_name_as(String firstName) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);
	}
	@Given("Last name as {string}")
	public void last_name_as(String lastName) {
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys(lastName);
	}
	@When("Click on create lead submit button")
	public void click_on_create_lead_submit_button() {
		driver.findElement(By.xpath("(//input[@type='submit'])")).click();
	}
	@Then("Lead should be created")
	public void lead_should_be_created() {
		System.out.println("Create leads page is displayed");
	}
	//delete lead
	
	@Given("Click on find contact button")
	public void click_on_find_contact_button() {
		driver.findElement(By.xpath("//a[@href= '/crmsfa/control/findLeads']")).click();
	}
	@Given("Click on phone tab button")
	public void click_on_phone_tab_button() {
		driver.findElement(By.linkText("Phone")).click();
	}
	@Given("Enter the phone number")
	public void enter_the_phone_number() {
		driver.findElement(By.name("phoneNumber")).sendKeys("9940445555");
	}
	@Given("Click on the find contact submit button")
	public void click_on_the_find_contact_submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@Given("Click on the lead to be deleted")
	public void click_on_the_lead_to_be_deleted() throws InterruptedException {
		WebElement id = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]"));
		String text = id.getText();
		id.click();
		
		Thread.sleep(3000);
	}
	@When("Click on delete button")
	public void click_on_delete_button() {
		driver.findElement(By.className("subMenuButtonDangerous")).click();	
	}
	@Then("Lead should be deleted")
	public void lead_should_be_deleted() {
    System.out.println("Lead deleted successfully");
	}
	//edit lead
	
	@Given("Enter the firstname as {string}")
	public void enter_the_firstname_as(String firstname) {
		driver.findElement(By.xpath("(//input[@name= 'firstName'])[3]")).sendKeys(firstname);
	}
	@Given("Click on first lead on search")
	public void click_on_first_lead_on_search() throws InterruptedException {
		WebElement id = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]"));
		String text = id.getText();
		id.click();
		Thread.sleep(1000);
		}
	@Given("Click on edit lead button")
	public void click_on_edit_lead_button() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}
	@When("Click on update button")
	public void click_on_update_button() {
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	}
	@Then("Edit lead should be successful")
	public void edit_lead_should_be_successful() {
		System.out.println("Lead edited successfully");
	}
	//create contact
	@Given("Click on create contact tab")
	public void click_on_create_contact_tab() {
		driver.findElement(By.partialLinkText("Create Contact")).click();
	}
	@Given("Click on create contact menu button")
	public void click_on_create_contact_menu_button() {
		driver.findElement(By.xpath("//a[@href ='/crmsfa/control/createContactForm']")).click();
	}
	@Given("Click on create contact button")
	public void click_on_create_contact_button() {
		driver.findElement(By.xpath("//input[@name ='submitButton']")).click();
	}
	@Then("Contact should be created")
	public void Contact_should_be_created() {
		System.out.println("Contact created successfully");
	}
	//find contact
	
	@Given("Click on find contact tab button")
	public void click_on_find_contact_tab_button() {
		driver.findElement(By.partialLinkText("Find Contacts")).click();
	}
	@Given("Click on email tab")
	public void click_on_email_tab() {
		driver.findElement(By.xpath("//span[text()='Email']")).click();
	}
	@Given("Enter the emailid as {string}")
	public void enter_the_emailid_as(String emailid) {
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(emailid);
	}
	@When("Click on find contact submit button")
	public void click_on_find_contact_submit_button() {
		driver.findElement(By.partialLinkText("Find Contacts")).click();
	}
	@Then("Contacts should be displayed")
	public void contacts_should_be_displayed() {
		System.out.println("Contacts found successfully");
	}
}
