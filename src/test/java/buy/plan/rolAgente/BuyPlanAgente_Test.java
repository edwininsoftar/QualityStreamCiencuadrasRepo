package buy.plan.rolAgente;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

public class BuyPlanAgente_Test {
	private WebDriver driver;
	BuyPlanPageAgente buyPlanPageAgente;

	@Before
	public void setUp() throws Exception {
		buyPlanPageAgente = new BuyPlanPageAgente(driver);
		driver = buyPlanPageAgente.chromeDriverConnection();
		buyPlanPageAgente.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test()throws InterruptedException {
		buyPlanPageAgente.buys();
		buyPlanPageAgente.formMonths(BasicData.PLAN_XS,BasicData.MONTHS_PLAN_3);
		buyPlanPageAgente.paymentSelection(BasicData.ROUTE_1, BasicData.PHOTO_TAKING_1, BasicData.PHOTO_UPLOAD_1, BasicData.FEATURED_1, BasicData.PROMOTED_1, BasicData.ONLINE_1);
		buyPlanPageAgente.finalPaymentForm(BasicData.TYPE_DOCUMENT_CC , BasicData.EMAIL_DIAN_SI, BasicData.REGIME_TYPE_R , BasicData.RETENTION_AGENT_NO,  BasicData.FISCAL_RESPONSIBILITY_N, BasicData.ICA_WITH_HOLDING_N, BasicData.IVA_WITH_HOLDING_S);
		buyPlanPageAgente.payFinish(BasicData.DISCOUNT_CODE_NOT);
		buyPlanPageAgente.purchaseDetail(BasicData.PAYMENT_TYPE_C, BasicData.TYPE_DOCUMENT_CC, BasicData.TYPE_PERSON_PN, BasicData.TYPE_BANK_BANCOLOMBIA);
	}

}
