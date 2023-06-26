package week5.day2;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ProjectSpecificMethod {

public ChromeDriver driver;
    @Test
    public void launchBrowser() {
    	ChromeDriver driver=new ChromeDriver();
		//Load the url http://leaftaps.com/opentaps/control/login
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser
		driver.manage().window().maximize();
		//Find the element username  Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Find the element password Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	
		//Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//To verify the page Loaded
	}
    
    
}
	
	

	
	

