package createPurchaseStream;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BasicWrap;

public class CreatePurchasePageAgente extends BasicWrap{

	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_username = By.xpath("//*[@id=\"mat-input-3\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_login = By.cssSelector("span[class=\"ng-star-inserted\"]");
	By locator_public = By.cssSelector("span[_ngcontent-serverapp-c114][class=\"link\"]");
	By locator_agente = By.name("agente"); 
	By locator_seePlans = By.cssSelector("a[_ngcontent-serverapp-c275][routerlink=\"/seleccion-ideal\"]");
	By locator_toAssemble = By.cssSelector("a[_ngcontent-serverapp-c275][routerlink=\"/arma-tu-plan\"]");
	By locator_monthsXS = By.tagName("select");							
    By locator_monthsM = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[6]/div/div[2]/div[2]/select");
	By locator_monthsS = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[5]/div/div[2]/div[2]/select");
    By locator_buttonSelectXS = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[7]/div/div[2]/div[3]/button");
	By locator_buttonSelectS = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[5]/div/div[2]/div[3]/button");
    By locator_buttonSelectM = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[6]/div/div[2]/div[3]/button");
	By locator_buttonPay = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[2]/app-resume/div/div[2]/button");
	By locator_buttonRoute = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/app-product-card[1]/div/div[2]/div/div/button[2]/span");
	By locator_buttonPhotoTaking = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/app-product-card[2]/div/div[2]/div/div/button[2]/span");
	By locator_buttonPhotoUpload = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/app-product-card[3]/div/div[2]/div/div/button[2]/span");
	By locator_buttonFeatured = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[2]/div/app-product-card[1]/div/div[2]/div/div/button[2]/span");
	By locator_buttonPromoted = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[2]/div/app-product-card[2]/div/div[2]/div/div/button[2]/span");
	By locator_buttonOnline = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[3]/div/app-product-card/div/div[2]/div/div/button[2]/span");
	By locator_buttonPayTow = By.cssSelector("div[class=\"resume__pay ng-star-inserted\"]>button[class=\"button secondary rounded block\"]");			
	By locator_buttonPayFinish = By.xpath("//*[@id=\"payment-data\"]/div/div/button");
	//localizadores de pago
	By locator_psePayment = By.xpath("//*[@id=\"mat-radio-4\"]/label/div[1]/div[1]");
	By locator_davipuntos = By.xpath("//*[@id=\"mat-radio-5\"]/label/div[1]/div[2]");
	By locator_debitCard = By.xpath("//*[@id=\"mat-radio-3\"]/label/div[1]/div[2]");
	By locator_typeDocument = By.name("doc_type_holder");
	By locator_typedocumentP = By.name("documentType");
	By locator_personType = By.name("personType");
	By locator_bank = By.name("bank");
	By locator_creditCard = By.xpath("//*[@id=\"mat-radio-2\"]/label/div[1]/div[2]");
	By locator_document = By.name("doc_number_holder");
	By locator_CardName = By.name("card_name");
	By locator_CardNumber = By.name("card_number");
	By locator_month = By.name("M3");
	By locator_year = By.name("YY");
	By locator_CW = By.name("cvc");
	//tarjeta de credito
	By locator_duesC = By.xpath("//*[@id=\"mat-select-4\"]/div/div[2]/div");
	By locator_paymentC = By.xpath("//*[@id=\"formulario_card-credit\"]/div[2]/button");
	//tarjeta debito 
	By locator_paymentD = By.xpath("//*[@id=\"formulario_card-debit\"]/div[2]/button");
	//pago PSE
	By locator_paymentP = By.xpath("//*[@id=\"pay-pse\"]/form/div[2]/button");
	//pago davivienda
	By locator_paymentDa = By.xpath("//*[@id=\"pay-davipuntos\"]/form/div[3]/button");
	
										
	String username = "agenteciencuadras1@yopmail.com";
	String password = "@Contraseña112";
	String planType = "VerPlanes";//VerPlanes, QuieroArmarlo
	String plan = "PlanXS";//PlanXS, PlanS, PlanM
	String monthsPlan = "3 meses";//1 meses, 3 meses, 6 meses, 9 meses, 12 meses
	//producctos adicionales
	String additionalProducts = "No";//No, route, photoTaking, photoUpload, featured, promoted, online
	int route = 0;
	int photoTaking = 0;
	int photoUpload= 0;
	int featured = 0;
	int promoted = 0;
	int online = 0;
	String paymentType = "Debito";// Debito, Credito, PSE, Davivienda
	String typeDocument = "CC";//CC, NIT, CE, Cédula de Ciudadania, Cédula de Extranjeria, Cédula de Pasaporte, Número de identificación tributario, Tarjeta de identidad
	
	
	public CreatePurchasePageAgente(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void waitForAngularRequestsToFinish() {
		try {
			getNgWebDriver().waitForAngularRequestsToFinish();
		} catch (Exception e) {
			Assert.fail("Error while waiting for Angular request to finish: "+e.getMessage());
		}
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
			click(locator_agente);
			if(planType.equals("VerPlanes")) {
				click(locator_seePlans);

			}
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	
	public void continuación() {
		if(plan.equals("PlanS")) {
			WebElement ml = driver.findElement(locator_monthsS);
			Select sel = new Select(ml);
			sel.selectByVisibleText(monthsPlan);
			click(locator_buttonSelectS);
		}
		if(plan.equals("PlanM")) {
			WebElement ml = driver.findElement(locator_monthsM);
			Select sel = new Select(ml);
			sel.selectByVisibleText(monthsPlan);
			click(locator_buttonSelectM);
		}
		if(additionalProducts.equals("route")) {
			for(int i=0; i<route; i++) {
				click(locator_buttonRoute);
			}
		}
		if(additionalProducts.equals("photoTaking")) {
			for(int i=0; i<photoTaking; i++) {
				click(locator_buttonPhotoTaking);
			}
		}
		if(additionalProducts.equals("photoUpload")) {
			for(int i=0; i<photoUpload; i++) {
				click(locator_buttonPhotoUpload);
			}
		}
		if(additionalProducts.equals("featured")) {
			for(int i=0; i<featured; i++) {
				click(locator_buttonFeatured);
			}
		}
		if(additionalProducts.equals("promoted")) {
			for(int i=0; i<promoted; i++) {
				click(locator_buttonPromoted);
			}
		}
		if(additionalProducts.equals("online")) {
			for(int i=0; i<online; i++) {
				click(locator_buttonOnline);
			}
		}				
		click(locator_buttonPay);
		click(locator_buttonPayTow);	
		click(locator_buttonPayFinish);
		if(paymentType.equals("Debito")) {
			click(locator_debitCard);
			WebElement td = driver.findElement(locator_typeDocument);
			Select sel = new Select(td);
			sel.selectByVisibleText(typeDocument);
			click(locator_paymentD);
		}
		if(paymentType.equals("Credito")) {
			click(locator_creditCard);
			WebElement tc = driver.findElement(locator_typeDocument);
			Select sel = new Select(tc);
			sel.selectByVisibleText(typeDocument);
			click(locator_paymentC);
		}
		if(paymentType.equals("PSE")) {
			click(locator_psePayment);
			WebElement tc = driver.findElement(locator_typedocumentP);
			Select sel = new Select(tc);
			sel.selectByVisibleText(typeDocument);
			click(locator_paymentP);
		}
		if(paymentType.equals("Daviplata")) {
			click(locator_davipuntos);
			click(locator_paymentDa);
		}
	else {
		click(locator_toAssemble);
	}
	}

}
