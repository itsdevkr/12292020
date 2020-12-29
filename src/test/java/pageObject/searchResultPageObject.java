package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.basePage;

public class searchResultPageObject extends basePage{

	public searchResultPageObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[@href='https://www.instagram.com/']/h3")
	public WebElement instagramLink;
	public WebElement instagramLink() {
		return instagramLink;
	}
	
	@FindBy(xpath="//h3[@class='LC20lb DKV0Md']")
	public WebElement twitterLink;
	public WebElement twitterLink() {
		return twitterLink;
	}

}
