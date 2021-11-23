package activities;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;


public class Activity1 {
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
    public void verifyTitle() {
        // Check the title of the page
        String title = driver.getTitle();
            
        //Print the title of the page
        System.out.println("Page title is: " + title);
        
        //Assertion for page title
       Assert.assertEquals(title, "Alchemy LMS – An LMS Application");
	}
	
	@Test (dependsOnMethods = {"verifyTitle"})
	public void closeLmsSite() {
		driver.close();
	}

}
