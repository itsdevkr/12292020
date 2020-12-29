package testScript;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.baseTest;
import pageObject.googleSearchPageObject;
import pageObject.searchResultPageObject;

public class testInstagram extends baseTest{

	@Test
	public void instagram() {
		try {
			googleSearchPageObject gsp = new googleSearchPageObject(driver);
			gsp.searchTextBox().sendKeys("Instagram");
			gsp.searchTextBox().sendKeys(Keys.ENTER);
			
			searchResultPageObject srp = new searchResultPageObject(driver);
			srp.instagramLink().click();
			
			String expTitle="Instagrm";
			String actTitle = driver.getTitle();
			System.out.println(actTitle);
			
			AssertJUnit.assertEquals(expTitle, actTitle);
			Reporter.log("Instagram Title is matched!!", true);
			
		} catch(Exception e) {
			Reporter.log("Instagram Title is not matched!!", true);
			Assert.fail();
		}
	}
	
}
