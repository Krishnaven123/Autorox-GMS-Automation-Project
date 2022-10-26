package com.autorox.All_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import controllers.BaseMethod;

public class Login_Page extends BaseMethod {

	@FindBy(id = "logo1")
	private WebElement loginPageautoroxLogo;

	@FindBy(xpath = "//div[@class='col-sm-6 col-xs-12']/p")
	private static WebElement login_HeaderText;

	@FindBy(id = "userName_login")
	private WebElement username_Field;

	@FindBy(id = "password_login")
	private WebElement password_Field;

	@FindBy(xpath = "//*[text()='Continue']")
	private WebElement login_Btn;

	@FindBy(xpath = "//a[text()='I Forgot']")
	private WebElement forgotPassword;

	@FindBy(xpath = "//label[@for='checkboxSuccess']")
	private WebElement rememberPassword;
	@FindBy(xpath = "//input[@id='checkboxSuccess']")
	private WebElement CheckBox;
	
	@FindBy(className = "error_msg")
	private WebElement error_Msg;

	@FindBy(xpath = "//h3[text()='Sign In']")
	private WebElement signInLabel;

	@FindBy(xpath = "(//label[contains(text(),'Username')])[1]")
	private WebElement login_usernameLabel;

	@FindBy(xpath = "(//label[text()='Password'])[1]")
	private WebElement login_passwordLabel;
	
	@FindBy(xpath = "//div[@class='error_msg']")
	private static WebElement Login_Page_Alerts;
	
	@FindBy(xpath = "//div[@class='mega_menu dropdown keep-inside-clicks-open']")
	private static WebElement Logout_Popup;
	
	@FindBy(xpath = "//button[contains(text(),'Logout')]")
	private static WebElement Logout;
	
	public Login_Page verifyAllElements() throws InterruptedException {
		Thread.sleep(5000);
    String Element=getWebDriver().getTitle();
    validateResults(Element, "Autorox");
	boolean Element1=loginPageautoroxLogo.isDisplayed();
	validateResults(Element1, true);
	String Element2=login_HeaderText.getText();
	validateResults(Element2, "Guaranteed to Improve your Garage's Revenues, Profits and Cashflow");
	String Element3=signInLabel.getText();
	validateResults(Element3, "Sign In");
	String Element4=login_usernameLabel.getText();
	validateResults(Element4, "Username");
	String Element5=login_passwordLabel.getText();
	validateResults(Element5, "Password");
	String Element6=forgotPassword.getText();
	validateResults(Element6, "I Forgot");
	String Element7= rememberPassword.getText();
	validateResults(Element7, "Remember Password");
	rememberPassword.click();
	boolean Element8=CheckBox.isSelected();
	validateResults(Element8, true);
	return this;
	}
	
	public Login_Page InValid_Login() {
		username_Field.sendKeys("krishna@123");
		password_Field.sendKeys("Admin@3214");
		login_Btn.click();
		String Alert=Login_Page_Alerts.getText();
		validateResults(Alert,"Invalid username and password.");
		
		return this;
	}
	public Login_Page Licence_expaired_Login() {
		username_Field.sendKeys("ax118");
		password_Field.sendKeys("Admin@123");
		login_Btn.click();
		String Alert=Login_Page_Alerts.getText();
		validateResults(Alert,"Your licence expired!");
		return this;
	}
	public Login_Page Licence_InActive_Login() {
		username_Field.sendKeys("mamatha");
		password_Field.sendKeys("n^yNB1uu");
		login_Btn.click();
		String Alert=Login_Page_Alerts.getText();
		validateResults(Alert,"Your licence is not active!");
		return this;
	}
	
	public void Valid_Login(String UserName, String Password) {
		username_Field.sendKeys(UserName);
		password_Field.sendKeys(Password);
		login_Btn.click();
		
	}
	
	public Login_Page Application_Logout() {
		Logout_Popup.click();
		Logout.click();
		String Alert=Login_Page_Alerts.getText();
		validateResults(Alert,"You've logged out successfully!");
		return this;
	}
	
	public Login_Page UserRole_Name(String RoleName) {
		String query = driver.findElement(By.id("role")).getAttribute("value");
		validateResults(query, RoleName);
		return this;
		
	}
	
}
