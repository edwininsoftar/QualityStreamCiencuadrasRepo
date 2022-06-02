package create.property.rolPersona;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

public class CreatePropertyPerson_Test {
	
	private WebDriver driver;
	CreatePropertyPersonPage createPropertyPersonPage;

	@Before
	public void setUp() throws Exception {
		createPropertyPersonPage = new CreatePropertyPersonPage(driver);
		driver = createPropertyPersonPage.chromeDriverConnection();
		createPropertyPersonPage.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() { 
		createPropertyPersonPage.login();
		createPropertyPersonPage.published(BasicData.CHOOSE_POST_T, BasicData.PLAN_TYPE_E);   
		createPropertyPersonPage.purchaseForm(BasicData.PROPERTY_TYPE_A, BasicData.TRANSACCTION_TYPE_A, BasicData.MANAGEMENT_S, BasicData.STRATUM_3, BasicData.CONTACT_ME_W);
		createPropertyPersonPage.load(BasicData.PLAN_TYPE_E);
		createPropertyPersonPage.payFinish(BasicData.DISCOUNT_CODE_NOT);
		createPropertyPersonPage.purchaseDetail(BasicData.PAYMENT_TYPE_D, BasicData.TYPE_DOCUMENT_CC, BasicData.TYPE_PERSON_PN, BasicData.TYPE_BANK_COLOMBIA);
	}

}
