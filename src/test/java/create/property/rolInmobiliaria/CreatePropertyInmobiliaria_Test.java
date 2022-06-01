package create.property.rolInmobiliaria;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

public class CreatePropertyInmobiliaria_Test {
	
	private WebDriver driver;
	CreatePropertyInmobiliariaPage createPropertyInmobiliariaPage;

	@Before
	public void setUp() throws Exception {
		createPropertyInmobiliariaPage = new CreatePropertyInmobiliariaPage(driver);
		driver = createPropertyInmobiliariaPage.chromeDriverConnection();
		createPropertyInmobiliariaPage.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		createPropertyInmobiliariaPage.login();
		createPropertyInmobiliariaPage.propertyPublication(BasicData.AVCLL_CLL, BasicData.LETTER_A, BasicData.CARDINAL_POINT_S, BasicData.LETTER_A, BasicData.CARDINAL_POINT_S, BasicData.LETTER_B, BasicData.CARDINAL_POINT_N, BasicData.COMPLEMENT_A, BasicData.BUTTON_ADDRESS_N);
		createPropertyInmobiliariaPage.basicInformation(BasicData.COMPLEMENT_A, BasicData.TRANSACTION_TYPE_V, BasicData.STRATUM_3, BasicData.TYPE_PARKING_1_N, BasicData.TYPE_PARKIKNG_2_N, BasicData.TYPE_PARKING_3_N, BasicData.TYPE_PARKING_4_N, BasicData.TYPE_PARKING_5_N, BasicData.BUTTON_ADMINISTRATION_N, BasicData.BUTTON_BRAND_NEW_N);
		createPropertyInmobiliariaPage.load();
		createPropertyInmobiliariaPage.validation();
	}

}
