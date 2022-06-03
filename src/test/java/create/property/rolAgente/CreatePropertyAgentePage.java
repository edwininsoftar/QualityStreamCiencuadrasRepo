package create.property.rolAgente;

import java.io.File;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class CreatePropertyAgentePage extends BasicWrap{
	
	public CreatePropertyAgentePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub 
	}
	
	public void login() {
		try {
			Thread.sleep(2000);
			click(LocatorCreatePropertyAgente.LOCATOR_X);
			Thread.sleep(2000);
			click(LocatorCreatePropertyAgente.LOCATOR_INTO);
			type(BasicData.USERNAME_A, LocatorCreatePropertyAgente.LOCATOR_USERNAME);
			type(BasicData.PASSWORD_A, LocatorCreatePropertyAgente.LOCATOR_PASSWORD);
			click(LocatorCreatePropertyAgente.LOCATOR_LOGIN);
			Thread.sleep(8000);
			click(LocatorCreatePropertyAgente.LOCATOR_USER);
			click(LocatorCreatePropertyAgente.LOCATOR_PUBLISHED_PROPERTY);
			Thread.sleep(5000);
			click(LocatorCreatePropertyAgente.LOCATOR_CREATE_PROPERTY);
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
	
	public void propertyPublication(String Avll, String Letter, String CardinalPoints, String CardinalPointsTwo, String Complement, String ButtonAddress) {
		try {
			type(BasicData.REGISTRATION, LocatorCreatePropertyAgente.LOCATOR_REGISTRATION);
			Thread.sleep(2000);
			click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON);
			Thread.sleep(2000);
			type(BasicData.DEPARTMENT, LocatorCreatePropertyAgente.LOCATOR_DEPARTMENT);
			WebElement dp = driver.findElement(LocatorCreatePropertyAgente.LOCATOR_DEPARTMENT);
			dp.sendKeys(Keys.DOWN);	
			dp.sendKeys(Keys.ENTER);	
			Thread.sleep(2000);
			click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_2);
			Thread.sleep(2000);
			type(BasicData.CITY, LocatorCreatePropertyAgente.LOCATOR_CITY);
			WebElement ci = driver.findElement(LocatorCreatePropertyAgente.LOCATOR_CITY);
			ci.sendKeys(Keys.DOWN);
			ci.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_3);
			Thread.sleep(2000);
			type(BasicData.LOCATION, LocatorCreatePropertyAgente.LOCATOR_LOCATION);
			WebElement lc = driver.findElement(LocatorCreatePropertyAgente.LOCATOR_LOCATION);
			lc.sendKeys(Keys.DOWN);
			lc.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_4);
			Thread.sleep(2000);
			type(BasicData.NEIGHBORHOOD, LocatorCreatePropertyAgente.LOCATOR_NEIGHBORHOOD);
			WebElement br = driver.findElement(LocatorCreatePropertyAgente.LOCATOR_NEIGHBORHOOD);
			br.sendKeys(Keys.DOWN);
			br.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_5);
			Thread.sleep(2000);
			if(BasicData.AVCLL_CR.equals(Avll)) {
				click(LocatorCreatePropertyAgente.LOCATOR_CARRERA);
			}
			if(BasicData.AVCLL_CLL.equals(Avll)) {
				click(LocatorCreatePropertyAgente.LOCATOR_CALLE);
			}
			Thread.sleep(2000);
			type(BasicData.AVCLL_2, LocatorCreatePropertyAgente.LOCATOR_AVCLL_2);
			Thread.sleep(2000);
			if(BasicData.LETTER_A.equals(Letter)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_6);
				Thread.sleep(2000);
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_6);
				click(LocatorCreatePropertyAgente.LOCATOR_A);
			}
			if(BasicData.LETTER_B.equals(Letter)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_6);
				Thread.sleep(2000);
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_6);
				click(LocatorCreatePropertyAgente.LOCATOR_B);
			}
			Thread.sleep(2000);
			if(BasicData.BIS.equals(CardinalPoints)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_7);
				click(LocatorCreatePropertyAgente.LOCATOR_BIS);
			}
			if(BasicData.ESTE.equals(CardinalPoints)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_7);
				click(LocatorCreatePropertyAgente.LOCATOR_ESTE);
			}
			Thread.sleep(2000);
			if(BasicData.LETTER_A.equals(Letter)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_8);
				click(LocatorCreatePropertyAgente.LOCATOR_A_2);
			}
			if(BasicData.LETTER_B.equals(Letter)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_8);
				click(LocatorCreatePropertyAgente.LOCATOR_B_2);
			}
			Thread.sleep(2000);
			if(BasicData.CARDINAL_POINT_S.equals(CardinalPointsTwo)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_9);
				click(LocatorCreatePropertyAgente.LOCATOR_SUR);
			}
			if(BasicData.CARDINAL_POINT_N.equals(CardinalPointsTwo)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_9);
				click(LocatorCreatePropertyAgente.LOCATOR_NORTE);
			}
			Thread.sleep(2000);
			type(BasicData.NUMBER, LocatorCreatePropertyAgente.LOCATOR_NUMBER);
			Thread.sleep(2000);
			if(BasicData.LETTER_A.equals(Letter)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_10);
				click(LocatorCreatePropertyAgente.LOCATOR_A_3);
			}
			if(BasicData.LETTER_B.equals(Letter)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_10);
				click(LocatorCreatePropertyAgente.LOCATOR_B_3);
			}
			Thread.sleep(2000);
			type(BasicData.NUMBER_2, LocatorCreatePropertyAgente.LOCATOR_NUMBER_2);
			Thread.sleep(2000);
			if(BasicData.CARDINAL_POINT_S.equals(CardinalPointsTwo)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_11);
				click(LocatorCreatePropertyAgente.LOCATOR_SUR_2);
			}
			if(BasicData.CARDINAL_POINT_N.equals(CardinalPointsTwo)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_11);
				click(LocatorCreatePropertyAgente.LOCATOR_NORTE_2);
			}	
			Thread.sleep(2000);
			if(BasicData.COMPLEMENT_A.equals(Complement)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_12);
				click(LocatorCreatePropertyAgente.LOCATOR_APARTMENT);
			}
			if(BasicData.COMPLEMENT_C.equals(Complement)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_12);
				click(LocatorCreatePropertyAgente.LOCATOR_HOUSE);
			}
			Thread.sleep(2000);
			type(BasicData.TEXT_COMPLEMENT, LocatorCreatePropertyAgente.LOCATOR_TEXT_COMPLEMENT);
			Thread.sleep(2000);
			if(BasicData.COMPLEMENT_A.equals(Complement)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_13);
				click(LocatorCreatePropertyAgente.LOCATOR_APARTMENT_2);
			}
			if(BasicData.COMPLEMENT_C.equals(Complement)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_13);
				click(LocatorCreatePropertyAgente.LOCATOR_HOUSE_2);
			}
			Thread.sleep(2000);
			type(BasicData.TEXT_COMPLEMENT_2, LocatorCreatePropertyAgente.LOCATOR_TEXT_COMPLEMENT_2);
			Thread.sleep(2000);
			if(BasicData.BUTTON_ADDRESS_S.equals(ButtonAddress)) {
				click(LocatorCreatePropertyAgente.LOCATOR_BUTTON_ADDRESS);
			}
			type(BasicData.NICK_NAME, LocatorCreatePropertyAgente.LOCATOR_NICK_NAME);
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
	
	public void basicInformation(String TypeParking1, String TypeParking2, String TypeParking3, String TypeParking4, String TypeParking5, String Complement, String TransactionType, String Stratum, String ButtonAdministration, String ButtonBrandNew) {
		try {
			Thread.sleep(2000);
			if(BasicData.COMPLEMENT_A.equals(Complement)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_14);
				click(LocatorCreatePropertyAgente.LOCATOR_APARTMENT_3);
			}
			if(BasicData.COMPLEMENT_C.equals(Complement)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_14);
				click(LocatorCreatePropertyAgente.LOCATOR_HOUSE_3);
			}
			Thread.sleep(2000);
			if(BasicData.TRANSACTION_TYPE_A.equals(TransactionType)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_15);
				click(LocatorCreatePropertyAgente.LOCATOR_RENT); 
			}
			if(BasicData.TRANSACTION_TYPE_V.equals(TransactionType)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_15);
				click(LocatorCreatePropertyAgente.LOCATOR_SALE);
				Thread.sleep(2000);
				type(BasicData.VALUE_SALE, LocatorCreatePropertyAgente.LOCATOR_VALUE_SALE);
			}
			if(BasicData.TRANSACTION_TYPE_AV.equals(TransactionType)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_15);
				click(LocatorCreatePropertyAgente.LOCATOR_SALE_ORENT);
				Thread.sleep(2000);
				type(BasicData.VALUE_SALE, LocatorCreatePropertyAgente.LOCATOR_VALUE_SALE);
			}
			Thread.sleep(2000);
			if(BasicData.STRATUM_2.equals(Stratum)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_16);
				click(LocatorCreatePropertyAgente.LOCATOR_STRATUM_2);
			}
			if(BasicData.STRATUM_3.equals(Stratum)) {
				click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_16);
				click(LocatorCreatePropertyAgente.LOCATOR_STRATUM_3);
			}
			Thread.sleep(2000);
			type(BasicData.AREA, LocatorCreatePropertyAgente.LOCATOR_AREA);
			Thread.sleep(2000);
			//type(BasicData.LOT_AREA, LocatorCreatePropertyAgente.LOCATOR_LOT_AREA);
			//Thread.sleep(2000);
			type(BasicData.ROOM, LocatorCreatePropertyAgente.LOCATOR_ROOM);
			Thread.sleep(2000);
			type(BasicData.BATH, LocatorCreatePropertyAgente.LOCATOR_BATH);
			Thread.sleep(2000);
			type(BasicData.PARKING, LocatorCreatePropertyAgente.LOCATOR_PARKING);
			Thread.sleep(2000);
			click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_17);
			if(TypeParking1.equals(TypeParking1)) {
				click(LocatorCreatePropertyAgente.LOCATOR_INDEPENDENT);
			}
			if(TypeParking2.equals(TypeParking2)) {
				click(LocatorCreatePropertyAgente.LOCATOR_SERVITUDE);
			}
			if(TypeParking3.equals(TypeParking3)) {
				click(LocatorCreatePropertyAgente.LOCATOR_COVERED);
			}
			if(TypeParking4.equals(TypeParking4)) {
				click(LocatorCreatePropertyAgente.LOCATOR_DISCOVERED);
			}
			if(TypeParking5.equals(TypeParking5)) {
				click(LocatorCreatePropertyAgente.LOCATOR_COMMUNAL);
			}
			click(LocatorCreatePropertyAgente.LOCATOR_OPEN_BUTTON_17);
			Thread.sleep(2000);
			if(BasicData.TRANSACTION_TYPE_A.equals(TransactionType) || BasicData.TRANSACTION_TYPE_AV.equals(TransactionType)) {
				Thread.sleep(3000);
				type(BasicData.VALUE_RENT, LocatorCreatePropertyAgente.LOCATOR_VALUE_RENT);
				Thread.sleep(2000);
				if(BasicData.BUTTON_ADMINISTRATION_S.equals(ButtonAdministration)) {
					click(LocatorCreatePropertyAgente.LOCATOR_BUTTON_ADMINISTRATION);
				}
				if(BasicData.BUTTON_ADMINISTRATION_N.equals(ButtonAdministration)) {
					Thread.sleep(2000);
					type(BasicData.MANAGEMENT_VALUE, LocatorCreatePropertyAgente.LOCATOR_MANAGEMENT_VALUE);
				}
			}else {
				Thread.sleep(2000);
				type(BasicData.MANAGEMENT_VALUE, LocatorCreatePropertyAgente.LOCATOR_MANAGEMENT_VALUE);
			}	
			Thread.sleep(2000);
			type(BasicData.CODE, LocatorCreatePropertyAgente.LOCATOR_CODE);
			Thread.sleep(2000);
			if(BasicData.BUTTON_BRAND_NEW_S.equals(ButtonBrandNew)) {
				click(LocatorCreatePropertyAgente.LOCATOR_BUTTON_BRAND_NEW);
			}
			if(BasicData.BUTTON_BRAND_NEW_N.equals(ButtonBrandNew)) {
				Thread.sleep(2000);
				type(BasicData.ANTIQUITY, LocatorCreatePropertyAgente.LOCATOR_ANTIQUITY);
			}
			Thread.sleep(2000);
			type(BasicData.FLOOR, LocatorCreatePropertyAgente.LOCATOR_FLOOR);
			Thread.sleep(2000);
			type(BasicData.ADDITIONAL_INFORMATION, LocatorCreatePropertyAgente.LOCATOR_ADDITIONAL_INFORMATION);
			Thread.sleep(3000);
			click(LocatorCreatePropertyAgente.LOCATOR_BUTTON_SAVE);
			Thread.sleep(2000);
			click(LocatorCreatePropertyAgente.LOCATOR_BUTTON_SAVE);
			Thread.sleep(5000); 
			click(LocatorCreatePropertyAgente.LOCATOR_BUTTON_ACCEPT);
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
	
	public void load()  {
		try {
			File file1 = new File("./src/test/resources/img/portada.png");
			File file2 = new File("./src/test/resources/img/arriendo.png");
			File file3 = new File("./src/test/resources/img/Screenshot.png");
			String phat1 = file1.getAbsolutePath();
			String phat2 = file2.getAbsolutePath();
			String phat3 = file3.getAbsolutePath();
			
			driver.findElement(LocatorCreatePropertyAgente.LOCATOR_IMG).sendKeys(phat1);
			Thread.sleep(5000);
			driver.findElement(LocatorCreatePropertyAgente.LOCATOR_IMG).sendKeys(phat2);
			Thread.sleep(5000);
			driver.findElement(LocatorCreatePropertyAgente.LOCATOR_IMG).sendKeys(phat3);
			Thread.sleep(5000);
			click(LocatorCreatePropertyAgente.LOCATOR_UPLOAD_FILE);
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			click(LocatorCreatePropertyAgente.LOCATOR_COVER_PHOTO);
			Thread.sleep(2000);
			click(LocatorCreatePropertyAgente.LOCATOR_BUTTON_SAVE);
			Thread.sleep(8000);
			click(LocatorCreatePropertyAgente.LOCATOR_BUTTON_ACCEPT);
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
	
	public void validation() {
		try {
			Thread.sleep(8000);
			String textCode = driver.findElement(LocatorCreatePropertyAgente.LOCATOR_CODE_PROPERTY).getText();
			type(textCode, LocatorCreatePropertyAgente.LOCATOR_TEXT_CODE);
			Thread.sleep(3000);
			click(LocatorCreatePropertyAgente.LOCATOR_SEARH);
			Thread.sleep(5000);
			String endroom = driver.findElement(LocatorCreatePropertyAgente.LOCATOR_END_ROOM).getText();
			String sEndroom = endroom.substring(0,1);
			if(BasicData.ROOM.equals(sEndroom)) {
				System.out.println("El número de habitaciones concuerda con las ingresadas: "+sEndroom);
			}else {
				System.out.println("El número de habitaciones consultadas no concuerda con los ingresadas");
			}
			String endBath = driver.findElement(LocatorCreatePropertyAgente.LOCATOR_END_BATH).getText();
			String sEndBath = endBath.substring(0,1);
			if(BasicData.BATH.equals(sEndBath)) {
				System.out.println("El número de Baños concuerda con los ingresados: "+sEndBath);
			}else {
				System.out.println("El número de baños consultados no concuerda con los ingresados");
			}
			String endM2 = driver.findElement(LocatorCreatePropertyAgente.LOCATOR_END_M2).getText();
			String sEndM2 = endM2.substring(0,2);
			if(BasicData.AREA.equals(sEndM2)) {
				System.out.println("El area concuerda con el area ingresada: "+sEndM2);
			}else {
				System.out.println("El area consultada no concuerda con la ingresada");
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
