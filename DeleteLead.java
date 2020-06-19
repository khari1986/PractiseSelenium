package newassignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		
		String leadId = driver.findElementByXPath("(//div[@class='x-grid3-body']//a)[1]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-body']//a)[1]").click();
		
		driver.findElementByLinkText("Delete").click();
		Thread.sleep(3000);
		
		//driver.findElementByXPath("//div[text()='No records to display']").getText();
	}

}
