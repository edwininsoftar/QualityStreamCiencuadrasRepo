package create.property.rolInmobiliaria;

import java.io.File;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class CreatePropertyInmobiliariaPage extends BasicWrap{
	
	public CreatePropertyInmobiliariaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void login() throws InterruptedException {
		try {
			Thread.sleep(2000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_X);
			Thread.sleep(2000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_INTO);
			type(BasicData.USERNAME_I, LocatorCreatePropertyInmobiliaria.LOCATOR_USERNAME);
			type(BasicData.PASSWORD_I, LocatorCreatePropertyInmobiliaria.LOCATOR_PASSWORD);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_LOGIN);
			Thread.sleep(8000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_USER);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_PUBLISHED_PROPERTY);
			Thread.sleep(5000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_CREATE_PROPERTY);
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
	
	public void propertyPublication(String Avcll, String Letter, String CardinalPoint, String letter2, String CardinalPoint2, String Letter3, String CardinalPoint3, String Complement, String BAddress) {
		try {
			type(BasicData.REGISTRATION, LocatorCreatePropertyInmobiliaria.LOCATOR_REGISTRATION);
			Thread.sleep(2000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON);
			Thread.sleep(2000);
			type(BasicData.DEPARTMENT, LocatorCreatePropertyInmobiliaria.LOCATOR_DEPARTMENT);
			WebElement dp = driver.findElement(LocatorCreatePropertyInmobiliaria.LOCATOR_DEPARTMENT);
			dp.sendKeys(Keys.DOWN);	
			dp.sendKeys(Keys.ENTER);	
			Thread.sleep(2000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_2);
			Thread.sleep(2000);
			type(BasicData.CITY, LocatorCreatePropertyInmobiliaria.LOCATOR_CITY);
			WebElement ci = driver.findElement(LocatorCreatePropertyInmobiliaria.LOCATOR_CITY);
			ci.sendKeys(Keys.DOWN);
			ci.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_3);
			Thread.sleep(2000);
			type(BasicData.LOCATION, LocatorCreatePropertyInmobiliaria.LOCATOR_LOCATION);
			WebElement lc = driver.findElement(LocatorCreatePropertyInmobiliaria.LOCATOR_LOCATION);
			lc.sendKeys(Keys.DOWN);
			lc.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_4);
			Thread.sleep(2000);
			type(BasicData.NEIGHBORHOOD, LocatorCreatePropertyInmobiliaria.LOCATOR_NEIGHBORHOOD);
			WebElement br = driver.findElement(LocatorCreatePropertyInmobiliaria.LOCATOR_NEIGHBORHOOD);
			br.sendKeys(Keys.DOWN);
			br.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_5);
			Thread.sleep(2000);
			if(BasicData.AVCLL_CR.equals(Avcll)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_CARRERA);
			}
			if(BasicData.AVCLL_CLL.equals(Avcll)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_CALLE);
			}
			Thread.sleep(2000);
			type(BasicData.AVCLL_2, LocatorCreatePropertyInmobiliaria.LOCATOR_AVCLL_2);
			Thread.sleep(2000);
			if(BasicData.LETTER_A.equals(Letter)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_6);
				Thread.sleep(2000);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_6);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_A);
			}
			if(BasicData.LETTER_B.equals(Letter)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_6);
				Thread.sleep(2000);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_6);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_B);
			}
			Thread.sleep(2000);
			if(BasicData.BIS.equals(CardinalPoint)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_7);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_BIS);
			}
			if(BasicData.ESTE.equals(CardinalPoint)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_7);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_ESTE);
			}
			Thread.sleep(2000);
			if(BasicData.LETTER_A.equals(letter2)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_8);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_A2);
			}
			if(BasicData.LETTER_B.equals(letter2)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_8);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_B2);
			}
			Thread.sleep(2000);
			if(BasicData.CARDINAL_POINT_S.equals(CardinalPoint2)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_9);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_SUR);
			}
			if(BasicData.CARDINAL_POINT_N.equals(CardinalPoint2)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_9);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_NORTE);
			}
			Thread.sleep(2000);
			type(BasicData.NUMBER, LocatorCreatePropertyInmobiliaria.LOCATOR_NUMBER);
			Thread.sleep(2000);
			if(BasicData.LETTER_A.equals(Letter3)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_10);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_A3);
			}
			if(BasicData.LETTER_B.equals(Letter3)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_10);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_B3);
			}
			Thread.sleep(2000);
			type(BasicData.NUMBER_2, LocatorCreatePropertyInmobiliaria.LOCATOR_NUMBER_2);
			Thread.sleep(2000);
			if(BasicData.CARDINAL_POINT_S.equals(CardinalPoint3)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_11);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_SUR_2);
			}
			if(BasicData.CARDINAL_POINT_N.equals(CardinalPoint3)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_11);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_NORTE_2);
			}	
			Thread.sleep(2000);
			if(BasicData.COMPLEMENT_A.equals(Complement)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_12);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_APARTMENT);
			}
			if(BasicData.COMPLEMENT_C.equals(Complement)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_12);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_HOUSE);
			}
			Thread.sleep(2000);
			type(BasicData.TEXT_COMPLEMENT, LocatorCreatePropertyInmobiliaria.LOCATOR_TEXT_COMPLEMENT);
			Thread.sleep(2000);
			if(BasicData.COMPLEMENT_A.equals(Complement)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_13);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_APARTMENT_2);
			}
			if(BasicData.COMPLEMENT_C.equals(Complement)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_13);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_HOUSE_2);
			}
			Thread.sleep(2000);
			type(BasicData.TEXT_COMPLEMENT_2, LocatorCreatePropertyInmobiliaria.LOCATOR_TEXT_COMPLEMENT_2);
			Thread.sleep(2000);
			if(BasicData.BUTTON_ADDRESS_S.equals(BAddress)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_BUTTON_ADDRESS);
			}
			type(BasicData.NICK_NAME, LocatorCreatePropertyInmobiliaria.LOCATOR_NICKNAME);
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
	
	public void basicInformation(String Complement, String TransactionType, String Stratum, String TypeParking1, String TypeParking2, String TypeParking3, String TypeParking4, String TypeParking5, String Administration, String BrandNew) {
		try {
			Thread.sleep(2000);
			if(BasicData.COMPLEMENT_A.equals(Complement)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_14);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_APARTMENT_3);
			}
			if(BasicData.COMPLEMENT_C.equals(Complement)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_14);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_HOUSE_3);
			}
			Thread.sleep(2000);
			if(BasicData.TRANSACTION_TYPE_A.equals(TransactionType)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_15);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_RENT); 
			}
			if(BasicData.TRANSACTION_TYPE_V.equals(TransactionType)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_15);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_SALE);
				Thread.sleep(2000);
				type(BasicData.VALUE_SALE, LocatorCreatePropertyInmobiliaria.LOCATOR_VALUE_SALE);
			}
			if(BasicData.TRANSACTION_TYPE_AV.equals(TransactionType)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_15);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_SALE_ORENT);
				Thread.sleep(2000);
				type(BasicData.VALUE_SALE, LocatorCreatePropertyInmobiliaria.LOCATOR_VALUE_SALE);
			}
			Thread.sleep(2000);
			if(BasicData.STRATUM_2.equals(Stratum)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_16);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_STRATUM_2);
			}
			if(BasicData.STRATUM_3.equals(Stratum)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_16);
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_STRATUM_3);
			}
			Thread.sleep(2000);
			type(BasicData.AREA, LocatorCreatePropertyInmobiliaria.LOCATOR_AREA);
			Thread.sleep(2000);
			type(BasicData.ROOM, LocatorCreatePropertyInmobiliaria.LOCATOR_ROOM);
			Thread.sleep(2000);
			type(BasicData.BATH, LocatorCreatePropertyInmobiliaria.LOCATOR_BATH);
			Thread.sleep(2000);
			type(BasicData.PARKING, LocatorCreatePropertyInmobiliaria.LOCATOR_PARKING);
			Thread.sleep(2000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_17);
			if(BasicData.TYPE_PARKING_1_S.equals(TypeParking1)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_INDEPENDENT);
			}
			if(BasicData.TYPE_PARKIKNG_2_S.equals(TypeParking2)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_SERVITUDE);
			}
			if(BasicData.TYPE_PARKING_3_S.equals(TypeParking3)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_COVERED);
			}
			if(BasicData.TYPE_PARKING_4_S.equals(TypeParking4)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_DISCOVERED);
			}
			if(BasicData.TYPE_PARKING_5_S.equals(TypeParking5)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_COMMUNAL);
			}
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_OPEN_BUTTON_17);
			Thread.sleep(2000);
			if(BasicData.TRANSACTION_TYPE_A.equals(TransactionType) || BasicData.TRANSACTION_TYPE_AV.equals(TransactionType)) {
				Thread.sleep(3000);
				type(BasicData.VALUE_RENT, LocatorCreatePropertyInmobiliaria.LOCATOR_VALUE_RENT);
				Thread.sleep(2000);
				if(BasicData.BUTTON_ADMINISTRATION_S.equals(Administration)) {
					click(LocatorCreatePropertyInmobiliaria.LOCATOR_BUTTON_ADMINSTRATION);
				}
				if(BasicData.BUTTON_ADMINISTRATION_N.equals(Administration)) {
					Thread.sleep(2000);
					type(BasicData.MANAGEMENT_VALUE, LocatorCreatePropertyInmobiliaria.LOCATOR_MANAGEMENT_VALUE);
				}
			}else {
				Thread.sleep(2000);
				type(BasicData.MANAGEMENT_VALUE, LocatorCreatePropertyInmobiliaria.LOCATOR_MANAGEMENT_VALUE);
			}	
			Thread.sleep(2000);
			type(BasicData.CODE, LocatorCreatePropertyInmobiliaria.LOCATOR_CODE);
			Thread.sleep(2000);
			if(BasicData.BUTTON_BRAND_NEW_S.equals(BrandNew)) {
				click(LocatorCreatePropertyInmobiliaria.LOCATOR_BUTTON_BRAND_NEW);
			}
			if(BasicData.BUTTON_BRAND_NEW_N.equals(BrandNew)) {
				Thread.sleep(2000);
				type(BasicData.ANTIQUITY, LocatorCreatePropertyInmobiliaria.LOCATOR_ANTIQUITY);
			}
			Thread.sleep(2000);
			type(BasicData.FLOOR, LocatorCreatePropertyInmobiliaria.LOCATOR_FLOOR);
			Thread.sleep(2000);
			type(BasicData.ADDITIONAL_INFORMATION, LocatorCreatePropertyInmobiliaria.LOCATOR_ADDITIONAL_INFORMATION);
			Thread.sleep(3000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_BUTTON_SAVE);
			Thread.sleep(2000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_BUTTON_SAVE);
			Thread.sleep(5000); 
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_BUTTON_ACCEPT);
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
			
			driver.findElement(LocatorCreatePropertyInmobiliaria.LOCATOR_IMG).sendKeys(phat1);
			Thread.sleep(5000);
			driver.findElement(LocatorCreatePropertyInmobiliaria.LOCATOR_IMG).sendKeys(phat2);
			Thread.sleep(5000);
			driver.findElement(LocatorCreatePropertyInmobiliaria.LOCATOR_IMG).sendKeys(phat3);
			Thread.sleep(5000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_UPLOAD_FILE);
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_COVER_PHOTO);
			Thread.sleep(2000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_BUTTON_SAVE);
			Thread.sleep(8000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_BUTTON_ACCEPT);
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
			String textCode = driver.findElement(LocatorCreatePropertyInmobiliaria.LOCATOR_CODE_PROPERTY).getText();
			type(textCode, LocatorCreatePropertyInmobiliaria.LOCATOR_TEXT_CODE);
			Thread.sleep(3000);
			click(LocatorCreatePropertyInmobiliaria.LOCATOR_SEARH);
			Thread.sleep(5000);
			String endroom = driver.findElement(LocatorCreatePropertyInmobiliaria.LOCATOR_END_ROOM).getText();
			String sEndroom = endroom.substring(0,1);
			if(BasicData.ROOM.equals(sEndroom)) {
				System.out.println("El número de habitaciones concuerda con las ingresadas: "+sEndroom);
			}else {
				System.out.println("El número de habitaciones consultados no concuerda con los ingresados");
			}
			String endBath = driver.findElement(LocatorCreatePropertyInmobiliaria.LOCATOR_END_BATH).getText();
			String sEndBath = endBath.substring(0,1);
			if(BasicData.BATH.equals(sEndBath)) {
				System.out.println("El número de Baños concuerda con los ingresados: "+sEndBath);
			}else {
				System.out.println("El número de baños consultados no concuerda con los ingresados");
			}
			String endM2 = driver.findElement(LocatorCreatePropertyInmobiliaria.LOCATOR_END_M2).getText();
			String sEndM2 = endM2.substring(0,2);
			if(BasicData.AREA.equals(sEndM2)) {
				System.out.println("El area concuerda con el area ingresados: "+sEndM2);
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
