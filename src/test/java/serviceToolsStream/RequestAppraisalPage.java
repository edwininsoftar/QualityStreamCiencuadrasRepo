package serviceToolsStream;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BasicWrap;

public class RequestAppraisalPage extends BasicWrap {
	
	By locato_buttonAppraise = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[1]/div/div[2]/a");
	By locator_buttonColombia = By.xpath("/html/body/app-root/app-appraisal/section[3]/app-card-option/div/div/div[1]/a");
	By locator_buttonExterior = By.xpath("/html/body/app-root/app-appraisal/section[3]/app-card-option/div/div/div[2]/a");
	By locator_buttonCalculatePrice = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div/div[2]/a");
	By locator_city = By.name("ciudad");
	By locator_confirm = By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-check-coverage/div/div[2]/div[2]/button");
	By locator_continue = By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-coverage/div/div[3]/div/button");
	// Formato de solicitud
	By locator_typeProperty = By.cssSelector("div[class=\"mat-form-field-infix ng-tns-c121-6\"]");
	By locator_apartment = By.xpath("//*[@id=\"mat-option-6\"]/span");
	By locator_house = By.xpath("//*[@id=\"mat-option-7\"]/span");
	By locator_address = By.id("mat-input-2");
	By locator_addresAdd = By.id("mat-input-3");
	By locator_sale = By.id("mat-input-4"); 
	By locator_zone = By.id("mat-input-5");
	By locator_enrollment = By.id("mat-input-6");
	By locator_estateStatus = By.cssSelector("div[class=\"mat-select-arrow ng-tns-c165-15\"]");
	By locator_new = By.xpath("//*[@id=\"mat-option-2\"]/span");
	By locator_used = By.xpath("//*[@id=\"mat-option-3\"]/span");
								
	String appraisalFrom = "Colombia";//Colombia, Exterior
	String city = "Bogotá"; 
	//formato de solicitud 
	String typeProperty = "Casa";//Apartamento, Casa
	String address = "Calle 128 # 52-46";//Ingrese la dirección
	String addressAdd = "Primer Piso";//complemento de la dirección
	String sale = "120000000";//Valor estimado de venta 
	String zone = "2";// ingrese la zona
	String enrollment = "12345678"; // ingrese la matricula inmobiliaria
	String estateStatus = "Nueva"; // Nueva, Usada

	public RequestAppraisalPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void appraise() throws InterruptedException {
		try {
			Thread.sleep(7000);
			click(locato_buttonAppraise);
			//new tab
			String mainTab = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String actual: handles) {
				if(!actual.equalsIgnoreCase(mainTab)) {
					driver.switchTo().window(actual);
				}
			}
			if(appraisalFrom.equals("Colombia")) {
				Thread.sleep(5000);
				click(locator_buttonColombia);
				type(city, locator_city);
				Thread.sleep(3000);		
				WebElement ciu = driver.findElement(locator_city);
				ciu.sendKeys(Keys.DOWN);
				ciu.sendKeys(Keys.ENTER);
				Thread.sleep(3000);	
				click(locator_confirm);
				Thread.sleep(3000);	
				click(locator_continue);
			}
			if(appraisalFrom.equals("Exterior")) {
				click(locator_buttonExterior);
			}
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void requestForm()  throws InterruptedException {
		try {
			Thread.sleep(3000);
			click(locator_typeProperty);
			if(typeProperty.equals("Apartamento")) {
				click(locator_apartment);
			}
			if(typeProperty.equals("Casa")) {
				click(locator_house);
			}
			type(address, locator_address);
			type(addressAdd,locator_addresAdd);
			type(sale, locator_sale);
			type(zone, locator_zone);
			type(enrollment, locator_enrollment);
			if(estateStatus.equals("Nueva")) {
				click(locator_new);
			}
			if(estateStatus.equals("Usada")) {
				click(locator_used);
			}
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}

}
