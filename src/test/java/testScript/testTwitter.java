package testScript;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.baseTest;
import pageObject.googleSearchPageObject;
import pageObject.searchResultPageObject;

public class testTwitter extends baseTest{
	
	@Test
	public void twitterLink() {
		try {
			googleSearchPageObject gsp = new googleSearchPageObject(driver);
			gsp.searchTextBox().sendKeys("twitter");
			gsp.searchTextBox().sendKeys(Keys.ENTER);
			
			searchResultPageObject srp = new searchResultPageObject(driver);
			srp.twitterLink().click();
			
			String expTitle = "Twitter";
			String actTitle = driver.getTitle();
			
			AssertJUnit.assertEquals(expTitle, actTitle);
			Reporter.log("Twitter link is matched", true);
		}catch(Exception e) {
			Reporter.log("Twitter Link is not matched!!", true);
			Assert.fail();
		}
	}

}
