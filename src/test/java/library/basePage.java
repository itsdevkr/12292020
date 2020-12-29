package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage {
	public basePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
