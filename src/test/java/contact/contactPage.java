package contact;

import org.openqa.selenium.Keys;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class contactPage extends BasicWrap {

	public contactPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void contactBuyNew(String Contact) throws InterruptedException {
		try {
			Thread.sleep(2000);
			click(LocatorContact.LOCATOR_X);
			Thread.sleep(2000);
			click(LocatorContact.LOCATOR_BUY_NEW);
			Thread.sleep(8000);
			WebElement text = driver.findElement(LocatorContact.LOCATOR_BUILDER);
			type(BasicData.CONSTRUCTORA, LocatorContact.LOCATOR_BUILDER);
			Thread.sleep(8000);
			text.sendKeys(Keys.DOWN);
			text.sendKeys(Keys.ENTER);
			click(LocatorContact.LOCATOR_APPLY_BUTTON);
			Thread.sleep(8000);
			click(LocatorContact.LOCATOR_CANCELAR);
			Thread.sleep(10000);
			if (BasicData.CONTACT_1.equals(Contact)) {
				click(LocatorContact.LOCATOR_CONTACT_1);
			}
			if (BasicData.CONTACT_2.equals(Contact)) {
				click(LocatorContact.LOCATOR_CONTACT_2);
			}
			if (BasicData.CONTACT_3.equals(Contact)) {
				click(LocatorContact.LOCATOR_CONTACT_3);
			}
			if (BasicData.CONTACT_4.equals(Contact)) {
				click(LocatorContact.LOCATOR_CONTACT_4);
			}
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
	}

	public void formContact(String CustomerSupport, String LivinPlace, String PlanToBuy) throws InterruptedException {

		try {
			Thread.sleep(8000);
			type(BasicData.NAME, LocatorContact.LOCATOR_NAME);
			type(BasicData.EMAIL, LocatorContact.LOCATOR_EMAIL);
			type(BasicData.CELL_PHONE, LocatorContact.LOCATOR_CELL_PHONE);
			click(LocatorContact.LOCATOR_SCHEDULE);
			if (BasicData.CUSTOMER_SUPPORT_LV_AM.equals(CustomerSupport)) {
				click(LocatorContact.LOCATOR_MONDAY_FRIDAY_AM);
			}
			if (BasicData.CUSTOMER_SUPPORT_LV_PM.equals(CustomerSupport)) {
				click(LocatorContact.LOCATOR_MONDAY_FRIDAY_PM);
			}
			if (BasicData.CUSTOMER_SUPPORT_FS_AM.equals(CustomerSupport)) {
				click(LocatorContact.LOCATOR_WEEKEND_AM);
			}
			if (BasicData.CUSTOMER_SUPPORT_FS_PM.equals(CustomerSupport)) {
				click(LocatorContact.LOCATOR_WEEKEND_PM);
			}
			click(LocatorContact.LOCATOR_LIVING_PLACE);
			if (BasicData.LIVIN_PLACE_I.equals(LivinPlace)) {
				click(LocatorContact.LOCATOR_TO_INVEST);
			}
			if (BasicData.LIVIN_PLACE_V.equals(LivinPlace)) {
				click(LocatorContact.LOCATOR_TO_LIVE);
			}
			click(LocatorContact.LOCATOR_PLAN_TO_BUY);
			if (BasicData.PLAN_TO_BUY_3.equals(PlanToBuy)) {
				click(LocatorContact.LOCATOR_THREE_MONTHS);
			}
			if (BasicData.PLAN_TO_BUY_6.equals(PlanToBuy)) {
				click(LocatorContact.LOCATOR_SIX_MONTHS);
			}
			if (BasicData.PLAN_TO_BUY_9.equals(PlanToBuy)) {
				click(LocatorContact.LOCATOR_NINE_MONTHS);
			}
			Thread.sleep(10000);
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(30));
			ewait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(LocatorContact.LOCATOR_RE_CAPCHAT));
			ewait.until(ExpectedConditions.elementToBeClickable(LocatorContact.LOCATOR_CAPTCHA)).click();
			driver.switchTo().defaultContent();
			Thread.sleep(8000);
			click(LocatorContact.LOCATOR_BUTTON_SEND);
			Thread.sleep(5000);
			click(LocatorContact.LOCATOR_X_THREE);
			Thread.sleep(8000);
			click(LocatorContact.LOCATOR_X_TOW);

		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error" + e);
		} 

	}

	public void userBuilder() throws InterruptedException {

		try {
			Thread.sleep(8000);
			click(LocatorContact.LOCATOR_ENTER_BUTTON);
			type(BasicData.USER, LocatorContact.LOCATOR_USER);
			type(BasicData.PASSWORD, LocatorContact.LOCATOR_PASSWORD);
			click(LocatorContact.LOCATOR_LOGIN);
			Thread.sleep(10000);
			click(LocatorContact.LOCATOR_MENU);
			click(LocatorContact.LOCATOR_MY_REPORTS);
			Thread.sleep(8000);
			WebElement dta = driver.findElement(LocatorContact.LOCATOR_START_DATE);
			dta.clear();
			dta.sendKeys(BasicData.START_DATE);
			WebElement dtaFin = driver.findElement(LocatorContact.LOCATOR_END_DATE);
			dtaFin.clear();
			dtaFin.sendKeys(BasicData.END_DATE);
			Thread.sleep(5000);
			click(LocatorContact.LOCATOR_CONSULT);
			Thread.sleep(10000);
			String numText = driver.findElement(LocatorContact.LOCATOR_CLICK_FORM).getText();
			System.out.println("Numero de contactos registrados: " + numText);

		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		} 
	}
}
