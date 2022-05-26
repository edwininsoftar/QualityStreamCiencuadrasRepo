package buy.plan.rolPersona;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

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
		createPropertyPage.buys(BasicData.POPST_TYPE_T, BasicData.PLAN_TYPE_E);
		createPropertyPage.purchaseForm(BasicData.PROPERTY_TYPE_A, BasicData.TRANSACTION_TYPE_A, BasicData.MANAGEMENT_N, BasicData.STRATUM_3, BasicData.CONTACTME_W); 
		createPropertyPage.load(BasicData.PLAN_TYPE_E);
		createPropertyPage.payFinish(BasicData.DISCOUNT_CODE_NOT);
		createPropertyPage.purchaseDetail(BasicData.PAYMENT_TYPE_D, BasicData.DUES);
	}

}
