package contact;

import org.openqa.selenium.By;

public class LocatorContact {

	// Localizadores para llegar al contactar
	public static final By LOCATOR_X = By.xpath("//*[@id=\"mat-dialog-0\"]/app-register-code/div/div/button");
	public static final By LOCATOR_BUY_NEW = By.linkText("COMPRA NUEVO");
	public static final By LOCATOR_BUILDER = By.cssSelector("input[formcontrolname=\"builderName\"]");
	public static final By LOCATOR_CONSTRUCTORA_TU_HOGAR = By.id("mat-option[ng-reflect-value=\"Constructora tu hogar\"]");
	public static final By LOCATOR_APPLY_BUTTON = By.xpath("//*[@id=\"btn-filter-desktop\"]");
	public static final By LOCATOR_CANCELAR = By.cssSelector("button[class=\"btn cancel\"]");
	public static final By LOCATOR_CONTACT_1 = By.xpath("//*[@id=\"all-content\"]/app-card[1]/div/div/div[2]/div/button[3]");
	public static final By LOCATOR_CONTACT_2 = By.xpath("//*[@id=\"all-content\"]/app-card[2]/div/div/div[2]/div/button[3]");
	public static final By LOCATOR_CONTACT_3 = By.xpath("//*[@id=\"all-content\"]/app-card[3]/div/div/div[2]/div/button[3]");
	public static final By LOCATOR_CONTACT_4 = By.xpath("//*[@id=\"all-content\"]/app-card[4]/div/div/div[2]/div/button[3]");
	// Localizadores para llenar el formulario contactar
	public static final By LOCATOR_NAME = By.id("name");
	public static final By LOCATOR_EMAIL = By.id("email");
	public static final By LOCATOR_CELL_PHONE = By.id("cellPhone");
	public static final By LOCATOR_SCHEDULE = By.cssSelector("mat-select[formcontrolname=\"contactSchedule\"]");
	public static final By LOCATOR_MONDAY_FRIDAY_AM = By.cssSelector("mat-option[ng-reflect-value=\"Lunes - Viernes / am\"]");
	public static final By LOCATOR_MONDAY_FRIDAY_PM = By.cssSelector("mat-option[ng-reflect-value=\"Lunes - Viernes / pm\"]");
	public static final By LOCATOR_WEEKEND_AM = By.cssSelector("mat-option[ng-reflect-value=\"Fin de semana / am\"]");
	public static final By LOCATOR_WEEKEND_PM = By.cssSelector("mat-option[ng-reflect-value=\"Fin de semana / pm\"]");
	public static final By LOCATOR_LIVING_PLACE = By.cssSelector("mat-select[formcontrolname=\"reasonSeekHousing\"]");
	public static final By LOCATOR_TO_INVEST = By.cssSelector("mat-option[ng-reflect-value=\"Para Invertir\"]");
	public static final By LOCATOR_TO_LIVE = By.cssSelector("mat-option[ng-reflect-value=\"Para Vivir\"]");
	public static final By LOCATOR_PLAN_TO_BUY = By.cssSelector("mat-select[formcontrolname=\"expectedTimePurchase\"]");
	public static final By LOCATOR_THREE_MONTHS = By.xpath("/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span");
	public static final By LOCATOR_SIX_MONTHS = By.xpath("/html/body/div[2]/div[4]/div/div/div/mat-option[2]/span");
	public static final By LOCATOR_NINE_MONTHS = By.xpath("/html/body/div[2]/div[4]/div/div/div/mat-option[3]/span");
	public static final By LOCATOR_RE_CAPCHAT = By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
	public static final By LOCATOR_CAPTCHA = By.cssSelector("div[class=\"recaptcha-checkbox-border\"]");
	public static final By LOCATOR_BUTTON_SEND = By.xpath("//*[@id=\"contactSalesForm\"]/div[7]/button[1]");
	public static final By LOCATOR_X_TOW = By.xpath("//*[@id=\"detail-contact-sales\"]/button/span/span");
	public static final By LOCATOR_X_THREE = By.xpath("/html/body/div[2]/div[4]/div/mat-dialog-container/app-message-sended/div/div[1]/button/span/span");
	// Localizadores para validar que si se envio el contactar como usuario
	// Constructora
	public static final By LOCATOR_ENTER_BUTTON = By.linkText("INGRESAR");
	public static final By LOCATOR_USER = By.cssSelector("input[formcontrolname=\"username\"]");
	public static final By LOCATOR_PASSWORD = By.cssSelector("input[formcontrolname=\"password\"]");
	public static final By LOCATOR_LOGIN = By.xpath("/html/body/app-root/div/app-login/div/lib-cc-login/div/div/div[3]/form/button/span");
	public static final By LOCATOR_MENU = By.cssSelector("button[data-toggle=\"dropdown\"]");
	public static final By LOCATOR_MY_REPORTS = By.linkText("Mis Reportes");
	public static final By LOCATOR_START_DATE = By.id("fechaDesde");
	public static final By LOCATOR_END_DATE = By.id("fechaHasta");
	public static final By LOCATOR_CONSULT = By.id("btn-submit-home");
	public static final By LOCATOR_CLICK_FORM = By.xpath("/html/body/div[3]/div/section/div/div[3]/div/div[4]/table/tbody/tr[2]/td[5]");
	
}
