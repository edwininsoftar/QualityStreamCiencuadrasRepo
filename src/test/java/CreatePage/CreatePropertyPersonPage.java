package CreatePage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.BasicWrap;

public class CreatePropertyPersonPage extends BasicWrap{
	
	//Flucjo crear persona
	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_username = By.xpath("//*[@id=\"mat-input-3\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_login = By.cssSelector("span[class=\"ng-star-inserted\"]");
	By locator_user = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]");
	By locator_publishedProperty = By.linkText("Inmuebles publicados");
	//Mis publicaciones
	By locator_published = By.xpath("//*[@id=\"mis-publicaciones\"]/div[3]/div/div[2]/div/div[1]/div[1]/button");
	By locator_publicTu = By.xpath("/html/body/app-root/app-publication-options/div/mat-horizontal-stepper/div[2]/div[1]/app-options-content/div/div[2]/section/article[1]/div[4]");
	By locator_realEstate = By.xpath("/html/body/app-root/app-publication-options/div/mat-horizontal-stepper/div[2]/div[1]/app-options-content/div/div[2]/section/article[2]");
	//Elige tu plan	
	By locator_standard = By.xpath("/html/body/app-root/app-publication-options/div/mat-horizontal-stepper/div[2]/div[2]/app-publication-plans/div/div/div/div/div[2]/owl-carousel/owl-carousel-child/div[1]/div/div[1]/div/button");
	By locator_premium = By.xpath("/html/body/app-root/app-publication-options/div/mat-horizontal-stepper/div[2]/div[2]/app-publication-plans/div/div/div/div/div[2]/owl-carousel/owl-carousel-child/div[1]/div/div[2]/div/button");
	By locator_cityPremium = By.name("ciudad");
	//publica
	By locator_propertyType = By.id("propertyTypeId");	
	By locator_house = By.id("mat-option-4");
	By locator_office = By.id("mat-option-10");
	By locator_apartament = By.id("mat-option-3");
	By locator_rent = By.id("mat-button-toggle-2");
	By locator_sale = By.id("mat-button-toggle-1-button");
	By locator_value = By.xpath("//*[@id=\"leasingFee\"]");
	By locator_managementNo = By.xpath("//*[@id=\"form_elem\"]/label/div/div/div[1]");
	By locator_managementSi = By.xpath("//*[@id=\"form_elem\"]/label/div/div/div[2]");
	By locator_managementValue = By.xpath("//*[@id=\"administrationValue\"]");
	By locator_saleValue = By.id("sellingPrice");
	By locator_yearsOfAntiguaty = By.xpath("//*[@id=\"antiquity\"]");
	By locator_propertydescripti�n = By.cssSelector("textarea[_ngcontent-c7]");
	// Arriendo
	By locator_stratumOne = By.id("mat-button-toggle-4-button");
	By locator_stratumTow = By.id("mat-button-toggle-5-button");
	By locator_stratumThree = By.id("mat-button-toggle-6-button");
	By locator_stratumFour = By.id("mat-button-toggle-7-button"); 
	By locator_stratumFive = By.id("mat-button-toggle-8-button");
	By locator_stratumSix = By.id("mat-button-toggle-9-button");
	// Venta
	By locator_stratumOneV = By.id("mat-button-toggle-14-button");
	By locator_stratumTwoV = By.id("mat-button-toggle-15-button");
	By locator_stratumThreeV = By.id("mat-button-toggle-16-button");
	By locator_stratumFourV = By.id("mat-button-toggle-17-button");
	By locator_stratumFiveV = By.id("mat-button-toggle-18-button");
	By locator_stratumSixV = By.id("mat-button-toggle-19-button");
	By locator_squareMeter = By.xpath("//*[@id=\"builtArea\"]");
	By locator_room = By.name("numBedRooms");
	By locator_NToilets = By.name("numBathrooms");
	By locator_NParking = By.name("numParking");
	By locator_city = By.name("ciudad");
	By locator_neighborhood = By.xpath("//*[@id=\"barrio\"]");
	By locator_direction = By.xpath("//*[@id=\"address\"]");
	By locator_addaddress = By.xpath("//*[@id=\"addressComplement\"]");
	By locator_propertyLocation = By.xpath("//*[@id=\"dirCheckAddress\"]/label/div");
	By locator_NWhatsapp = By.xpath("//*[@id=\"cellphone\"]");
	By locator_contactMeWhatsapp = By.xpath("//*[@id=\"celularCheckWhatsapp\"]/label/div");
	By locator_contactMeCall = By.xpath("//*[@id=\"checkLlamada\"]/label/div");
	By locator_identification = By.id("identification");
	By locator_continue = By.cssSelector("div[class=\"pass-buttons desktop-btn\"]>div[class=\"pass-buttons-styles\"]>button[class=\"btn btn-default ng-star-inserted\"]");
	//Imagenes del inmueble
	By locator_img = By.id("ngx-input-file-0");
	By locator_continueTow = By.cssSelector("div[_ngcontent-c7][class=\"pass-buttons desktop-btn\"]>div[class=\"pass-buttons-styles\"]>button[class=\"btn btn-default\"]");
		
	
	//Flucjo crear persona
	String username = "personaciencuadras45@yopmail.com";
	String password = "Ciencuadras21*";
	// Elige como publicar
	String choosePost = "Publica Tu";// Publica Tu, Con Imbobiliaria
	//Elige tu plan
	String planType = "Estandar"; // Estandar, Premium
	String cityPremium = "Bogot�";// Ingrese la ciudad si el tipo de plan que seleciono es premium
	//formulario publica
	String propertyType = "Apartamento"; // Apartamento
	String transactionType = "Arriendo";// Arriendo, Venta
	String value = "800000";//ingrese el valor renta del inmueble
	String management = "No"; //ingrese si incluye administraci�n - No,Si
	String managementValue = "100000"; //Valor obligatorio si management = No
	String saleValue = "150000000";// ingrese el valor del inmuuebleen venta
	String yearsOfAntiguaty = "3";// Ingree a�os de antiguedad
	String propertyDescription = "Closed cosina integral zona de labado";//ingrese descripci�n del inmueble
	String stratum = "3";//ingrese el estarto de 1 a 6
	String squareMeter = "52"; // Ingrese los metros cuadrados del inmueble
	String room = "3 ";//ingrese el numero de abitaciones
	String Ntoilets = "2"; // Ingrese el numero de ba�os del inmueble
	String NParking = "2"; // Ingrese numero de parqueaderos
	String city = "Bogot� (Cundinamarca)"; // Ingrese la ciudad del inmueble
	String neighborhood = "Prado Veraniego Norte - Suba - Bogot�  (Cundinamarca)"; // Ingrese el barrio del inmueble
	String direction = "Calle 128C Bis # 52-53"; // Ingrese la direcci�n del inmueble
	String addaddress = "Piso 2"; // Complemento de direcci�n 
	String Nwhatsapp = "3202589674"; // Ingrese numero de whatsapp
	String contactMe = "Whatsapp"; // Whatsapp, Llamada
	String identification = "1057596841";// Ingrese numero de identificaci�n	

