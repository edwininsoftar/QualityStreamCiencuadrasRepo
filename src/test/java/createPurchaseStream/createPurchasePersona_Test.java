package createPurchaseStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class createPurchasePersona_Test {
	

	private WebDriver driver;
	CreatePurchasePagePersona CreatePurchasePagePersona;

	@Before
	public void setUp() throws Exception {
		CreatePurchasePagePersona = new CreatePurchasePagePersona(driver);
		driver = CreatePurchasePagePersona.chromeDriverConnection();
		CreatePurchasePagePersona.visit("https://dev.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		CreatePurchasePagePersona.buys();
		CreatePurchasePagePersona.purchaseForm();
		CreatePurchasePagePersona.load();
		CreatePurchasePagePersona.purchaseDetail();
	}

}
