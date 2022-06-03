package create.property.rolConstructora;

import java.io.File;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class CreateProjectPageConstructora extends BasicWrap{
		
	public CreateProjectPageConstructora(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void logIn() {
		try{
			Thread.sleep(2000);
			click(LocatorCreateProjectConstructora.LOCATOR_X);
			Thread.sleep(2000);
			click(LocatorCreateProjectConstructora.LOCATOR_INTO);
			type(BasicData.USERNAME_C, LocatorCreateProjectConstructora.LOCATOR_USERNAME);
			type(BasicData.PASSWORD_C, LocatorCreateProjectConstructora.LOCATOR_PASSWORD);
			click(LocatorCreateProjectConstructora.LOCATOR_LOGIN);
			Thread.sleep(8000);
			click(LocatorCreateProjectConstructora.LOCATOR_MENU);
			Thread.sleep(5000);
			click(LocatorCreateProjectConstructora.LOCATOR_PUBLISHED_PROPERTY);
			click(LocatorCreateProjectConstructora.LOCATOR_CREATE_PROJECT);
		}catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		}catch (TimeoutException e) {
			System.out.println("Error: " + e);
		}catch (ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error:" +e);
		} 
	}
	
	public void publicProject(String Stage, String ProjectPhase, String Stratum, String Departament, String City, String Location, String Neighborhood, String Direction, String Condition, String Pay) {
		try {
			type(BasicData.NAME_PROJECT, LocatorCreateProjectConstructora.LOCATOR_NAME_PROJECT);
			Thread.sleep(3000);
			WebElement eta = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_STAGE);
			Select sel = new Select(eta);
			sel.selectByVisibleText(Stage);
			Thread.sleep(3000);
			WebElement fas = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_PROJECT_PHASE);
			Select sel2 = new Select(fas);
			sel2.selectByVisibleText(ProjectPhase);
			Thread.sleep(3000);
			WebElement est = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_STRATUM);
			Select sel3 = new Select(est);
			sel3.selectByVisibleText(Stratum);
			Thread.sleep(3000);
			WebElement dep = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_DEPARMENT);
			Select sel4 = new Select(dep);
			sel4.selectByVisibleText(Departament);
			Thread.sleep(3000);
			WebElement ciu = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_CITY);
			Select sel5 = new Select(ciu);
			sel5.selectByVisibleText(City);
			Thread.sleep(3000);
			WebElement loc = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_LOCATION);
			Select sel6 = new Select(loc);
			sel6.selectByVisibleText(Location);
			Thread.sleep(3000);
			WebElement bar = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_NEIGHBORHOOD);
			Select sel7 = new Select(bar);
			sel7.selectByVisibleText(Neighborhood);
			Thread.sleep(3000);
			WebElement dir = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_DIRECTION);
			Select sel8 = new Select(dir);
			sel8.selectByVisibleText(Direction);
			Thread.sleep(3000);
			type(BasicData.DATE, LocatorCreateProjectConstructora.LOCATOR_DATE);
			Thread.sleep(3000);
			WebElement con = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_CONDITION);
			Select sel9 = new Select(con);
			sel9.selectByVisibleText(Condition);
			Thread.sleep(3000);
			WebElement mem = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_PAY);
			Select sel10 = new Select(mem);
			sel10.selectByVisibleText(Pay);
			type(BasicData.DIRECTION_COMPLIT, LocatorCreateProjectConstructora.LOCATOR_DIRECTION_COMPLIT);
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		}catch (TimeoutException e) {
			System.out.println("Error: " + e);
		}catch (ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error:" +e);
		} 
	}
	
	public void characteristicsProperty(String TypeProperty, String NumberRoom, String NumberBath, String NumberParking, String Swimning, String Floor, String TvCircuit, String ServiceRoom, String ServiceBath, String LaundryArea, String Fireplace, String AllowsPets, String TypeStove, String TypeHeater, String AirConditioning, String TerraceArea, String NumberBalcony, String NumberDeposits, String SoldOut, String TypeParking, String Kiln, String Extractor, String Dishwasher) {
		try {
			Thread.sleep(3000);
			WebElement tipInm = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_TYPE_PROPERTY);
			Select sel11 = new Select(tipInm);
			sel11.selectByVisibleText(TypeProperty);
			Thread.sleep(3000);
			type(BasicData.NAME_TYPE_PROPERTY, LocatorCreateProjectConstructora.LOCATOR_NAME_TYPE_PROPERTY);
			type(BasicData.PRICE, LocatorCreateProjectConstructora.LOCATOR_PRICE);
		    Thread.sleep(3000);
		    WebElement numHab = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_NUMBER_ROOM);
		    Select sel12 = new Select(numHab);
		    sel12.selectByVisibleText(NumberRoom);
		    Thread.sleep(3000);
		    WebElement numBath = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_NUMBER_BATH);
		    Select sel13 = new Select(numBath);
		    sel13.selectByVisibleText(NumberBath);
		    Thread.sleep(3000);
		    WebElement numPar = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_NUMBER_PARKING);
		    Select sel14 = new Select(numPar);
		    sel14.selectByVisibleText(NumberParking);
		    Thread.sleep(3000);
		    WebElement pisPri = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_SWIMMING);
		    Select sel15 = new Select(pisPri);
		    sel15.selectByVisibleText(Swimning);
		    Thread.sleep(3000);
		    WebElement pisInm = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_FLOOR);
		    Select sel16 = new Select(pisInm);
		    sel16.selectByVisibleText(Floor);
		    Thread.sleep(3000);
		    type(BasicData.VALUE_MANAGEMENT, LocatorCreateProjectConstructora.LOCATOR_VALUE_MANAGEMENT);
		    Thread.sleep(3000);
		    WebElement cirTv = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_TV_CIRCUIT);
		    Select sel17 = new Select(cirTv);
		    sel17.selectByVisibleText(TvCircuit);
		    Thread.sleep(3000);
		    WebElement habSer = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_SERVICE_ROOM);
		    Select sel18 = new Select(habSer);
		    sel18.selectByVisibleText(ServiceRoom);
		    Thread.sleep(3000);
		    WebElement bathSer = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_SERVICE_BATH);
		    Select sel19 = new Select(bathSer);
		    sel19.selectByVisibleText(ServiceBath);
		    Thread.sleep(3000);
		    WebElement zonLav = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_LAUNDRY_AREA );
		    Select sel20 = new Select(zonLav);
		    sel20.selectByVisibleText(LaundryArea);
		    Thread.sleep(3000);
		    WebElement conChi = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_FIREPLACE);
		    Select sel21 = new Select(conChi);
		    sel21.selectByVisibleText(Fireplace);
		    Thread.sleep(3000);
		    WebElement perMas = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_ALLOWS_PETS);
		    Select sel22 = new Select(perMas);
		    sel22.selectByVisibleText(AllowsPets);
		    Thread.sleep(3000);
		    WebElement tipEst = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_TYPE_STOVE);
		    Select sel23 = new Select(tipEst);
		    sel23.selectByVisibleText(TypeStove);
		    Thread.sleep(3000);
		    WebElement tipCal = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_TYPE_HEATER);
		    Select sel24 = new Select(tipCal);
		    sel24.selectByVisibleText(TypeHeater);
		    Thread.sleep(3000);
		    WebElement airAco = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_AIR_CONDITIONING);
		    Select sel25 = new Select(airAco);
		    sel25.selectByVisibleText(AirConditioning);
		    Thread.sleep(3000);
		    WebElement zonTer = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_TERRACE_AREA);
		    Select sel26 = new Select(zonTer);
		    sel26.selectByVisibleText(TerraceArea);
		    Thread.sleep(3000);
		    type(BasicData.NUMBER_TERRACE, LocatorCreateProjectConstructora.LOCATOR_NUMBER_TERRACE);
		    Thread.sleep(3000);
		    type(BasicData.BUILT_AREA, LocatorCreateProjectConstructora.LOCATOR_BUIL_AREA);
		    Thread.sleep(3000);
		    type(BasicData.TOTAL_AREA, LocatorCreateProjectConstructora.LOCATOR_TOTAL_AREA);
		    Thread.sleep(3000);
		    WebElement numBal = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_NUMBER_BALCONY);
		    Select sel30 = new Select(numBal);
		    sel30.selectByVisibleText(NumberBalcony);
		    Thread.sleep(3000);
		    WebElement numDep = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_NUMBER_DEPOSITS);
		    Select sel31 = new Select(numDep);
		    sel31.selectByVisibleText(NumberDeposits);
		    Thread.sleep(3000);
		    type(BasicData.DELIVER_DATE, LocatorCreateProjectConstructora.LOCATOR_DELIVER_DATE);
		    Thread.sleep(3000);
		    WebElement ven = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_SOLD_OUT);
		    Select sel32 = new Select(ven);
		    sel32.selectByVisibleText(SoldOut);
		    Thread.sleep(3000);
		    WebElement tipPar = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_TYPE_PARKING);
		    Select sel33 = new Select(tipPar);
		    sel33.selectByVisibleText(TypeParking);
		    Thread.sleep(3000);
		    type(BasicData.UNITS_AVAILABLE, LocatorCreateProjectConstructora.LOCATOR_UNITS_AVAILABLE);
		    Thread.sleep(5000);
		    if(BasicData.KILN_S.equals(Kiln) || BasicData.EXTRACTOR_S.equals(Extractor) || BasicData.DISHWASHER_S.equals(Dishwasher)) {
		    	click(LocatorCreateProjectConstructora.LOCATOR_HOME_APPLIANCES);
		    	 if(BasicData.KILN_S.equals(Kiln)) {
				    click(LocatorCreateProjectConstructora.LOCATOR_KILN);
				 }
				 if(BasicData.EXTRACTOR_S.equals(Extractor)) {
					click(LocatorCreateProjectConstructora.LOCATOR_EXTRACTOR);
				 }
				 if(BasicData.DISHWASHER_S.equals(Dishwasher)) {
					click(LocatorCreateProjectConstructora.LOCATOR_DISHWASHER);
				 }
		    }
		}catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		}catch (TimeoutException e) {
			System.out.println("Error: " + e);
		}catch (ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error:" +e);
		} 
	}
	
	public void salesRoom() {
		try {
			Thread.sleep(3000);
			type(BasicData.NAME_ROOM, LocatorCreateProjectConstructora.LOCATOR_NAME_ROOM);
			Thread.sleep(3000);
			type(BasicData.ROOM_ADDRESS, LocatorCreateProjectConstructora.LOCATOR_ROOM_ADDRESS);
			Thread.sleep(3000);
			type(BasicData.CALL_CONTACT_NUMBER, LocatorCreateProjectConstructora.LOCATOR_CALL_CONTACT_NUMBER);
			Thread.sleep(3000);
			type(BasicData.EMAIL_ROOM, LocatorCreateProjectConstructora.LOCATOR_EMAIL_ROOM);
			Thread.sleep(3000);
			type(BasicData.WHATSAPP_CONTACT_NUMBER, LocatorCreateProjectConstructora.LOCATOR_WHATSAPP_CONTACT_NUMBER);
			Thread.sleep(3000);
			type(BasicData.SELLER, LocatorCreateProjectConstructora.LOCATOR_SELLER);
		}catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		}catch (TimeoutException e) {
			System.out.println("Error: " + e);
		}catch (ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error:" +e);
		} 
	}
	
	public void stages() {
		try {
			Thread.sleep(3000);
			type(BasicData.STAGE_1, LocatorCreateProjectConstructora.LOCATOR_STAGE_1);
			Thread.sleep(3000);
			type(BasicData.OPENIG_DATE, LocatorCreateProjectConstructora.LOCATOR_OPENING_DATE);
			Thread.sleep(3000);
			type(BasicData.CLOSING_DATE, LocatorCreateProjectConstructora.LOCATOR_CLOSING_DATE);
			Thread.sleep(3000);
			type(BasicData.ADDITIONAL_INFORMATION, LocatorCreateProjectConstructora.LOCATOR_ADDITIONAL_INFORMATION);
			Thread.sleep(3000);
			click(LocatorCreateProjectConstructora.LOCATOR_BUTTON_SAVE);
			Thread.sleep(5000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		}catch (TimeoutException e) {
			System.out.println("Error: " + e);
		}catch (ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error:" +e);
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
			
			driver.findElement(LocatorCreateProjectConstructora.LOCATOR_IMG_PROYECT).sendKeys(phat1);
			Thread.sleep(8000);
			click(LocatorCreateProjectConstructora.LOCATOR_UPLOAD_FILE_PROJECT);
			Thread.sleep(8000);
			click(LocatorCreateProjectConstructora.LOCATOR_COVER_PHOTO);
			Thread.sleep(8000);
			driver.findElement(LocatorCreateProjectConstructora.LOCATOR_IMG_PROPERTY).sendKeys(phat2);
			Thread.sleep(8000);
			click(LocatorCreateProjectConstructora.LOCATOR_UPLOAD_FILE_PROPERTY);
			Thread.sleep(8000);
			driver.findElement(LocatorCreateProjectConstructora.LOCATOR_IMG_LOGO_PROPERTY).sendKeys(phat3);
			Thread.sleep(8000);
			click(LocatorCreateProjectConstructora.LOCATOR_UPLOAD_FILE_LOGO_PROPERTY);
			Thread.sleep(8000);
			click(LocatorCreateProjectConstructora.LOCATOR_SAVE);
			Thread.sleep(8000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
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
			click(LocatorCreateProjectConstructora.LOCATOR_NAME_PROJECT_O);
			Thread.sleep(8000);
			String endArea = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_AREA).getText();
			String sEndArea = endArea.substring(0,2);
			if(BasicData.BUILT_AREA.equals(sEndArea)) {
				System.out.println("El area concuerda con el area ingresados: "+sEndArea);
			}else {
				System.out.println("El area consultada no concuerda con la ingresada");
			}
			String endRoom = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_ROOM).getText();
			String sEndRoom = endRoom.substring(0,1);
			if(BasicData.NUMBER_ROOM.equals(sEndRoom)) {
				System.out.println("El número de habitaciones concuerda con las ingresadas: "+sEndRoom);
			}else {
				System.out.println("El número de habitaciones consultadas no concuerda con los ingresadas");
			}
			String endBath = driver.findElement(LocatorCreateProjectConstructora.LOCATOR_BATH).getText();
			String sEndBath = endBath.substring(0,1);
			if(BasicData.NUMBER_BATH.equals(sEndBath)) {
				System.out.println("El número de Baños concuerda con los ingresados: "+sEndBath);
			}else {
				System.out.println("El número de baños consultados no concuerda con los ingresados");
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
