 package create.property.rolPersona;

import java.io.File;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class CreatePropertyPersonPage extends BasicWrap{
	
	public CreatePropertyPersonPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void login() {
		try {
			Thread.sleep(2000);
			click(LocatorCreatePropertyPersona.LOCATOR_X);
			click(LocatorCreatePropertyPersona.LOCATOR_INTO);
			Thread.sleep(2000);
			type(BasicData.USERNAME_P, LocatorCreatePropertyPersona.LOCATOR_USER_NAME);
			type(BasicData.PASSWORD_P, LocatorCreatePropertyPersona.LOCATOR_PASSWORD);
			click(LocatorCreatePropertyPersona.LOCATOR_LOGIN);
			Thread.sleep(8000);
			click(LocatorCreatePropertyPersona.LOCATOR_USER);
			click(LocatorCreatePropertyPersona.LOCATOR_PUBLISHED_PROPERTY);
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
	
	public void published(String ChoosePost, String TypePlan) {
		try {
			Thread.sleep(5000);
			click(LocatorCreatePropertyPersona.LOCATOR_PUBLISHED);
			Thread.sleep(15000);
			if(BasicData.CHOOSE_POST_T.equals(ChoosePost)) {
				click(LocatorCreatePropertyPersona.LOCATOR_PUBLIC_TU);
			}
			if(BasicData.CHOOSE_POST_I.equals(ChoosePost)) {
				click(LocatorCreatePropertyPersona.LOCATOR_REAL_ESTATE);
			}
			if(BasicData.PLAN_TYPE_E.equals(TypePlan)) {
				click(LocatorCreatePropertyPersona.LOCATOR_STANDARD);
			}
			if(BasicData.PLAN_TYPE_P.equals(TypePlan)) {
				click(LocatorCreatePropertyPersona.LOCATOR_PREMIUM);
				Thread.sleep(5000);
				type(BasicData.CITY_PREMIUM, LocatorCreatePropertyPersona.LOCATOR_CITY_PREMIUM);
				Thread.sleep(5000);
				WebElement cp = driver.findElement(LocatorCreatePropertyPersona.LOCATOR_CITY_PREMIUM);
				cp.sendKeys(Keys.DOWN);
				cp.sendKeys(Keys.ENTER);
				Thread.sleep(5000);
				click(LocatorCreatePropertyPersona.LOCATOR_BUTTON_CONFIRM_PREMIUM);
				Thread.sleep(3000);
				click(LocatorCreatePropertyPersona.LOCATOR_BUTTON_CONTINUE_PREMIUM );
			}
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
	
	public void purchaseForm(String PropertyType, String TransactionType, String Management, String Stratum, String ContactMe) {
		try {
			Thread.sleep(8000);
			click(LocatorCreatePropertyPersona.LOCATOR_PROPERTY_TYPE);
			Thread.sleep(3000);
			if(BasicData.PROPERTY_TYPE_A.equals(PropertyType)) {
				click(LocatorCreatePropertyPersona.LOCATOR_APARTAMENT);
			}
			if(BasicData.PROPERTY_TYPE_C.equals(PropertyType)) {
				click(LocatorCreatePropertyPersona.LOCATOR_HOUSE);
			}
			if(BasicData.TRANSACCTION_TYPE_A.equals(TransactionType)) {
				click(LocatorCreatePropertyPersona.LOCATOR_RENT);
				type(BasicData.VALUE, LocatorCreatePropertyPersona.LOCATOR_VALUE);
				if(BasicData.MANAGEMENT_S.equals(Management)) {
					Actions action = new Actions(driver);
					WebElement source = driver.findElement(LocatorCreatePropertyPersona.LOCATOR_MANAGEMENT_NO);
					WebElement target = driver.findElement(LocatorCreatePropertyPersona.LOCATOR_MANAGEMENT_SI);
					action.dragAndDrop(source, target);
					action.dragAndDropBy(source, 0, 0);
					action.moveToElement(source).moveToElement(target).perform();
					action.release();
				}
				if(BasicData.MANAGEMENT_N.equals(Management)){
					type(BasicData.MANAGEMENT_VALUE, LocatorCreatePropertyPersona.LOCATOR_MANAGEMENT_VALUE);
				}
			}
			if(BasicData.TRANSACCTION_TYPE_V.equals(TransactionType)) {
				click(LocatorCreatePropertyPersona.LOCATOR_SALE);
				type(BasicData.SALE_VALUE, LocatorCreatePropertyPersona.LOCATOR_SALE_VALUE);
				type(BasicData.MANAGEMENT_VALUE, LocatorCreatePropertyPersona.LOCATOR_MANAGEMENT_VALUE);
			}
			type(BasicData.YEARS_OF_ANTIQUITY, LocatorCreatePropertyPersona.LOCATOR_YEARS_OF_ANTIQUITY);
			type(BasicData.PROPERTY_DESCRIPTION, LocatorCreatePropertyPersona.LOCATOR_PROPERTY_DESCRIPTION);
			if(BasicData.TRANSACCTION_TYPE_A.equals(TransactionType)) {
				if(BasicData.STRATUM_1.equals(Stratum)) {
					click(LocatorCreatePropertyPersona.LOCATOR_STRATUM_ONE);
				}
				if(BasicData.STRATUM_2.equals(Stratum)) {
					click(LocatorCreatePropertyPersona.LOCATOR_STRATUM_TWO);
				}
				if(BasicData.STRATUM_3.equals(Stratum)) {
					click(LocatorCreatePropertyPersona.LOCATOR_STRATUM_THREE);
				}
				if(BasicData.STRATUM_4.equals(Stratum)) {
					click(LocatorCreatePropertyPersona.LOCATOR_STRATUM_FOUR);
				}
				if(BasicData.STRATUM_5.equals(Stratum)) {
					click(LocatorCreatePropertyPersona.LOCATOR_STRATUM_FIVE);
				}
				if(BasicData.STRATUM_6.equals(Stratum)) {
					click(LocatorCreatePropertyPersona.LOCATOR_STRATUM_SIX);
				}
			}
			if(BasicData.TRANSACCTION_TYPE_V.equals(TransactionType)) {
				if(BasicData.STRATUM_1.equals(Stratum)) {
					click(LocatorCreatePropertyPersona.LOCATOR_STRATUM_ONE_V);
				}
				if(BasicData.STRATUM_2.equals(Stratum)) {
					click(LocatorCreatePropertyPersona.LOCATOR_STRATUM_TWO_V);
				}
				if(BasicData.STRATUM_3.equals(Stratum)) {
					click(LocatorCreatePropertyPersona.LOCATOR_STRATUM_THREE_V);
				}
				if(BasicData.STRATUM_4.equals(Stratum)) {
					click(LocatorCreatePropertyPersona.LOCATOR_STRATUM_FOUR_V);
				}
				if(BasicData.STRATUM_5.equals(Stratum)) {
					click(LocatorCreatePropertyPersona.LOCATOR_STRATUM_FIVE_V);
				}
				if(BasicData.STRATUM_6.equals(Stratum)) {
					click(LocatorCreatePropertyPersona.LOCATOR_STRATUM_SIX_V);
				}
			}
			type(BasicData.SQUARE_METER, LocatorCreatePropertyPersona.LOCATOR_SQUARE_METER);
			WebElement roomClear = driver.findElement(LocatorCreatePropertyPersona.LOCATOR_ROOM);
			roomClear.clear();
			type(BasicData.ROOM, LocatorCreatePropertyPersona.LOCATOR_ROOM);
			WebElement toiletsClear = driver.findElement(LocatorCreatePropertyPersona.LOCATOR_N_TOILETS);
			toiletsClear.clear();
			type(BasicData.N_TOILETS, LocatorCreatePropertyPersona.LOCATOR_N_TOILETS);
			WebElement parkingClear = driver.findElement(LocatorCreatePropertyPersona.LOCATOR_N_PARKING);
			parkingClear.clear();
			type(BasicData.N_PARKING, LocatorCreatePropertyPersona.LOCATOR_N_PARKING);
			WebElement citytab = driver.findElement(LocatorCreatePropertyPersona.LOCATOR_CITY);
			citytab.sendKeys(Keys.TAB);
			type(BasicData.CITY_P, LocatorCreatePropertyPersona.LOCATOR_CITY);
			Thread.sleep(4000);
			type(BasicData.NEIGHBORHOOD_P, LocatorCreatePropertyPersona.LOCATOR_NEIGHBORHOOD);
			WebElement neighborhoodTab = driver.findElement(LocatorCreatePropertyPersona.LOCATOR_NEIGHBORHOOD);
			Thread.sleep(4000);
			neighborhoodTab.sendKeys(Keys.TAB);
			Thread.sleep(4000);
			type(BasicData.DIRECTION_P, LocatorCreatePropertyPersona.LOCATOR_DIRECTION);
			type(BasicData.TEXT_COMPLEMENT_2, LocatorCreatePropertyPersona.LOCATOR_ADD_ADDRESS);
			click(LocatorCreatePropertyPersona.LOCATOR_PROPERTY_LOCATION);
			type(BasicData.N_WHATSAPP, LocatorCreatePropertyPersona.LOCATOR_N_WHATSAPP);
			if(BasicData.CONTACT_ME_W.equals(ContactMe)) {
				click(LocatorCreatePropertyPersona.LOCATOR_CONTACT_ME_WHATSAPP);
			}
			if(BasicData.CONTACT_ME_LL.equals(ContactMe)){
				click(LocatorCreatePropertyPersona.LOCATOR_CONTACT_ME_CALL);
			}
			Thread.sleep(2000);
			click(LocatorCreatePropertyPersona.LOCATOR_CONTINUE);
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

	public void load(String PlanType) {
		try {
			File file1 = new File("./src/test/resources/img/portada.png");
			File file2 = new File("./src/test/resources/img/arriendo.png");
			File file3 = new File("./src/test/resources/img/Screenshot.png");
			String phat1 = file1.getAbsolutePath();
			String phat2 = file2.getAbsolutePath();
			String phat3 = file3.getAbsolutePath();
			
			driver.findElement(LocatorCreatePropertyPersona.LOCATOR_IMG).sendKeys(phat1);
			Thread.sleep(5000);
			driver.findElement(LocatorCreatePropertyPersona.LOCATOR_IMG).sendKeys(phat2);
			Thread.sleep(5000);
			driver.findElement(LocatorCreatePropertyPersona.LOCATOR_IMG).sendKeys(phat3);
			Thread.sleep(5000);
			if(BasicData.PLAN_TYPE_P.equals(PlanType)) {
				click(LocatorCreatePropertyPersona.LOCATOR_DATE_PREMIUM);
				Thread.sleep(3000);
				click(LocatorCreatePropertyPersona.LOCATOR_28);
				click(LocatorCreatePropertyPersona.LOCATOR_TIME_PREMIUM);
				Thread.sleep(3000);
				click(LocatorCreatePropertyPersona.LOCATOR_9AM);
			}
			click(LocatorCreatePropertyPersona.LOCATOR_CONTINUE_TWO);
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
	
	public void payFinish(String DiscountCode) {
		try {
			Thread.sleep(20000);
			if (DiscountCode != "") {
				type(DiscountCode, LocatorCreatePropertyPersona.LOCATOR_BOND);
				click(LocatorCreatePropertyPersona.LOCATOR_APLIC);
			}
			click(LocatorCreatePropertyPersona.LOCATOR_BUTTON_PAY_FINISH);
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
	
	public void purchaseDetail(String PaymentType, String TypeDocument, String TypePerson, String TypeBank) {
		try {
			Thread.sleep(8000);
			click(LocatorCreatePropertyPersona.LOCATOR_COOKIES);
			Thread.sleep(3000);
			if(BasicData.PAYMENT_TYPE_D.equals(PaymentType)) {
			    click(LocatorCreatePropertyPersona.LOCATOR_DEBIT_CARD);
			    Thread.sleep(5000);
				click(LocatorCreatePropertyPersona.LOCATOR_PAYMENT_D);
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(LocatorCreatePropertyPersona.LOCATOR_IFRAME));
				type(BasicData.HOLDER_NAME, LocatorCreatePropertyPersona.LOCATOR_HOLDER_NAME);
				type(BasicData.CARD_NUMBER, LocatorCreatePropertyPersona.LOCATOR_CARD_NUMBER);
				type(BasicData.MONTH_CARD, LocatorCreatePropertyPersona.LOCATOR_MONTH_CARD);
				type(BasicData.CVV, LocatorCreatePropertyPersona.LOCATOR_CVV);
				click(LocatorCreatePropertyPersona.LOCATOR_BUTTON_FORM_CHECKOUT);
			}
			if(BasicData.PAYMENT_TYPE_C.equals(PaymentType)) {
				click(LocatorCreatePropertyPersona.LOCATOR_CREDIT_CARD);
				Thread.sleep(5000);
				click(LocatorCreatePropertyPersona.LOCATOR_PAYMENT_C);
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(LocatorCreatePropertyPersona.LOCATOR_IFRAME));
				type(BasicData.HOLDER_NAME, LocatorCreatePropertyPersona.LOCATOR_HOLDER_NAME);
				type(BasicData.CARD_NUMBER, LocatorCreatePropertyPersona.LOCATOR_CARD_NUMBER);
				type(BasicData.MONTH_CARD, LocatorCreatePropertyPersona.LOCATOR_MONTH_CARD);
				type(BasicData.CVV, LocatorCreatePropertyPersona.LOCATOR_CVV);
				WebElement ddl = driver.findElement(LocatorCreatePropertyPersona.LOCATOR_DUES);
				Select sel = new Select(ddl);
				sel.selectByVisibleText(BasicData.DUES);
				click(LocatorCreatePropertyPersona.LOCATOR_BUTTON_FORM_CHECKOUT);
			}
			if(BasicData.PAYMENT_TYPE_P.equals(PaymentType)) {
				click(LocatorCreatePropertyPersona.LOCATOR_PSE);
				click(LocatorCreatePropertyPersona.LOCATOR_TYPE_DOCUMENT_P);
				Thread.sleep(8000);
				if(BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
					click(LocatorCreatePropertyPersona.LOCATOR_CC);
				}
				if(BasicData.TYPE_DOCUMENT_CE.equals(TypeDocument)) {
					click(LocatorCreatePropertyPersona.LOCATOR_CE);
				}
				if(BasicData.TYPE_DOCUMENT_CP.equals(TypeDocument)) {
					click(LocatorCreatePropertyPersona.LOCATOR_CP);
				}
				if(BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
					click(LocatorCreatePropertyPersona.LOCATOR_NIT);
				}
				if(BasicData.TYPE_DOCUMENT_TI.equals(TypeDocument)) {
					click(LocatorCreatePropertyPersona.LOCATOR_TI);
				}
				click(LocatorCreatePropertyPersona.LOCATOR_TYPE_PERSON);
				Thread.sleep(8000);
				if(BasicData.TYPE_PERSON_PN.equals(TypePerson)) {
					click(LocatorCreatePropertyPersona.LOCATOR_PN);
				}
				if(BasicData.TYPE_PERSON_PJ.equals(TypePerson)) {
					click(LocatorCreatePropertyPersona.LOCATOR_PJ);
				}
				click(LocatorCreatePropertyPersona.LOCATOR_BANK);
				Thread.sleep(8000);
				if(BasicData.TYPE_BANK_CAJA_SOCIAL.equals(TypeBank)) {
					click(LocatorCreatePropertyPersona.LOCATOR_CAJA_SOCIAL);
				}
				if(BasicData.TYPE_BANK_COLOMBIA.equals(TypeBank)) {
					click(LocatorCreatePropertyPersona.LOCATOR_BANCOLOMBIA);
				}
				Thread.sleep(8000);
				click(LocatorCreatePropertyPersona.LOCATOR_PAYMENT_P);
			}
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
