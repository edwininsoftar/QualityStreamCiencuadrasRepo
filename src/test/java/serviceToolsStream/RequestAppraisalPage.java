package serviceToolsStream;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Base.BasicWrap;

public class RequestAppraisalPage extends BasicWrap {
	
	By locato_buttonAppraise = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[1]/div/div[2]/a");
	By locator_buttonColombia = By.xpath("/html/body/app-root/app-appraisal/section[3]/app-card-option/div/div/div[1]/a");
	By locator_buttonExterior = By.xpath("/html/body/app-root/app-appraisal/section[3]/app-card-option/div/div/div[2]/a");
	By locator_buttonCalculatePrice = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div/div[2]/a");
	By locator_city = By.name("ciudad");  
	By locator_confirm = By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-check-coverage/div/div[2]/div[2]/button");
	By locator_continue = By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-coverage/div/div[3]/div/button");
	// Formato de solicitud
	By locator_typeProperty = By.cssSelector("div[class=\"mat-form-field-infix ng-tns-c121-6\"]");
	By locator_apartment = By.xpath("//*[@id=\"mat-option-6\"]/span");
	By locator_house = By.xpath("//*[@id=\"mat-option-7\"]/span");
	By locator_address = By.id("mat-input-2");
	By locator_addresAdd = By.id("mat-input-3"); 
	By locator_sale = By.id("mat-input-4"); 
	By locator_zone = By.id("mat-input-5");
	By locator_enrollment = By.id("mat-input-6");
	By locator_estateStatus = By.cssSelector("div[class=\"mat-select-arrow ng-tns-c165-15\"]");
	By locator_new = By.xpath("//*[@id=\"mat-option-2\"]/span");
	By locator_used = By.xpath("//*[@id=\"mat-option-3\"]/span");
	By locator_buildingUnderConstruction = By.xpath("//*[@id=\"mat-radio-2\"]/label/span[1]/span[1]");
	By locator_finishedProperty = By.xpath("//*[@id=\"mat-radio-3\"]/label/span[1]/span[1]");
	By locator_parking = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-appraisal-register/div/div[1]/form/div[2]/div[1]/div[1]/div/button[2]");
	By locator_parkingCommunal = By.xpath("//*[@id=\"mat-radio-5\"]");
	By locator_parkingPrivate = By.xpath("//*[@id=\"mat-radio-6\"]");
	By locator_parkingExclusive = By.xpath("//*[@id=\"mat-radio-7\"]");
	By locator_deposit = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-appraisal-register/div/div[1]/form/div[2]/div[2]/div[1]/div/button[2]");
	By locator_depositCommunal = By.xpath("//*[@id=\"mat-radio-9\"]/label/span[1]/span[2]");
	By locator_depositPrivate = By.xpath("//*[@id=\"mat-radio-10\"]/label/span[1]/span[2]");
	By locator_depositExclusive = By.xpath("//*[@id=\"mat-radio-11\"]");
	By locator_buttonContinue = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-appraisal-register/div/div[1]/form/div[4]/button[2]");
	//Formulario de facturación
	By locator_email = By.id("mat-input-9");
	By locator_typeDocument = By.cssSelector("div[class=\"mat-select-arrow ng-tns-c165-20\"]");
	By locator_cc = By.xpath("//*[@id=\"mat-option-32\"]/span");
	By locator_nit = By.xpath("//*[@id=\"mat-option-33\"]/span");
	By locator_extranjeria = By.xpath("//*[@id=\"mat-option-34\"]/span");
	By locator_pasaporte = By.xpath("//*[@id=\"mat-option-35\"]/span");
	By locator_identification = By.id("mat-input-10");
	By locator_name = By.id("mat-input-11");
	By locator_phone = By.id("mat-input-12");
	By locator_homeVisit = By.id("mat-slide-toggle-1");
	By locator_nameLastName = By.id("mat-input-21");
	By locator_phoneTwo = By.id("mat-input-22");
	By locator_emailTwo = By.id("mat-input-23");
	By locator_ownerName = By.id("mat-input-16");
	By locator_ownerPhone = By.id("mat-input-17");
	By locator_ownerEmail = By.id("mat-input-18");
	By locator_processingPersonalData = By.xpath("//*[@id=\"mat-checkbox-2\"]/label/span[1]");
	By locator_pay = By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-user-info/div/div/form/div[4]/button[2]");
	//Pago y descuento ciencuadras 
	By locator_bond = By.cssSelector("input[formcontrolname=\"discount\"]");
	By locator_aplic = By.xpath("/html/body/app-root/app-products-checkout/car-summary/div[1]/section/div/div[2]/div[2]/app-coupon/div/form/div/button/span");
	By locator_buttonPayfinish = By.xpath("//*[@id=\"payment-data\"]/div/div/button");
	//Datos de pago cliente
	By locator_cookies = By.cssSelector("div[class=\"cookies\"]>div[class=\"cookies-container\"]>button[class=\"btn-primary aceptar\"]");
	By locator_pse = By.xpath("//*[@id=\"mat-radio-4\"]/label/div[1]/div[1]"); 
	By locator_paymentP = By.xpath("//*[@id=\"pay-pse\"]/form/div[2]/button");
	By locator_typedocument = By.name("documentType");
	By locator_TypePerson = By.name("personType");
	By locator_bank = By.name("bank");
	By locator_debitCard = By.xpath("//*[@id=\"mat-radio-3\"]/label/div[1]/div[1]");
	By locator_paymentD = By.xpath("//*[@id=\"formulario_card-debit\"]/div[2]/button");
	By locator_creditCard = By.xpath("//*[@id=\"mat-radio-2\"]/label/div[1]/div[2]");
	By locator_paymentC = By.xpath("//*[@id=\"formulario_card-credit\"]/div[2]/button");
	
