package buy.plan.rolInmobiliaria;

import java.time.Duration;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class BuyPlanPageInmobiliaria extends BasicWrap{
	
	public BuyPlanPageInmobiliaria(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void buys() throws InterruptedException {
		try {
			Thread.sleep(2000);
			click(LocatorBuyPlanInmobiliaria.LOCATOR_X);
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(60));
			ewait.until(ExpectedConditions.elementToBeClickable(LocatorBuyPlanInmobiliaria.LOCATOR_INTO)).click();
			type(BasicData.USER_NAME_I, LocatorBuyPlanInmobiliaria.LOCATOR_USER_NAME);
			type(BasicData.PASSWORD_I, LocatorBuyPlanInmobiliaria.LOCATOR_PASWORD);
			click(LocatorBuyPlanInmobiliaria.LOCATOR_LOGIN);
			Thread.sleep(8000);
			click(LocatorBuyPlanInmobiliaria.LOCATOR_PUBLIC);
			click(LocatorBuyPlanInmobiliaria.LOCATOR_INMOBILIARIA);
			click(LocatorBuyPlanInmobiliaria.LOCATOR_SEE_PLANS);
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
			Thread.sleep(5000);
			if(BasicData.PLAN_P_BASICO.equals(Plan)) {
				WebElement ddl = driver.findElement(LocatorBuyPlanInmobiliaria.LOCATOR_MONTHS_B);
				Select sel = new Select(ddl);
				sel.selectByVisibleText(MonthsPlan);
				click(LocatorBuyPlanInmobiliaria.LOCATOR_SELECT_B);
			}
			if(BasicData.PLAN_P_BASE.equals(Plan)) {
				WebElement ddl = driver.findElement(LocatorBuyPlanInmobiliaria.LOCATOR_MONTHS_BP);
				Select sel = new Select(ddl);
				sel.selectByVisibleText(MonthsPlan);
				click(LocatorBuyPlanInmobiliaria.LOCATOR_SELECT_BP);
			}
			if(BasicData.PLAN_P_S.equals(Plan)) {
				WebElement ddl = driver.findElement(LocatorBuyPlanInmobiliaria.LOCATOR_MONTHS_S);
				Select sel = new Select(ddl);
				sel.selectByVisibleText(MonthsPlan);
				click(LocatorBuyPlanInmobiliaria.LOCATOR_SELECT_S);
			}
			if(BasicData.PLAN_P_M.equals(Plan)) {
				WebElement ddl = driver.findElement(LocatorBuyPlanInmobiliaria.LOCATOR_MONTHS_M);
				Select sel = new Select(ddl);
				sel.selectByVisibleText(MonthsPlan);
				click(LocatorBuyPlanInmobiliaria.LOCATOR_SELECT_M);
			}
			if(BasicData.PLAN_P_L.equals(Plan)) {
				WebElement ddl = driver.findElement(LocatorBuyPlanInmobiliaria.LOCATOR_MONTHS_L);
				Select sel = new Select(ddl);
				sel.selectByVisibleText(MonthsPlan);
				click(LocatorBuyPlanInmobiliaria.LOCATOR_SELECT_L);
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
					click(LocatorBuyPlanInmobiliaria.LOCATOR_BUTTON_ROUTE);
				}
			}
			if (PhotoTaking != 0) {
				for (int i = 0; i < PhotoTaking; i++) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_BUTTON_PHOTO_TAKING);
				}
			}
			if (PhotoUpload != 0) {
				for (int i = 0; i < PhotoUpload; i++) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_BUTTON_PHOTO_UPLOAD);
				}
			}
			if (Featured != 0) {
				for (int i = 0; i < Featured; i++) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_BUTTON_FEATURED);
				}
			}
			if (Promoted != 0) {
				for (int i = 0; i < Promoted; i++) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_BUTTON_PROMOTED);
				}
			}
			if (Online != 0) {
				for (int i = 0; i < Online; i++) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_BUTTON_ONLINE);
				}
			}
			click(LocatorBuyPlanInmobiliaria.LOCATOR_BUTTON_SHOPPING_CART);
			Thread.sleep(3000);
			click(LocatorBuyPlanInmobiliaria.LOCATOR_BUTTON_PAY);
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
	
	public void billingData(String TypeDocument, String EmailDian, String RegimeType, String RetentionAgent, String Ica, String Iva, String FiscalResponsability) {
		try {
			Thread.sleep(8000);
			click(LocatorBuyPlanInmobiliaria.LOCATOR_TYPE_DOCUMENT);
			if(BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_TYPE_DOCUMENT_CC);
			}
			if(BasicData.TYPE_DOCUMENT_CE.equals(TypeDocument)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_TYPE_DOCUMENT_CE);
			}
			if(BasicData.TYPE_DOCUMENT_TI.equals(TypeDocument)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_TYPE_DOCUMENT_TI);
			}
			if(BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_TYPE_DOCUMENT_NIT);
				type(BasicData.NIT, LocatorBuyPlanInmobiliaria.LOCATOR_NUMBER_DOCUMENT);
				type(BasicData.DV, LocatorBuyPlanInmobiliaria.LOCATOR_DV);
				type(BasicData.BUSINESS_NAME, LocatorBuyPlanInmobiliaria.LOCATOR_NAME);
			}else {
				type(BasicData.NUMBER_DOCUMENT, LocatorBuyPlanInmobiliaria.LOCATOR_NUMBER_DOCUMENT);
				type(BasicData.LAST_NAME, LocatorBuyPlanInmobiliaria.LOCATOR_LAST_NAME);
				type(BasicData.NAME, LocatorBuyPlanInmobiliaria.LOCATOR_NAME);
			}
			Thread.sleep(3000);
			type(BasicData.CELL, LocatorBuyPlanInmobiliaria.LOCATOR_PHONE);
			Thread.sleep(3000);
			type(BasicData.CITY, LocatorBuyPlanInmobiliaria.LOCATOR_CITY);
			Thread.sleep(3000); WebElement
			City = driver.findElement(LocatorBuyPlanInmobiliaria.LOCATOR_CITY); 
			City.sendKeys(Keys.DOWN);
			City.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			type(BasicData.ADDRESS, LocatorBuyPlanInmobiliaria.LOCATOR_ADDRESS); 
			Thread.sleep(3000);
			type(BasicData.EMAIL, LocatorBuyPlanInmobiliaria.LOCATOR_EMAIL);
			Thread.sleep(3000);
			type(BasicData.EMAIL, LocatorBuyPlanInmobiliaria.LOCATOR_CONFIRM_EMAIL);
			if (BasicData.EMAIL_DIAN_NO.equals(EmailDian)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_EMAIL_DIAN);
				type(BasicData.BILLING_MAIL, LocatorBuyPlanInmobiliaria.LOCATOR_BILLIN_MAIL);
			}
			Thread.sleep(3000);
			click(LocatorBuyPlanInmobiliaria.LOCATOR_REGIMEN_TYPE);
			if (BasicData.REGIME_TYPE_R.equals(RegimeType)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_RESPONSIBLE_IVA);
			}
			if (BasicData.REGIME_TYPE_N.equals(RegimeType)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_NOT_RESPONSIBLE_IVA);
			}
			if (BasicData.REGIME_TYPE_RST.equals(RegimeType)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_RST);
			}
			Thread.sleep(3000);
			click(LocatorBuyPlanInmobiliaria.LOCATOR_INCOME_RETAINER);
			if (BasicData.RETENTION_AGENT_NO.equals(RetentionAgent)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_NO);
			}
			if (BasicData.RETENTION_AGENT_4.equals(RetentionAgent)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_4);
			}
			if (BasicData.RETENTION_AGENT_11.equals(RetentionAgent)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_11);
			} 
		    Thread.sleep(3000); 
			if(BasicData.ICA_WITH_HOLDING_S.equals(Ica)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_ICA); 
			}
			if(BasicData.IVA_WITH_HOLDING_S.equals(Iva)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_IVA);
			} 
			Thread.sleep(3000);
			click(LocatorBuyPlanInmobiliaria.LOCATOR_FISCAL_RESPONSABILITY);
			if(BasicData.FISCAL_RESPONSIBILITY_R.equals(FiscalResponsability)) {
				 click(LocatorBuyPlanInmobiliaria.LOCATOR_SIMPLE_REGIMEN); 
			}
		    if(BasicData.FISCAL_RESPONSIBILITY_A.equals(FiscalResponsability)) {
				 click(LocatorBuyPlanInmobiliaria.LOCATOR_WITH_HOLDING_AGENT);
			}
			if(BasicData.FISCAL_RESPONSIBILITY_G.equals(FiscalResponsability)) {
				 click(LocatorBuyPlanInmobiliaria.LOCATOR_GREAT_CONTRIBUTOR); 
			}
			if(BasicData.FISCAL_RESPONSIBILITY_AU.equals(FiscalResponsability)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_SELF_RETAINING);
			}
		    if(BasicData.FISCAL_RESPONSIBILITY_N.equals(FiscalResponsability)) {
		    	click(LocatorBuyPlanInmobiliaria.LOCATOR_NOT_RESPONSIBLE); 
            }
			Thread.sleep(3000);
			click(LocatorBuyPlanInmobiliaria.LOCATOR_BUTTON_PAY_TWO);
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
				type(DiscountCode, LocatorBuyPlanInmobiliaria.LOCATOR_BOND);
				click(LocatorBuyPlanInmobiliaria.LOCATOR_APLIC);
			}
			click(LocatorBuyPlanInmobiliaria.LOCATOR_BUTTON_PAY_FINISH);
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
	
	public void purchaseDetail(String PaymentType, String TypeDocument, String TypeBank) {
		try {
			Thread.sleep(8000);
			click(LocatorBuyPlanInmobiliaria.LOCATOR_COOKIES);
			Thread.sleep(3000);
			if(BasicData.PAYMENT_TYPE_D.equals(PaymentType)) {
			    click(LocatorBuyPlanInmobiliaria.LOCATOR_DEBIT_CARD);
			    Thread.sleep(5000);
				click(LocatorBuyPlanInmobiliaria.LOCATOR_PAYMENT_D);
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(LocatorBuyPlanInmobiliaria.LOCATOR_IFRAME));
				type(BasicData.HOLDER_NAME, LocatorBuyPlanInmobiliaria.LOCATOR_HOLDER_NAME);
				type(BasicData.CARD_NUMBER, LocatorBuyPlanInmobiliaria.LOCATOR_CARD_NUMBER);
				type(BasicData.MONTH_AND_YEAR_CARD, LocatorBuyPlanInmobiliaria.LOCATOR_MONTH_CARD);
				type(BasicData.CVV, LocatorBuyPlanInmobiliaria.LOCATOR_CVV);
				click(LocatorBuyPlanInmobiliaria.LOCATOR_BUTTON_FORM_CHECKOUT);
			}
			if(BasicData.PAYMENT_TYPE_C.equals(PaymentType)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_CREDIT_CARD);
				Thread.sleep(5000);
				click(LocatorBuyPlanInmobiliaria.LOCATOR_PAYMENT_C);
				Thread.sleep(5000);
				driver.switchTo().frame(driver.findElement(LocatorBuyPlanInmobiliaria.LOCATOR_IFRAME));
				type(BasicData.HOLDER_NAME, LocatorBuyPlanInmobiliaria.LOCATOR_HOLDER_NAME);
				type(BasicData.CARD_NUMBER, LocatorBuyPlanInmobiliaria.LOCATOR_CARD_NUMBER);
				type(BasicData.MONTH_AND_YEAR_CARD, LocatorBuyPlanInmobiliaria.LOCATOR_MONTH_CARD);
				type(BasicData.CVV, LocatorBuyPlanInmobiliaria.LOCATOR_CVV);
				WebElement ddl = driver.findElement(LocatorBuyPlanInmobiliaria.LOCATOR_DUES);
				Select sel = new Select(ddl);
				sel.selectByVisibleText(BasicData.DUES);
				click(LocatorBuyPlanInmobiliaria.LOCATOR_BUTTON_FORM_CHECKOUT);
			}
			if(BasicData.PAYMENT_TYPE_P.equals(PaymentType)) {
				click(LocatorBuyPlanInmobiliaria.LOCATOR_PSE);
				click(LocatorBuyPlanInmobiliaria.LOCATOR_TYPE_DOCUMENT_P);
				Thread.sleep(8000);
				if(BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_CC);
				}
				if(BasicData.TYPE_DOCUMENT_CE.equals(TypeDocument)) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_CE);
				}
				if(BasicData.TYPE_DOCUMENT_CP.equals(TypeDocument)) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_CP);
				}
				if(BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_NIT);
				}
				if(BasicData.TYPE_DOCUMENT_TI.equals(TypeDocument)) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_TI);
				}
				click(LocatorBuyPlanInmobiliaria.LOCATOR_TYPE_PERSON);
				Thread.sleep(8000);
				if(BasicData.TYPE_PERSON_PN.equals(TypeDocument)) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_PN);
				}
				if(BasicData.TYPE_PERSON_PJ.equals(TypeDocument)) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_PJ);
				}
				click(LocatorBuyPlanInmobiliaria.LOCATOR_BANK);
				Thread.sleep(8000);
				if(BasicData.TYPE_BANK_CAJA_SOCIAL.equals(TypeBank)) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_CAJA_SOCIAL);
				}
				if(BasicData.TYPE_BANK_BANCOLOMBIA.equals(TypeBank)) {
					click(LocatorBuyPlanInmobiliaria.LOCATOR_BANCOLOMBIA);
				}
				Thread.sleep(8000);
				click(LocatorBuyPlanInmobiliaria.LOCATOR_PAYMENT_P);
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
