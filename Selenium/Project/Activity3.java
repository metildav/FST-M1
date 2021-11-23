package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
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
    public void verifyTitleOfFirstInfoBox() {
        // Check the title of the First InfoBox
        String title = driver.findElement(By.xpath("//*[@id=\"uagb-infobox-f08ebab0-fbf1-40ec-9b2a-c9feeb3d4810\"]/div/div/div/div[2]/h3")).getText();
            
        //Print the heading of the page
        System.out.println("First InfoBox title is: " + title);
        
        //Assertion for First InfoBox title
        Assert.assertEquals(title, "Actionable Training");
	}
	
	@Test (dependsOnMethods = {"verifyTitleOfFirstInfoBox"})
	public void closeLmsSite() {
		driver.close();
	}
}
