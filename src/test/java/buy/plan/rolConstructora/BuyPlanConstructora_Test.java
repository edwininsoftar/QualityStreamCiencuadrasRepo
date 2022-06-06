package buy.plan.rolConstructora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

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
		createPurchasePageConstructora.buys(BasicData.TYPE_PLAN_PS, BasicData.PROYECT_NUMBER_6);
		createPurchasePageConstructora.paymentSelection(BasicData.ROUTE_1, BasicData.PHOTO_TAKING_1, BasicData.PHOTO_UPLOAD_1, BasicData.FEATURED_1, BasicData.PROMOTED_1, BasicData.ONLINE_1);
		createPurchasePageConstructora.finalPaymentForm(BasicData.TYPE_DOCUMENT_NIT ,BasicData.EMAIL_DIAN_SI, BasicData.REGIME_TYPE_R, BasicData.RETENTION_AGENT_NO, BasicData.IVA_WITH_HOLDING_S, BasicData.ICA_WITH_HOLDING_N, BasicData.FISCAL_RESPONSIBILITY_AU);
		createPurchasePageConstructora.payFinish(BasicData.DISCOUNT_CODE_NOT);
		createPurchasePageConstructora.purchaseDetail(BasicData.PAYMENT_TYPE_D, BasicData.TYPE_DOCUMENT_CC, BasicData.TYPE_PERSON_PN, BasicData.TYPE_BANK_BANCOLOMBIA);
	}

}
