package createPurchaseStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BasicWrap;

public class CreatePurchasePageInmobiliaria extends BasicWrap{
	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_username = By.xpath("//*[@id=\"mat-input-3\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_login = By.cssSelector("span[class=\"ng-star-inserted\"]");
	By locator_public = By.cssSelector("span[_ngcontent-serverapp-c114][class=\"link\"]");
	By locator_inmobiliaria = By.name("inmobiliaria");
	By locator_seePlans = By.cssSelector("a[routerlink=\"/seleccion-ideal\"]");
	By locator_monthsS = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[4]/div/div[2]/div[2]/select");
	By locator_toAssemble = By.cssSelector("a[routerlink=\"/arma-tu-plan\"]");
	By locator_months3 = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[1]/div/div[2]/div[3]/app-base-card/div/div[1]/label");
	
	String username = "leocien21@yopmail.com";
	String password = "100Cien*";
	String planType = "QuieroArmarlo";//VerPlanes, QuieroArmarlo
	String plan = "PlanS";//PlanS, PlanM, PlanL
	String monthsPlan = "3 meses";//1 meses, 3 meses, 6 meses, 9 meses, 12 meses
	
	public CreatePurchasePageInmobiliaria(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void  buys() throws InterruptedException {
		try {
			Thread.sleep(6000);
			click(locator_into);
			type(username, locator_username);
			type(password, locator_password);
			click(locator_login);
			Thread.sleep(5000);
			click(locator_public);
			click(locator_inmobiliaria);
			if(planType.equals("VerPlanes")) {
				click(locator_seePlans);
				if(plan.equals("PlanS")) {
					click(locator_monthsS);			
				}
			}
			if(plan.equals("QuieroArmarlo")) {
					click(locator_toAssemble);
					click(locator_months3);
				}
				
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
}
