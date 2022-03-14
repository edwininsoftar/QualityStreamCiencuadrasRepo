package postStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasicWrap;

public class CreatePropertyPage extends BasicWrap {

	public CreatePropertyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_username = By.cssSelector("input[formcontrolname=\"username\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
}
