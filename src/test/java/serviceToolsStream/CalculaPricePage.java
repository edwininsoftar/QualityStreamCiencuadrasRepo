package serviceToolsStream;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularBinding;

import Base.BasicWrap;

public class CalculaPricePage extends BasicWrap{
	//Formulario ubicación del inmueble
	By locator_ButtonCalculaPrice = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div/div[2]/a");
	By locator_city = By.id("mat-input-0");
	By locator_address = By.id("mat-input-1");
	By locator_addressAdd = By.id("mat-input-2");
	By locator_checkMap = By.id("mat-checkbox-1");
	By locator_button_continue = By.cssSelector("button[class=\"btn button rounded secondary\"]");
	//Información del inmueble
	By locator_typeProperty = By.id("mat-select-0");
	By locator_apartment = By.id("mat-option-0");
	By locator_house = By.id("mat-option-1");
	By locator_rent = By.id("mat-button-toggle-2-button");
	By locator_sale = By.id("mat-button-toggle-3-button");
	By locator_stratum1 = By.id("mat-button-toggle-4-button");
	By locator_stratum2 = By.id("mat-button-toggle-5-button");
	By locator_stratum3 = By.id("mat-button-toggle-6-button");
	By locator_stratum4 = By.id("mat-button-toggle-7-button");
	By locator_stratum5 = By.id("mat-button-toggle-8-button");
	By locator_stratum6 = By.id("mat-button-toggle-9-button");
	By locator_area = By.id("mat-input-3");
	By locator_antiquity = By.id("mat-input-4");
	By locator_parkingLess = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[1]/div/button[1]");
	By locator_parkingMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[1]/div/button[2]");
	By locator_toiletsLess = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[2]/div/button[1]");
	By locator_toiletsMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[2]/div/button[2]");
	By locator_roomsLess = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[3]/div/button[1]");
	By locator_roomsMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[3]/div/button[2]");
	By locator_balconiesMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[4]/div/button[2]");
	By locator_terraceMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[5]/div/button[2]");
	By locator_depositMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[6]/div/button[2]");
	By locator_elevatorsMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[7]/div/button[2]");
	By locator_buttonContinue = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/button[2]");
	// Formulario paga el precio en linea
	By locator_names = By.id("mat-input-12");
	By locator_surnames = By.id("mat-input-13");
	By locator_identityDocument = By.id("mat-select-2");
	By locator_cc = By.id("mat-option-2");
	By locator_nit = By.id("mat-option-3");
	By locator_ce = By.id("mat-option-4");
	By locator_idNumber  = By.id("mat-input-14");
	By locator_email = By.id("mat-input-15");
	By locator_confirmEmail = By.id("mat-input-16");
	By locator_phone = By.id("mat-input-17");
	By locator_acceptTerms = By.id("mat-checkbox-2");
	By locator_dataTreatment = By.id("mat-checkbox-3");
	By locator_buttonContinueTwo = By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/button[2]");
	
