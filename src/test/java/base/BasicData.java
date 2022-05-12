package base;

import service.tools.calculatePrice.LocatorProject;

public class BasicData extends LocatorProject{
	
	String city = "Bogotá";//Ingrese la ciudad
	String address = "Calle 184 # 20-51";//Ingrese la dirección
	String addressAdd = "Segundo piso";// Agregue el complemento de dirección
	String typeProperty = "Apartamento";//Casa, Apartamento
	String transactionType = "Arriendo";//Arriendo, Venta
	String stratum = "3";// estrato: 1,2,3,4,5,6
	String area = "85.5";//Ingrese el area en metros cuadrados 
	String antiquity = "10";//Ingrese la antiguedad del inmueble en años
	int parkingLess = 0;//Ingrese el numero de clicks si desea disminuir la cantidad de parqueaderos
	int parkingMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de parqueaderos 
	int toiletsLess = 0;//Ingrese el numero de clicks si desea disminuir la cantidad de baños
	int toiletsMore = 0; //Ingrese el numero de clicks si desea aumentar la cantidad de baños 
	int roomsLess = 0;//Ingrese el numero de clicks si desea disminuir la cantidad de habitaciones
	int roomsMore = 3;//Ingrese el numero de clicks si desea aunmentar la cantidad de habitaciones 
	int balconiesMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de balcones
	int terraceMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de balcones
	int depositMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de depositos
	int elevatorsMore = 0;//Ingrese el numero de clicks si desea aumentar la cantidad de elevadores
	String names = "Sebastian Andres";//Ingrese los nombres
	String surnames = "Rodiguez Cepeda";//ingrese los apellidos
	String identityDocument = "CC";//CC,NIT,CE
	String idNumber = "1057585412";//Ingrese el numero de identificación
	String email = "emaildepagoprueba@yopmail.com";// Ingrese el email 
	String phone = "205814789";// Ingrese el numero de celular sin el numero 3
	String acceptTerms = "Si";//Si, No //Ingrese si o no si hacepta los terminos 
	String dataTreatment = "Si";// Si, No // Ingrese si o no si acepta el tratamiento de datos
	String discountCode = "";// ingrese codigo de descuento
	String paymentType = "Credito";// Debito, Credito, PSE, Davipuntos, Daviplata
	String typeDocument = "CC";// CC, CE, CP, NIT, TI, SSE
	String typePerson = "PN";//PN, PJ
	String typeBank = "ITAU";//ITAU, BANCO CAJA SOCIAL
	String holderName = "Sebastian Andres Rodiguez Cepeda"; // ingrese el numero del titular de la tarjeta
	String cardNumber = "4575623182290326"; // Ingrese el numero de la tarjeta 
	String monthCard = "12";// Ingrese el mes de la tarjeta 
	String yearCard = "25";// Ingrese el año de la tarjeta 
	String cvv = "123";// Ingrese el codigo cvv de la tarjeta
	String dues = "5"; // Ingrese el numero de cuotas campo obligatorio si el tipo de tarjeta de credito
	String documentNumber = "1057595824";// Ingrese en numero de documento formulario daviplata
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressAdd() {
		return addressAdd;
	}
	public void setAddressAdd(String addressAdd) {
		this.addressAdd = addressAdd;
	}
	public String getTypeProperty() {
		return typeProperty;
	}
	public void setTypeProperty(String typeProperty) {
		this.typeProperty = typeProperty;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getStratum() {
		return stratum;
	}
	public void setStratum(String stratum) {
		this.stratum = stratum;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAntiquity() {
		return antiquity;
	}
	public void setAntiquity(String antiquity) {
		this.antiquity = antiquity;
	}
	public int getParkingLess() {
		return parkingLess;
	}
	public void setParkingLess(int parkingLess) {
		this.parkingLess = parkingLess;
	}
	public int getParkingMore() {
		return parkingMore;
	}
	public void setParkingMore(int parkingMore) {
		this.parkingMore = parkingMore;
	}
	public int getToiletsLess() {
		return toiletsLess;
	}
	public void setToiletsLess(int toiletsLess) {
		this.toiletsLess = toiletsLess;
	}
	public int getToiletsMore() {
		return toiletsMore;
	}
	public void setToiletsMore(int toiletsMore) {
		this.toiletsMore = toiletsMore;
	}
	public int getRoomsLess() {
		return roomsLess;
	}
	public void setRoomsLess(int roomsLess) {
		this.roomsLess = roomsLess;
	}
	public int getRoomsMore() {
		return roomsMore;
	}
	public void setRoomsMore(int roomsMore) {
		this.roomsMore = roomsMore;
	}
	public int getBalconiesMore() {
		return balconiesMore;
	}
	public void setBalconiesMore(int balconiesMore) {
		this.balconiesMore = balconiesMore;
	}
	public int getTerraceMore() {
		return terraceMore;
	}
	public void setTerraceMore(int terraceMore) {
		this.terraceMore = terraceMore;
	}
	public int getDepositMore() {
		return depositMore;
	}
	public void setDepositMore(int depositMore) {
		this.depositMore = depositMore;
	}
	public int getElevatorsMore() {
		return elevatorsMore;
	}
	public void setElevatorsMore(int elevatorsMore) {
		this.elevatorsMore = elevatorsMore;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getSurnames() {
		return surnames;
	}
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	public String getIdentityDocument() {
		return identityDocument;
	}
	public void setIdentityDocument(String identityDocument) {
		this.identityDocument = identityDocument;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAcceptTerms() {
		return acceptTerms;
	}
	public void setAcceptTerms(String acceptTerms) {
		this.acceptTerms = acceptTerms;
	}
	public String getDataTreatment() {
		return dataTreatment;
	}
	public void setDataTreatment(String dataTreatment) {
		this.dataTreatment = dataTreatment;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getTypeDocument() {
		return typeDocument;
	}
	public void setTypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}
	public String getTypePerson() {
		return typePerson;
	}
	public void setTypePerson(String typePerson) {
		this.typePerson = typePerson;
	}
	public String getTypeBank() {
		return typeBank;
	}
	public void setTypeBank(String typeBank) {
		this.typeBank = typeBank;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getMonthCard() {
		return monthCard;
	}
	public void setMonthCard(String monthCard) {
		this.monthCard = monthCard;
	}
	public String getYearCard() {
		return yearCard;
	}
	public void setYearCard(String yearCard) {
		this.yearCard = yearCard;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getDues() {
		return dues;
	}
	public void setDues(String dues) {
		this.dues = dues;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	
	
	
	
}
