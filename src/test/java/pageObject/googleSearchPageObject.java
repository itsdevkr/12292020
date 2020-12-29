package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.basePage;

public class googleSearchPageObject extends basePage{

	public googleSearchPageObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='input']")
	public WebElement searchTextBox;
	public WebElement searchTextBox() {
		return searchTextBox;
	}

	
	
}
