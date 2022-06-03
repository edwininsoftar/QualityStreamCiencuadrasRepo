package create.property.rolConstructora;

import org.openqa.selenium.By;

public class LocatorCreateProjectConstructora {

	//localizadores de logueo hasta llegar a crear un proyecto 
	public static final By LOCATOR_X = By.xpath("//*[@id=\"mat-dialog-0\"]/app-register-code/div/div/button");
	public static final By LOCATOR_INTO = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	public static final By LOCATOR_USERNAME = By.xpath("//*[@id=\"mat-input-3\"]");
	public static final By LOCATOR_PASSWORD = By.cssSelector("input[formcontrolname=\"password\"]");
	public static final By LOCATOR_LOGIN = By.cssSelector("span[class=\"ng-star-inserted\"]");
	public static final By LOCATOR_MENU = By.cssSelector("div[class=\"circle-name\"]");
	public static final By LOCATOR_PUBLISHED_PROPERTY = By.linkText("Proyectos publicados");
	public static final By LOCATOR_CREATE_PROJECT = By.linkText("CREAR PROYECTO");
	//localizadores para crear el proyecto
	public static final By LOCATOR_NAME_PROJECT = By.id("nombreProyecto");
	public static final By LOCATOR_STAGE = By.id("select_etapa_cabecera");
	public static final By LOCATOR_PROJECT_PHASE = By.id("fase_proyecto");
	public static final By LOCATOR_STRATUM = By.id("input_estrato");
	public static final By LOCATOR_DEPARMENT = By.id("select_departamento_publicador");
	public static final By LOCATOR_CITY = By.id("select_ciudad_publicador");
	public static final By LOCATOR_LOCATION = By.id("select_localidad_publicador");
	public static final By LOCATOR_NEIGHBORHOOD = By.id("select_barrio_publicador");
	public static final By LOCATOR_DIRECTION = By.id("select_mostrar_direccion_publicador");
	public static final By LOCATOR_DATE = By.id("input_fecha_entrega");
	public static final By LOCATOR_CONDITION = By.id("select_estado");
	public static final By LOCATOR_PAY = By.id("select_membresia");
	public static final By LOCATOR_DIRECTION_COMPLIT = By.id("publicador_direccion");
	//Caracteristicas de los tipos de inmuebles
	public static final By LOCATOR_TYPE_PROPERTY = By.id("select_tipo_proyecto");
	public static final By LOCATOR_NAME_TYPE_PROPERTY = By.id("inmueble-nombre_proyecto_1");
	public static final By LOCATOR_PRICE = By.id("inmueble-precio_desde_1");
	public static final By LOCATOR_NUMBER_ROOM = By.id("select_num_habitaciones_1");
	public static final By LOCATOR_NUMBER_BATH = By.id("select_num_banos_1");
	public static final By LOCATOR_NUMBER_PARKING = By.id("select_num_parqueaderos_1");
	public static final By LOCATOR_SWIMMING = By.id("select_num_piscinas_privadas_1");
	public static final By LOCATOR_FLOOR = By.id("inmueble_tipo_piso_1");
	public static final By LOCATOR_VALUE_MANAGEMENT = By.id("inmueble-valor_administracion_1");
	public static final By LOCATOR_TV_CIRCUIT = By.id("inmueble_cir_cerr_tv_1");
	public static final By LOCATOR_SERVICE_ROOM = By.id("habitacion_servicio_1");
	public static final By LOCATOR_SERVICE_BATH = By.id("banio_servicio_1");
	public static final By LOCATOR_LAUNDRY_AREA = By.id("zona_lavanderia_1");
	public static final By LOCATOR_FIREPLACE = By.id("select_con_chimenea_1");
	public static final By LOCATOR_ALLOWS_PETS = By.id("select_permite_mascotas_1");
	public static final By LOCATOR_TYPE_STOVE = By.id("inmueble_tipo_estufa_1");
	public static final By LOCATOR_TYPE_HEATER = By.id("inmueble_tipo_calentador_1");
	public static final By LOCATOR_AIR_CONDITIONING = By.id("select_num_aires_acondicionados_1");
	public static final By LOCATOR_TERRACE_AREA = By.id("select_zona_terraza_1");
	public static final By LOCATOR_NUMBER_TERRACE = By.id("select_numero_terraza_1");
	public static final By LOCATOR_BUIL_AREA = By.id("inmueble_area_privada_1");
	public static final By LOCATOR_TOTAL_AREA = By.id("inmueble_area_construida_1");
	public static final By LOCATOR_NUMBER_BALCONY = By.id("select_numero_balcones_1");
	public static final By LOCATOR_NUMBER_DEPOSITS = By.id("select_numero_depositos_1");
	public static final By LOCATOR_DELIVER_DATE = By.id("inmueble_fecha_entrega_1");
	public static final By LOCATOR_SOLD_OUT = By.id("select_vendido_si_no_1");
	public static final By LOCATOR_TYPE_PARKING = By.id("select_tipo_parqueadero_1");
	public static final By LOCATOR_UNITS_AVAILABLE = By.id("select_unidades_disponibles_1");
	public static final By LOCATOR_HOME_APPLIANCES = By.xpath("/html/body/div[3]/div/form/div/div[1]/div[1]/div[1]/div[10]/div/div[33]/div/div/div/button");
	public static final By LOCATOR_KILN = By.xpath("/html/body/div[3]/div/form/div/div[1]/div[1]/div[1]/div[10]/div/div[33]/div/div/div/div/ul/li[1]");
	public static final By LOCATOR_EXTRACTOR = By.xpath("/html/body/div[3]/div/form/div/div[1]/div[1]/div[1]/div[10]/div/div[33]/div/div/div/div/ul/li[2]");
	public static final By LOCATOR_DISHWASHER = By.xpath("/html/body/div[3]/div/form/div/div[1]/div[1]/div[1]/div[10]/div/div[33]/div/div/div/div/ul/li[3]");
	// localizadores sala de ventas
	public static final By LOCATOR_NAME_ROOM = By.id("nombre_sala_1");
	public static final By LOCATOR_ROOM_ADDRESS = By.id("sala_direccion_1");
	public static final By LOCATOR_CALL_CONTACT_NUMBER = By.id("sala_ventas_telefono_fijo_1");
	public static final By LOCATOR_EMAIL_ROOM = By.id("email_sala_1");
	public static final By LOCATOR_WHATSAPP_CONTACT_NUMBER = By.id("sala_ventas_num_celular_1");
	public static final By LOCATOR_SELLER = By.id("sala_ventas_vendedor_nombre_1");
	//localizadores etapa
	public static final By LOCATOR_STAGE_1 = By.id("etapa_nombre_1");
	public static final By LOCATOR_OPENING_DATE = By.id("inicio_etapa_1");
	public static final By LOCATOR_CLOSING_DATE = By.id("finalizacion_etapa_1");
	//localizadores informacion adicional
	public static final By LOCATOR_ADDITIONAL_INFORMATION = By.id("proyecto-info_adicional");
	public static final By LOCATOR_BUTTON_SAVE = By.id("btn_guardar_publicador");
	//Imagenes del inmueble
	public static final By LOCATOR_IMG_PROYECT = By.id("file_cabecera");
	public static final By LOCATOR_UPLOAD_FILE_PROJECT = By.xpath("//*[@id=\"container_images_cabecera\"]/div[4]/div[4]/div[2]/a");
	public static final By LOCATOR_IMG_PROPERTY = By.id("file_inmueblestipo_1");
	public static final By LOCATOR_UPLOAD_FILE_PROPERTY = By.xpath("//*[@id=\"container_images_tipoinmueble_1\"]/div/div[4]/div[2]/a");
	public static final By LOCATOR_IMG_LOGO_PROPERTY = By.id("file_logo_proyecto1");
	public static final By LOCATOR_UPLOAD_FILE_LOGO_PROPERTY = By.xpath("//*[@id=\"container_logo_proyecto1\"]/div/div[4]/div[2]/a");
	public static final By LOCATOR_COVER_PHOTO = By.name("fotoPortada_project");
	public static final By LOCATOR_SAVE = By.id("btn_editar_publicador");
	// Verificación
	public static final By LOCATOR_NAME_PROJECT_O = By.linkText("OASIS - TABIO");
	public static final By LOCATOR_AREA = By.xpath("/html/body/app-root/app-estate-detail/div/div[1]/div[2]/div[2]/div[1]/app-detail-type-of/div/div/mat-accordion/div/mat-expansion-panel/div/div/ul/li[2]");
	public static final By LOCATOR_ROOM = By.xpath("/html/body/app-root/app-estate-detail/div/div[1]/div[2]/div[2]/div[1]/app-detail-type-of/div/div/mat-accordion/div/mat-expansion-panel/div/div/ul/li[4]");
	public static final By LOCATOR_BATH = By.xpath("/html/body/app-root/app-estate-detail/div/div[1]/div[2]/div[2]/div[1]/app-detail-type-of/div/div/mat-accordion/div/mat-expansion-panel/div/div/ul/li[5]");
	
}
