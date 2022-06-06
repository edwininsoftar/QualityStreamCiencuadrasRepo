package buy.plan.rolConstructora;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class BuyPlanPageConstructora extends BasicWrap {

	public BuyPlanPageConstructora(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void buys(String TypePlan, String ProyectPlan) throws InterruptedException {
		try {
			Thread.sleep(2000);
			click(LocatorBuyPlanConstructora.LOCATOR_X);
			Thread.sleep(2000);
			click(LocatorBuyPlanConstructora.LOCATOR_INTO);
			type(BasicData.USERNAME_C, LocatorBuyPlanConstructora.LOCATOR_USER_NAME);
			type(BasicData.PASSWORD_C, LocatorBuyPlanConstructora.LOCATOR_PASSWORD);
			click(LocatorBuyPlanConstructora.LOCATOR_LOGIN);
			Thread.sleep(5000);
			click(LocatorBuyPlanConstructora.LOCATOR_PUBLIC);
			click(LocatorBuyPlanConstructora.LOCATOR_CONSTRUCTORA);
			click(LocatorBuyPlanConstructora.LOCATOR_SEE_PLANS);
			if (BasicData.TYPE_PLAN_PS.equals(TypePlan)) {
				click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_WEEKLY_PLANS);
				Thread.sleep(8000);
				if (BasicData.PROYECT_NUMBER_6.equals(ProyectPlan)) {
					click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_PROJECTS_6_P);
				}
				if (BasicData.PROYECT_NUMBER_7.equals(ProyectPlan)) {
					click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_PROJECTS_7_P);
				}
			}
			if (BasicData.TYPE_PLAN_PA.equals(TypePlan)) {
				click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_ANNUAL_PLANS);
				Thread.sleep(5000);
				if (BasicData.PROYECT_NUMBER_1.equals(ProyectPlan)) {
					click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_PROJECTS_1);
				}
				if (BasicData.PROYECT_NUMBER_2.equals(ProyectPlan)) {
					click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_PROJECTS_2);
				}
				if (BasicData.PROYECT_NUMBER_3.equals(ProyectPlan)) {
					click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_PROJECTS_3);
				}
			}
			Thread.sleep(3000);
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
			if (Route != 0) {
				for (int i = 0; i < Route; i++) {
					click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_ROUTE);
				}
			}
			if (PhotoTaking != 0) {
				for (int i = 0; i < PhotoTaking; i++) {
					click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_PHOTO_TAKING);
				}
			}
			if (PhotoUpload != 0) {
				for (int i = 0; i < PhotoUpload; i++) {
					click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_PHOTO_UPLOAD);
				}
			}
			if (Featured != 0) {
				for (int i = 0; i < Featured; i++) {
					click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_FEATURED);
				}
			}
			if (Promoted != 0) {
				for (int i = 0; i < Promoted; i++) {
					click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_PROMOTED);
				}
			}
			if (Online != 0) {
				for (int i = 0; i < Online; i++) {
					click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_ONLINE);
				}
			}
			click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_SHOPPING_CART);
			Thread.sleep(3000);
			click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_PAY);
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

	public void finalPaymentForm(String TypeDocument,String EmailDian, String RegimeType, String RetentionAgent, String Iva, String Ica, String FiscalResponsibility) {
		try {
			Thread.sleep(8000);
			click(LocatorBuyPlanConstructora.LOCATOR_TYPE_DOCUMENT);
			if(BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
				click(LocatorBuyPlanConstructora.LOCATOR_TYPE_DOCUMENT_CC);
			}
			if(BasicData.TYPE_DOCUMENT_CE.equals(TypeDocument)) {
				click(LocatorBuyPlanConstructora.LOCATOR_TYPE_DOCUMENT_CE);
			}
			if(BasicData.TYPE_DOCUMENT_TI.equals(TypeDocument)){
				click(LocatorBuyPlanConstructora.LOCATOR_TYPE_DOCUMENT_TI);
			}
			if(BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
				click(LocatorBuyPlanConstructora.LOCATOR_TYPE_DOCUMENT_NIT);
				type(BasicData.NIT, LocatorBuyPlanConstructora.LOCATOR_NUMBER_DOCUMENT);
				type(BasicData.DV, LocatorBuyPlanConstructora.LOCATOR_DV);
				type(BasicData.BUSINESS_NAME, LocatorBuyPlanConstructora.LOCATOR_NAME);
			}else {
				type(BasicData.NUMBER_DOCUMENT, LocatorBuyPlanConstructora.LOCATOR_NUMBER_DOCUMENT);
				type(BasicData.NAME, LocatorBuyPlanConstructora.LOCATOR_NAME);
				type(BasicData.LAST_NAME, LocatorBuyPlanConstructora.LOCATOR_LAST_NAME);
			}
			type(BasicData.CELL, LocatorBuyPlanConstructora.LOCATOR_PHONE);
			Thread.sleep(3000);
			type(BasicData.CITY, LocatorBuyPlanConstructora.LOCATOR_CITY);
			Thread.sleep(3000);
			WebElement City = driver.findElement(LocatorBuyPlanConstructora.LOCATOR_CITY);
			City.sendKeys(Keys.DOWN);
			City.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			type(BasicData.ADDRESS, LocatorBuyPlanConstructora.LOCATOR_ADDRESS);
			Thread.sleep(3000);
			type(BasicData.EMAIL, LocatorBuyPlanConstructora.LOCATOR_EMAIL);
			Thread.sleep(3000);
			type(BasicData.EMAIL, LocatorBuyPlanConstructora.LOCATOR_CONFIRM_EMAIL);
			Thread.sleep(3000);
			if(BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
				if (BasicData.EMAIL_DIAN_NO.equals(EmailDian)) {
					click(LocatorBuyPlanConstructora.LOCATOR_EMAIL_DIAN);
					type(BasicData.BILLING_MAIL, LocatorBuyPlanConstructora.LOCATOR_BILLING_MAIL);
				}
				click(LocatorBuyPlanConstructora.LOCATOR_REGIME_TYPE);
				if (BasicData.REGIME_TYPE_R.equals(RegimeType)) {
					click(LocatorBuyPlanConstructora.LOCATOR_RESPONSIBLE_IVA);
				}
				if (BasicData.REGIME_TYPE_N.equals(RegimeType)) {
					click(LocatorBuyPlanConstructora.LOCATOR_NOT_RESPONSIBLE);
				}
				if (BasicData.REGIME_TYPE_RST.equals(RegimeType)) {
					click(LocatorBuyPlanConstructora.LOCATOR_RST);
				}
				Thread.sleep(3000);
				click(LocatorBuyPlanConstructora.LOCATOR_RETENTION_AGENT);
				if (BasicData.RETENTION_AGENT_NO.equals(RetentionAgent)) {
					click(LocatorBuyPlanConstructora.LOCATOR_NO);
				}
				if (BasicData.RETENTION_AGENT_4.equals(RetentionAgent)) {
					click(LocatorBuyPlanConstructora.LOCATOR_4);
				}
				if (BasicData.RETENTION_AGENT_11.equals(RetentionAgent)) {
					click(LocatorBuyPlanConstructora.LOCATOR_11);
				}
				click(LocatorBuyPlanConstructora.LOCATOR_FISCAL_RESPONSIBILITY);
				if (BasicData.FISCAL_RESPONSIBILITY_R.equals(FiscalResponsibility)) {
					click(LocatorBuyPlanConstructora.LOCATOR_REGIMEN_SIMPLE);
				}
				if (BasicData.FISCAL_RESPONSIBILITY_A.equals(FiscalResponsibility)) {
					click(LocatorBuyPlanConstructora.LOCATOR_AGENTE_RETENEDOR);
				}
				if (BasicData.FISCAL_RESPONSIBILITY_G.equals(FiscalResponsibility)) {
					click(LocatorBuyPlanConstructora.LOCATOR_GRAN_CONTRIBUYENTE);
				}
				if (BasicData.FISCAL_RESPONSIBILITY_AU.equals(FiscalResponsibility)) {
					click(LocatorBuyPlanConstructora.LOCATOR_AUTORETENEDOR);
				}
				if (BasicData.FISCAL_RESPONSIBILITY_N.equals(FiscalResponsibility)) {
					click(LocatorBuyPlanConstructora.LOCATOR_NO_RESPONSABLE);
				}
				Thread.sleep(3000);
				if (BasicData.ICA_WITH_HOLDING_S.equals(Ica)) {
					click(LocatorBuyPlanConstructora.LOCATOR_ICA_WITH_HOLDING);
				}
				if (BasicData.IVA_WITH_HOLDING_S.equals(Iva)) {
					click(LocatorBuyPlanConstructora.LOCATOR_IVA_WITH_HOLDING);
				}
			}
			Thread.sleep(3000);
			click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_PAY_TOW);
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
				type(DiscountCode, LocatorBuyPlanConstructora.LOCATOR_BOND);
				click(LocatorBuyPlanConstructora.LOCATOR_APLIC);
			}
			click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_PAY_FINISH);
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
			click(LocatorBuyPlanConstructora.LOCATOR_COOKIES);
			Thread.sleep(3000);
			if(BasicData.PAYMENT_TYPE_D.equals(PaymentType)) {
			    click(LocatorBuyPlanConstructora.LOCATOR_DEBIT_CARD);
			    Thread.sleep(5000);
				click(LocatorBuyPlanConstructora.LOCATOR_PAYMENT_D);
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(LocatorBuyPlanConstructora.LOCATOR_IFRAME));
				type(BasicData.HOLDER_NAME, LocatorBuyPlanConstructora.LOCATOR_HOLDER_NAME);
				type(BasicData.CARD_NUMBER, LocatorBuyPlanConstructora.LOCATOR_CARD_NUMBER);
				type(BasicData.MONTH_AND_YEAR_CARD, LocatorBuyPlanConstructora.LOCATOR_MONTH_CARD);
				type(BasicData.CVV, LocatorBuyPlanConstructora.LOCATOR_CVV);
				click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_FORM_CHECKOUT);
			}
			if(BasicData.PAYMENT_TYPE_C.equals(PaymentType)) {
				click(LocatorBuyPlanConstructora.LOCATOR_CREDIT_CARD);
				Thread.sleep(5000);
				click(LocatorBuyPlanConstructora.LOCATOR_PAYMENT_C);
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(LocatorBuyPlanConstructora.LOCATOR_IFRAME));
				type(BasicData.HOLDER_NAME, LocatorBuyPlanConstructora.LOCATOR_HOLDER_NAME);
				type(BasicData.CARD_NUMBER, LocatorBuyPlanConstructora.LOCATOR_CARD_NUMBER);
				type(BasicData.MONTH_AND_YEAR_CARD, LocatorBuyPlanConstructora.LOCATOR_MONTH_CARD);
				type(BasicData.CVV, LocatorBuyPlanConstructora.LOCATOR_CVV);
				WebElement ddl = driver.findElement(LocatorBuyPlanConstructora.LOCATOR_DUES);
				Select sel = new Select(ddl);
				sel.selectByVisibleText(BasicData.DUES);
				click(LocatorBuyPlanConstructora.LOCATOR_BUTTON_FORM_CHECKOUT);
			}
			if (BasicData.PAYMENT_TYPE_P.equals(PaymentType)) {
				click(LocatorBuyPlanConstructora.LOCATOR_PSE);
				click(LocatorBuyPlanConstructora.LOCATOR_TYPE_DOCUMENT_P);
				Thread.sleep(8000);
				if (BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
					click(LocatorBuyPlanConstructora.LOCATOR_CC);
				}
				if (BasicData.TYPE_DOCUMENT_CE.equals(TypeDocument)) {
					click(LocatorBuyPlanConstructora.LOCATOR_CE);
				} 
				if (BasicData.TYPE_DOCUMENT_CP.equals(TypeDocument)) {
					click(LocatorBuyPlanConstructora.LOCATOR_CP);
				}
				if (BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
					click(LocatorBuyPlanConstructora.LOCATOR_NIT_P);
				}
				if (BasicData.TYPE_DOCUMENT_TI.equals(TypeDocument)) {
					click(LocatorBuyPlanConstructora.LOCATOR_TI);
				}
				click(LocatorBuyPlanConstructora.LOCATOR_TYPE_PERSON);
				Thread.sleep(8000);
				if (BasicData.TYPE_PERSON_PN.equals(TypePerson)) {
					click(LocatorBuyPlanConstructora.LOCATOR_PN);
				}
				if (BasicData.TYPE_PERSON_PJ.equals(TypePerson)) {
					click(LocatorBuyPlanConstructora.LOCATOR_PJ);
				}
				click(LocatorBuyPlanConstructora.LOCATOR_BANK);
				Thread.sleep(8000);
				if (BasicData.TYPE_BANK_CAJA_SOCIAL.equals(TypeBank)) {
					click(LocatorBuyPlanConstructora.LOCATOR_CAJA_SOCIAL);
				}
				if (BasicData.TYPE_BANK_BANCOLOMBIA.equals(TypeBank)) {
					click(LocatorBuyPlanConstructora.LOCATOR_BANCOLOMBIA);
				}
				Thread.sleep(8000);
				click(LocatorBuyPlanConstructora.LOCATOR_PAYMENT_P);
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
