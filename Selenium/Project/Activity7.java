package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
WebDriver driver;
	
	@BeforeClass
	public void openLmsSite() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}

	@Test
	public void navigateToAllCourses() {
		driver.findElement(By.linkText("All Courses")).click();
		//check the title of My Account page
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		Assert.assertEquals(title, "All Courses – Alchemy LMS");
		
	}
	
	@Test (dependsOnMethods = {"navigateToAllCourses"})
	public void countAllCourses() {
		List<WebElement> elements = driver.findElements(By.className("caption"));
		System.out.println("Number of Courses: " + elements.size());
		for(WebElement e : elements) {
			System.out.println(e.findElement(By.className("entry-title")).getText());
		}
		
	}

	@Test (dependsOnMethods = {"navigateToAllCourses", "countAllCourses"}) 
	public void closeLmsSite() {
		driver.close();
	}
}
