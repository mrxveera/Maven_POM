package org.pom_findElements;

import org.baseCls.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage extends BaseClass {

	public FacebookLoginPage() {
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(id = "email")
	private WebElement txtUserName;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {    
		return txtPassWord;
	}

	public WebElement getLoginclk() {
		return loginclk;
	}

	@FindBy(id = "pass")
	private WebElement txtPassWord;

	@FindBy(name = "login")
	private WebElement loginclk;

}
