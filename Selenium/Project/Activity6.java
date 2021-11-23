package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
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
	public void loginToSite() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div[2]/div[2]/div[2]/a")).click();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
		String profName = driver.findElement(By.className("display-name")).getText();
		Assert.assertEquals(profName, "root");
	}

	@Test (dependsOnMethods = {"navigateToMyAccount", "loginToSite"}) 
	public void closeLmsSite() {
		System.out.println("Logged in successfully as " + driver.findElement(By.className("display-name")).getText());
		driver.close();
	}
}
