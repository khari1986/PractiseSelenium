package week2new.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLogin {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//open a new chrome browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		//Maximize the browser
		driver.manage().window().maximize();
		//to locate an element
		WebElement eleUsername = driver.findElementById("username");
		eleUsername.sendKeys("Demosalesmanager");
		//to enter password
		WebElement elePassword = driver.findElementById("password");
		elePassword.sendKeys("crmsfa");
		//click on login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//click on CRMSFA link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click on Leads
		driver.findElementByLinkText("Leads").click();
		
		//Click on create lead button
		driver.findElementByLinkText("Create Lead").click();
		
		//Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Mindtree");
		
		//Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Enter firstname
		
		driver.findElementById("createLeadForm_firstName").sendKeys("HariPrasad");
		
		//Wait 30 seconds
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter lastname
		driver.findElementById("createLeadForm_lastName").sendKeys("DKaliyaperumal");		
		
		//click on createlead button
		driver.findElementByClassName("smallSubmit").click();
		
		
		
	}

}
