package newassignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("(//a[contains(text(),'Lead')])[1]").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("hari.prasath086@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		
		String leadId = driver.findElementByXPath("(//input[@name='companyName'])[2]").getText();
		  System.out.println(leadId); 
		  //click on Edit button 
		 driver.findElementByLinkText("Edit").click();
		 String cName =driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").getText();
		 System.out.println(cName); 
		 //clear company name
		 driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear( ); 
		 //enter new companyname
		 driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("Hexaware");
		 //click on update button
		 driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		 String cName1 =driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText(); 
		 System.out.println(cName1);
		 driver.close();
		 
		

	}

}
