package buy.plan.rolInmobiliaria;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

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
		createPurchasePageInmobiliaria.formMonths(BasicData.PLAN_P_BASE, BasicData.MONTHS_PLAN_M3);
		createPurchasePageInmobiliaria.paymentSelection(BasicData.ROUTE_1, BasicData.PHOTO_TAKING_1, BasicData.PHOTO_UPLOAD_1, BasicData.FEATURED_1, BasicData.PROMOTED_1, BasicData.ONLINE_1);
		createPurchasePageInmobiliaria.billingData(BasicData.TYPE_DOCUMENT_NIT ,BasicData.EMAIL_DIAN_NO, BasicData.REGIME_TYPE_R, BasicData.RETENTION_AGENT_NO, BasicData.ICA_WITH_HOLDING_N, BasicData.IVA_WITH_HOLDING_S, BasicData.FISCAL_RESPONSIBILITY_A);
		createPurchasePageInmobiliaria.payFinish(BasicData.DISCOUNT_CODE_NOT);
		createPurchasePageInmobiliaria.purchaseDetail(BasicData.PAYMENT_TYPE_C, BasicData.TYPE_DOCUMENT_CC, BasicData.TYPE_BANK_BANCOLOMBIA);
	}

}
