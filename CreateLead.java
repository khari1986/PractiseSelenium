package newassignment1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
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
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Syntel");
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("HariPrasad");
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Kaliyaperumal");
		//selectbyvisibletext
		Select dropDownSource = new Select (driver.findElementByName("dataSourceId"));
		dropDownSource.selectByValue("LEAD_EMPLOYEE");
		driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("1650000");
		//selectindustry
		Select dropDownIndustry = new Select (driver.findElementByName("industryEnumId"));
		dropDownIndustry.selectByValue("IND_SOFTWARE");
		//selectownership
		Select dropDownOwnership = new Select (driver.findElementByName("ownershipEnumId"));
		dropDownOwnership.selectByVisibleText("S-Corporation");
		//Enter Description:
		driver.findElementByXPath("//textarea[@name='description']").sendKeys("Selenium Automation Tester");
		//select Marketing campaign
		Select dropDownCampaign = new Select (driver.findElementByName("marketingCampaignId"));
		dropDownCampaign.selectByIndex(5);
		//select state/province
		Select dropDownSTE = new Select (driver.findElementByName("generalStateProvinceGeoId"));
		dropDownSTE.selectByValue("TX");
		//Enter Email
		driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("hari.prasath086@gmail.com");
		//Enter phoneno
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("9962602995");
		//click on createlead
		driver.findElementByXPath("//input[@name='submitButton']").click();
		System.out.println(driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText());
		driver.close();
	}

}
