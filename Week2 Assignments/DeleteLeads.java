package week2assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeads {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Email").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@gmail.com");
		driver.findElementByXPath("(//td[@class='x-btn-center']//button)[7]").click();
		Thread.sleep(3000);
		String leadid = driver.findElementByXPath("(//div[@class='x-grid3-body']//a)[1]").getText();
		
		driver.findElementByXPath("(//div[@class='x-grid3-body']//a)[1]").click();
		driver.findElementByLinkText("Delete").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadid);
		driver.findElementByXPath("(//td[@class='x-btn-center']//button)[7]").click();
		Thread.sleep(3000);
		
		
		driver.findElementByXPath("//div[text()='No records to display']").getText();
//		
//		if (record == "Norecords to dis")
		
//		boolean record = driver.findElementByXPath("//div[text()='No records to display']").isDisplayed();
//		
//		if(record == true)
//			System.out.println("No records to display");
//		else
//			System.out.println("There are some records exist");
//	
		driver.close();
		
	}

}
