package contact.buy.used;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class contactBuyUsedPage extends BasicWrap {

	public contactBuyUsedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void contactBuyUsed(String ResultsContact, String Contact, String Letter) throws InterruptedException {
		try {
			Thread.sleep(2000);
			click(LocatorContactBuyUsed.LOCATOR_X);
			if (BasicData.RESULTS_CONTACT_C.equals(ResultsContact)) {
				click(LocatorContactBuyUsed.LOCATOR_BUY_USED);
			}
			if (BasicData.RESULTS_CONTACT_O.equals(ResultsContact)) {
				click(LocatorContactBuyUsed.LOCATOR_OFFERS);
			}
			if (BasicData.RESULTS_CONTACT_A.equals(ResultsContact)) {
				click(LocatorContactBuyUsed.LOCATOR_LEASE_PROPERTY);
			}
			Thread.sleep(8000);
			type(BasicData.CITY, LocatorContactBuyUsed.LOCATOR_SEARCH);
			Thread.sleep(8000);
			click(LocatorContactBuyUsed.LOCATOR_CITY);
			Thread.sleep(8000);
			if (BasicData.CONTACT_1.equals(Contact)) {
				click(LocatorContactBuyUsed.LOCATOR_CONTACT_1);
			}
			if (BasicData.CONTACT_2.equals(Contact)) {
				click(LocatorContactBuyUsed.LOCATOR_CONTACT_2);
			}
			if (BasicData.CONTACT_3.equals(Contact)) {
				click(LocatorContactBuyUsed.LOCATOR_CONTACT_3);
			}
			if (BasicData.CONTACT_4.equals(Contact)) {
				click(LocatorContactBuyUsed.LOCATOR_CONTACT_4);
			}
			Thread.sleep(10000);
			if (BasicData.LETTER_1.equals(Letter)) {
				click(LocatorContactBuyUsed.LOCATOR_LETTER_1);
			}
			if (BasicData.LETTER_2.equals(Letter)) {
				click(LocatorContactBuyUsed.LOCATOR_LETTER_2);
			}
			if (BasicData.LETTER_3.equals(Letter)) {
				click(LocatorContactBuyUsed.LOCATOR_LETTER_3);
			}
			if (BasicData.LETTER_4.equals(Letter)) {
				click(LocatorContactBuyUsed.LOCATOR_LETTER_4);
			} 
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error:"+ e);
		}
	}

	public void formContact() throws InterruptedException {

		try {
			Thread.sleep(8000);
			type(BasicData.NAME, LocatorContactBuyUsed.LOCATOR_NAME);
			type(BasicData.EMAIL, LocatorContactBuyUsed.LOCATOR_EMAIL);
			type(BasicData.CELL_PHONE, LocatorContactBuyUsed.LOCATOR_CELL_PHONE);
			Thread.sleep(10000);
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(30));
			ewait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(LocatorContactBuyUsed.LOCATOR_RE_CAPCHAT));
			ewait.until(ExpectedConditions.elementToBeClickable(LocatorContactBuyUsed.LOCATOR_CAPTCHA)).click();
			driver.switchTo().defaultContent();
			Thread.sleep(8000);
			click(LocatorContactBuyUsed.LOCATOR_BUTTON_SEND);
			Thread.sleep(10000);
			click(LocatorContactBuyUsed.LOCATOR_X_TWO);

		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error:" +e);
		} 
	}

	public void userRealEstate() throws InterruptedException {

		try {
			Thread.sleep(8000);
			click(LocatorContactBuyUsed.LOCATOR_ENTER_BUTTON);
			type(BasicData.USER_C, LocatorContactBuyUsed.LOCATOR_USER);
			type(BasicData.PASSWORD_C, LocatorContactBuyUsed.LOCATOR_PASSWORD);
			click(LocatorContactBuyUsed.LOCATOR_LOGIN);
			Thread.sleep(8000);
			click(LocatorContactBuyUsed.LOCATOR_MENU);
			click(LocatorContactBuyUsed.LOCATOR_MY_REPORTS);
			Thread.sleep(8000);
			WebElement dta = driver.findElement(LocatorContactBuyUsed.LOCATOR_START_DATE);
			dta.clear();
			dta.sendKeys(BasicData.START_DATE);
			WebElement dtaFin = driver.findElement(LocatorContactBuyUsed.LOCATOR_END_DATE);
			dtaFin.clear();
			dtaFin.sendKeys(BasicData.END_DATE);
			Thread.sleep(5000);
			click(LocatorContactBuyUsed.LOCATOR_CONSULT);
			Thread.sleep(30000);
			String numText = driver.findElement(LocatorContactBuyUsed.LOCATOR_CLICK_FORM).getText();
			System.out.println("Numero de contactos registrados: " + numText);

		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error" + e);
		} 

	}

}
