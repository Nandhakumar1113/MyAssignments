package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadAssignment {

	public static void main(String[] args) throws InterruptedException {

		    ChromeDriver driver= new ChromeDriver();
		    System.out.println(driver);
		    
		 //Launch URL
		    driver.get("http://leaftaps.com/opentaps/control/login");
		    driver.manage().window().maximize();
		    //Enter UserName and Password Using Id Locator
		    driver.findElement(By.id("username")).sendKeys("demosalesManager");
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
          	// Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		  //Click on CRM/SFA Link
		    driver.findElement(By.linkText("CRM/SFA")).click();
		    // Click on Leads Button
		    driver.findElement(By.linkText("Leads")).click();
		  // Click on Create Lead 
		    driver.findElement(By.linkText("Create Lead")).click();
		  // Enter CompanyName Field Using id Locator
		    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		    Thread.sleep(2000);
		  // Enter FirstName Field Using id Locator
		    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhakumar");
		    Thread.sleep(2000);
		  // Enter LastName Field Using id Locator
		    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		    Thread.sleep(2000);
		 //Enter FirstName(Local) Field Using id Locator
		    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nandha");
		    Thread.sleep(2000);
		// Enter Department Field Using any Locator of Your Choice
		    driver.findElement(By.name("departmentName")).sendKeys("Selenium");
		    Thread.sleep(2000);
		  // Enter Description Field Using any Locator of your choice 
		  driver.findElement(By.name("description")).sendKeys("Learn Selenium Automation");
		    Thread.sleep(2000);
		    // Enter your email in the E-mail address Field using the locator of your choice
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nandha111@gmail.com");
		    Thread.sleep(2000);
		    // Click on Create Button
          driver.findElement(By.className("smallSubmit")).click();
          Thread.sleep(2000);
		    //Get the Title of Resulting Page. 
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
