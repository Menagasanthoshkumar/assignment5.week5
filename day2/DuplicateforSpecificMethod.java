package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DuplicateforSpecificMethod extends ProjectSpecificMethod  {
	@Test
	public  void testCreateLead() throws InterruptedException{


		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();	

     }

}
