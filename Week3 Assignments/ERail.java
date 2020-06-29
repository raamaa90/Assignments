package week3assignment;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ERail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).isEnabled();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS", Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("CBE", Keys.ENTER);
		
		
		List<WebElement> trainlist = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a"));
		int totaltrain = trainlist.size();
		System.out.println("Total Number of Trains in List: " + totaltrain);
		
		Set<WebElement> trainset = new HashSet<WebElement>();
		
		for (int i = 0; i < totaltrain; i++) {

			trainset.add(trainlist.get(i));
		}
		
		int trainsize = trainset.size();
		System.out.println("Total Number of Trains in Set: " + trainsize);
		
		if (totaltrain == trainsize) {
			
			System.out.println("Train Names are Unique");
			
		}
		
		else
			System.out.println("Train Names are not Unique");
		
		driver.close();

		
	}
}
