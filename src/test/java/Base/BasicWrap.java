package Base;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class BasicWrap {
	 	
	    //OBJETO DRIVER
		public WebDriver driver;
		
		//CONSTRUCTOR DE LA CLASE 
		public BasicWrap(WebDriver driver) {
			this.driver = driver;
		}
		
		// CREACI�N DE INSTACIA DEL NAVEGADOR CHROME
		public WebDriver chromeDriverConnection() {
			//Chrome
			//System.setProperty("webdriver.chrome.driver", "./src/test/resources/DriverChrome/chromedriver.exe");
			//driver = new ChromeDriver();
			//Mozilla
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/DriverMozillaFirefox/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}
		
		// Metodo ngWebdriver para manejo de angular 
		public NgWebDriver getNgWebDriver() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return (new NgWebDriver(js));
		} 
		
		//either of the lines can be used for clicking
		public void waitForAngularRequestsToFinish() {
			try {
				getNgWebDriver().waitForAngularRequestsToFinish();
			} catch (Exception e) {
				Assert.fail("Error while waiting for Angular request to finish: "+e.getMessage());
			}
		}
		
		//WRAPPER DE LOS COMANDOS DE SELENIUM
		public WebElement findElement(By locator) {
			return driver.findElement(locator);
		}
		

		// LOCALIZADOR TIPO LISTA
		public List<WebElement> findElements(By locator){
			return driver.findElements(locator);
		}
		
		// DEVUELVE EL TEXTO DEL ELEMENTO PASADO COMO PARAMETRO
		public String getText(WebElement element) {
			return element.getText();
		}
		
		// RETORNA EL TEXTO DEL ELEMENTO BUSCADO
		public String getText(By locator) {
			return driver.findElement(locator).getText();
		}
		
		// ESCRIBIR TEXTO
		public void type(String inputText, By locator) {
			driver.findElement(locator).sendKeys(inputText);
		}
		
		public void typeKeys(Keys key, By locator) {
			driver.findElement(locator).sendKeys(key);
		}
		
		// CLICK
		public void click(By locator) {
			driver.findElement(locator).click();
		}
		
		
		// VALIDA QUE UN ELEMENTO SE ENCUENTRE LISTO PARA SER UTILIZADO  
		public Boolean isDisplayed(By locator) {
			try {
				return driver.findElement(locator).isDisplayed();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		}
		
		// VALIDA SI UN LOCALIZADOR ESTA SELECCIONADO 
		public Boolean isSelected(By locator) {
			try {
				return driver.findElement(locator).isSelected();
			} catch (org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		}
		
		// ENCARGADO DE RECIBIR LA URL Y ABRIR LA PAGINA 
		public void visit(String url) {
			driver.get(url);
		}
}
