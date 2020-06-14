package week2newday2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadTCxpath {

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
		
		//clicking on CRMSFA link
		//driver.findElementByXPath("//a[contains(text(),'CRM/SFA'").click();
		
		//click on leads link
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		//click on CreateLead
		
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		//Enter company Name
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Maverick");
		
		//Enter firstname
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Prasath");
		
		//Enter Last name
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Hariharan");

		//Click on Create Lead
		
		driver.findElementByXPath("//input[@type='submit']").click();
		
		//gettext of company name:
		
		System.out.println(driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText());
		
	}

}
