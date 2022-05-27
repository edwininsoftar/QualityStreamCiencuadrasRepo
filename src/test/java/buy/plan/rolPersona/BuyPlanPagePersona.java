package buy.plan.rolPersona;

import java.io.File;

import base.BasicData;
import base.BasicWrap;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.netty.handler.timeout.TimeoutException;

public class BuyPlanPagePersona extends BasicWrap {

	public BuyPlanPagePersona(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Esta funcion es la encargada del login hasta el proceso de selección del tipo de plan
	public void buys(String Popst, String PlanType) throws InterruptedException {
		try {
			Thread.sleep(2000);
			click(LocatorBuyPlanPersona.LOCATOR_X);
			Thread.sleep(2000);
			click(LocatorBuyPlanPersona.LOCATOR_INTO);
			type(BasicData.USER_NAME_P, LocatorBuyPlanPersona.LOCATOR_USERNAME);
			type(BasicData.PASSWORD_P,LocatorBuyPlanPersona.LOCATOR_PASSWORD);
			click(LocatorBuyPlanPersona.LOCATOR_LOGIN);
			Thread.sleep(8000);
			click(LocatorBuyPlanPersona.LOCATOR_PUBLIC);
			click(LocatorBuyPlanPersona.LOCATOR_PERSON);
			Thread.sleep(5000);
			click(LocatorBuyPlanPersona.LOCATOR_PUBLIC_TU);
			if (BasicData.POPST_TYPE_T.equals(Popst)) {
				Thread.sleep(10000);
				click(LocatorBuyPlanPersona.LOCATOR_POST_YOUR);
				if (BasicData.PLAN_TYPE_E.equals(PlanType)) {
					click(LocatorBuyPlanPersona.LOCATOR_STANDART);
				}
				if (BasicData.PLAN_TYPE_P.equals(PlanType)) {
					click(LocatorBuyPlanPersona.LOCATOR_PREMIUM);
					Thread.sleep(5000);
					type(BasicData.CITY_PREMIUM, LocatorBuyPlanPersona.LOCATOR_CITY_PREMIUM);
					Thread.sleep(5000);
					WebElement cp = driver.findElement(LocatorBuyPlanPersona.LOCATOR_CITY_PREMIUM);
					cp.sendKeys(Keys.DOWN);
					cp.sendKeys(Keys.ENTER);
					Thread.sleep(5000);
					click(LocatorBuyPlanPersona.LOCATOR_BUTTON_CONFIR_PREMIUM);
					Thread.sleep(3000);
					click(LocatorBuyPlanPersona.LOCATOR_BUTTON_CONTINUE_PREMIUM);
				}
			}
			if (BasicData.POPST_TYPE_I.equals(Popst)) {
				Thread.sleep(8000);
				click(LocatorBuyPlanPersona.LOCATOR_REAL_ESTATE);
			}
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (ElementClickInterceptedException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	// Esta funcion es la encargada de diligenciar el formulario información del inmueble
	public void purchaseForm(String PropertyType, String TransactionType, String Management, String Stratum, String ContactMe) throws InterruptedException {
		try {
			Thread.sleep(8000);
			click(LocatorBuyPlanPersona.LOCATOR_PROPERTY_TYPE);
			Thread.sleep(3000);
			if (BasicData.PROPERTY_TYPE_A.equals(PropertyType)) {
				click(LocatorBuyPlanPersona.LOCATOR_APARTAMENT);
			}
			if (BasicData.TRANSACTION_TYPE_A.equals(TransactionType)) {
				click(LocatorBuyPlanPersona.LOCATOR_RENT);
				type(BasicData.VALUE, LocatorBuyPlanPersona.LOCATOR_VALUE);
				if (BasicData.MANAGEMENT_S.equals(Management)) {
					Actions action = new Actions(driver);
					WebElement source = driver.findElement(LocatorBuyPlanPersona.LOCATOR_MANAGEMENT_NO);
					WebElement target = driver.findElement(LocatorBuyPlanPersona.LOCATOR_MANAGEMENT_SI);
					action.dragAndDrop(source, target);
					action.dragAndDropBy(source, 0, 0);
					action.moveToElement(source).moveToElement(target).perform();
					action.release();
				}
				if (BasicData.MANAGEMENT_N.equals(Management)) {
					type(BasicData.MANAGEMENT_VALUE, LocatorBuyPlanPersona.LOCATOR_MANAGEMENT_VALUE);
				}
			}
			if (BasicData.TRANSACTION_TYPE_V.equals(TransactionType)) {
				click(LocatorBuyPlanPersona.LOCATOR_SALE);
				type(BasicData.SALE_VALUE, LocatorBuyPlanPersona.LOCATOR_SALE_VALUE);
				type(BasicData.MANAGEMENT_VALUE, LocatorBuyPlanPersona.LOCATOR_MANAGEMENT_VALUE);
			}
			type(BasicData.YEARS_OF_ANTIQUITY, LocatorBuyPlanPersona.LOCATOR_YEARS_OF_ANTIQUITY);
			type(BasicData.PROPERTY_DESCRIPTION, LocatorBuyPlanPersona.LOCATOR_PROPERTY_DESCRIPTION);
			if (BasicData.TRANSACTION_TYPE_A.equals(TransactionType)) {
				if (BasicData.STRATUM_1.equals(Stratum)) {
					click(LocatorBuyPlanPersona.LOCATOR_STRATUM_ONE);
				}
				if (BasicData.STRATUM_2.equals(Stratum)) {
					click(LocatorBuyPlanPersona.LOCATOR_STRATUM_TWO);
				}
				if (BasicData.STRATUM_3.equals(Stratum)) {
					click(LocatorBuyPlanPersona.LOCATOR_STRATUM_THREE);
				}
				if (BasicData.STRATUM_4.equals(Stratum)) {
					click(LocatorBuyPlanPersona.LOCATOR_STRATUM_FOUR);
				}
				if (BasicData.STRATUM_5.equals(Stratum)) {
					click(LocatorBuyPlanPersona.LOCATOR_STRATUM_FIVE);
				}
				if (BasicData.STRATUM_6.equals(Stratum)) {
					click(LocatorBuyPlanPersona.LOCATOR_STRATUM_SIX);
				}
			}
			if (BasicData.TRANSACTION_TYPE_V.equals(TransactionType)) {
				if (BasicData.STRATUM_1.equals(Stratum)) {
					click(LocatorBuyPlanPersona.LOCATOR_STRATUM_ONE_V);
				}
				if (BasicData.STRATUM_2.equals(Stratum)) {
					click(LocatorBuyPlanPersona.LOCATOR_STRATUM_TWO_V);
				}
				if (BasicData.STRATUM_3.equals(Stratum)) {
					click(LocatorBuyPlanPersona.LOCATOR_STRATUM_THREE_V);
				}
				if (BasicData.STRATUM_4.equals(Stratum)) {
					click(LocatorBuyPlanPersona.LOCATOR_STRATUM_FOUR_V);
				}
				if (BasicData.STRATUM_5.equals(Stratum)) {
					click(LocatorBuyPlanPersona.LOCATOR_STRATUM_FIVE_V);
				}
				if (BasicData.STRATUM_6.equals(Stratum)) {
					click(LocatorBuyPlanPersona.LOCATOR_STRATUM_SIX_V);
				}
			}
			type(BasicData.SQUARE_METER, LocatorBuyPlanPersona.LOCATOR_SQUARE_METER);
			WebElement roomClear = driver.findElement(LocatorBuyPlanPersona.LOCATOR_ROOM);
			roomClear.clear();
			type(BasicData.ROOM, LocatorBuyPlanPersona.LOCATOR_ROOM);
			WebElement toiletsClear = driver.findElement(LocatorBuyPlanPersona.LOCATOR_N_TOILETS);
			toiletsClear.clear();
			type(BasicData.N_TOILETS, LocatorBuyPlanPersona.LOCATOR_N_TOILETS);
			WebElement parkingClear = driver.findElement(LocatorBuyPlanPersona.LOCATOR_N_PARKING);
			parkingClear.clear();
			type(BasicData.N_PARKING, LocatorBuyPlanPersona.LOCATOR_N_PARKING);
			WebElement citytab = driver.findElement(LocatorBuyPlanPersona.LOCATOR_CITY);
			citytab.sendKeys(Keys.TAB);
			type(BasicData.CITY, LocatorBuyPlanPersona.LOCATOR_CITY);
			Thread.sleep(4000);
			type(BasicData.NEIGHBORHOOD, LocatorBuyPlanPersona.LOCATOR_NEIGHBORHOOD);
			WebElement neighborhoodTab = driver.findElement(LocatorBuyPlanPersona.LOCATOR_NEIGHBORHOOD);
			Thread.sleep(4000);
			neighborhoodTab.sendKeys(Keys.TAB);
			Thread.sleep(4000);
			type(BasicData.DIRECTION, LocatorBuyPlanPersona.LOCATOR_DIRECTION);
			type(BasicData.ADD_ADDRESS, LocatorBuyPlanPersona.LOCATOR_ADD_ADDRESS);
			click(LocatorBuyPlanPersona.LOCATOR_PROPERTY_LOCATION);
			type(BasicData.N_WHATSAPP, LocatorBuyPlanPersona.LOCATOR_N_WHATSAPP);
			if (BasicData.CONTACTME_W.equals(ContactMe)) {
				click(LocatorBuyPlanPersona.LOCATOR_CONTACT_ME_WHATSAPP);
			}
			if (BasicData.CONTACTME_LL.equals(ContactMe)) {
				click(LocatorBuyPlanPersona.LOCATOR_CONTACT_ME_CALL);
			}
			Thread.sleep(2000);
			click(LocatorBuyPlanPersona.LOCATOR_CONTINUE);
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (ElementClickInterceptedException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	// Esta funcion es la encargada de cargar la imagenes del inmueble
	public void load(String PlanType) throws InterruptedException {
		try {
			File file1 = new File("./src/test/resources/img/portada.png");
			File file2 = new File("./src/test/resources/img/arriendo.png");
			File file3 = new File("./src/test/resources/img/Screenshot.png");
			String phat1 = file1.getAbsolutePath();
			String phat2 = file2.getAbsolutePath();
			String phat3 = file3.getAbsolutePath();

			driver.findElement(LocatorBuyPlanPersona.LOCATOR_IMG).sendKeys(phat1);
			Thread.sleep(5000);
			driver.findElement(LocatorBuyPlanPersona.LOCATOR_IMG).sendKeys(phat2);
			Thread.sleep(5000);
			driver.findElement(LocatorBuyPlanPersona.LOCATOR_IMG).sendKeys(phat3);
			Thread.sleep(5000);
			if (BasicData.PLAN_TYPE_P.equals(PlanType)) {
				Thread.sleep(3000);
				click(LocatorBuyPlanPersona.LOCATOR_DATE_PREMIUM);
				Thread.sleep(3000);
				click(LocatorBuyPlanPersona.LOCATOR_28);
				click(LocatorBuyPlanPersona.LOCATOR_TIME_PREMIUM);
				Thread.sleep(3000);
				click(LocatorBuyPlanPersona.LOCATOR_9AM);
			}
			Thread.sleep(3000);
			click(LocatorBuyPlanPersona.LOCATOR_CONTINUE_TWO);
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (ElementClickInterceptedException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	// Esta funcion es la encargada de proceso de pago y codigo de descuento
	public void payFinish(String DiscountCode) {
		try {
			Thread.sleep(20000);
			if (DiscountCode != "") {
				type(DiscountCode, LocatorBuyPlanPersona.LOCATOR_BOUND);
				click(LocatorBuyPlanPersona.LOCATOR_APLIC);
			}
			click(LocatorBuyPlanPersona.LOCATOR_BUTTON_PAY_FINISH);
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (ElementClickInterceptedException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	// Esta funcion es la encargada de diligenciar los datos bancarios del cliente y finalizar la compra
	public void purchaseDetail(String PaymentType,String Dues) {
		try {
			Thread.sleep(8000);
			click(LocatorBuyPlanPersona.LOCATOR_COOKIES);
			Thread.sleep(3000);
			if (BasicData.PAYMENT_TYPE_D.equals(PaymentType)) {
				click(LocatorBuyPlanPersona.LOCATOR_DEBIT_CARD);
				Thread.sleep(5000);
				click(LocatorBuyPlanPersona.LOCATOR_PAYMENT_D);
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(LocatorBuyPlanPersona.LOCATOR_IFRAME));
				type(BasicData.HOLDER_NAME, LocatorBuyPlanPersona.LOCATOR_HOLDER_NAME);
				type(BasicData.CARD_NUMBER, LocatorBuyPlanPersona.LOCATOR_CARD_NUMBER);
				type(BasicData.MONTH_AND_YEAR_CARD, LocatorBuyPlanPersona.LOCATOR_MONTH_CARD);
				type(BasicData.CVV, LocatorBuyPlanPersona.LOCATOR_CVV);
				click(LocatorBuyPlanPersona.LOCATOR_BUTTON_FORM_CHECKOUT);
			}
			if (BasicData.PAYMENT_TYPE_C.equals(PaymentType)) {
				click(LocatorBuyPlanPersona.LOCATOR_CREDIT_CARD);
				Thread.sleep(5000);
				click(LocatorBuyPlanPersona.LOCATOR_PAYMENT_C);
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(LocatorBuyPlanPersona.LOCATOR_IFRAME));
				type(BasicData.HOLDER_NAME,LocatorBuyPlanPersona.LOCATOR_HOLDER_NAME);
				type(BasicData.CARD_NUMBER, LocatorBuyPlanPersona.LOCATOR_CARD_NUMBER);
				type(BasicData.MONTH_CARD, LocatorBuyPlanPersona.LOCATOR_MONTH_CARD);
				type(BasicData.CVV, LocatorBuyPlanPersona.LOCATOR_CVV);
				WebElement ddl = driver.findElement(LocatorBuyPlanPersona.LOCATOR_DUES);
				Select sel = new Select(ddl);
				sel.selectByVisibleText(Dues);
				click(LocatorBuyPlanPersona.LOCATOR_BUTTON_FORM_CHECKOUT);
			}
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (ElementClickInterceptedException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
