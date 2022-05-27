package contact;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

public class contact_test {
	
	private WebDriver driver;
	contactPage ContactPage;
	

	@Before
	public void setUp() throws Exception {
		ContactPage = new contactPage(driver);
		driver = ContactPage.chromeDriverConnection();
		ContactPage.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		ContactPage.contactBuyNew(BasicData.CONTACT_1);
		ContactPage.formContact(BasicData.CUSTOMER_SUPPORT_LV_AM, BasicData.LIVIN_PLACE_V, BasicData.PLAN_TO_BUY_6);
		ContactPage.userBuilder(); 
	}

}
