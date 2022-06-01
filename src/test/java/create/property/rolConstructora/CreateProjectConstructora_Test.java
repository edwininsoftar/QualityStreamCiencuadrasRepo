package create.property.rolConstructora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

public class CreateProjectConstructora_Test {
	
	private WebDriver driver;
	CreateProjectPageConstructora CreateProjectBuilder;

	@Before
	public void setUp() throws Exception {
		CreateProjectBuilder = new CreateProjectPageConstructora(driver);
		driver = CreateProjectBuilder.chromeDriverConnection();
		CreateProjectBuilder.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		CreateProjectBuilder.logIn();
		CreateProjectBuilder.publicProject(BasicData.STAGE_C, BasicData.PROJECT_PHASE_V, BasicData.STRATUM_3, BasicData.DEPARTMENT_C, BasicData.CITY_C, BasicData.LOCATION_C, BasicData.NEIGHBORHOOD_C, BasicData.DIRECTION_S, BasicData.CONDITION_A, BasicData.PAY_G);
		CreateProjectBuilder.characteristicsProperty(BasicData.TYPE_PROPERTY, BasicData.NUMBER_ROOM, BasicData.NUMBER_BATH, BasicData.NUMBER_PARKING, BasicData.SWIMNIG_N, BasicData.FLOOR_T, BasicData.TV_CIRCUIT_N, BasicData.SERVICE_ROOM_N, BasicData.SERVICE_BATH_N, BasicData.LAUNDRY_AREA_S, BasicData.FIREPLACE_N, BasicData.ALLOWS_PETS_S, BasicData.TYPE_STOVE, BasicData.TYPE_HEATER, BasicData.AIR_CONDITIONING_N, BasicData.TERRACE_AREA_N, BasicData.NUMBER_BALCONY, BasicData.NUMBER_DEPOSITS, BasicData.SOLD_OUT_N, BasicData.TYPE_PARKING, BasicData.KILN_N, BasicData.EXTRACTOR_N, BasicData.DISHWASHER_N);
		CreateProjectBuilder.salesRoom();
		CreateProjectBuilder.stages();
		CreateProjectBuilder.load();
		CreateProjectBuilder.validation();
	}

}
