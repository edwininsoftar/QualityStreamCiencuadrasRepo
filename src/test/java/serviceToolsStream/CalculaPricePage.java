package serviceToolsStream;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.BasicWrap;

public class CalculaPricePage extends BasicWrap{
	//Formulario ubicación del inmueble
	By locator_ButtonCalculaPrice = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div/div[2]/a");
	By locator_city = By.id("mat-input-0");
	By locator_address = By.id("mat-input-1");
	By locator_addressAdd = By.id("mat-input-2");
	By locator_checkMap = By.id("mat-checkbox-1");
	By locator_button_continue = By.cssSelector("button[class=\"btn button rounded secondary\"]");
	
	//Formulario ubicación del inmueble
	String city = "Bogotá"; // Ingrese la ciudad
	String address = "Calle 128 # 52-53";// Ingrese la dirección 
	String addressAdd = "Segundo piso";//Ingrese el complemento de la dirección
	
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
