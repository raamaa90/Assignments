package week2assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TestLeaf");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Ram");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Bala");
		
		Select dropdown = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		dropdown.selectByValue("LEAD_EMPLOYEE");
		
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("100000");
		
		Select dropdown1 = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		dropdown1.selectByIndex(3);
		
		Select dropdown2 = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		dropdown2.selectByVisibleText("S-Corporation");
		
		driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("Selenium Automation Tester");
		
		Select dropdown3 = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		dropdown3.selectByIndex(6);
		
		Select dropdown4 = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		dropdown4.selectByValue("TX");
		
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("abc@gmail.com");
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("9874563210");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		String a = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(a);
		
		driver.close();
	}

}
