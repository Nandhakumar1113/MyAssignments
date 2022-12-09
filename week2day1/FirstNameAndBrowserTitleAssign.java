package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstNameAndBrowserTitleAssign {

	public static void main(String[] args) throws InterruptedException {
	
	    ChromeDriver driver= new ChromeDriver();
	    System.out.println(driver);
	
	 //Open the browser
	    //Load the URL
	    driver.get("http://leaftaps.com/opentaps/control/login");
//Maximize the browser
	    driver.manage().window().maximize();
	    
	    //Enter UserName and Password
	    driver.findElement(By.id("username")).sendKeys("demosalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    
      	// Click Login
	driver.findElement(By.className("decorativeSubmit")).click();
	  
	//Click CRM/SFA
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	 //Click Contacts Tab
	    driver.findElement(By.linkText("Contacts")).click();
	        
	  //  Click Create Contact
	    driver.findElement(By.linkText("Create Contact")).click();
	    
	    //Type First Name
	   driver.findElement(By.id("firstNameField")).sendKeys("Nandha");
	   
	    // Type Last Name
	  driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
	  
	    //  Click Create Contact Button
	  driver.findElement(By.name("submitButton")).click();
	  
	    //Print the first name  
	   WebElement FirstName = driver.findElement(By.id("viewContact_firstName_sp"));
	   String Name = FirstName.getText();
	System.out.println("FirstName:"+Name);
	   //print browser title
	   String BrowserTitle = driver.getTitle();
	  System.out.println(BrowserTitle);
	  
	   // Close the browser
driver.close();
	}

}
