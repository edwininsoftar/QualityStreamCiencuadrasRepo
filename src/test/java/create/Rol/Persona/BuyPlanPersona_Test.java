package create.Rol.Persona;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BuyPlanPersona_Test {

	private WebDriver driver;
	BuyPlanPagePersona createPropertyPage;

	@Before
	public void setUp() throws Exception {
		createPropertyPage = new BuyPlanPagePersona(driver);
		driver = createPropertyPage.chromeDriverConnection();
		createPropertyPage.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		createPropertyPage.buys();
		createPropertyPage.purchaseForm(); 
		createPropertyPage.load();
		createPropertyPage.payFinish();
		createPropertyPage.purchaseDetail();
	}

}