	public CreatePropertyPersonPage(WebDriver driver) {
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
	
	public void published() {
		try {
			Thread.sleep(5000);
			click(locator_published);
			Thread.sleep(15000);
			if(choosePost.equals("Publica Tu")) {
				click(locator_publicTu);
			}
			if(choosePost.equals("Con Inmobiliaria")) {
				click(locator_realEstate);
			}
			if(planType.equals("Estandar")) {
				click(locator_standard);
			}
			if(planType.equals("Premium")) {
				click(locator_premium);
				Thread.sleep(5000);
				type(cityPremium,locator_cityPremium);
				Thread.sleep(5000);
				/*WebElement cp = driver.findElement(locator_cityPremium);
				cp.sendKeys(Keys.DOWN);
				cp.sendKeys(Keys.ENTER);*/
			}
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void purchaseForm() {
		try {
			Thread.sleep(8000);
			click(locator_propertyType);
			Thread.sleep(3000);
			if(propertyType.equals("Apartamento")) {
				click(locator_apartament);
			}
			if(propertyType.equals("Casa")) {
				click(locator_house);
			}
			if(transactionType.equals("Arriendo")) {
				click(locator_rent);
				type(value, locator_value);
				if(management.equals("Si")) {
					Actions action = new Actions(driver);
					WebElement source = driver.findElement(locator_managementNo);
					WebElement target = driver.findElement(locator_managementSi);
					action.dragAndDrop(source, target);
					action.dragAndDropBy(source, 0, 0);
					action.moveToElement(source).moveToElement(target).perform();
					action.release();
				}
				if(management.equals("No")){
					type(managementValue, locator_managementValue);
				}
			}
			if(transactionType.equals("Venta")) {
				click(locator_sale);
				type(saleValue, locator_saleValue);
				type(managementValue, locator_managementValue);
			}
			type(yearsOfAntiguaty, locator_yearsOfAntiguaty);
			type(propertyDescription, locator_propertydescripti�n);
			if(transactionType.equals("Arriendo")) {
				if(stratum.equals("1")) {
					click(locator_stratumOne);
				}
				if(stratum.equals("2")) {
					click(locator_stratumTow);
				}
				if(stratum.equals("3")) {
					click(locator_stratumThree);
				}
				if(stratum.equals("4")) {
					click(locator_stratumFour);
				}
				if(stratum.equals("5")) {
					click(locator_stratumFive);
				}
				if(stratum.equals("6")) {
					click(locator_stratumSix);
				}
			}
			if(transactionType.equals("Venta")) {
				if(stratum.equals("1")) {
					click(locator_stratumOneV);
				}
				if(stratum.equals("2")) {
					click(locator_stratumTwoV);
				}
				if(stratum.equals("3")) {
					click(locator_stratumThreeV);
				}
				if(stratum.equals("4")) {
					click(locator_stratumFourV);
				}
				if(stratum.equals("5")) {
					click(locator_stratumFiveV);
				}
				if(stratum.equals("6")) {
					click(locator_stratumSixV);
				}
			}
			type(squareMeter, locator_squareMeter);
			WebElement roomClear = driver.findElement(locator_room);
			roomClear.clear();
			type(room, locator_room);
			WebElement toiletsClear = driver.findElement(locator_NToilets);
			toiletsClear.clear();
			type(Ntoilets, locator_NToilets);
			WebElement parkingClear = driver.findElement(locator_NParking);
			parkingClear.clear();
			type(NParking, locator_NParking);
			WebElement citytab = driver.findElement(locator_city);
			citytab.sendKeys(Keys.TAB);
			type(city, locator_city);
			Thread.sleep(4000);
			type(neighborhood, locator_neighborhood);
			WebElement neighborhoodTab = driver.findElement(locator_neighborhood);
			Thread.sleep(4000);
			neighborhoodTab.sendKeys(Keys.TAB);
			Thread.sleep(4000);
			type(direction, locator_direction);
			type(addaddress, locator_addaddress);
			click(locator_propertyLocation);
			/*type(identification, locator_identification);
			Thread.sleep(3000);*/
			type(Nwhatsapp, locator_NWhatsapp);
			if(contactMe.equals("Whatsapp")) {
				click(locator_contactMeWhatsapp);
			}
			if(contactMe.equals("Llamada")){
				click(locator_contactMeCall);
			}
			Thread.sleep(2000);
			click(locator_continue);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}

	public void load() {
		try {
			File file1 = new File("./src/test/resources/img/portada.png");
			File file2 = new File("./src/test/resources/img/arriendo.png");
			File file3 = new File("./src/test/resources/img/Screenshot.png");
			String phat1 = file1.getAbsolutePath();
			String phat2 = file2.getAbsolutePath();
			String phat3 = file3.getAbsolutePath();
			
			driver.findElement(locator_img).sendKeys(phat1);
			Thread.sleep(5000);
			driver.findElement(locator_img).sendKeys(phat2);
			Thread.sleep(5000);
			driver.findElement(locator_img).sendKeys(phat3);
			Thread.sleep(5000);
			click(locator_continueTow);
		} catch (Exception e) {
			System.out.println("error: "+e);
		}
	}
	
}
