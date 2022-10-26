package pageObjects.initializePageObjects;

import org.openqa.selenium.support.PageFactory;

import com.autorox.All_Pages.Login_Page;

import controllers.BaseMethod;

public class All_Page_Intializer extends BaseMethod {

	    public Login_Page LoginPageTest() {
	        return PageFactory.initElements(getWebDriver(), Login_Page.class);
	    }
	} 

