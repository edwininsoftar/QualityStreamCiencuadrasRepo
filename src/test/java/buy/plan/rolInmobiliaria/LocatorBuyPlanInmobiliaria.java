package buy.plan.rolInmobiliaria;

import org.openqa.selenium.By;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularCssContainingText;
import com.paulhammant.ngwebdriver.ByAngularOptions;

public class LocatorBuyPlanInmobiliaria {

	// Flujo inmobiliaria
	public static final By LOCATOR_X = By.xpath("//*[@id=\"mat-dialog-0\"]/app-register-code/div/div/button");
	public static final By LOCATOR_INTO = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	public static final By LOCATOR_USER_NAME = By.xpath("//*[@id=\"mat-input-3\"]");
	public static final By LOCATOR_PASWORD = By.cssSelector("input[formcontrolname=\"password\"]");
	public static final By LOCATOR_LOGIN = By.cssSelector("span[class=\"ng-star-inserted\"]");
	public static final By LOCATOR_PUBLIC = ByAngularCssContainingText.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/a[2]/span[2]");
	public static final By LOCATOR_INMOBILIARIA = By.name("inmobiliaria");
	public static final By LOCATOR_SEE_PLANS = By.cssSelector("a[routerlink=\"/seleccion-ideal\"]");
	//Formulario escoge tu plan ideal ver planes Plan basico
	public static final By LOCATOR_MONTHS_B = By.xpath("//*[@id=\"products-ideal\"]/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[4]/div/div[2]/div[2]/select");
	public static final By LOCATOR_SELECT_B = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[4]/div/div[2]/div[3]/button");
	//plan base plus
	public static final By LOCATOR_MONTHS_BP = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[5]/div/div[2]/div[2]/select");
	public static final By LOCATOR_SELECT_BP = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[5]/div/div[2]/div[3]/button");
	//plan S
	public static final By LOCATOR_MONTHS_S = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[6]/div/div[2]/div[2]/select");
	public static final By LOCATOR_SELECT_S = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[6]/div/div[2]/div[3]/button");
	//Plan M
	public static final By LOCATOR_MONTHS_M = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[7]/div/div[2]/div[2]/select");
	public static final By LOCATOR_SELECT_M = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[7]/div/div[2]/div[3]/button");
	//Plan L
	public static final By LOCATOR_MONTHS_L = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[8]/div/div[2]/div[2]/select");
	public static final By LOCATOR_SELECT_L  = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[8]/div/div[2]/div[3]/button");
	// botones Agregar productos adicionales
	public static final By LOCATOR_BUTTON_ROUTE = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/app-product-card[1]/div/div[2]/div/div/button[2]/span");
	public static final By LOCATOR_BUTTON_PHOTO_TAKING = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/app-product-card[2]/div/div[2]/div/div/button[2]/span");
	public static final By LOCATOR_BUTTON_PHOTO_UPLOAD = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/app-product-card[3]/div/div[2]/div/div/button[2]/span");
	public static final By LOCATOR_BUTTON_FEATURED = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[2]/div/app-product-card[1]/div/div[2]/div/div/button[2]/span");
	public static final By LOCATOR_BUTTON_PROMOTED = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[2]/div/app-product-card[2]/div/div[2]/div/div/button[2]/span");
	public static final By LOCATOR_BUTTON_ONLINE = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[3]/div/app-product-card/div/div[2]/div/div/button[2]/span");
	public static final By LOCATOR_BUTTON_SHOPPING_CART = By.xpath("//*[@id=\"products-base\"]/app-header/div/nav/button");
	public static final By LOCATOR_BUTTON_PAY = By.cssSelector("button[class=\"button secondary rounded block\"]");
	//datos de facturación
	public static final By LOCATOR_TYPE_DOCUMENT = By.cssSelector("mat-select[formcontrolname=\"documentType\"]");
	public static final By LOCATOR_TYPE_DOCUMENT_CC = By.cssSelector("mat-option[value=\"1\"]");
	public static final By LOCATOR_TYPE_DOCUMENT_CE = By.cssSelector("mat-option[value=\"5\"]");
	public static final By LOCATOR_TYPE_DOCUMENT_TI = By.cssSelector("mat-option[value=\"4\"]");
	public static final By LOCATOR_TYPE_DOCUMENT_NIT = By.cssSelector("mat-option[value=\"2\"]");
	public static final By LOCATOR_NUMBER_DOCUMENT = By.cssSelector("input[formcontrolname=\"document\"]");
	public static final By LOCATOR_DV = By.cssSelector("input[formcontrolname=\"nitVerification\"]");
	public static final By LOCATOR_NAME = By.cssSelector("input[formcontrolname=\"name\"]");
	public static final By LOCATOR_LAST_NAME = By.cssSelector("input[formcontrolname=\"surname\"]");
	public static final By LOCATOR_PHONE = By.cssSelector("input[formcontrolname=\"mobile\"]");
	public static final By LOCATOR_CITY = By.cssSelector("input[formcontrolname=\"city\"]");
	public static final By LOCATOR_ADDRESS = By.cssSelector("input[formcontrolname=\"address\"]");
	public static final By LOCATOR_EMAIL = By.cssSelector("input[formcontrolname=\"email\"]");
	public static final By LOCATOR_CONFIRM_EMAIL = By.cssSelector("input[formcontrolname=\"emailConfirmation\"]");
	public static final By LOCATOR_EMAIL_DIAN = By.xpath("/html/body/app-root/app-products-payment/section/div/div[2]/div/lib-cc-invoice-information/invoice-information/div/invoice-information-add/div/div/form/div[2]/div/div[2]/div/label/span[2]");
	public static final By LOCATOR_BILLIN_MAIL = By.cssSelector("input[formcontrolname=\"billingEmail\"]");
	public static final By LOCATOR_REGIMEN_TYPE = By.cssSelector("mat-select[formcontrolname=\"regimeId\"]");
	public static final By LOCATOR_RESPONSIBLE_IVA = By.cssSelector("mat-option[value=\"4\"]");
	public static final By LOCATOR_NOT_RESPONSIBLE_IVA = By.cssSelector("mat-option[value=\"5\"]");
	public static final By LOCATOR_RST = By.cssSelector("mat-option[value=\"6\"]");
	public static final By LOCATOR_INCOME_RETAINER = By.cssSelector("mat-select[formcontrolname=\"incomeWithholding\"]");
	public static final By LOCATOR_NO = By.cssSelector("mat-option[value=\"0\"]");
	public static final By LOCATOR_4 = By.cssSelector("mat-option[value=\"4\"]");
	public static final By LOCATOR_11 = By.cssSelector("mat-option[value=\"11\"]");
	public static final By LOCATOR_FISCAL_RESPONSABILITY = By.cssSelector("mat-select[formcontrolname=\"fiscalResponsibility\"]");
	public static final By LOCATOR_SIMPLE_REGIMEN = By.cssSelector("mat-option[value=\"2\"]");
	public static final By LOCATOR_WITH_HOLDING_AGENT = By.cssSelector("mat-option[value=\"3\"]");
	public static final By LOCATOR_GREAT_CONTRIBUTOR = By.cssSelector("mat-option[value=\"4\"]");
	public static final By LOCATOR_SELF_RETAINING = By.cssSelector("mat-option[value=\"5\"]");
	public static final By LOCATOR_NOT_RESPONSIBLE = By.cssSelector("mat-option[value=\"1\"]");
	public static final By LOCATOR_ICA = By.xpath("/html/body/app-root/app-products-payment/section/div/div[2]/div/lib-cc-invoice-information/invoice-information/div/invoice-information-add/div/div/form/div[2]/div/div[5]/div/label/span[3]");
	public static final By LOCATOR_IVA = By.xpath("/html/body/app-root/app-products-payment/section/div/div[2]/div/lib-cc-invoice-information/invoice-information/div/invoice-information-add/div/div/form/div[2]/div/div[7]/div/label/span[3]");
	public static final By LOCATOR_BUTTON_PAY_TWO = By.xpath("/html/body/app-root/app-products-payment/section/div/div[2]/div/lib-cc-invoice-information/invoice-information/div/invoice-information-add/div/div/form/div[3]/div/div[2]/button[2]");
	//Pago y descuento ciencuadras
	public static final By LOCATOR_BOND = By.cssSelector("input[formcontrolname=\"discount\"]");
	public static final By LOCATOR_APLIC = By.xpath("/html/body/app-root/app-products-checkout/car-summary/div[1]/section/div/div[2]/div[2]/app-coupon/div/form/div/button/span");
	public static final By LOCATOR_BUTTON_PAY_FINISH = By.xpath("//*[@id=\"payment-data\"]/div/div/button");
	//Datos de pago cliente
	public static final By LOCATOR_COOKIES = ByAngular.buttonText("Aceptar");
	// datos tarjeta debito
	public static final By LOCATOR_DEBIT_CARD = By.xpath("//*[@id=\"mat-radio-3\"]");
	public static final By LOCATOR_PAYMENT_D = By.cssSelector("div[id=\"cdk-accordion-child-1\"]>div[class=\"mat-expansion-panel-body ng-tns-c157-6\"]>div[class=\"ng-tns-c157-6\"]>div[class=\"ng-star-inserted\"]>button[id=\"pagar-gateway-btn\"]");
	// datos tarjeta credito
	public static final By LOCATOR_CREDIT_CARD = By.xpath("/html/body/app-root/app-payment/app-payment-request/div/div[2]/div[1]/div/div/app-owner-data/app-add-data/div/gateway-paymentez/div/mat-radio-group/mat-accordion/div/mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-panel-description/div/div[1]/mat-radio-button/label/div[2]");
	public static final By LOCATOR_PAYMENT_C = By.id("pagar-gateway-btn");
	//formulario de pago paimentez
	public static final By LOCATOR_IFRAME = By.xpath("//*[@id=\"modalBoxContentPaymentezCheckout\"]");
	public static final By LOCATOR_HOLDER_NAME = By.xpath("/html/body/form/div[2]/div[3]/input");
	public static final By LOCATOR_CARD_NUMBER = By.name("card-number");
	public static final By LOCATOR_MONTH_CARD = By.xpath("/html/body/form/div[2]/div[5]/div/div[1]/input[1]");
	public static final By LOCATOR_CVV = By.xpath("/html/body/form/div[2]/div[6]/div/input");
	public static final By LOCATOR_DUES = By.xpath("//*[@id=\"my-card\"]/div[7]/select");
	public static final By LOCATOR_BUTTON_FORM_CHECKOUT = By.xpath("//*[@id=\"checkout-form\"]/div[4]/div[2]/button");
	// datos PSE
	public static final By LOCATOR_PSE = By.xpath("//*[@id=\"mat-radio-4\"]/label/div[1]/div[1]");
	public static final By LOCATOR_TYPE_DOCUMENT_P = By.name("documentType");
	public static final By LOCATOR_CC = ByAngularOptions.id("mat-option-2");
	public static final By LOCATOR_CE = ByAngularOptions.id("mat-option-3");
	public static final By LOCATOR_CP = ByAngularOptions.id("mat-option-4");
	public static final By LOCATOR_NIT = ByAngularOptions.id("mat-option-5");
	public static final By LOCATOR_TI = ByAngularOptions.id("mat-option-6");
	public static final By LOCATOR_TYPE_PERSON = By.name("personType");
	public static final By LOCATOR_PN = ByAngularOptions.id("mat-option-0");
	public static final By LOCATOR_PJ = ByAngularOptions.id("mat-option-1");
	public static final By LOCATOR_BANK = By.name("bank");
	public static final By LOCATOR_BANCOLOMBIA = ByAngularOptions.id("mat-option-19");
	public static final By LOCATOR_CAJA_SOCIAL = ByAngularOptions.id("mat-option-8");
	public static final By LOCATOR_PAYMENT_P = By.xpath("//*[@id=\"pay-pse\"]/form/div[2]/button");
	
}
