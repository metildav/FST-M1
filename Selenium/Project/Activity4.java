package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
    public void openLmsSite() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }
	
	@Test
    public void verifyTitleOfSecondMostPopularCourse() {
        // Check the title of second most popular course
        String title = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3")).getText();
                    
        //Print the title of second most popular course
        System.out.println("Second most popular course is: " + title);
        
        //Assertion for the title of second most popular course
        Assert.assertEquals(title, "Email Marketing Strategies");
	}
	
	@Test (dependsOnMethods = {"verifyTitleOfSecondMostPopularCourse"})
	public void closeLmsSite() {
		driver.close();
	}
}
