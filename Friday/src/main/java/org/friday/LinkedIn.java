package org.friday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedIn {
	
WebDriver driver;
@FindBy(id="username")
WebElement userName;

@FindBy(id="password")
WebElement userPassword;

@FindBy(className = "login__form_action_container")
WebElement loginButton;

public LinkedIn(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void loginLinkedIn(String username,String password)
{
	userName.sendKeys(username);
	userPassword.sendKeys(password);
	loginButton.click();
}

}