	String appraisalFrom = "Colombia";//Colombia, Exterior
	String city = "Bogotá"; 
	//formato de solicitud 
	String typeProperty = "Casa";//Apartamento, Casa
	String address = "Calle 128 # 52-46";//Ingrese la dirección
	String addressAdd = "Primer Piso";//complemento de la dirección
	String sale = "120000000";//Valor estimado de venta 
	String zone = "2";// ingrese la zona
	String enrollment = "12345678"; // ingrese la matricula inmobiliaria
	String estateStatus = "Nueva"; // Nueva, Usada
	String stateOfTheProperty = "InmuebleEnObra";//InmuebleEnObra, InmuebleTerminado
	int parking = 1;//Ingrese el numero de parqueaderos
	int deposit = 1;// Ingrese el numero de depositos
	String typeParking = "Exclusivo"; // Comunal, Privado, Exclusivo
	String typeDeposit = "Exclusivo"; // Comunal, Privado, Exclusivo
	//Formulario de facturación
	String email = "pruebaciencuadras@yopmail.com"; // Ingrese email
	String typedocument = "CC";// CC, NIT, CCE, Pasaporte
	String document = "80427865 "; //Ingrese el numero de documento
	String name = "Juan Daniel Rodriguez Lopes";// Ingrese su nombre
	String phone = "201569874"; // Ingrese el numero de celular sin el 3
	String homeVisit = "Si"; // Si, No
	String nameTwo = "Pedro alejandro Muños";// Ingrese nombre de la persona que recibira la visita
	String phoneTwo = "201256487";// Ingrese numero de la persona que recivira la visita 
	String emailTwo = "pruebacorreovisita@yopmail.com";// Ingrese el correo de la persona que recivira la visita
	String ownerName = "Luis Alejandro Rodriguez Lopez"; // Ingrese el nombre de propietario
	String ownerPhone = "204436343"; // Ingrese el numero del propietario sin el 3
	String ownerEmail = "pruebacorreopropietario@yopmail.com";// Ingrese el correo del propietario 
	String processingPersonalData = "No";//Ingrese SI o No si acepta el tratamiento de datos personales
	//Pago y descuento ciencuadras
	String discountCode = "";// ingrese codigo de descuento
	//Dastos cliente pago
	String paymentType = "Debito";// Debito, Credito, PSE
	String typeDocument = "Número de identificación tributario";// Cédula de Ciudadania, Cédula de Extranjeria, Cédula de Pasaporte, Número de identificación tributario, Tarjeta de identidad
	String typePerson = "Persona natural";//Persona natural, Persona Juridica
	String typeBank = "BANCO DAVIVIENDA";//BANCO DAVIVIENDA, BANCO CACJA SOCIAL, BANCON COLPATRIA, BANCOLOMBIA

