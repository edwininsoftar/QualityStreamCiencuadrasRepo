package buy.plan.rolAgente;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

public class BuyPlanAgente_Test {
	private WebDriver driver;
	BuyPlanPageAgente CreatePurchasePageAgente;

	@Before
	public void setUp() throws Exception {
		CreatePurchasePageAgente = new BuyPlanPageAgente(driver);
		driver = CreatePurchasePageAgente.chromeDriverConnection();
		CreatePurchasePageAgente.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test()throws InterruptedException {
		CreatePurchasePageAgente.buys();
		CreatePurchasePageAgente.formMonths(BasicData.PLAN_XS,BasicData.MONTHS_PLAN_3);
		CreatePurchasePageAgente.paymentSelection(BasicData.ROUTE_1, BasicData.PHOTO_TAKING_1, BasicData.PHOTO_UPLOAD_1, BasicData.FEATURED_1, BasicData.PROMOTED_1, BasicData.ONLINE_1);
		CreatePurchasePageAgente.payFinish(BasicData.DISCOUNT_CODE_NOT);
		CreatePurchasePageAgente.purchaseDetail(BasicData.PAYMENT_TYPE_D, BasicData.TYPE_DOCUMENT_CC, BasicData.TYPE_PERSON_PN, BasicData.TYPE_BANK_BANCOLOMBIA);
	}

}
