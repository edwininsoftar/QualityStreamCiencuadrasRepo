package serviceToolsStream;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularBinding;

import Base.BasicWrap;

public class CalculaPricePage extends BasicWrap{
	//Formulario ubicación del inmueble
	By locator_ButtonCalculaPrice = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div/div[2]/a");
	By locator_city = By.id("mat-input-0");
	By locator_address = By.id("mat-input-1");
	By locator_addressAdd = By.id("mat-input-2");
	By locator_checkMap = By.id("mat-checkbox-1");
	By locator_button_continue = By.cssSelector("button[class=\"btn button rounded secondary\"]");
	//Información del inmueble
	By locator_typeProperty = By.id("mat-select-0");
	By locator_apartment = By.id("mat-option-0");
	By locator_house = By.id("mat-option-1");
	By locator_rent = By.id("mat-button-toggle-2-button");
	By locator_sale = By.id("mat-button-toggle-3-button");
	By locator_stratum1 = By.id("mat-button-toggle-4-button");
	By locator_stratum2 = By.id("mat-button-toggle-5-button");
	By locator_stratum3 = By.id("mat-button-toggle-6-button");
	By locator_stratum4 = By.id("mat-button-toggle-7-button");
	By locator_stratum5 = By.id("mat-button-toggle-8-button");
	By locator_stratum6 = By.id("mat-button-toggle-9-button");
	By locator_area = By.id("mat-input-3");
	By locator_antiquity = By.id("mat-input-4");
	By locator_parkingLess = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[1]/div/button[1]");
	By locator_parkingMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[1]/div/button[2]");
	By locator_toiletsLess = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[2]/div/button[1]");
	By locator_toiletsMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[2]/div/button[2]");
	By locator_roomsLess = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[3]/div/button[1]");
	By locator_roomsMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[3]/div/button[2]");
	By locator_balconiesMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[4]/div/button[2]");
	By locator_terraceMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[5]/div/button[2]");
	By locator_depositMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[6]/div/button[2]");
	By locator_elevatorsMore = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-property-information/div/form/div[7]/div/button[2]");
	By locator_buttonContinue = ByAngular.buttonText("CONTINUAR");
	
	//Formulario ubicación del inmueble
	String city = "Bogotá"; // Ingrese la ciudad
	String address = "Calle 128 # 52-53";// Ingrese la dirección 
	String addressAdd = "Segundo piso";//Ingrese el complemento de la dirección
	//Información del inmueble
	
	
	public CalculaPricePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void propertyLocation() throws InterruptedException {
		try {
			Thread.sleep(8000);
			click(locator_ButtonCalculaPrice);
			//new tab
			String mainTab = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String actual: handles) {
				if(!actual.equalsIgnoreCase(mainTab)) {
					driver.switchTo().window(actual);
				}
			}
			type(city, locator_city);
			Thread.sleep(8000);	
			WebElement ct = driver.findElement(locator_city);
			ct.sendKeys(Keys.DOWN);
			ct.sendKeys(Keys.ENTER);
			type(address, locator_address);
			type(addressAdd, locator_addressAdd);
			click(locator_checkMap);
			click(locator_button_continue);
		} catch (Exception e) {
			System.out.println("Error: "+ e);
		}
		
	}

}
