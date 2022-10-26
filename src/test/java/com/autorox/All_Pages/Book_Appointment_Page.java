package com.autorox.All_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Book_Appointment_Page {
	
	@FindBy(xpath = "//div/span/img")
	private WebElement CalendarIcon;
	@FindBy(xpath = "//div[@class='title nav-link']/span[2]")
	private WebElement CalendarLabel;
	@FindBy(xpath = "//div[@class='v-toolbar__content']//button[1]")
	private WebElement TodayButton;
	@FindBy(xpath = "(//div[@class='v-toolbar__content']//i)[1]")
	private WebElement BackwordDatesArrow;
	@FindBy(xpath = "(//div[@class='v-toolbar__content']//i)[2]")
	private WebElement Forward_Dates_Arrow;
	@FindBy(xpath = "//div[contains(text(),'October 2022')]")
	private WebElement Dispalyed_Month_Year;
	@FindBy(xpath = "//button[@class='search_btn']")
	private WebElement Search_Icon;
	@FindBy(xpath = "//button[@class='v-btn v-btn--outlined theme--light "
			+ "v-size--default grey--text text--darken-2']")
	private WebElement Page_View_DropDown;
	@FindBy(xpath = "//button//Span[@class='v-btn__content']/span")
	private WebElement Page_view_Label;
	@FindBy(xpath = "(//button//Span[@class='v-btn__content']/i)[3]")
	private WebElement Page_View_DropDown_Icon;
	@FindBy(xpath = "//div[@class='v-list-item__title']")
	private WebElement PV_DropDown_Options;
	@FindBy(xpath = "//div/span[contains(text(),'Appointment')]")
	private WebElement Appointment_Button;
	@FindBy(xpath = "//div[contains(text(),'Working Staff')]")
	private WebElement Working_Staff_Label;
	@FindBy(xpath = "//div[@class='ui fluid search selection dropdown']/i")
	private WebElement Working_Staff_DropDown;
	@FindBy(xpath = "//div[@class='menu visible']/div")
	private WebElement Working_Staff_List;
	@FindBy(xpath = "//button[contains(text(),'Add New')]")
	private WebElement Add_New_Button;
	@FindBy(xpath = "//div/input[@class='form-control']")
	private WebElement Main_Search_Bar;
	@FindBy(xpath = "//div[contains(text(),'Sun')]")
	private WebElement Day_Sun_Label;
	@FindBy(xpath = "//div[contains(text(),'Mon')]")
	private WebElement Day_Mon_Label;
	@FindBy(xpath = "//div[contains(text(),'Tue')]")
	private WebElement Day_Tue_Label;
	@FindBy(xpath = "//div[contains(text(),'Wed')]")
	private WebElement Day_Wed_Label;
	@FindBy(xpath = "//div[contains(text(),'Thu')]")
	private WebElement Day_Thu_Label;
	@FindBy(xpath = "//div[contains(text(),'Fri')]")
	private WebElement Day_Fri_Label;
	@FindBy(xpath = "//div[contains(text(),'Sat')]")
	private WebElement Day_Sat_Label;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

