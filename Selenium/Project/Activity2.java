package activities;

import org.testng.annotations.*;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity2 {
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
    public void verifyHeading() {
        // Check the heading of the page
        String heading = driver.findElement(By.className("uagb-ifb-title")).getText();
            
        //Print the heading of the page
        System.out.println("Page heading is: " + heading);
        
        //Assertion for page heading
        Assert.assertEquals(heading, "Learn from Industry Experts");
	}
	
	@Test (dependsOnMethods = {"verifyHeading"})
	public void closeLmsSite() {
		driver.close();
	}
}
