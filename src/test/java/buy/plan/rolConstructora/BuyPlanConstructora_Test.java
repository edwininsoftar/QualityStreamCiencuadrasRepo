package buy.plan.rolConstructora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BuyPlanConstructora_Test {
	
	private WebDriver driver;
	BuyPlanPageConstructora createPurchasePageConstructora;
	
	@Before
	public void setUp() throws Exception {
		createPurchasePageConstructora = new BuyPlanPageConstructora(driver);
		driver = createPurchasePageConstructora.chromeDriverConnection();
		createPurchasePageConstructora.visit("https://qa.ciencuadras.com/"); 
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		createPurchasePageConstructora.buys();
		createPurchasePageConstructora.paymentSelection();
		createPurchasePageConstructora.finalPaymentForm();
		createPurchasePageConstructora.payFinish();
		createPurchasePageConstructora.purchaseDetail();
	}

}
