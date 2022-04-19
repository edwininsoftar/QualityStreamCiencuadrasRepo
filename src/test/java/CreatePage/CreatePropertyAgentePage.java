package CreatePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasicWrap;

public class CreatePropertyAgentePage extends BasicWrap{
	
	//Flujo crear rol Agente
	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_username = By.xpath("//*[@id=\"mat-input-3\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_login = By.cssSelector("span[class=\"ng-star-inserted\"]");
	By locator_user = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]");
	By locator_publishedProperty = By.linkText("Mis Inmuebles Favoritos");
	
	//Flujo crear rol Agente
	String username = "agenteciencuadras1@yopmail.com";
	String password = "@Contraseña112";
	
	public CreatePropertyAgentePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub 
	}
	
	public void login() {
		try {
			Thread.sleep(8000);
			click(locator_into);
			type(username, locator_username);
			type(password, locator_password);
			click(locator_login);
			Thread.sleep(8000);
			click(locator_user);
			click(locator_publishedProperty);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}

}
