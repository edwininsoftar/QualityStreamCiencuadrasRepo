package contact.buy.used;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

public class contactBuyUsed_Test {
	
	private WebDriver driver;
	contactBuyUsedPage ContactBuyUsedPage;

	@Before
	public void setUp() throws Exception {
		ContactBuyUsedPage = new contactBuyUsedPage(driver);
		driver = ContactBuyUsedPage.chromeDriverConnection();
		ContactBuyUsedPage.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		ContactBuyUsedPage.contactBuyUsed(BasicData.RESULTS_CONTACT_C, BasicData.CONTACT_1, BasicData.LETTER_1);
		ContactBuyUsedPage.formContact();
		ContactBuyUsedPage.userRealEstate();
	}

}
