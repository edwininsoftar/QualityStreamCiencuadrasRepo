package createPurchaseStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
	By locator_town = By.xpath("//*[@id=\"mat-option-20\"]/span");
	By locator_address = By.cssSelector("input[formcontrolname=\"address\"]");
	By locator_email = By.cssSelector("input[formcontrolname=\"email\"]");
	By locator_confirmEmail = By.cssSelector("input[formcontrolname=\"emailConfirmation\"]");
	By locator_cell = By.cssSelector("input[formcontrolname=\"mobile\"]");
	By locator_emailDIAN = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div/lib-cc-invoice-information/invoice-information/div/invoice-information-add/div/div/form/div[2]/div/div[2]/div/label/span[2]");
	By locator_billingMail = By.cssSelector("input[formcontrolname=\"billingEmail\"]");
	By locator_regimeType = By.xpath("//*[@id=\"mat-select-4\"]/div/div[2]/div");
	By locator_comun = By.xpath("//*[@id=\"mat-option-2\"]/span");
	By locator_simplificado = By.xpath("//*[@id=\"mat-option-3\"]/span");
	By locator_especial = By.xpath("//*[@id=\"mat-option-4\"]/span");
	By locator_retentionAgent = By.xpath("//*[@id=\"mat-select-6\"]/div/div[2]/div");
	By locator_no = By.xpath("//*[@id=\"mat-option-5\"]/span");
	By locator_4 = By.xpath("//*[@id=\"mat-option-6\"]/span");
	By locator_11 = By.xpath("//*[@id=\"mat-option-7\"]/span");
	By locator_fiscalResponsibility = By.xpath("//*[@id=\"mat-select-8\"]/div/div[2]/div");
	By locator_regimenSimple = By.xpath("//*[@id=\"mat-option-8\"]/span");
	By locator_agenteRetenedor = By.xpath("//*[@id=\"mat-option-9\"]/span");
	By locator_granContribuyente = By.xpath("//*[@id=\"mat-option-10\"]/span");
	By locator_autoretenedor = By.xpath("//*[@id=\"mat-option-11\"]/span");
	By locator_noResponsable = By.xpath("//*[@id=\"mat-option-12\"]/span");
	By locator_clic = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div/lib-cc-invoice-information/invoice-information/div/invoice-information-add/div/div/form/div[2]/div/mat-form-field[12]/div/div[1]/div[3]");
	By locator_ICAwithholding = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div/lib-cc-invoice-information/invoice-information/div/invoice-information-add/div/div/form/div[2]/div/div[5]/div/label/span[3]");
	By locator_IVAwithholding = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div/lib-cc-invoice-information/invoice-information/div/invoice-information-add/div/div/form/div[2]/div/div[7]/div/label/span[3]");
	By locator_buttonPayTow = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div/lib-cc-invoice-information/invoice-information/div/invoice-information-add/div/div/form/div[3]/div/div[2]/button[2]/span");
	//Pago y descuento ciencuadras 
	By locator_bond = By.cssSelector("input[formcontrolname=\"discount\"]");
	By locator_aplic = By.xpath("/html/body/app-root/app-products-checkout/car-summary/div[1]/section/div/div[2]/div[2]/app-coupon/div/form/div/button/span");
	By locator_buttonPayfinish = By.xpath("//*[@id=\"payment-data\"]/div/div/button");
	//Datos de pago cliente
	By locator_cookies = By.xpath("/html/body/app-root/app-payment/div[2]/div/button");
	By locator_pse = By.xpath("//*[@id=\"mat-radio-4\"]/label/div[1]/div[1]"); 
	By locator_paymentP = By.xpath("//*[@id=\"pay-pse\"]/form/div[2]/button");
	By locator_typedocument = By.name("documentType");
	By locator_TypePerson = By.name("personType");
	By locator_bank = By.name("bank");
	By locator_debitCard = By.xpath("//*[@id=\"mat-radio-2\"]/label/div[1]/div[1]");
	By locator_paymentD = By.xpath("//*[@id=\"formulario_card-debit\"]/div[2]/button");
	By locator_creditCard = By.xpath("//*[@id=\"mat-radio-2\"]/label/div[1]/div[2]");
	By locator_paymentC = By.xpath("//*[@id=\"formulario_card-credit\"]/div[2]/button");
	
	String username = "ciencuadras4@yopmail.com";
	String password = "100Cuadras%";
	String typePlan = "PlanesSemestrales";// PlanesSemestrales, PlanesAnuales
	String proyectNumber = "3Proyecto";// 1Proyecto, 2Proyecto, 3Proyecto
	// producctos adicionales
	int route = 2; 
	int photoTaking = 1;
	int photoUpload = 3;
	int featured = 5;
	int promoted = 1;
	int online = 4;
	// Formulario de pago
	String Nit = "900457893";// ingrese el nit 
	String dv = "7";//ingrese el digito de verificación
	String city = "Bogotá";
	String address = "Calle 128 # 52-53";// ingrese la direción
	String email = "ciencuadras4@yopmail.com";
	String confirmEmail = "ciencuadras4@yopmail.com";
	String cell = "3202159841";
	String emailDIAN = "Si";// Si, No
	String billingMail = "ciencuadras4@yopmail.com";// ingrese email de facturación electronica
	String regimeType = "Comun";//Comun, Simplificado, Especial
	String retentionAgent = "No";//No, 4, 11
	String fiscalResponsibility = "RegimenSimple";//RegimenSimple, AgenteRetenedor, GranContribuyente, Autorretenedor, NoResponsable
	String ICAwithholding = "Si"; // Si, No
	String IVAwithholding = "Si";// Si, No
	String discountCode = "";// codigo de descuento
	//Dastos cliente pago
	String paymentType = "Debito";// Debito, Credito, PSE
	String typeDocument = "Número de identificación tributario";// Cédula de Ciudadania, Cédula de Extranjeria, Cédula de Pasaporte, Número de identificación tributario, Tarjeta de identidad
	String typePerson = "Persona natural";//Persona natural, Persona Juridica
	String typeBank = "BANCO DAVIVIENDA";//BANCO DAVIVIENDA, BANCO CACJA SOCIAL, BANCON COLPATRIA, BANCOLOMBIA
	
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
			if (typePlan.equals("PlanesSemestrales")) {
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
			WebElement dvClear = driver.findElement(locator_DV);
			dvClear.clear();
			type(dv, locator_DV);
			Thread.sleep(3000);
			WebElement cityClear = driver.findElement(locator_city);
			cityClear.clear();
			type(city, locator_city);
			Thread.sleep(3000);
			WebElement City = driver.findElement(locator_city);
			City.sendKeys(Keys.DOWN);
			City.sendKeys(Keys.ENTER);
			City.sendKeys(Keys.TAB);
			Thread.sleep(3000);
			WebElement addressClear = driver.findElement(locator_address);
			addressClear.clear();
			type(address, locator_address);
			Thread.sleep(3000);
			WebElement emailClear = driver.findElement(locator_email);
			emailClear.clear();
			type(email, locator_email);
			Thread.sleep(3000);
			type(confirmEmail, locator_confirmEmail);
			Thread.sleep(3000);
			WebElement cellClear = driver.findElement(locator_cell);
			cellClear.clear();
			type(cell, locator_cell); 
			if(emailDIAN.equals("No")) {
				click(locator_emailDIAN);
				type(billingMail, locator_billingMail);
			}
			click(locator_regimeType);
			if(regimeType.equals("Comun")) {
				click(locator_comun);
			}
			if(regimeType.equals("Simplificado")) {
				click(locator_simplificado);
			}
			if(regimeType.equals("Especial")) {
				click(locator_especial);
			}
			Thread.sleep(3000);
			click(locator_retentionAgent);
			if(retentionAgent.equals("No")) {
				click(locator_no);
			}
			if(retentionAgent.equals("4")) {
				click(locator_4);
			}
			if(retentionAgent.equals("11")) {
				click(locator_11);
			}
			Thread.sleep(3000);
			if(ICAwithholding.equals("Si")) {
				click(locator_ICAwithholding);
			}
			if(IVAwithholding.equals("Si")) {
				click(locator_IVAwithholding);
			}
			click(locator_fiscalResponsibility);
			if(fiscalResponsibility.equals("RegimenSimple")) {
				click(locator_regimenSimple);
				WebElement rs = driver.findElement(locator_cell);
				rs.sendKeys(Keys.ESCAPE);
			}
			if(fiscalResponsibility.equals("AgenteRetenedor")) {
				click(locator_agenteRetenedor);
				WebElement rs = driver.findElement(locator_cell);
				rs.sendKeys(Keys.ESCAPE);
			}
			if(fiscalResponsibility.equals("GranContribuyente")) {
				click(locator_granContribuyente);
				WebElement rs = driver.findElement(locator_cell);
				rs.sendKeys(Keys.ESCAPE);
			}
			if(fiscalResponsibility.equals("Autorretenedor")) {
				click(locator_autoretenedor);
				WebElement rs = driver.findElement(locator_cell);
				rs.sendKeys(Keys.ESCAPE);
			}
			if(fiscalResponsibility.equals("NoResponsable")) {
				click(locator_noResponsable);
				WebElement rs = driver.findElement(locator_cell);
				rs.sendKeys(Keys.ESCAPE);
			}
			Thread.sleep(3000);
				click(locator_buttonPayTow);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void payFinish() {
		try {
			Thread.sleep(20000);
			if(discountCode != "") {
				type(discountCode, locator_bond);
				click(locator_aplic);
			}
			click(locator_buttonPayfinish);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void purchaseDetail() {
		try {
			click(locator_cookies);
			if(paymentType.equals("Debito")) {
				click(locator_debitCard);
				click(locator_paymentD);
			}
			if(paymentType.equals("Credito")) {
				click(locator_creditCard);
				click(locator_paymentC);
			}
			if(paymentType.equals("PSE")) {
				click(locator_pse);
				WebElement tc = driver.findElement(locator_typedocument);
				Select sel = new Select(tc);
				sel.selectByVisibleText(typeDocument);
				WebElement tp = driver.findElement(locator_TypePerson);
				Select selp = new Select(tp);
				selp.selectByVisibleText(typePerson);
				WebElement tb = driver.findElement(locator_bank);
				Select selb = new Select(tb);
				selb.selectByVisibleText(typeBank);
				click(locator_paymentP);
			}
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}

}
