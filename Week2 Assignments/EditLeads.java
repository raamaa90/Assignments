package week2assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeads {

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
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Testleaf");
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Ram");
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Bala");
		driver.findElementByXPath("(//td[@class='x-btn-center']//button)[7]").click();
		Thread.sleep(3000);
		//driver.wait(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-body']//a)[1]").click();
		
		String a = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(a);
	
		driver.findElementByLinkText("Edit").click();
		
		String b = driver.findElementByName("companyName").getText();
		System.out.println(b);
		
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Newland");
		driver.findElementByXPath("//input[@name='submitButton']").click();
		
		String c = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(c);
		
		driver.close();
	}

}
