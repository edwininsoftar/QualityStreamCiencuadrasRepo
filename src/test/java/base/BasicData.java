package base;

public class BasicData extends LocatorProject{
	
	private String city = "Bogotá";//Ingrese la ciudad
	private String address = "Calle 184 # 20-51";//Ingrese la dirección
	private String addressAdd = "Segundo piso";// Agregue el complemento de dirección
	private String typeProperty = "Apartamento";//Casa, Apartamento
	private String transactionType = "Arriendo";//Arriendo, Venta
	private String stratum = "3";// estrato: 1,2,3,4,5,6
	private String area = "85.5";//Ingrese el area en metros cuadrados 
	private String antiquity = "10";//Ingrese la antiguedad del inmueble en años
	private int parkingLess = 0;//Ingrese el numero de clicks si desea disminuir la cantidad de parqueaderos
	private int parkingMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de parqueaderos 
	private int toiletsLess = 0;//Ingrese el numero de clicks si desea disminuir la cantidad de baños
	private int toiletsMore = 0; //Ingrese el numero de clicks si desea aumentar la cantidad de baños 
	private int roomsLess = 0;//Ingrese el numero de clicks si desea disminuir la cantidad de habitaciones
	private int roomsMore = 3;//Ingrese el numero de clicks si desea aunmentar la cantidad de habitaciones 
	private int balconiesMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de balcones
	private int terraceMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de balcones
	private int depositMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de depositos
	private int elevatorsMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de elevadores
	private String names = "Sebastian Andres";//Ingrese los nombres
	private String surnames = "Rodiguez Cepeda";//ingrese los apellidos
	private String identityDocument = "CC";//CC,NIT,CE
	private String idNumber = "1057585412";//Ingrese el numero de identificación
	private String email = "emaildepagoprueba@yopmail.com";// Ingrese el email 
	private String phone = "205814789";// Ingrese el numero de celular sin el numero 3
	private String acceptTerms = "Si";//Si, No //Ingrese si o no si hacepta los terminos 
	private String dataTreatment = "Si";// Si, No // Ingrese si o no si acepta el tratamiento de datos
	private String discountCode = "";// ingrese codigo de descuento
	private String paymentType = "Credito";// Debito, Credito, PSE, Davipuntos, Daviplata
	private String typeDocument = "CC";// CC, CE, CP, NIT, TI, SSE
	private String typePerson = "PN";//PN, PJ
	private String typeBank = "ITAU";//ITAU, BANCO CAJA SOCIAL
	private String holderName = "Sebastian Andres Rodiguez Cepeda"; // ingrese el numero del titular de la tarjeta
	private String cardNumber = "4575623182290326"; // Ingrese el numero de la tarjeta 
	private String monthCard = "12";// Ingrese el mes de la tarjeta 
	private String yearCard = "25";// Ingrese el año de la tarjeta 
	private String cvv = "123";// Ingrese el codigo cvv de la tarjeta
	private String dues = "5"; // Ingrese el numero de cuotas campo obligatorio si el tipo de tarjeta de credito
	private String documentNumber = "1057595824";// Ingrese en numero de documento formulario daviplata

	public String getCity() {
		return city;
	}
	public String getAddress() {
		return address;
	}
	public String getAddressAdd() {
		return addressAdd;
	}
	public String getTypeProperty() {
		return typeProperty;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public String getStratum() {
		return stratum;
	}
	public String getArea() {
		return area;
	}
	public String getAntiquity() {
		return antiquity;
	}
	public int getParkingLess() {
		return parkingLess;
	}
	public int getParkingMore() {
		return parkingMore;
	}
	public int getToiletsLess() {
		return toiletsLess;
	}
	public int getToiletsMore() {
		return toiletsMore;
	}
	public int getRoomsLess() {
		return roomsLess;
	}
	public int getRoomsMore() {
		return roomsMore;
	}
	public int getBalconiesMore() {
		return balconiesMore;
	}
	public int getTerraceMore() {
		return terraceMore;
	}
	public int getDepositMore() {
		return depositMore;
	}
	public int getElevatorsMore() {
		return elevatorsMore;
	}
	public String getNames() {
		return names;
	}
	public String getSurnames() {
		return surnames;
	}
	public String getIdentityDocument() {
		return identityDocument;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getAcceptTerms() {
		return acceptTerms;
	}
	public String getDataTreatment() {
		return dataTreatment;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public String getTypeDocument() {
		return typeDocument;
	}
	public String getTypePerson() {
		return typePerson;
	}
	public String getTypeBank() {
		return typeBank;
	}
	public String getHolderName() {
		return holderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public String getMonthCard() {
		return monthCard;
	}
	public String getYearCard() {
		return yearCard;
	}
	public String getCvv() {
		return cvv;
	}
	public String getDues() {
		return dues;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	
	
	
}
