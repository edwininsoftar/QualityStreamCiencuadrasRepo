package buy.plan.rolPersona;

import org.openqa.selenium.By;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularCssContainingText;

public class LocatorBuyPlanPersona {

	public static final By LOCATOR_X = By.xpath("//*[@id=\"mat-dialog-0\"]/app-register-code/div/div/button");
	public static final By LOCATOR_INTO = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	public static final By LOCATOR_USERNAME = By.xpath("//*[@id=\"mat-input-3\"]");
	public static final By LOCATOR_PASSWORD = By.cssSelector("input[formcontrolname=\"password\"]");
	public static final By LOCATOR_LOGIN = By.cssSelector("span[class=\"ng-star-inserted\"]");
	public static final By LOCATOR_PUBLIC = ByAngularCssContainingText.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/a[2]/span[2]");
	public static final By LOCATOR_PERSON = By.name("persona");
	public static final By LOCATOR_PUBLIC_TU = By.xpath("/html/body/app-root/app-products-profile/section/div/div[3]/div/div/div[2]/a");
	// Acompa�amiento
	public static final By LOCATOR_POST_YOUR = By.xpath("/html/body/app-root/app-publication-options/div/mat-horizontal-stepper/div[2]/div[1]/app-options-content/div/div[2]/section/article[1]/div[4]");
	public static final By LOCATOR_REAL_ESTATE = By.xpath("/html/body/app-root/app-publication-options/div/mat-horizontal-stepper/div[2]/div[1]/app-options-content/div/div[2]/section/article[2]");
	// Elige tu plan
	public static final By LOCATOR_STANDART = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-publication-plans/div/div/div/div/div[2]/owl-carousel/owl-carousel-child/div[1]/div/div[1]/div/button");
	public static final By LOCATOR_PREMIUM = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-publication-plans/div/div/div/div/div[2]/owl-carousel/owl-carousel-child/div[1]/div/div[2]/div/button");
	public static final By LOCATOR_CITY_PREMIUM = By.cssSelector("div[class=\"mat-form-field-infix\"]>input[id=\"ciudad\"][ng-reflect-placeholder=\"Escribe y selecciona Ej: Bogot\"]");
	public static final By LOCATOR_BUTTON_CONFIR_PREMIUM = By.xpath("//*[@id=\"mat-dialog-0\"]/app-check-coverage/div/div[2]/div/button");
	public static final By LOCATOR_BUTTON_CONTINUE_PREMIUM = By.xpath("//*[@id=\"mat-dialog-1\"]/app-confirmed-coverage/div/div[2]/div/button");
	// publica
	public static final By LOCATOR_PROPERTY_TYPE = By.id("propertyTypeId");
	public static final By LOCATOR_HOUSE = By.id("mat-option-4");
	public static final By LOCATOR_OFFICE = By.id("mat-option-10");
	public static final By LOCATOR_APARTAMENT = By.id("mat-option-3");
	public static final By LOCATOR_RENT = By.id("mat-button-toggle-2");
	public static final By LOCATOR_SALE = By.id("mat-button-toggle-1-button");
	public static final By LOCATOR_VALUE = By.xpath("//*[@id=\"leasingFee\"]");
	public static final By LOCATOR_MANAGEMENT_NO = By.xpath("//*[@id=\"form_elem\"]/label/div/div/div[1]");
	public static final By LOCATOR_MANAGEMENT_SI = By.xpath("//*[@id=\"form_elem\"]/label/div/div/div[2]");
	public static final By LOCATOR_MANAGEMENT_VALUE = By.xpath("//*[@id=\"administrationValue\"]");
	public static final By LOCATOR_SALE_VALUE = By.id("sellingPrice");
	public static final By LOCATOR_YEARS_OF_ANTIQUITY = By.id("antiquity");
	public static final By LOCATOR_PROPERTY_DESCRIPTION = By.cssSelector("textarea[_ngcontent-c7]");
	// Arriendo
	public static final By LOCATOR_STRATUM_ONE = By.id("mat-button-toggle-4-button");
	public static final By LOCATOR_STRATUM_TWO = By.id("mat-button-toggle-5-button");
	public static final By LOCATOR_STRATUM_THREE = By.id("mat-button-toggle-6-button");
	public static final By LOCATOR_STRATUM_FOUR = By.id("mat-button-toggle-7-button");
	public static final By LOCATOR_STRATUM_FIVE = By.id("mat-button-toggle-8-button");
	public static final By LOCATOR_STRATUM_SIX = By.id("mat-button-toggle-9-button");
	// Venta
	public static final By LOCATOR_STRATUM_ONE_V = By.id("mat-button-toggle-14-button");
	public static final By LOCATOR_STRATUM_TWO_V = By.id("mat-button-toggle-15-button");
	public static final By LOCATOR_STRATUM_THREE_V = By.id("mat-button-toggle-16-button");
	public static final By LOCATOR_STRATUM_FOUR_V = By.id("mat-button-toggle-17-button");
	public static final By LOCATOR_STRATUM_FIVE_V = By.id("mat-button-toggle-18-button");
	public static final By LOCATOR_STRATUM_SIX_V = By.id("mat-button-toggle-19-button");
	public static final By LOCATOR_SQUARE_METER = By.xpath("//*[@id=\"builtArea\"]");
	public static final By LOCATOR_ROOM = By.name("numBedRooms");
	public static final By LOCATOR_N_TOILETS = By.name("numBathrooms");
	public static final By LOCATOR_N_PARKING = By.name("numParking");
	public static final By LOCATOR_CITY = By.name("ciudad");
	public static final By LOCATOR_NEIGHBORHOOD = By.xpath("//*[@id=\"barrio\"]");
	public static final By LOCATOR_DIRECTION = By.xpath("//*[@id=\"address\"]");
	public static final By LOCATOR_ADD_ADDRESS = By.xpath("//*[@id=\"addressComplement\"]");
	public static final By LOCATOR_PROPERTY_LOCATION = By.xpath("//*[@id=\"dirCheckAddress\"]/label/div");
	public static final By LOCATOR_N_WHATSAPP = By.xpath("//*[@id=\"cellphone\"]");
	public static final By LOCATOR_CONTACT_ME_WHATSAPP = By.xpath("//*[@id=\"celularCheckWhatsapp\"]/label/div");
	public static final By LOCATOR_CONTACT_ME_CALL = By.xpath("//*[@id=\"checkLlamada\"]/label/div");
	public static final By LOCATOR_IDENTIFICATION = By.id("identification");
	public static final By LOCATOR_CONTINUE = By.cssSelector("div[class=\"pass-buttons desktop-btn\"]>div[class=\"pass-buttons-styles\"]>button[class=\"btn btn-default ng-star-inserted\"]");
	// Imagenes del inmueble
	public static final By LOCATOR_IMG = By.id("ngx-input-file-0");
	public static final By LOCATOR_CONTINUE_TWO = By.cssSelector("div[_ngcontent-c7][class=\"pass-buttons desktop-btn\"]>div[class=\"pass-buttons-styles\"]>button[class=\"btn btn-default\"]");
	public static final By LOCATOR_DATE_PREMIUM = By.xpath("//*[@id=\"dateVisit\"]");
	public static final By LOCATOR_28 = By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[5]/td[5]/div");
	public static final By LOCATOR_TIME_PREMIUM = By.xpath("//*[@id=\"timeVisit\"]/div/div[1]");
	public static final By LOCATOR_9AM = By.xpath("//*[@id=\"mat-option-28\"]/span");
	// Pago y descuento ciencuadras
	public static final By LOCATOR_BOUND = By.cssSelector("input[formcontrolname=\"discount\"]");
	public static final By LOCATOR_APLIC = By.xpath("/html/body/app-root/app-products-checkout/car-summary/div[1]/section/div/div[2]/div[2]/app-coupon/div/form/div/button/span");
	public static final By LOCATOR_BUTTON_PAY_FINISH = By.xpath("//*[@id=\"payment-data\"]/div/div/button");
	// Datos de pago cliente
	public static final By LOCATOR_COOKIES = ByAngular.buttonText("Aceptar");
	// datos tarjeta debito
	public static final By LOCATOR_DEBIT_CARD = By.xpath("//*[@id=\"mat-radio-3\"]");
	public static final By LOCATOR_PAYMENT_D = By.cssSelector("div[id=\"cdk-accordion-child-1\"]>div[class=\"mat-expansion-panel-body ng-tns-c157-6\"]>div[class=\"ng-tns-c157-6\"]>div[class=\"ng-star-inserted\"]>button[id=\"pagar-gateway-btn\"]");
	// datos tarjeta credito
	public static final By LOCATOR_CREDIT_CARD = By.xpath("/html/body/app-root/app-payment/app-payment-request/div/div[2]/div[1]/div/div/app-owner-data/app-add-data/div/gateway-paymentez/div/mat-radio-group/mat-accordion/div/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-panel-description/div/div[1]/mat-radio-button/label/div[2]");
	public static final By LOCATOR_PAYMENT_C = By.id("pagar-gateway-btn");
	// formulario de pago paimentez
	public static final By LOCATOR_IFRAME = By.xpath("//*[@id=\"modalBoxContentPaymentezCheckout\"]");
	public static final By LOCATOR_HOLDER_NAME = By.xpath("/html/body/form/div[2]/div[3]/input");
	public static final By LOCATOR_CARD_NUMBER = By.name("card-number");
	public static final By LOCATOR_MONTH_CARD = By.xpath("/html/body/form/div[2]/div[5]/div/div[1]/input[1]");
	public static final By LOCATOR_CVV = By.xpath("/html/body/form/div[2]/div[6]/div/input");
	public static final By LOCATOR_BUTTON_FORM_CHECKOUT = By.xpath("//*[@id=\"checkout-form\"]/div[4]/div[2]/button");
	public static final By LOCATOR_DUES = By.xpath("//*[@id=\"my-card\"]/div[7]/select");
	
}
