package week2newday2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignment {

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
		
		//click on leads link
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		//click on Find leads link
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		//click on phone tab:
		driver.findElementByXPath("//span[text()='Phone']").click();
		
		//firstname textbox xpath:
		
		driver.findElementByXPath("((//label[text()='First name:'])[3]/following::input[1]").sendKeys("Hari Prasath");

		//click findleads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		//click on Mergeleads button
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		//click on lookup link:
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		//locate the first leadid
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	
		
	}

}