	//Formulario ubicación del inmueble
	String city = "Bogotá"; // Ingrese la ciudad
	String address = "Calle 128 # 52-53";// Ingrese la dirección 
	String addressAdd = "Segundo piso";//Ingrese el complemento de la dirección
	//Información del inmueble
	String typeProperty = "Apartamento";//Casa, Apartamento
	String transactionType = "Venta";//Arriendo, Venta
	String stratum = "3";// estrato: 1,2,3,4,5,6
	String area = "85.5";//Ingrese el area en metros cuadrados 
	String antiquity = "10";//Ingrese la antiguedad del inmueble en años
	int parkingLess = 2;//Ingrese el numero de clicks si desea disminuir la cantidad de parqueaderos
	int parkingMore = 2;//Ingrese el numero de clicks si desea aumentar la cantidad de parqueaderos 
	int toiletsLess = 1;//Ingrese el numero de clicks si desea disminuir la cantidad de baños
	int toiletsMore = 3; //Ingrese el numero de clicks si desea aumentar la cantidad de baños 
	int roomsLess = 1;//Ingrese el numero de clicks si desea disminuir la cantidad de habitaciones
	int roomsMore = 3;//Ingrese el numero de clicks si desea aunmentar la cantidad de habitaciones 
	int balconiesMore = 1;//Ingrese el numero de clicks si desea aumentar la cantidad de balcones
	int terraceMore = 1;//Ingrese el numero de clicks si desea aumentar la cantidad de balcones
	int depositMore = 1;//Ingrese el numero de clicks si desea aumentar la cantidad de depositos
	int elevatorsMore = 1;//Ingrese el numero de clicks si desea aumentar la cantidad de elevadores
	// Formulario paga el precio en linea
	String names = "Sebastian Andres";//Ingrese los nombres
	String surnames = "Rodiguez Cepeda";//ingrese los apellidos
	String identityDocument = "CC";//CC,NIT,CE
	String idNumber = "1057585412";//Ingrese el numero de identificación
	String email = "emaildepagoprueba@yopmail.com";// Ingrese el email 
	String confirmEmail = "emaildepagoprueba@yopmail.com";//Ingrese la confirmación del email
	String phone = "205814789";// Ingrese el numero de celular sin el numero 3
	String acceptTerms = "Si";//Si, No //Ingrese si o no si hacepta los terminos 
	String dataTreatment = "Si";// Si, No // Ingrese si o no si acepta el tratamiento de datos
	
		
	public CalculaPricePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void propertyLocation() throws InterruptedException {
		try {
			Thread.sleep(8000);
			click(locator_ButtonCalculaPrice);
			//new tab
			String mainTab = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String actual: handles) {
				if(!actual.equalsIgnoreCase(mainTab)) {
					driver.switchTo().window(actual);
				}
			}
			type(city, locator_city);
			Thread.sleep(5000);	
			WebElement ct = driver.findElement(locator_city);
			ct.sendKeys(Keys.DOWN);
			ct.sendKeys(Keys.ENTER);
			type(address, locator_address);
			type(addressAdd, locator_addressAdd);
			click(locator_checkMap);
			click(locator_button_continue);
		} catch (Exception e) {
			System.out.println("Error: "+ e);
		}
		
	}
	
	public void propertyInformation() {
		try {
			Thread.sleep(8000);	
			click(locator_typeProperty);
			Thread.sleep(8000);	
			if(typeProperty.equals("Casa")) {
				click(locator_house);
			}
			if(typeProperty.equals("Apartamento")) {
				click(locator_apartment);
			}
			if(transactionType.equals("Arriendo")) {
				click(locator_rent);
			}
			if(transactionType.equals("Venta")) {
				click(locator_sale);
			}
			if(stratum.equals("1")) {
				click(locator_stratum1);
			}
			if(stratum.equals("2")) {
				click(locator_stratum2);
			}
			if(stratum.equals("3")) {
				click(locator_stratum3);
			}
			if(stratum.equals("4")) {
				click(locator_stratum4);
			}
			if(stratum.equals("5")) {
				click(locator_stratum5);
			}
			if(stratum.equals("6")) {
				click(locator_stratum6);
			}
			Thread.sleep(5000);	
			WebElement ar = driver.findElement(locator_area);
			ar.clear(); 
			type(area, locator_area);
			Thread.sleep(5000);	
			WebElement an = driver.findElement(locator_antiquity);
			an.clear();
			type(antiquity, locator_antiquity);
			Thread.sleep(5000);			
			for(int i=0;i<parkingLess;i++) {
				click(locator_parkingLess);
			}
			for(int i=0;i<parkingMore;i++) {
				click(locator_parkingMore);
			}
			for(int i=0;i<toiletsLess;i++) {
				click(locator_toiletsLess);
			}
			for(int i=0;i<toiletsMore;i++) {
				click(locator_toiletsMore);
			}
			for(int i=0;i<roomsLess;i++) {
				click(locator_roomsLess);
			}
			for(int i=0;i<roomsMore;i++) {
				click(locator_roomsMore);
			}
			for(int i=0;i<balconiesMore;i++) {
				click(locator_balconiesMore);
			}
			for(int i=0;i<terraceMore;i++) {
				click(locator_terraceMore);
			}
			for(int i=0;i<depositMore;i++) {
				click(locator_depositMore);
			}
			for(int i=0;i<elevatorsMore;i++) {
				click(locator_elevatorsMore);
			}
			click(locator_buttonContinue);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void payThePriceonline() {
		try {
			Thread.sleep(5000);	
			type(names, locator_names);
			type(surnames, locator_surnames);
			click(locator_identityDocument);
			if(identityDocument.equals("CC")) {
				click(locator_cc);
			}
			if(identityDocument.equals("NIT")) {
				click(locator_nit);
			}
			if(identityDocument.equals("CE")) {
				click(locator_ce);
			}
			type(idNumber, locator_idNumber);
			type(email, locator_email);
			type(confirmEmail, locator_confirmEmail);
			type(phone, locator_phone);
			if(acceptTerms.equals("No")) {
				click(locator_acceptTerms);
			}
			if(dataTreatment.equals("No")){
				click(locator_dataTreatment);
			}
			Thread.sleep(5000);	
			click(locator_buttonContinueTwo);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
