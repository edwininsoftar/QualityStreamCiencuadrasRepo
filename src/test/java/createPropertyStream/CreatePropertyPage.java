package createPropertyStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasicWrap;

public class CreatePropertyPage extends BasicWrap {

	public CreatePropertyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_username = By.xpath("//*[@id=\"mat-input-3\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_login = By.cssSelector("span[class=\"ng-star-inserted\"]");
	By locator_public = By.cssSelector("span[_ngcontent-serverapp-c114]");
	By locator_person = By.name("persona");
	By locator_publicTu = By.cssSelector("span[class=\"card-item__type d-flex d-md-none\"]");
	
	String username = "juanlag4545@yopmail.com";
	String password = "Ciencuadras21*";
	
	public void login() throws InterruptedException {
		try {
			Thread.sleep(6000);
			click(locator_into);
			type(username, locator_username);
			type(password, locator_password);
			click(locator_login);
			click(locator_public);
		} catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
}
