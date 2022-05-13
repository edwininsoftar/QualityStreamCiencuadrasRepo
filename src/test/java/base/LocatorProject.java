package base;

import org.openqa.selenium.By;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularBinding;
import com.paulhammant.ngwebdriver.ByAngularOptions;

public class LocatorProject {

	// Formulario ubicación del inmueble
	By locator_ButtonCalculaPrice = By.xpath(
			"/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div/div[2]/a");
	By locator_city = By.id("mat-input-0");
	By locator_address = By.id("mat-input-1");
	By locator_addressAdd = By.id("mat-input-2");
	By locator_checkMap = By.id("mat-checkbox-1");
	By locator_button_continue = By.cssSelector("button[class=\"btn button rounded secondary\"]");
	// Información del inmueble
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
	
	
	public By getLocator_cookies() {
		return locator_cookies;
	}

	public By getLocator_debitCard() {
		return locator_debitCard;
	}

	public By getLocator_holderNameD() {
		return locator_holderNameD;
	}

	public By getLocator_cardNumberD() {
		return locator_cardNumberD;
	}

	public By getLocator_monthCardD() {
		return locator_monthCardD;
	}

	public By getLocator_yearCardD() {
		return locator_yearCardD;
	}

	public By getLocator_cvvD() {
		return locator_cvvD;
	}

	public By getLocator_paymentD() {
		return locator_paymentD;
	}

	public By getLocator_creditCard() {
		return locator_creditCard;
	}

	public By getLocator_holderNameC() {
		return locator_holderNameC;
	}

	public By getLocator_cardNumberC() {
		return locator_cardNumberC;
	}

	public By getLocator_monthCardC() {
		return locator_monthCardC;
	}

	public By getLocator_yearCardC() {
		return locator_yearCardC;
	}

	public By getLocator_cvvC() {
		return locator_cvvC;
	}

	public By getLocator_dues() {
		return locator_dues;
	}

	public By getLocator_five() {
		return locator_five;
	}

	public By getLocator_paymentC() {
		return locator_paymentC;
	}

	public By getLocator_pse() {
		return locator_pse;
	}

	public By getLocator_typedocumentP() {
		return locator_typedocumentP;
	}

	public By getLocator_CC() {
		return locator_CC;
	}

	public By getLocator_CE() {
		return locator_CE;
	}

	public By getLocator_CP() {
		return locator_CP;
	}

	public By getLocator_NIT() {
		return locator_NIT;
	}

	public By getLocator_TI() {
		return locator_TI;
	}

	public By getLocator_TypePerson() {
		return locator_TypePerson;
	}

	public By getLocator_PN() {
		return locator_PN;
	}

	public By getLocator_PJ() {
		return locator_PJ;
	}

	public By getLocator_bank() {
		return locator_bank;
	}

	public By getLocator_itau() {
		return locator_itau;
	}

	public By getLocator_cajaSocial() {
		return locator_cajaSocial;
	}

	public By getLocator_paymentP() {
		return locator_paymentP;
	}

	public By getLocator_PSECheckPolicy() {
		return locator_PSECheckPolicy;
	}

	public By getLocator_PSECheckTerms() {
		return locator_PSECheckTerms;
	}

	public By getLocator_follow() {
		return locator_follow;
	}

	public By getLocator_davipuntos() {
		return locator_davipuntos;
	}

	public By getLocator_paymentDavi() {
		return locator_paymentDavi;
	}

	public By getLocator_epayco() {
		return locator_epayco;
	}

	public By getLocator_continueEpayco() {
		return locator_continueEpayco;
	}

	public By getLocator_daviplata() {
		return locator_daviplata;
	}

	public By getLocator_typeDocumentDaviplata() {
		return locator_typeDocumentDaviplata;
	}

	public By getLocator_CCDaviplata() {
		return locator_CCDaviplata;
	}

	public By getLocator_CEDaviplata() {
		return locator_CEDaviplata;
	}

