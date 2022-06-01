package create.property.rolAgente;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

public class CreatePropertyAgente_Test {
	
	private WebDriver driver;
	CreatePropertyAgentePage CreatePropertyAgentePage;
	
	@Before
	public void setUp() throws Exception {
		CreatePropertyAgentePage = new CreatePropertyAgentePage(driver);
		driver = CreatePropertyAgentePage.chromeDriverConnection();
		CreatePropertyAgentePage.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		CreatePropertyAgentePage.login();
		CreatePropertyAgentePage.propertyPublication(BasicData.AVCLL_CR, BasicData.LETTER_A, BasicData.BIS, BasicData.CARDINAL_POINT_S, BasicData.COMPLEMENT_A, BasicData.BUTTON_ADDRESS_N);
		CreatePropertyAgentePage.basicInformation(BasicData.TYPE_PARKING_1_N, BasicData.TYPE_PARKIKNG_2_N, BasicData.TYPE_PARKING_3_S, BasicData.TYPE_PARKING_4_N, BasicData.TYPE_PARKING_5_S, BasicData.COMPLEMENT_A, BasicData.TRANSACTION_TYPE_A, BasicData.STRATUM_2, BasicData.BUTTON_ADMINISTRATION_N, BasicData.BUTTON_BRAND_NEW_N);
		CreatePropertyAgentePage.load();
		CreatePropertyAgentePage.validation();
	}

}