	public RequestAppraisalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void appraise() throws InterruptedException {
		try {
			Thread.sleep(7000);
			click(locato_buttonAppraise);
			//new tab
			String mainTab = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String actual: handles) {
				if(!actual.equalsIgnoreCase(mainTab)) {
					driver.switchTo().window(actual);
				}
			}
			if(appraisalFrom.equals("Colombia")) {
				Thread.sleep(5000);
				click(locator_buttonColombia);
				type(city, locator_city);
				Thread.sleep(3000);		
				WebElement ciu = driver.findElement(locator_city);
				ciu.sendKeys(Keys.DOWN);
				ciu.sendKeys(Keys.ENTER);
				Thread.sleep(3000);	
				click(locator_confirm);
				Thread.sleep(3000);	
				click(locator_continue);
			}
			if(appraisalFrom.equals("Exterior")) {
				click(locator_buttonExterior);
			}
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void requestForm()  throws InterruptedException {
		try {
			Thread.sleep(5000);
			click(locator_typeProperty);
			if(typeProperty.equals("Apartamento")) {
				click(locator_apartment);
			}
			if(typeProperty.equals("Casa")) {
				click(locator_house);
			}
			type(address, locator_address);
			type(addressAdd,locator_addresAdd);
			type(sale, locator_sale);
			type(zone, locator_zone);
			type(enrollment, locator_enrollment);
			if(estateStatus.equals("Nueva")) {
				click(locator_estateStatus);
				click(locator_new);
			}
			if(estateStatus.equals("Usada")) {
				click(locator_estateStatus);
				click(locator_used);
			}
			if(stateOfTheProperty.equals("InmuebleEnObra")) {
				click(locator_buildingUnderConstruction);
			}
			if(stateOfTheProperty.equals("InmuebleTerminado")) {
				click(locator_finishedProperty);
			}
			if(parking != 0) {
				for(int i=0;i<parking;i++) {
					click(locator_parking);
				}
				if(typeParking.equals("Comunal")) {
					click(locator_parkingCommunal);
				}
				if(typeParking.equals("Privado")) {
					click(locator_parkingPrivate);
				}
				if(typeParking.equals("Exclusivo")) {
					click(locator_parkingExclusive);
				}
			}
			if(deposit != 0) {
				for(int i=0;i<deposit;i++) {
					click(locator_deposit);
				}
				Thread.sleep(3000);
				if(typeDeposit.equals("Comunal")) {
					click(locator_depositCommunal);
				}
				if(typeDeposit.equals("Privado")) {
					click(locator_depositPrivate);
				}
				if(typeDeposit.equals("Exclusivo")) {
					click(locator_depositExclusive);
				}
			}
			click(locator_buttonContinue);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void billingForm() {
		try {
			type(email,locator_email);
			click(locator_typeDocument);
			if(typedocument.equals("CC")) {
				click(locator_cc);
			}
			if(typedocument.equals("NIT")) {
				click(locator_nit);
			}
			if(typedocument.equals("CCE")) {
				click(locator_extranjeria);
			}
			if(typedocument.equals("Pasaporte")) {
				click(locator_pasaporte);
			}
			type(document, locator_identification);
			WebElement na = driver.findElement(locator_name);
			na.clear();
			type(name, locator_name);
			type(phone, locator_phone);
			if(homeVisit.equals("Si")) {
				click(locator_homeVisit);
			}else {
				type(nameTwo, locator_nameLastName);
				type(phoneTwo, locator_phoneTwo);
				type(emailTwo, locator_emailTwo);
			}
			type(ownerName, locator_ownerName);
			type(ownerPhone, locator_ownerPhone);
			type(ownerEmail, locator_ownerEmail);
			if(processingPersonalData.equals("Si")) {
				click(locator_processingPersonalData);
			}
			click(locator_pay);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void payFinish() {
		try {
			Thread.sleep(15000);
			if(discountCode != "") {
				type(discountCode, locator_bond);
				click(locator_aplic);
			}
			click(locator_buttonPayfinish);
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void purchaseDetail() {
		try {
			//Actions action = new Actions(driver);
			//action.moveToElement(driver.findElement(locator_cookies)).click();
			click(locator_cookies);
			Thread.sleep(5000);
			if(paymentType.equals("Debito")) {
				click(locator_debitCard);
				//click(locator_paymentD);
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
