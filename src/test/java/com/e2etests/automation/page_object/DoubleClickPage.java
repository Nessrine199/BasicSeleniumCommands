package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class DoubleClickPage {
	@FindBy(how = How.ID, using = "doubleClickBtn")
	public static WebElement doubleClickButton;
	
	@FindBy(how = How.ID, using = "doubleClickMessage")
	public static WebElement message;
	
	public DoubleClickPage() {
		PageFactory.initElements(Setup.driver, this);
	}
	

}
