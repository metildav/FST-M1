package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.Assert;

public class Activity5 {
	WebDriver driver;
	
	@BeforeClass
	public void openLmsSite() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}

	@Test
	public void navigateToMyAccount() {
		driver.findElement(By.linkText("My Account")).click();
		//check the title of My Account page
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		Assert.assertEquals(title, "My Account – Alchemy LMS");
		
	}

	@Test (dependsOnMethods = {"navigateToMyAccount"}) 
	public void closeLmsSite() {
		driver.close();
	}
}
