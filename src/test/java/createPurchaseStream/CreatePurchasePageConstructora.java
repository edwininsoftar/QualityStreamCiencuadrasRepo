package createPurchaseStream;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasicWrap;

public class CreatePurchasePageConstructora extends BasicWrap {

	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_username = By.xpath("//*[@id=\"mat-input-3\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_login = By.cssSelector("span[class=\"ng-star-inserted\"]");
	By locator_public = By.cssSelector("span[_ngcontent-serverapp-c114][class=\"link\"]");
	By locator_Constructora = By.name("constructora");
	By locator_seePlans = By.cssSelector("a[routerlink=\"/seleccion-ideal\"]");
	// localizadores planes semanales
	By locator_buttonWeeklyPlans = By.id("mat-button-toggle-1-button");
	By locator_buttonProjects1S = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[4]/div/div[2]/div/button");
	By locator_buttonProjects2S = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[5]/div/div[2]/div/button");
	By locator_buttonProjects3S = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[6]/div/div[2]/div/button");
	// localizadores planes anuales
	By locator_buttonAnnualPlans = By.id("mat-button-toggle-2-button");
	By locator_buttonProjects3 = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[7]/div/div[2]/div/button");
	By locator_buttonProjects2 = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[6]/div/div[2]/div/button");
	By locator_buttonProjects1 = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[5]/div/div[2]/div/button");
	By locator_buttonProjects4 = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[8]/div/div[2]/div/button");
	// botones Agregar productos adicionales
	By locator_buttonRoute = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/app-product-card[1]/div/div[2]/div/div/button[2]/span");
	By locator_buttonPhotoTaking = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/app-product-card[2]/div/div[2]/div/div/button[2]/span");
	By locator_buttonPhotoUpload = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/app-product-card[3]/div/div[2]/div/div/button[2]/span");
	By locator_buttonFeatured = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[2]/div/app-product-card[1]/div/div[2]/div/div/button[2]/span");
	By locator_buttonPromoted = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[2]/div/app-product-card[2]/div/div[2]/div/div/button[2]/span");
	By locator_buttonOnline = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[3]/div/app-product-card/div/div[2]/div/div/button[2]/span");
	By locator_buttonShoppingCart = By.xpath("//*[@id=\"products-base\"]/app-header/div/nav/button");
	By locator_buttonPay = By.cssSelector("button[class=\"button secondary rounded block\"]");			
	//Formulario de pago 
	By locator_Nit = By.cssSelector("input[formcontrolname=\"document\"]");
	By locator_DV = By.cssSelector("input[formcontrolname=\"nitVerification\"]");
	By locator_city = By.cssSelector("input[formcontrolname=\"city\"]");
	By locator_address = By.cssSelector("input[formcontrolname=\"address\"]");
	By locator_email = By.cssSelector("input[formcontrolname=\"email\"]");
	By locator_confirmEmail = By.cssSelector("input[formcontrolname=\"emailConfirmation\"]");
	By locator_cell = By.cssSelector("input[formcontrolname=\"mobile\"]");
	
	String username = "pruebaconstructora1@yopmail.com";
	String password = "100Cuadras%";
	String typePlan = "PlanesSemanales";// PlanesSemanales//PlanesAnuales
	String proyectNumber = "1Proyecto";// 1Proyecto, 2Proyecto, 3Proyecto
	// producctos adicionales
	int route = 0; 
	int photoTaking = 0;
	int photoUpload = 0;
	int featured = 0;
	int promoted = 0;
	int online = 0;
	// Formulario de pago
	String Nit = "900457893";// ingrese el nit 
	String dv = "7";//ingrese el digito de verificación
	String city = "Bogotá";// ingrese la ciudad
	String address = "Calle 128 # 52-53";// ingrese la direción
	String email = "pruebaconstructora1@yopmail.com";
	String confirmEmail = "pruebaconstructora1@yopmail.com";
	String cell = "3202159841";
	
	public CreatePurchasePageConstructora(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void buys() throws InterruptedException {
		try {
			Thread.sleep(6000);
			click(locator_into);
			type(username, locator_username);
			type(password, locator_password);
			click(locator_login);
			Thread.sleep(5000);
			click(locator_public);
			click(locator_Constructora);
			click(locator_seePlans);
			if (typePlan.equals("PlanesSemanales")) {
				click(locator_buttonWeeklyPlans);
				Thread.sleep(5000);
				if (proyectNumber.equals("1Proyecto")) {
					click(locator_buttonProjects1S);
				}
				if (proyectNumber.equals("2Proyecto")) {
					click(locator_buttonProjects2S);
				}
				if (proyectNumber.equals("3Proyecto")) {
					click(locator_buttonProjects3S);
				}
			}
			if (typePlan.equals("PlanesAnuales")) {
				click(locator_buttonAnnualPlans);
				Thread.sleep(5000);
				if (proyectNumber.equals("1Proyecto")) {
					click(locator_buttonProjects1);
				}
				if (proyectNumber.equals("2Proyecto")) {
					click(locator_buttonProjects2);
				}
				if (proyectNumber.equals("3Proyecto")) {
					click(locator_buttonProjects3);
				}
			}
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void paymentSelection()  throws InterruptedException {
		try {
			if (route != 0) {
				for (int i = 0; i < route; i++) {
					click(locator_buttonRoute);
				}
			}
			if (photoTaking != 0) {
				for (int i = 0; i < photoTaking; i++) {
					click(locator_buttonPhotoTaking);
				}
			}
			if (photoUpload != 0) {
				for (int i = 0; i < photoUpload; i++) {
					click(locator_buttonPhotoUpload);
				}
			}
			if (featured != 0) {
				for (int i = 0; i < featured; i++) {
					click(locator_buttonFeatured);
				}
			}
			if (promoted != 0) {
				for (int i = 0; i < promoted; i++) {
					click(locator_buttonPromoted);
				}
			}
			if (online != 0) {
				for (int i = 0; i < online; i++) {
					click(locator_buttonOnline);
				}
			}
			click(locator_buttonShoppingCart);
			Thread.sleep(3000);
			click(locator_buttonPay);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
	public void finalPaymentForm() {
		try {
			Thread.sleep(5000);
			WebElement NitClear = driver.findElement(locator_Nit);
			NitClear.clear();
			type(Nit, locator_Nit);
			Thread.sleep(3000);
			type(dv, locator_DV);
			Thread.sleep(3000);
			type(city, locator_city);
			WebElement City = driver.findElement(locator_city);
			City.sendKeys(Keys.TAB);
			Thread.sleep(3000);
			type(address, locator_address);
			Thread.sleep(3000);
			type(email, locator_email);
			Thread.sleep(3000);
			type(confirmEmail, locator_confirmEmail);
			Thread.sleep(3000);
			type(cell, locator_cell);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}

}
