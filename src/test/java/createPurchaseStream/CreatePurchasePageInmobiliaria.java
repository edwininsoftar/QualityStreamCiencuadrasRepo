package createPurchaseStream;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularCssContainingText;
import com.paulhammant.ngwebdriver.NgWebDriver;

import Base.BasicWrap;

public class CreatePurchasePageInmobiliaria extends BasicWrap{
	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_username = By.xpath("//*[@id=\"mat-input-3\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_login = By.cssSelector("span[class=\"ng-star-inserted\"]");
	By locator_public = ByAngularCssContainingText.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/a[2]/span[2]");
	By locator_inmobiliaria = By.name("inmobiliaria");
	By locator_seePlans = By.cssSelector("a[routerlink=\"/seleccion-ideal\"]");
	By locator_monthsS = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[4]/div/div[2]/div[2]/select");
	By locator_toAssemble = By.cssSelector("a[routerlink=\"/arma-tu-plan\"]");
	//Formulario de pago arma tu plan 
	By locator_oneMonths = By.cssSelector("label[for=\"52\"]");
	
	String username = "inmobiliariaciencuadras1@yopmail.com";
	String password = "100Cuadras%";
	String planType = "QuieroArmarlo";//VerPlanes, QuieroArmarlo
	String plan = "PlanS";//PlanS, PlanM, PlanL
	String monthsPlan = "3 meses";//1 meses, 3 meses, 6 meses, 9 meses, 12 meses
	
	public CreatePurchasePageInmobiliaria(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void buys() throws InterruptedException {
		try {
			JavascriptExecutor js =(JavascriptExecutor) driver;
			NgWebDriver ngDriver = new NgWebDriver(js);
			ngDriver.waitForAngularRequestsToFinish();
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(60));
			ewait.until(ExpectedConditions.elementToBeClickable(locator_into)).click();
			type(username, locator_username);
			type(password, locator_password);
			click(locator_login);
			Thread.sleep(5000);
			//ewait.until(ExpectedConditions.elementToBeClickable(locator_public)).click();
			click(locator_public);
			click(locator_inmobiliaria);
			if(planType.equals("VerPlanes")) {
				click(locator_seePlans);
				if(plan.equals("PlanS")) {
					click(locator_monthsS);			
				}
			}
			if(planType.equals("QuieroArmarlo")) {
					click(locator_toAssemble);
					//click(locator_oneMonths);
				}
			Thread.sleep(5000);	
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void formMonths() {
		try {
			Thread.sleep(5000);	
			click(locator_oneMonths);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
}
