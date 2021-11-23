package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
WebDriver driver;
WebDriver wait;
	
	@BeforeClass
	public void openLmsSite() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}

	@Test
	public void navigateToContact() {
		driver.findElement(By.linkText("Contact")).click();
		//check the title of Contact page
		String title = driver.getTitle();
		System.out.println("Yor are now in : " + title + " page....");
		Assert.assertEquals(title, "Contact – Alchemy LMS");
		
	}
	
	@Test (dependsOnMethods = {"navigateToContact"})
	public void fillForm() {
		WebElement fullName = driver.findElement(By.id("wpforms-8-field_0"));
		WebElement email = driver.findElement(By.id("wpforms-8-field_1"));
		WebElement subject = driver.findElement(By.id("wpforms-8-field_3"));
		WebElement comment = driver.findElement(By.id("wpforms-8-field_2"));
		fullName.sendKeys("Jeyanthi V");
		email.sendKeys("jeyv@abc.com");
		subject.sendKeys("Computer");
		comment.sendKeys("Test Comment");
		driver.findElement(By.id("wpforms-submit-8")).click();
		String confMsg = driver.findElement(By.id("wpforms-confirmation-8")).getText();
		System.out.println("Submission Successful..... " + confMsg);
		}
		
	@Test (dependsOnMethods = {"fillForm"})
	public void closeSite() {
		driver.close();
	}
	}

	

