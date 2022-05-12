package service.tools.calculatePrice;

import org.openqa.selenium.By;

public class LocatorProject {
	
	//Formulario ubicación del inmueble
	By locator_ButtonCalculaPrice = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[1]/div/div[2]/div/div[2]/a");
	By locator_city = By.id("mat-input-0");
	By locator_address = By.id("mat-input-1");
	By locator_addressAdd = By.id("mat-input-2");
	By locator_checkMap = By.id("mat-checkbox-1");
	By locator_button_continue = By.cssSelector("button[class=\"btn button rounded secondary\"]");
	
	public By getLocator_ButtonCalculaPrice() {
		return locator_ButtonCalculaPrice;
	}
	public void setLocator_ButtonCalculaPrice(By locator_ButtonCalculaPrice) {
		this.locator_ButtonCalculaPrice = locator_ButtonCalculaPrice;
	}
	public By getLocator_city() {
		return locator_city;
	}
	public void setLocator_city(By locator_city) {
		this.locator_city = locator_city;
	}
	public By getLocator_address() {
		return locator_address;
	}
	public void setLocator_address(By locator_address) {
		this.locator_address = locator_address;
	}
	public By getLocator_addressAdd() {
		return locator_addressAdd;
	}
	public void setLocator_addressAdd(By locator_addressAdd) {
		this.locator_addressAdd = locator_addressAdd;
	}
	public By getLocator_checkMap() {
		return locator_checkMap;
	}
	public void setLocator_checkMap(By locator_checkMap) {
		this.locator_checkMap = locator_checkMap;
	}
	public By getLocator_button_continue() {
		return locator_button_continue;
	}
	public void setLocator_button_continue(By locator_button_continue) {
		this.locator_button_continue = locator_button_continue;
	}
	
}
