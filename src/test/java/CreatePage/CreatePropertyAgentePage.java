package CreatePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BasicWrap;

public class CreatePropertyAgentePage extends BasicWrap{
	
	//Flujo crear rol Agente
	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_username = By.xpath("//*[@id=\"mat-input-3\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_login = By.cssSelector("span[class=\"ng-star-inserted\"]");
	By locator_user = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]");
	By locator_publishedProperty = By.linkText("Inmuebles publicados");
	By locator_createProperty = By.xpath("/html/body/div[3]/div/section/section/div/div[1]/div[2]/a[1]");
	//Publicación de un inmueble
	By locator_registration = By.id("inmueble-matricula_inmobiliaria");
	By locator_openButton = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[1]/div/div[1]/button");
	By locator_department = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[1]/div/div[1]/div/div/input");
	By locator_city = By.id("inmueble-id_ciudad");
	By locator_location = By.id("inmueble-id_localidad");
	By locator_neighborhood = By.id("inmueble-id_barrio");
	By locator_avcll = By.id("dir1");
	By locator_avcll2 = By.id("dir2");
	By locator_letter = By.id("dir3");
	By locator_bis = By.id("dir4");
	By locator_letter2 = By.id("dir5");
	By locator_cardinalPoint = By.id("dir6");
	By locator_number = By.id("dir7");
	By locator_letter3 = By.id("dir8");
	By locator_number2 = By.id("dir9");
	By locator_cardinalPoint2 = By.id("dir10");
	By locator_complement = By.id("dir11");
	By locator_textComplement = By.id("dir12");
	By locator_complement2 = By.id("dir13");
	By locator_textComplement2 = By.id("dir14");
	By loator_buttonAddress = By.id("ocultar_direccion");
	By locator_nickname = By.id("inmueble-apodo");
	
	//Flujo crear rol Agente
	String username = "agenteciencuadras1@yopmail.com";
	String password = "@Contraseña112";
	//Publicación de un inmueble
	String registration = "45859674";// Ingrese la matricula inmobiliaria 
	String department = "Boyacá";// ingrese el departamento
	String city = "Sogamoso";//Ingrese la ciudad
	String location = "Sogamoso";//Ingrese la localidad
	String neighborhood = "UPTC";// Ingrese el barrio 
	String avcll = "Carrera";// ingrese el AV/CLL
	String avcll2 = "14";
	String letter = "A";// Ingrese la letra de la direccón
	String bis = "Bis";
	String letter2 = "A";
	String cardinalPoint = "Sur";//Ingrese el punto cardinal
	String number = "18";
	String letter3 = "A"; // Ingrese la letra
	String number2 = "20";
	String cardinalPoint2 = "Sur";//Ingrese el punto cardinal
	String complement = "Casa";
	String textComplement = "segundo piso";
	String complement2 = "Casa";
	String textComplement2 = "piso2";
	String buttonAddress = "Si";// Ingresi Si o No si decea que la direccion sea visible 
	String nickname = "San calletano";
	
	public CreatePropertyAgentePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub 
	}
	
	public void login() {
		try {
			Thread.sleep(8000);
			click(locator_into);
			type(username, locator_username);
			type(password, locator_password);
			click(locator_login);
			Thread.sleep(8000);
			click(locator_user);
			click(locator_publishedProperty);
			Thread.sleep(5000);
			click(locator_createProperty);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void propertyPublication() {
		try {
			type(registration, locator_registration);
			Thread.sleep(3000);
			click(locator_openButton);
			Thread.sleep(3000);
			type(department, locator_department);
			WebElement dp = driver.findElement(locator_department);
			dp.sendKeys(Keys.DOWN);	
			dp.sendKeys(Keys.ENTER);	
			/*Thread.sleep(3000);
			WebElement ci = driver.findElement(locator_city);
			Select sel1 = new Select(ci);
			sel1.selectByVisibleText(city);
			Thread.sleep(3000);
			WebElement lc = driver.findElement(locator_location);
			Select sel2 = new Select(lc);
			sel2.selectByVisibleText(location);
			Thread.sleep(3000);
			WebElement br = driver.findElement(locator_neighborhood);
			Select sel3 = new Select(br);
			sel3.selectByVisibleText(neighborhood);
			Thread.sleep(3000);
			WebElement av = driver.findElement(locator_avcll);
			Select sel4 = new Select(av);
			sel4.selectByVisibleText(avcll);
			Thread.sleep(3000);
			type(avcll2, locator_avcll2);
			Thread.sleep(3000);
			WebElement le = driver.findElement(locator_letter);
			Select sel5 = new Select(le);
			sel5.selectByVisibleText(letter);
			Thread.sleep(3000);
			WebElement bi = driver.findElement(locator_bis);
			Select sel6 = new Select(bi);
			sel6.selectByVisibleText(bis);
			Thread.sleep(3000);
			WebElement let = driver.findElement(locator_letter2);
			Select sel7 = new Select(let);
			sel7.selectByVisibleText(letter2);
			Thread.sleep(3000);
			WebElement pc = driver.findElement(locator_cardinalPoint);
			Select sel8 = new Select(pc);
			sel8.selectByVisibleText(cardinalPoint);
			Thread.sleep(3000);
			type(number, locator_number);
			Thread.sleep(3000);
			WebElement letr = driver.findElement(locator_letter3);
			Select sel9 = new Select(letr);
			sel9.selectByVisibleText(letter3);
			Thread.sleep(3000);
			type(number2, locator_number2);
			Thread.sleep(3000);
			WebElement puc = driver.findElement(locator_cardinalPoint2);
			Select sel10 = new Select(puc);
			sel10.selectByVisibleText(cardinalPoint2);
			Thread.sleep(3000);
			WebElement comp = driver.findElement(locator_complement);
			Select sel11 = new Select(comp);
			sel11.selectByVisibleText(complement);
			Thread.sleep(3000);
			type(textComplement, locator_textComplement);
			Thread.sleep(3000);
			WebElement compl = driver.findElement(locator_complement2);
			Select sel12 = new Select(compl);
			sel12.selectByVisibleText(complement2);
			Thread.sleep(3000);
			type(textComplement2, locator_textComplement2);
			Thread.sleep(3000);
			if(buttonAddress.equals("Si")) {
				click(loator_buttonAddress);
			}
			type(nickname, locator_nickname);*/
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
