package create.property.rolInmobiliaria;

import org.openqa.selenium.By;

public class LocatorCreatePropertyInmobiliaria {

	// Flujo crear rol inmobiliaria 
	public static final By LOCATOR_X = By.xpath("//*[@id=\"mat-dialog-0\"]/app-register-code/div/div/button");
	public static final By LOCATOR_INTO = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	public static final By LOCATOR_USERNAME = By.xpath("//*[@id=\"mat-input-3\"]");
	public static final By LOCATOR_PASSWORD = By.cssSelector("input[formcontrolname=\"password\"]");
	public static final By LOCATOR_LOGIN = By.cssSelector("span[class=\"ng-star-inserted\"]");
	public static final By LOCATOR_USER = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]");
	public static final By LOCATOR_PUBLISHED_PROPERTY = By.linkText("Inmuebles publicados");
	public static final By LOCATOR_CREATE_PROPERTY = By.xpath("/html/body/div[3]/div/section/section/div/div[1]/div[2]/a[1]");
	//Publicación de un inmueble
	public static final By LOCATOR_REGISTRATION = By.id("inmueble-matricula_inmobiliaria");
	public static final By LOCATOR_OPEN_BUTTON = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[1]/div/div[1]/button");
	public static final By LOCATOR_DEPARTMENT = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[1]/div/div[1]/div/div/input");
	public static final By LOCATOR_OPEN_BUTTON_2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[2]/div/div[1]/button");
	public static final By LOCATOR_CITY = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[2]/div/div[1]/div/div/input");
	public static final By LOCATOR_OPEN_BUTTON_3 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[3]/div/div[1]/button");
	public static final By LOCATOR_LOCATION = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[3]/div/div[1]/div/div/input");
	public static final By LOCATOR_OPEN_BUTTON_4 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[4]/div/div[1]/button");
	public static final By LOCATOR_NEIGHBORHOOD = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[4]/div/div[1]/div/div/input");
	public static final By LOCATOR_OPEN_BUTTON_5 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[1]/div/button");
	public static final By LOCATOR_CARRERA = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[1]/div/div/ul/li[10]/a/span[1]");
	public static final By LOCATOR_CALLE = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[1]/div/div/ul/li[5]/a/span[1]");
	public static final By LOCATOR_AVCLL_2 = By.id("dir2");
	public static final By LOCATOR_A = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[3]/div/div/ul/li[2]/a/span[1]");
	public static final By LOCATOR_B = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[3]/div/div/ul/li[3]/a/span[1]");
	public static final By LOCATOR_OPEN_BUTTON_6 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[3]/div/button");
	public static final By LOCATOR_BIS = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[4]/div/div/ul/li[2]/a/span[1]");  
	public static final By LOCATOR_ESTE = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[4]/div/div/ul/li[3]/a/span[1]");
	public static final By LOCATOR_OPEN_BUTTON_7 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[4]/div/button");
	public static final By LOCATOR_A2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[5]/div/div/ul/li[2]/a/span[1]");
	public static final By LOCATOR_B2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[5]/div/div/ul/li[3]/a/span[1]");
	public static final By LOCATOR_OPEN_BUTTON_8 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[5]/div/button");
	public static final By LOCATOR_SUR = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[6]/div/div/ul/li[2]/a/span[1]");
	public static final By LOCATOR_NORTE = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[6]/div/div/ul/li[4]/a/span[1]");
	public static final By LOCATOR_OPEN_BUTTON_9 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[6]/div/button");
	public static final By LOCATOR_NUMBER = By.id("dir7");
	public static final By LOCATOR_A3 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[9]/div/div/ul/li[2]/a/span[1]");
	public static final By LOCATOR_B3 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[9]/div/div/ul/li[3]/a/span[1]");
	public static final By LOCATOR_OPEN_BUTTON_10 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[9]/div/button");
	public static final By LOCATOR_NUMBER_2 = By.id("dir9");
	public static final By LOCATOR_SUR_2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[11]/div/div/ul/li[2]/a/span[1]");
	public static final By LOCATOR_NORTE_2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[11]/div/div/ul/li[4]/a/span[1]");
	public static final By LOCATOR_OPEN_BUTTON_11 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[11]/div/button");
	public static final By LOCATOR_APARTMENT = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[14]/div/div/ul/li[2]/a/span[1]");
	public static final By LOCATOR_HOUSE = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[14]/div/div/ul/li[5]/a/span[1]");
	public static final By LOCATOR_OPEN_BUTTON_12 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[14]/div/button");
	public static final By LOCATOR_TEXT_COMPLEMENT = By.id("dir12");
	public static final By LOCATOR_APARTMENT_2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[16]/div/div/ul/li[2]/a/span[1]");
	public static final By LOCATOR_HOUSE_2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[16]/div/div/ul/li[5]/a/span[1]");
	public static final By LOCATOR_OPEN_BUTTON_13 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[16]/div/button");
	public static final By LOCATOR_TEXT_COMPLEMENT_2 = By.id("dir14");
	public static final By LOCATOR_BUTTON_ADDRESS = By.id("ocultar_direccion");
	public static final By LOCATOR_NICKNAME = By.id("inmueble-apodo");
	//Caracteristicas información basica
	public static final By LOCATOR_APARTMENT_3 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[1]/div/div[1]/div/ul/li[4]/a/span[1]");
	public static final By LOCATOR_HOUSE_3 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[1]/div/div[1]/div/ul/li[5]/a/span[1]");
	public static final By LOCATOR_OPEN_BUTTON_14 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[1]/div/div[1]/button");
	public static final By LOCATOR_SALE = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[2]/div/div[1]/div/ul/li[2]/a/span[1]");
	public static final By LOCATOR_RENT = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[2]/div/div[1]/div/ul/li[3]/a/span[1]");
	public static final By LOCATOR_SALE_ORENT = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[2]/div/div[1]/div/ul/li[4]/a/span[1]");
	public static final By LOCATOR_OPEN_BUTTON_15 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[2]/div/div[1]/button");
	//Arriendo
	public static final By LOCATOR_STRATUM_2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[5]/div/div[1]/div/ul/li[2]/a/span[1]");
	public static final By LOCATOR_STRATUM_3 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[5]/div/div[1]/div/ul/li[3]/a/span[1]");
	public static final By LOCATOR_OPEN_BUTTON_16 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[5]/div/div[1]/button");
	public static final By LOCATOR_AREA = By.id("inmueble-area_construida");
	public static final By LOCATOR_LOT_AREA = By.id("inmueble-area_lote");
	public static final By LOCATOR_ROOM = By.id("inmueble-num_habitaciones");
	public static final By LOCATOR_BATH = By.id("inmueble-num_banos");
	public static final By LOCATOR_PARKING = By.id("inmueble-num_parqueaderos");
	public static final By LOCATOR_INDEPENDENT = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[12]/div/div[1]/div/ul/li[1]/a/span[1]");
	public static final By LOCATOR_SERVITUDE = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[12]/div/div[1]/div/ul/li[2]/a/span[1]");
	public static final By LOCATOR_COVERED = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[12]/div/div[1]/div/ul/li[3]/a/span[1]");
	public static final By LOCATOR_DISCOVERED = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[12]/div/div[1]/div/ul/li[4]/a/span[1]");
	public static final By LOCATOR_COMMUNAL = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[12]/div/div[1]/div/ul/li[5]/a/span[1]");
	public static final By LOCATOR_OPEN_BUTTON_17 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[12]/div/div[1]/button");
	public static final By LOCATOR_VALUE_RENT = By.id("inmueble-canon_arrendamiento");
	public static final By LOCATOR_BUTTON_ADMINSTRATION = By.id("incluye_administracion");
	public static final By LOCATOR_MANAGEMENT_VALUE = By.id("inmueble-valor_administracion");
	public static final By LOCATOR_CODE = By.id("inmueble-codigo");
	public static final By LOCATOR_BUTTON_BRAND_NEW = By.id("para_estrenar");
	public static final By LOCATOR_ANTIQUITY = By.id("inmueble-antiguedad");
	public static final By LOCATOR_FLOOR = By.id("inmueble-num_piso");
	public static final By LOCATOR_ADDITIONAL_INFORMATION = By.id("inmueble-info_adicional");
	public static final By LOCATOR_BUTTON_SAVE = By.id("btn-publicar");
	public static final By LOCATOR_BUTTON_ACCEPT = By.id("botonMisPublicaciones");
	//Venta 
	public static final By LOCATOR_VALUE_SALE = By.id("inmueble-precio_venta");
	//Imagenes del inmueble
	public static final By LOCATOR_IMG = By.id("fotos");
	public static final By LOCATOR_COVER_PHOTO = By.name("fotoPortada");
	public static final By LOCATOR_ACCEPT = By.xpath("/html/body/div[17]/div[2]/div/div/div/div/div/div/div/div[4]/button");
	public static final By LOCATOR_UPLOAD_FILE = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[11]/div[4]/div[5]/div[4]/div[2]/a");
	//Comprobación 
	public static final By LOCATOR_CODE_PROPERTY = By.xpath("/html/body/div[3]/div/section/section/div/div[2]/div/article/div/div[4]/div/div[1]/div[2]/p[1]/span/strong");
	public static final By LOCATOR_TEXT_CODE = By.id("inmueblesearch-codigo");
	public static final By LOCATOR_SEARH = By.xpath("/html/body/div[3]/div/section/section/div/div[1]/div[6]/div[2]/a");
	public static final By LOCATOR_END_LINK = By.xpath("/html/body/div[3]/div/section/section/div/div[2]/div/article[1]/div/div[4]/div/header/div[1]/h4/a");
	public static final By LOCATOR_END_ROOM = By.xpath("/html/body/div[3]/div/section/section/div/div[2]/div/article/div/div[4]/div/div[2]/div/div[1]/p");
	public static final By LOCATOR_END_BATH = By.xpath("/html/body/div[3]/div/section/section/div/div[2]/div/article/div/div[4]/div/div[2]/div/div[2]/p");
	public static final By LOCATOR_END_M2 = By.xpath("/html/body/div[3]/div/section/section/div/div[2]/div/article/div/div[4]/div/div[2]/div/div[4]/p");
	
}
