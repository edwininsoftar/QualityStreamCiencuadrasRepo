package contact.buy.used;

import org.openqa.selenium.By;

public class LocatorContactBuyUsed {

	// Localizadores para llegar al contactar
	public static final By LOCATOR_X = By.xpath("//*[@id=\"mat-dialog-0\"]/app-register-code/div/div/button");
	public static final By LOCATOR_BUY_USED = By.linkText("COMPRA USADO");
	public static final By LOCATOR_OFFERS = By.linkText("OFERTAS");
	public static final By LOCATOR_LEASE_PROPERTY = By.linkText("ARRENDAR INMUEBLE");
	public static final By LOCATOR_SEARCH  = By.id("search");
	public static final By LOCATOR_CITY = By.xpath("/html/body/div[3]/div/div/div/div/mat-optgroup[1]/mat-option/span");
	public static final By LOCATOR_CONTACT_1 = By.xpath("//*[@id=\"all-content\"]/app-card[1]/div/div/div[2]/div/button[3]");
	public static final By LOCATOR_CONTACT_2 = By.xpath("//*[@id=\"all-content\"]/app-card[2]/div/div/div[2]/div/button[3]");
	public static final By LOCATOR_CONTACT_3 = By.xpath("//*[@id=\"all-content\"]/app-card[3]/div/div/div[2]/div/button[3]");
	public static final By LOCATOR_CONTACT_4 = By.xpath("//*[@id=\"all-content\"]/app-card[4]/div/div/div[2]/div/button[3]");
	public static final By LOCATOR_LETTER_1 = By.xpath("//*[@id=\"all-content\"]/app-card[1]/div/div/div[2]/div/div/ul/li[1]/button");
	public static final By LOCATOR_LETTER_2 = By.xpath("//*[@id=\"all-content\"]/app-card[2]/div/div/div[2]/div/div/ul/li[1]/button");
	public static final By LOCATOR_LETTER_3 = By.xpath("//*[@id=\"all-content\"]/app-card[3]/div/div/div[2]/div/div/ul/li[1]/button");
	public static final By LOCATOR_LETTER_4 = By.xpath("//*[@id=\"all-content\"]/app-card[4]/div/div/div[2]/div/div/ul/li[1]/button");
	// Localizadores para llenar el formulario contactar
	public static final By LOCATOR_NAME = By.id("name");
	public static final By LOCATOR_EMAIL = By.id("email");
	public static final By LOCATOR_CELL_PHONE = By.id("celphone");
	public static final By LOCATOR_RE_CAPCHAT = By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
	public static final By LOCATOR_CAPTCHA = By.cssSelector("div[class=\"recaptcha-checkbox-border\"]");
	public static final By LOCATOR_BUTTON_SEND = By.xpath("//*[@id=\"estateAdvisorForm\"]/div[7]/button/span");
	public static final By LOCATOR_X_TWO = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-message-sended/div/div[1]/button/span/span");
	// Localizadores para validar que si se envio el contactar como usuario
	// inmobiliaria
	public static final By LOCATOR_ENTER_BUTTON = By.linkText("INGRESAR");
	public static final By LOCATOR_USER = By.cssSelector("input[formcontrolname=\"username\"]");
	public static final By LOCATOR_PASSWORD = By.cssSelector("input[formcontrolname=\"password\"]");
	public static final By LOCATOR_LOGIN = By.xpath("/html/body/app-root/div/app-login/div/lib-cc-login/div/div/div[3]/form/button/span");
	public static final By LOCATOR_MENU = By.cssSelector("div[class=\"circle-name\"]");
	public static final By LOCATOR_MY_REPORTS = By.linkText("Mis Reportes");
	public static final By LOCATOR_START_DATE = By.id("fechaDesde");
	public static final By LOCATOR_END_DATE = By.id("fechaHasta");
	public static final By LOCATOR_CONSULT = By.id("btn-submit-home");
	public static final By LOCATOR_CLICK_FORM = By.xpath("/html/body/div[3]/div/section/div/div[3]/div/div[5]/table/tbody/tr[2]/td[5]");

}
