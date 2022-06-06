package buy.plan.rolAgente;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class BuyPlanPageAgente extends BasicWrap{
		
	public BuyPlanPageAgente(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	public void buys() throws InterruptedException {
		try {
			Thread.sleep(2000);
			click(LocatorBuyPlanAgente.LOCATOR_X);
			click(LocatorBuyPlanAgente.LOCATOR_INTO);
			type(BasicData.USERNAME_A, LocatorBuyPlanAgente.LOCATOR_USERNAME);
			type(BasicData.PASSWORD_A, LocatorBuyPlanAgente.LOCATOR_PASSWORD);
			click(LocatorBuyPlanAgente.LOCATOR_LOGIN);
			Thread.sleep(8000);
			click(LocatorBuyPlanAgente.LOCATOR_PUBLIC);
			click(LocatorBuyPlanAgente.LOCATOR_AGENTE);
			click(LocatorBuyPlanAgente.LOCATOR_SEE_PLANS);
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
	
	public void formMonths(String Plan, String MonthsPlan) {
		try {
			if(BasicData.PLAN_XS.equals(Plan)) {
				Thread.sleep(8000);
				WebElement ddl = driver.findElement(LocatorBuyPlanAgente.LOCATOR_PLAN_XS);
				Select sel = new Select(ddl);
				sel.selectByVisibleText(MonthsPlan);
				click(LocatorBuyPlanAgente.LOCATOR_BUTTON_SELECT_XS);
			}
			if(BasicData.PLAN_S.equals(Plan)) {
				Thread.sleep(8000);
				WebElement ddl = driver.findElement(LocatorBuyPlanAgente.LOCATOR_PLAN_S);
				Select sel = new Select(ddl);
				sel.selectByVisibleText(MonthsPlan);
				click(LocatorBuyPlanAgente.LOCATOR_BUTTON_SELECT_S);
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
	
	public void paymentSelection(int Route, int PhotoTaking, int PhotoUpload, int Featured, int Promoted, int Online) throws InterruptedException {
		try {
			Thread.sleep(5000);
			if (Route != 0) {
				for (int i = 0; i < Route; i++) {
					click(LocatorBuyPlanAgente.LOCATOR_BUTTON_ROUTE);
				}
			}
			if (PhotoTaking != 0) {
				for (int i = 0; i < PhotoTaking; i++) {
					click(LocatorBuyPlanAgente.LOCATOR_BUTTON_PHOTO_TAKING);
				}
			}
			if (PhotoUpload != 0) {
				for (int i = 0; i < PhotoUpload; i++) {
					click(LocatorBuyPlanAgente.LOCATOR_BUTTON_PHOTHO_UPLOAD);
				}
			}
			if (Featured != 0) {
				for (int i = 0; i < Featured; i++) {
					click(LocatorBuyPlanAgente.LOCATOR_BUTTON_FEATURED);
				}
			}
			if (Promoted != 0) {
				for (int i = 0; i < Promoted; i++) {
					click(LocatorBuyPlanAgente.LOCATOR_BUTTON_PROMOTED);
				}
			}
			if (Online != 0) {
				for (int i = 0; i < Online; i++) {
					click(LocatorBuyPlanAgente.LOCATOR_BUTTON_ONLINE);
				}
			}
			click(LocatorBuyPlanAgente.LOCATOR_BUTTON_SHOPPING_CART);
			Thread.sleep(3000);
			click(LocatorBuyPlanAgente.LOCATOR_BUTTON_PAY);
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
	
	public void finalPaymentForm(String TypeDocument, String EmailDian, String RegimeType, String RetentionAgent, String FiscalResponsability, String Ica, String Iva) {
		try {
			Thread.sleep(5000);
			click(LocatorBuyPlanAgente.LOCATOR_TYPE_DOCUMENT);
			Thread.sleep(2000);
			if(BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
				click(LocatorBuyPlanAgente.LOCATOR_TYPE_DOCUMENT_CC);
			}
			if(BasicData.TYPE_DOCUMENT_CE.equals(TypeDocument)) {
				click(LocatorBuyPlanAgente.LOCATOR_TYPE_DOCUMENT_CE);
			}
			if(BasicData.TYPE_DOCUMENT_TI.equals(TypeDocument)) {
				click(LocatorBuyPlanAgente.LOCATOR_TYPE_DOCUMENT_TI);
			}
			Thread.sleep(2000);
			if(BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
				click(LocatorBuyPlanAgente.LOCATOR_TYPE_DOCUMENT_NIT);
				type(BasicData.NIT, LocatorBuyPlanAgente.LOCATOR_NUMBER_DOCUMENT);
				type(BasicData.DV, LocatorBuyPlanAgente.LOCATOR_DV);
				type(BasicData.BUSINESS_NAME, LocatorBuyPlanAgente.LOCATOR_NAME);
			}else {
				type(BasicData.NUMBER_DOCUMENT, LocatorBuyPlanAgente.LOCATOR_NUMBER_DOCUMENT);
				type(BasicData.NAME, LocatorBuyPlanAgente.LOCATOR_NAME);
				type(BasicData.LAST_NAME, LocatorBuyPlanAgente.LOCATOR_LAST_NAME);
			}
			type(BasicData.CELL, LocatorBuyPlanAgente.LOCATOR_PHONE);
			type(BasicData.CITY, LocatorBuyPlanAgente.LOCATOR_CITY);
			Thread.sleep(3000);
			WebElement city = driver.findElement(LocatorBuyPlanAgente.LOCATOR_CITY);
			city.sendKeys(Keys.DOWN);
			city.sendKeys(Keys.ENTER);
			type(BasicData.ADDRESS, LocatorBuyPlanAgente.LOCATOR_ADDRESS);
			type(BasicData.USERNAME_A, LocatorBuyPlanAgente.LOCATOR_USER_EMAIL);
			type(BasicData.USERNAME_A, LocatorBuyPlanAgente.LOCATOR_EMAIL_CONFIRM);
			if(BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
				if(BasicData.EMAIL_DIAN_NO.equals(EmailDian)) {
					click(LocatorBuyPlanAgente.LOCATOR_DIAN_NO);
					type(BasicData.BILLING_MAIL, LocatorBuyPlanAgente.LOCATOR_EMAIL_DIAN);
				}
				click(LocatorBuyPlanAgente.LOCATOR_TYPE_REGIME);
				Thread.sleep(2000);
				if(BasicData.REGIME_TYPE_R.equals(RegimeType)) {
					click(LocatorBuyPlanAgente.LOCATOR_IVA);
				}
				if(BasicData.REGIME_TYPE_N.equals(RegimeType)) {
					click(LocatorBuyPlanAgente.LOCATOR_NO_IVA);
				}
				if(BasicData.REGIME_TYPE_RST.equals(RegimeType)) {
					click(LocatorBuyPlanAgente.LOCATOR_RST);
				}
				click(LocatorBuyPlanAgente.LOCATOR_RETENTION_AGENT);
				Thread.sleep(2000);
				if(BasicData.RETENTION_AGENT_NO.equals(RetentionAgent)) {
					click(LocatorBuyPlanAgente.LOCATOR_RETENTION_NO);
				}
				if(BasicData.RETENTION_AGENT_4.equals(RetentionAgent)) {
					click(LocatorBuyPlanAgente.LOCATOR_RETENTION_4);
				}
				if(BasicData.RETENTION_AGENT_11.equals(RetentionAgent)) {
					click(LocatorBuyPlanAgente.LOCATOR_RETENTION_11);
				}
				click(LocatorBuyPlanAgente.LOCATOR_FISCAL_RESPONSABILITY);
				Thread.sleep(2000);
				if(BasicData.FISCAL_RESPONSIBILITY_R.equals(FiscalResponsability)) {
					click(LocatorBuyPlanAgente.LOCATOR_SIMPLE_REGIME);
				}
				if(BasicData.FISCAL_RESPONSIBILITY_A.equals(FiscalResponsability)) {
					click(LocatorBuyPlanAgente.LOCATOR_AGENT_RETENTION_IVA);
				}
				if(BasicData.FISCAL_RESPONSIBILITY_G.equals(FiscalResponsability)) {
					click(LocatorBuyPlanAgente.LOCATOR_GREAT_CONTRIBUTOR);
				}
				if(BasicData.FISCAL_RESPONSIBILITY_AU.equals(FiscalResponsability)) {
					click(LocatorBuyPlanAgente.LOCATOR_SELF_RESTRAINT);
				}
				if(BasicData.FISCAL_RESPONSIBILITY_N.equals(FiscalResponsability)) {
					click(LocatorBuyPlanAgente.LOCATOR_NOT_RESPONSIBLE);
				}
				Thread.sleep(2000);
				if(BasicData.ICA_WITH_HOLDING_S.equals(Ica)) {
					click(LocatorBuyPlanAgente.LOCATOR_ICA_SI);
				}
				if(BasicData.IVA_WITH_HOLDING_S.equals(Iva)) {
					click(LocatorBuyPlanAgente.LOCATOR_IVA_SI);
				}
			}
			Thread.sleep(2000);
			click(LocatorBuyPlanAgente.LOCATOR_BUTTON_PAY_TWO);
		} catch (NoSuchElementException e) {
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
				type(DiscountCode, LocatorBuyPlanAgente.LOCATOR_BOND);
				click(LocatorBuyPlanAgente.LOCATOR_APLIC);
			}
			click(LocatorBuyPlanAgente.LOCATOR_BUTTON_PAY_FINISH);
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
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			click(LocatorBuyPlanAgente.LOCATOR_COOKIS);
			Thread.sleep(3000);
			if(BasicData.PAYMENT_TYPE_D.equals(PaymentType)) {
			    click(LocatorBuyPlanAgente.LOCATOR_DEBIT_CARD);
			    Thread.sleep(5000);
				click(LocatorBuyPlanAgente.LOCATOR_PAYMENT_D);
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(LocatorBuyPlanAgente.LOCATOR_IFRAME));
				type(BasicData.HOLDER_NAME, LocatorBuyPlanAgente.LOCATOR_HOLDER_NAME);
				type(BasicData.CARD_NUMBER, LocatorBuyPlanAgente.LOCATOR_CARD_NUMBER);
				type(BasicData.MONTH_AND_YEAR_CARD, LocatorBuyPlanAgente.LOCATOR_MONTH_CARD);
				type(BasicData.CVV, LocatorBuyPlanAgente.LOCATOR_CVV);
				click(LocatorBuyPlanAgente.LOCATOR_BUTTON_FORM_CHECKOUT);
			}
			if(BasicData.PAYMENT_TYPE_C.equals(PaymentType)) {
				click(LocatorBuyPlanAgente.LOCATOR_CREDIT_CARD);
				Thread.sleep(5000);
				click(LocatorBuyPlanAgente.LOCATOR_PAYMENT_C);
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(LocatorBuyPlanAgente.LOCATOR_IFRAME));
				type(BasicData.HOLDER_NAME, LocatorBuyPlanAgente.LOCATOR_HOLDER_NAME);
				type(BasicData.CARD_NUMBER, LocatorBuyPlanAgente.LOCATOR_CARD_NUMBER);
				type(BasicData.MONTH_AND_YEAR_CARD, LocatorBuyPlanAgente.LOCATOR_MONTH_CARD);
				type(BasicData.CVV, LocatorBuyPlanAgente.LOCATOR_CVV);
				WebElement ddl = driver.findElement(LocatorBuyPlanAgente.LOCATOR_DUES);
				Select sel = new Select(ddl);
				sel.selectByVisibleText(BasicData.DUES);
				click(LocatorBuyPlanAgente.LOCATOR_BUTTON_FORM_CHECKOUT);
			}
			if(BasicData.PAYMENT_TYPE_P.equals(PaymentType)) {
				click(LocatorBuyPlanAgente.LOCATOR_PSE);
				click(LocatorBuyPlanAgente.LOCATOR_TYPE_DOCUMENT_P);
				Thread.sleep(8000);
				if(BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
					click(LocatorBuyPlanAgente.LOCATOR_CC);
				}
				if(BasicData.TYPE_DOCUMENT_CE.equals(TypeDocument)) {
					click(LocatorBuyPlanAgente.LOCATOR_CE);
				}
				if(BasicData.TYPE_DOCUMENT_CP.equals(TypeDocument)) {
					click(LocatorBuyPlanAgente.LOCATOR_CP);
				}
				if(BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
					click(LocatorBuyPlanAgente.LOCATOR_NIT);
				}
				if(BasicData.TYPE_DOCUMENT_TI.equals(TypeDocument)) {
					click(LocatorBuyPlanAgente.LOCATOR_TI);
				}
				click(LocatorBuyPlanAgente.LOCATOR_TYPE_PERSON);
				Thread.sleep(8000);
				if(BasicData.TYPE_PERSON_PN.equals(TypePerson)) {
					click(LocatorBuyPlanAgente.LOCATOR_PN);
				}
				if(BasicData.TYPE_PERSON_PJ.equals(TypePerson)) {
					click(LocatorBuyPlanAgente.LOCATOR_PJ);
				}
				click(LocatorBuyPlanAgente.LOCATOR_BANK);
				Thread.sleep(8000);
				if(BasicData.TYPE_BANK_CAJA_SOCIAL.equals(TypeBank)) {
					click(LocatorBuyPlanAgente.LOCATOR_CAJA_SOCIAL);
				}
				if(BasicData.TYPE_BANK_BANCOLOMBIA.equals(TypeBank)) {
					click(LocatorBuyPlanAgente.LOCATOR_BANCOLOMBIA);
				}
				Thread.sleep(8000);
				click(LocatorBuyPlanAgente.LOCATOR_PAYMENT_P);
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
