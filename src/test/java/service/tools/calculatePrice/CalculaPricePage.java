package service.tools.calculatePrice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularBinding;
import com.paulhammant.ngwebdriver.ByAngularOptions;

import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class CalculaPricePage extends BasicWrap{
	
	public CalculaPricePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	LocatorProject locatorProject;
	
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
	//Pago y descuento ciencuadras 
	By locator_bond = By.cssSelector("input[formcontrolname=\"discount\"]");
	By locator_aplic = By.xpath("/html/body/app-root/app-products-checkout/car-summary/div[1]/section/div/div[2]/div[2]/app-coupon/div/form/div/button/span");
	By locator_buttonPayfinish = By.xpath("//*[@id=\"payment-data\"]/div/div/button");
	//Datos de pago cliente
	By locator_cookies = ByAngular.buttonText("Aceptar");
	//datos tarjeta debito
	By locator_debitCard = By.xpath("//*[@id=\"mat-radio-3\"]/label/div[1]/div[1]");
	By locator_holderNameD = By.id("mat-input-11");
	By locator_cardNumberD = By.id("mat-input-13");
	By locator_monthCardD = By.id("mat-input-14");
	By locator_yearCardD = By.id("mat-input-15");
	By locator_cvvD = By.id("mat-input-16");
	By locator_paymentD = By.xpath("//*[@id=\"formulario_card-debit\"]/div[2]/button");
	//datos tarjeta credito
	By locator_creditCard = By.xpath("/html/body/app-root/app-payment/app-payment-request/div/div[2]/div[1]/div/div/app-owner-data/app-add-data/div/gateway-paymentez/div/mat-radio-group/mat-accordion/div/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-panel-description/div/div[1]/mat-radio-button/label/div[2]");
	By locator_holderNameC = By.id("mat-input-5");
	By locator_cardNumberC= By.id("mat-input-7");
	By locator_monthCardC = By.id("mat-input-8");
	By locator_yearCardC = By.id("mat-input-9");
	By locator_cvvC = By.id("mat-input-10");
	By locator_dues = ByAngularBinding.id("mat-select-3");
	By locator_five = ByAngularOptions.id("mat-option-6");
	By locator_paymentC = By.xpath("//*[@id=\"formulario_card-credit\"]/div[2]/button");
	//datos PSE
	By locator_pse = By.id("mat-radio-4"); 
	By locator_typedocumentP = By.name("documentType");
	By locator_CC = ByAngularOptions.id("mat-option-38");
	By locator_CE = ByAngularOptions.id("mat-option-39");
	By locator_CP = ByAngularOptions.id("mat-option-40");
	By locator_NIT = ByAngularOptions.id("mat-option-41");
	By locator_TI = ByAngularOptions.id("mat-option-42");
	By locator_TypePerson = By.name("personType");
	By locator_PN = ByAngularOptions.id("mat-option-0");
	By locator_PJ = ByAngularOptions.id("mat-option-1");
	By locator_bank = By.name("bank");
	By locator_itau = ByAngularOptions.id("mat-option-53");
	By locator_cajaSocial = ByAngularOptions.id("mat-option-46");
	By locator_paymentP = By.xpath("//*[@id=\"pay-pse\"]/form/div[2]/button");
	//datos de pago PSE
	By locator_PSECheckPolicy = By.id("chkPolicy");
	By locator_PSECheckTerms = By.id("chkTerminos");
	By locator_follow = By.id("btnIngresar");
	//Davi puntos
	By locator_davipuntos = By.xpath("//*[@id=\"mat-radio-5\"]");
	By locator_paymentDavi = By.xpath("/html/body/app-root/app-payment/app-payment-request/div/div[2]/div[1]/div/div/app-owner-data/app-add-data/div/gateway-paymentez/div/mat-radio-group/mat-accordion/div/mat-expansion-panel[4]/div/div/div/app-pay-checkout-epayco/div/button");
	By locator_epayco = By.id("email-user");
	By locator_continueEpayco = By.xpath("/html/body/div/div[6]/div/div/div[1]/div[2]/div[2]/form/button");
	//Daviplata
	By locator_daviplata = By.xpath("//*[@id=\"mat-radio-6\"]");
	By locator_typeDocumentDaviplata = ByAngularBinding.id("mat-select-4");
	By locator_CCDaviplata = ByAngularOptions.id("mat-option-67");
	By locator_CEDaviplata = ByAngularOptions.id("mat-option-68");
	By locator_NITDaviplata = ByAngularOptions.id("mat-option-69");	
	By locator_TIDaviplata = ByAngularOptions.id("mat-option-70");
	By locator_CPDaviplata = ByAngularOptions.id("mat-option-71");
	By locator_SSEDaviplata = ByAngularOptions.id("mat-option-72");
	By locator_documentNumber = By.id("mat-input-17");
	By locator_paymentDaviplata = By.xpath("/html/body/app-root/app-payment/app-payment-request/div/div[2]/div[1]/div/div/app-owner-data/app-add-data/div/gateway-paymentez/div/mat-radio-group/mat-accordion/div/mat-expansion-panel[5]/div/div/div/app-pay-daviplata/div/div[2]/form/div[3]/button");
	//Listo descarga reporte
	By locator_report = By.xpath("//*[@id=\"cdk-step-content-0-3\"]/app-generate-report/div/div[2]/div[1]/button");
	
	
	public void propertyLocation() throws InterruptedException {
		try {
			Thread.sleep(8000);
			click(locatorProject.getLocator_ButtonCalculaPrice());
			//new tab
			String mainTab = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String actual: handles) {
				if(!actual.equalsIgnoreCase(mainTab)) {
					driver.switchTo().window(actual);
				}
			}
			type(getCity(), locatorProject.getLocator_city());
			Thread.sleep(5000);	
			WebElement ct = driver.findElement(locatorProject.getLocator_city());
			ct.sendKeys(Keys.DOWN);
			ct.sendKeys(Keys.ENTER);
			type(getAddress(), locatorProject.getLocator_address());
			Thread.sleep(5000);	
			type(getAddressAdd(), locatorProject.getLocator_addressAdd());
			click(locatorProject.getLocator_checkMap());
			click(locatorProject.getLocator_button_continue());
		} catch (Exception e) {
			System.out.println("Error: "+ e);
		}
		
	}
	
	public void propertyInformation() {
		try {
			Thread.sleep(8000);	
			click(locator_typeProperty);
			Thread.sleep(8000);	
			if(getTypeProperty().equals("Casa")) {
				click(locator_house);
			}
			if(getTypeProperty().equals("Apartamento")) {
				click(locator_apartment);
			}
			if(getTransactionType().equals("Arriendo")) {
				click(locator_rent);
			}
			if(getTransactionType().equals("Venta")) {
				click(locator_sale);
			}
			if(getStratum().equals("1")) {
				click(locator_stratum1);
			}
			if(getStratum().equals("2")) {
				click(locator_stratum2);
			}
			if(getStratum().equals("3")) {
				click(locator_stratum3);
			}
			if(getStratum().equals("4")) {
				click(locator_stratum4);
			}
			if(getStratum().equals("5")) {
				click(locator_stratum5);
			}
			if(getStratum().equals("6")) {
				click(locator_stratum6);
			}
			Thread.sleep(5000);	
			WebElement ar = driver.findElement(locator_area);
			ar.clear(); 
			type(getArea(), locator_area);
			Thread.sleep(5000);	
			WebElement an = driver.findElement(locator_antiquity);
			an.clear();
			type(getAntiquity(), locator_antiquity);
			Thread.sleep(5000);			
			for(int i=0;i<getParkingLess();i++) {
				click(locator_parkingLess);
			}
			for(int i=0;i<getParkingMore();i++) {
				click(locator_parkingMore);
			}
			for(int i=0;i<getToiletsLess();i++) {
				click(locator_toiletsLess);
			}
			for(int i=0;i<getToiletsMore();i++) {
				click(locator_toiletsMore);
			}
			for(int i=0;i<getRoomsLess();i++) {
				click(locator_roomsLess);
			}
			for(int i=0;i<getRoomsMore();i++) {
				click(locator_roomsMore);
			}
			for(int i=0;i<getBalconiesMore();i++) {
				click(locator_balconiesMore);
			}
			for(int i=0;i<getTerraceMore();i++) {
				click(locator_terraceMore);
			}
			for(int i=0;i<getDepositMore();i++) {
				click(locator_depositMore);
			}
			for(int i=0;i<getElevatorsMore();i++) {
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
			type(getNames(), locator_names);
			type(getSurnames(), locator_surnames);
			click(locator_identityDocument);
			if(getIdentityDocument().equals("CC")) {
				click(locator_cc);
			}
			if(getIdentityDocument().equals("NIT")) {
				click(locator_nit);
			}
			if(getIdentityDocument().equals("CE")) {
				click(locator_ce);
			}
			type(getIdNumber(), locator_idNumber);
			type(getEmail(), locator_email);
			type(getEmail(), locator_confirmEmail);
			type(getPhone(), locator_phone);
			if(getAcceptTerms().equals("No")) {
				click(locator_acceptTerms);
			}
			if(getDataTreatment().equals("No")){
				click(locator_dataTreatment);
			}
			Thread.sleep(5000);	
			click(locator_buttonContinueTwo);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void payFinish() {
		try {
			Thread.sleep(50000);
			if(getDiscountCode() != "") {
				type(getDiscountCode(), locator_bond);
				click(locator_aplic);
			}
			click(locator_buttonPayfinish);
			Thread.sleep(8000);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void purchaseDetail() {
		try {
			Thread.sleep(8000);
			click(locator_cookies);
			Thread.sleep(8000);
			if(getPaymentType().equals("Debito")) {
				click(locator_debitCard);
				Thread.sleep(3000);
				type(getHolderName(), locator_holderNameD);
				type(getCardNumber(), locator_cardNumberD);
				type(getMonthCard(), locator_monthCardD);
				type(getYearCard(), locator_yearCardD);
				type(getCvv(), locator_cvvD);
				Thread.sleep(8000);
				click(locator_paymentD);
			}
			if(getPaymentType().equals("Credito")) {
				click(locator_creditCard);
				Thread.sleep(3000);
				type(getHolderName(), locator_holderNameC);
				type(getCardNumber(), locator_cardNumberC);
				type(getMonthCard(), locator_monthCardC);
				type(getYearCard(), locator_yearCardC);
				type(getCvv(), locator_cvvC);
				Thread.sleep(8000);
				click(locator_dues);
				Thread.sleep(8000);
				click(locator_five);
				Thread.sleep(8000);
				click(locator_paymentC);
			}
			if(getPaymentType().equals("PSE")) {
				click(locator_pse);
				Thread.sleep(3000);
				click(locator_typedocumentP);
				Thread.sleep(8000);
				if(getTypeDocument().equals("CC")) {
					click(locator_CC);
				}
				if(getTypeDocument().equals("CE")) {
					click(locator_CE);
				}
				if(getTypeDocument().equals("CP")) {
					click(locator_CP);
				}
				if(getTypeDocument().equals("NIT")) {
					click(locator_NIT);
				}
				if(getTypeDocument().equals("TI")) {
					click(locator_TI);
				}
				click(locator_TypePerson);
				Thread.sleep(8000);
				if(getTypePerson().equals("PN")) {
					click(locator_PN);
				}
				if(getTypePerson().equals("PJ")) {
					click(locator_PJ);
				}
				click(locator_bank);
				Thread.sleep(8000);
				if(getTypeBank().equals("BANCO CAJA SOCIAL")) {
					click(locator_cajaSocial);
				}
				if(getTypeBank().equals("ITAU")) {
					click(locator_itau);
				}
				Thread.sleep(8000);
				click(locator_paymentP);
				Thread.sleep(10000);
				click(locator_PSECheckPolicy);
				click(locator_PSECheckTerms);
				click(locator_follow);
			}
			if(getPaymentType().equals("Davipuntos")) {
				click(locator_davipuntos);
				Thread.sleep(8000);
				click(locator_paymentDavi);
				Thread.sleep(8000);
				driver.switchTo().defaultContent();
				click(locator_continueEpayco);
			}
			if(getPaymentType().equals("Daviplata")) {
				click(locator_daviplata);
				Thread.sleep(3000);
				click(locator_typeDocumentDaviplata);
				Thread.sleep(8000);
				if(getTypeDocument().equals("CC")) {
					click(locator_CCDaviplata);
				}
				if(getTypeDocument().equals("CE")) {
					click(locator_CEDaviplata);
				}
				if(getTypeDocument().equals("CP")) {
					click(locator_CPDaviplata);
				}
				if(getTypeDocument().equals("NIT")) {
					click(locator_NITDaviplata);
				}
				if(getTypeDocument().equals("TI")) {
					click(locator_TIDaviplata);
				}
				if(getTypeDocument().equals("SSE")) {
					click(locator_SSEDaviplata);
				}
				type(getDocumentNumber(),locator_documentNumber);
				Thread.sleep(8000);
				click(locator_paymentDaviplata);
			}
			Thread.sleep(5000);
			click(locator_report);
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
