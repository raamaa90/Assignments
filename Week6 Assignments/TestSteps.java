package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestSteps {
	public ChromeDriver driver;
	public String leadID;
	public Set<String> allWindows;
	public List<String> allhandles;
	public Set<String> allWindows2;
	public List<String> allhandles2;
	
@Given("Open the Chrome browser adn Load the URL")	
public void openbrowser() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
@And ("Enter the Username as Demosalesmanager and Password as crmsfa")	
public void Credential() {
	driver.findElementById("username").sendKeys("Demosalesmanager");
	driver.findElementById("password").sendKeys("crmsfa");
}
@And("Click the Login Button")
public void Login() {
	driver.findElementByClassName("decorativeSubmit").click();
}
@And("Click the CRMSFA Link")
public void CrmsfaLink() {
	driver.findElementByLinkText("CRM/SFA").click();
}
@And("Click the Leads Link")
public void LeadsLink() {
	driver.findElementByLinkText("Leads").click();
}
@And("Click the Create Lead Link")
public void CreateLeadLink() {
	driver.findElementByLinkText("Create Lead").click();
}
@And("Enter the Company Name as (.*)")
public void CName(String CName) {
	driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys(CName);
}
@And("Enter the First Name as (.*)")
public void FName(String FName) {
	driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys(FName);
}
@And("Enter the Last Name as (.*)")
public void LName(String LName) {
	driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys(LName);
}
@And("Click on the Create Lead Button")
public void Submit() {
	driver.findElementByXPath("//input[@class='smallSubmit']").click();
}
@And("Verify the Lead Creation")
public void Verify() {
	String a = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
	System.out.println(a);
}
@And("Verify the error Message")
public void ErrorMessage() {
	boolean displayed = driver.findElement(By.xpath("//li[@class='errorMessage']")).isDisplayed();
	if (displayed==true) {
		System.out.println("Error Messge is Displayed");
		}
	else {
		System.out.println("No Error Message");
	}
}
@And("Logout and close Browser")
public void CloseBrowser() {
	driver.close();
}
@And("Click on Find Lead Link")
public void FindLead() {
	driver.findElementByLinkText("Find Leads").click();
}
@And("Enter the Company name (.*)")
public void CMPName(String CMPName) {
	driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(CMPName);	
}

@And("Enter the First name (.*)")
public void FSTName(String FSTName) {
	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(FSTName);
}
@And("Enter the Last name (.*)")
public void LSTName(String LSTName) {
	driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys(LSTName);
}
@And("Click on Find Button")
public void Find() throws InterruptedException {
	driver.findElementByXPath("(//td[@class='x-btn-center']//button)[7]").click();
	Thread.sleep(3000);
}
@And("Select the Record")
public void SelectRecord() {
	driver.findElementByXPath("(//div[@class='x-grid3-body']//a)[1]").click();
}
@And("Click on Edit Button")
public void EditButton() {
	driver.findElementByLinkText("Edit").click();
}
@And("Enter the New Company Name (.*)")
public void NewCompanyName(String NewComp) {
	driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
	driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys(NewComp);
}
@And("Click on Submit button")
public void SubmitButton() {
	driver.findElementByXPath("//input[@name='submitButton']").click();
}
@And("Verify the Lead Updation")
public void ConfirmUpdation() {
	String c = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
	System.out.println(c);
	System.out.println("Company name is Updated");
}
@And("Click on Phone tab")
public void phonetab() {
	driver.findElementByXPath("//span[text()='Phone']").click();
}
@And("Enter Phone number")
public void PhoneNumber() {
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("98");
}
@And("Click on Duplicate leads Button")
public void DuplicateLeadButton() {
	driver.findElementByLinkText("Duplicate Lead").click();
}
@And("Click on Merge Lead Link")
public void MergeleadsLink() {
	driver.findElementByLinkText("Merge Leads").click();
}
@And("Click on First Lookup icon")
public void FirstLookup() {
	driver.findElementByXPath("//img[@alt='Lookup']").click();
	allWindows = driver.getWindowHandles();
	allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(1));
}
@And("Enter the Fname in lookup as (.*)")
public void FirstName(String FirstName) {
	driver.findElementByXPath("//input[@name='firstName']").sendKeys(FirstName);
}
@And("Click on Findlead Button")
public void FLead() throws InterruptedException {
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(3000);
}
@And("Store the leadID of First record")
public void StoreLeadID() {
	leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
}
@And("Click on Second Lookup icon")
public void SecondLookup() {
	driver.switchTo().window(allhandles.get(0));
	driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
	allWindows2 = driver.getWindowHandles();
	allhandles2 = new ArrayList<String>(allWindows2);
	driver.switchTo().window(allhandles2.get(1));
}
@And("Click on Merge Button")
public void MergeButton() {
	driver.switchTo().window(allhandles2.get(0));
	driver.findElementByXPath("//a[text()='Merge']").click();
}
@And("Accept popup alert")
public void AlertAccept() {
	driver.switchTo().alert().accept();
}
@And("Enter the LeadID")
public void LeadID() {
	driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
	
}
@And("Verify the Lead Merge")
public void LeadExist() {
	String text = driver.findElementByClassName("x-paging-info").getText();
	if (text.equals("No records to display")) {
		System.out.println("Lead Merged");
	} else {
		System.out.println("Lead not Merged");
	}
	
}
@And("Click on Email tab")
public void EmailLink() {
	driver.findElementByLinkText("Email").click();
}
@And("Enter Email Address as xyz@gmail.com")
public void EmailAddress() {
	driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("xyz@gmail.com");
}
@When("Click on Delete Button")
public void DeleteButton() throws InterruptedException {
	driver.findElementByLinkText("Delete").click();
	Thread.sleep(3000);
}
@And("Verify the Lead Deletion")
public void LeadDeleted() {
	String text = driver.findElementByClassName("x-paging-info").getText();
	if (text.equals("No records to display")) {
		System.out.println("Lead Deleted");
	} else {
		System.out.println("Lead not Deleted");
	}
}
}