	public By getLocator_NITDaviplata() {
		return locator_NITDaviplata;
	}

	public By getLocator_TIDaviplata() {
		return locator_TIDaviplata;
	}

	public By getLocator_CPDaviplata() {
		return locator_CPDaviplata;
	}

	public By getLocator_SSEDaviplata() {
		return locator_SSEDaviplata;
	}

	public By getLocator_documentNumber() {
		return locator_documentNumber;
	}

	public By getLocator_paymentDaviplata() {
		return locator_paymentDaviplata;
	}

	public By getLocator_bond() {
		return locator_bond;
	}

	public By getLocator_aplic() {
		return locator_aplic;
	}

	public By getLocator_buttonPayfinish() {
		return locator_buttonPayfinish;
	}

	public By getLocator_names() {
		return locator_names;
	}

	public By getLocator_surnames() {
		return locator_surnames;
	}

	public By getLocator_identityDocument() {
		return locator_identityDocument;
	}

	public By getLocator_cc() {
		return locator_cc;
	}

	public By getLocator_nit() {
		return locator_nit;
	}

	public By getLocator_ce() {
		return locator_ce;
	}

	public By getLocator_idNumber() {
		return locator_idNumber;
	}

	public By getLocator_email() {
		return locator_email;
	}

	public By getLocator_confirmEmail() {
		return locator_confirmEmail;
	}

	public By getLocator_phone() {
		return locator_phone;
	}

	public By getLocator_acceptTerms() {
		return locator_acceptTerms;
	}

	public By getLocator_dataTreatment() {
		return locator_dataTreatment;
	}

	public By getLocator_buttonContinueTwo() {
		return locator_buttonContinueTwo;
	}

	public By getLocator_ButtonCalculaPrice() {
		return locator_ButtonCalculaPrice;
	}

	public By getLocator_typeProperty() {
		return locator_typeProperty;
	}

	public By getLocator_apartment() {
		return locator_apartment;
	}

	public By getLocator_house() {
		return locator_house;
	}

	public By getLocator_rent() {
		return locator_rent;
	}

	public By getLocator_sale() {
		return locator_sale;
	}

	public By getLocator_stratum1() {
		return locator_stratum1;
	}

	public By getLocator_stratum2() {
		return locator_stratum2;
	}

	public By getLocator_stratum3() {
		return locator_stratum3;
	}

	public By getLocator_stratum4() {
		return locator_stratum4;
	}

	public By getLocator_stratum5() {
		return locator_stratum5;
	}

	public By getLocator_stratum6() {
		return locator_stratum6;
	}

	public By getLocator_area() {
		return locator_area;
	}

	public By getLocator_antiquity() {
		return locator_antiquity;
	}

	public By getLocator_parkingLess() {
		return locator_parkingLess;
	}

	public By getLocator_parkingMore() {
		return locator_parkingMore;
	}

	public By getLocator_toiletsLess() {
		return locator_toiletsLess;
	}

	public By getLocator_toiletsMore() {
		return locator_toiletsMore;
	}

	public By getLocator_roomsLess() {
		return locator_roomsLess;
	}

	public By getLocator_roomsMore() {
		return locator_roomsMore;
	}

	public By getLocator_balconiesMore() {
		return locator_balconiesMore;
	}

	public By getLocator_terraceMore() {
		return locator_terraceMore;
	}

	public By getLocator_depositMore() {
		return locator_depositMore;
	}

	public By getLocator_elevatorsMore() {
		return locator_elevatorsMore;
	}

	public By getLocator_buttonContinue() {
		return locator_buttonContinue;
	}

	public By getLocator_city() {
		return locator_city;
	}

	public By getLocator_address() {
		return locator_address;
	}

	public By getLocator_addressAdd() {
		return locator_addressAdd;
	}

	public By getLocator_checkMap() {
		return locator_checkMap;
	}

	public By getLocator_button_continue() {
		return locator_button_continue;
	}

}
