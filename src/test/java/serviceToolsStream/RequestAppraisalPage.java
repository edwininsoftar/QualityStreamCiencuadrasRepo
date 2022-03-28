package serviceToolsStream;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasicWrap;

public class RequestAppraisalPage extends BasicWrap {
	
	By locato_buttonAppraise = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[1]/div/div[2]/a");
	By locator_buttonColombia = By.xpath("/html/body/app-root/app-appraisal/section[3]/app-card-option/div/div/div[1]/a");
	By locator_buttonExterior = By.xpath("/html/body/app-root/app-appraisal/section[3]/app-card-option/div/div/div[2]/a");
	By locator_buttonCalculatePrice = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div/div[2]/a");
	By locator_city = By.name("ciudad");
	By locator_confirm = By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-check-coverage/div/div[2]/div[2]/button");
	By locator_continue = By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-coverage/div/div[3]/div/button");
	
	String appraisalFrom = "Colombia";//Colombia, Exterior
	String city = "Bogotá"; 

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
			click(locator_buttonCalculatePrice);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}

}
