package buy.plan.rolAgente;

import org.openqa.selenium.By;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularOptions;

public class LocatorBuyPlanAgente {

	public static final By LOCATOR_X = By.xpath("//*[@id=\"mat-dialog-0\"]/app-register-code/div/div/button");
	public static final By LOCATOR_INTO = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	public static final By LOCATOR_USERNAME = By.xpath("//*[@id=\"mat-input-3\"]");
	public static final By LOCATOR_PASSWORD = By.cssSelector("input[formcontrolname=\"password\"]");
	public static final By LOCATOR_LOGIN = By.cssSelector("span[class=\"ng-star-inserted\"]");
	public static final By LOCATOR_PUBLIC = By.xpath("/html/body/app-root/app-home/section[1]/div/div/lib-cc-header/header/nav[2]/a[2]/span[2]");
	public static final By LOCATOR_AGENTE = By.name("agente"); 
	public static final By LOCATOR_SEE_PLANS = By.cssSelector("a[_ngcontent-serverapp-c275][routerlink=\"/seleccion-ideal\"]");
	public static final By LOCATOR_PLAN_XS = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div[2]/select");
	public static final By LOCATOR_PLAN_S = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[2]/div/div[2]/div[2]/select");
	public static final By LOCATOR_BUTTON_SELECT_XS = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div[3]/button");
	public static final By LOCATOR_BUTTON_SELECT_S = By.xpath("/html/body/app-root/app-products-ideal/div/div/div[2]/div/app-carousel-card/owl-carousel-o/div/div[1]/owl-stage/div/div/div[2]/div/div[2]/div[3]/button");
	//botones Agregar productos adicionales
	public static final By LOCATOR_BUTTON_ROUTE = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/app-product-card[1]/div/div[2]/div/div/button[2]/span");
	public static final By LOCATOR_BUTTON_PHOTO_TAKING = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/app-product-card[2]/div/div[2]/div/div/button[2]/span");
	public static final By LOCATOR_BUTTON_PHOTHO_UPLOAD = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/app-product-card[3]/div/div[2]/div/div/button[2]/span");
	public static final By LOCATOR_BUTTON_FEATURED = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[2]/div/app-product-card[1]/div/div[2]/div/div/button[2]/span");
	public static final By LOCATOR_BUTTON_PROMOTED = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[2]/div/app-product-card[2]/div/div[2]/div/div/button[2]/span");
	public static final By LOCATOR_BUTTON_ONLINE = By.xpath("//*[@id=\"products-base\"]/div/div[2]/div[1]/div[2]/div/div[3]/div/app-product-card/div/div[2]/div/div/button[2]/span");
	public static final By LOCATOR_BUTTON_SHOPPING_CART = By.xpath("//*[@id=\"products-base\"]/app-header/div/nav/button");
	public static final By LOCATOR_BUTTON_PAY = By.cssSelector("button[class=\"button secondary rounded block\"]");
	//Pago y descuento ciencuadras
	public static final By LOCATOR_BOND = By.cssSelector("input[formcontrolname=\"discount\"]");
	public static final By LOCATOR_APLIC = By.xpath("/html/body/app-root/app-products-checkout/car-summary/div[1]/section/div/div[2]/div[2]/app-coupon/div/form/div/button/span");
	public static final By LOCATOR_BUTTON_PAY_FINISH = By.xpath("//*[@id=\"payment-data\"]/div/div/button");
	//Datos de pago cliente
	public static final By LOCATOR_COOKIS = ByAngular.buttonText("Aceptar");
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
