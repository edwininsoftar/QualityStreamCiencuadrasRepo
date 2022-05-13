package service.tools.calculatePrice;

import java.util.Set;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class CalculaPricePage extends BasicWrap{
	
	public CalculaPricePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	public void propertyLocation() throws InterruptedException {
		try {
			Thread.sleep(8000);
			click(getLocator_ButtonCalculaPrice());
			//new tab
			String mainTab = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String actual: handles) {
				if(!actual.equalsIgnoreCase(mainTab)) {
					driver.switchTo().window(actual);
				}
			}
			type(getCity(), getLocator_city());
			Thread.sleep(5000);	
			WebElement ct = driver.findElement(getLocator_city());
			ct.sendKeys(Keys.DOWN);
			ct.sendKeys(Keys.ENTER);
			type(getAddress(),getLocator_address());
			Thread.sleep(5000);	
			type(getAddressAdd(),getLocator_addressAdd());
			click(getLocator_checkMap());
			click(getLocator_button_continue());
		} catch (Exception e) {
			System.out.println("Error: "+ e);
		}
		
	}
	
	public void propertyInformation() {
		try {
			Thread.sleep(8000);	
			click(getLocator_typeProperty());
			Thread.sleep(8000);	
			if(getTypeProperty().equals("Casa")) {
				click(getLocator_house());
			}
			if(getTypeProperty().equals("Apartamento")) {
				click(getLocator_apartment());
			}
			if(getTransactionType().equals("Arriendo")) {
				click(getLocator_rent());
			}
			if(getTransactionType().equals("Venta")) {
				click(getLocator_sale());
			}
			if(getStratum().equals("1")) {
				click(getLocator_stratum1());
			}
			if(getStratum().equals("2")) {
				click(getLocator_stratum2());
			}
			if(getStratum().equals("3")) {
				click(getLocator_stratum3());
			}
			if(getStratum().equals("4")) {
				click(getLocator_stratum4());
			}
			if(getStratum().equals("5")) {
				click(getLocator_stratum5());
			}
			if(getStratum().equals("6")) {
				click(getLocator_stratum6());
			}
			Thread.sleep(5000);	
			WebElement ar = driver.findElement(getLocator_area());
			ar.clear(); 
			type(getArea(), getLocator_area());
			Thread.sleep(5000);	
			WebElement an = driver.findElement(getLocator_antiquity());
			an.clear();
			type(getAntiquity(), getLocator_antiquity());
			Thread.sleep(5000);			
			for(int i=0;i<getParkingLess();i++) {
				click(getLocator_parkingLess());
			}
			for(int i=0;i<getParkingMore();i++) {
				click(getLocator_parkingMore());
			}
			for(int i=0;i<getToiletsLess();i++) {
				click(getLocator_toiletsLess());
			}
			for(int i=0;i<getToiletsMore();i++) {
				click(getLocator_toiletsMore());
			}
			for(int i=0;i<getRoomsLess();i++) {
				click(getLocator_roomsLess());
			}
			for(int i=0;i<getRoomsMore();i++) {
				click(getLocator_roomsMore());
			}
			for(int i=0;i<getBalconiesMore();i++) {
				click(getLocator_balconiesMore());
			}
			for(int i=0;i<getTerraceMore();i++) {
				click(getLocator_terraceMore());
			}
			for(int i=0;i<getDepositMore();i++) {
				click(getLocator_depositMore());
			}
			for(int i=0;i<getElevatorsMore();i++) {
				click(getLocator_elevatorsMore());
			}
			click(getLocator_buttonContinue());
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void payThePriceonline() {
		try {
			Thread.sleep(5000);	
			type(getNames(), getLocator_names());
			type(getSurnames(), getLocator_surnames());
			click(getLocator_identityDocument());
			if(getIdentityDocument().equals("CC")) {
				click(getLocator_cc());
			}
			if(getIdentityDocument().equals("NIT")) {
				click(getLocator_nit());
			}
			if(getIdentityDocument().equals("CE")) {
				click(getLocator_ce());
			}
			type(getIdNumber(), getLocator_idNumber());
			type(getEmail(), getLocator_email());
			type(getEmail(), getLocator_confirmEmail());
			type(getPhone(), getLocator_phone());
			if(getAcceptTerms().equals("No")) {
				click(getLocator_acceptTerms());
			}
			if(getDataTreatment().equals("No")){
				click(getLocator_dataTreatment());
			}
			Thread.sleep(5000);	
			click(getLocator_buttonContinueTwo());
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void payFinish() {
		try {
			Thread.sleep(50000);
			if(getDiscountCode() != "") {
				type(getDiscountCode(), getLocator_bond());
				click(getLocator_aplic());
			}
			click(getLocator_buttonPayfinish());
			Thread.sleep(8000);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void purchaseDetail() {
		try {
			Thread.sleep(8000);
			click(getLocator_cookies());
			Thread.sleep(8000);
			if(getPaymentType().equals("Debito")) {
				click(getLocator_debitCard());
				Thread.sleep(3000);
				type(getHolderName(), getLocator_holderNameD());
				type(getCardNumber(), getLocator_cardNumberD());
				type(getMonthCard(), getLocator_monthCardD());
				type(getYearCard(), getLocator_yearCardD());
				type(getCvv(), getLocator_cvvD());
				Thread.sleep(8000);
				click(getLocator_paymentD());
			}
			if(getPaymentType().equals("Credito")) {
				click(getLocator_creditCard());
				Thread.sleep(3000);
				type(getHolderName(), getLocator_holderNameC());
				type(getCardNumber(), getLocator_cardNumberC());
				type(getMonthCard(), getLocator_monthCardC());
				type(getYearCard(), getLocator_yearCardC());
				type(getCvv(), getLocator_cvvC());
				Thread.sleep(8000);
				click(getLocator_dues());
				Thread.sleep(8000);
				click(getLocator_five());
				Thread.sleep(8000);
				click(getLocator_paymentC());
			}
			if(getPaymentType().equals("PSE")) {
				click(getLocator_pse());
				Thread.sleep(3000);
				click(getLocator_typedocumentP());
				Thread.sleep(8000);
				if(getTypeDocument().equals("CC")) {
					click(getLocator_CC());
				}
				if(getTypeDocument().equals("CE")) {
					click(getLocator_CE());
				}
				if(getTypeDocument().equals("CP")) {
					click(getLocator_CP());
				}
				if(getTypeDocument().equals("NIT")) {
					click(getLocator_NIT());
				}
				if(getTypeDocument().equals("TI")) {
					click(getLocator_TI());
				}
				click(getLocator_TypePerson());
				Thread.sleep(8000);
				if(getTypePerson().equals("PN")) {
					click(getLocator_PN());
				}
				if(getTypePerson().equals("PJ")) {
					click(getLocator_PJ());
				}
				click(getLocator_bank());
				Thread.sleep(8000);
				if(getTypeBank().equals("BANCO CAJA SOCIAL")) {
					click(getLocator_cajaSocial());
				}
				if(getTypeBank().equals("ITAU")) {
					click(getLocator_itau());
				}
				Thread.sleep(8000);
				click(getLocator_paymentP());
				Thread.sleep(10000);
				click(getLocator_PSECheckPolicy());
				click(getLocator_PSECheckTerms());
				click(getLocator_follow());
			}
			if(getPaymentType().equals("Davipuntos")) {
				click(getLocator_davipuntos());
				Thread.sleep(8000);
				click(getLocator_paymentDavi());
				Thread.sleep(8000);
				driver.switchTo().defaultContent();
				click(getLocator_continueEpayco());
			}
			if(getPaymentType().equals("Daviplata")) {
				click(getLocator_daviplata());
				Thread.sleep(3000);
				click(getLocator_typeDocumentDaviplata());
				Thread.sleep(8000);
				if(getTypeDocument().equals("CC")) {
					click(getLocator_CCDaviplata());
				}
				if(getTypeDocument().equals("CE")) {
					click(getLocator_CEDaviplata());
				}
				if(getTypeDocument().equals("CP")) {
					click(getLocator_CPDaviplata());
				}
				if(getTypeDocument().equals("NIT")) {
					click(getLocator_NITDaviplata());
				}
				if(getTypeDocument().equals("TI")) {
					click(getLocator_TIDaviplata());
				}
				if(getTypeDocument().equals("SSE")) {
					click(getLocator_SSEDaviplata());
				}
				type(getDocumentNumber(),getLocator_documentNumber());
				Thread.sleep(8000);
				click(getLocator_paymentDaviplata());
			}
			Thread.sleep(5000);
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
