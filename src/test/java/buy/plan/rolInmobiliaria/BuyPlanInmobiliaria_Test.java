package buy.plan.rolInmobiliaria;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BuyPlanInmobiliaria_Test {
	
	private WebDriver driver;
	BuyPlanPageInmobiliaria createPurchasePageInmobiliaria;
	
	@Before
	public void setUp() throws Exception {
		createPurchasePageInmobiliaria = new BuyPlanPageInmobiliaria(driver);
		driver = createPurchasePageInmobiliaria.chromeDriverConnection();
		createPurchasePageInmobiliaria.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		createPurchasePageInmobiliaria.buys();
		createPurchasePageInmobiliaria.formMonths();
		createPurchasePageInmobiliaria.paymentSelection();
		createPurchasePageInmobiliaria.billingData();
		createPurchasePageInmobiliaria.payFinish();
		createPurchasePageInmobiliaria.purchaseDetail();
	}

}
