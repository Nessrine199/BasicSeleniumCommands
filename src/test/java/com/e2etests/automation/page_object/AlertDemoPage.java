package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AlertDemoPage {
	
	@FindBy(how = How.ID, using = "alertButton")
	public static WebElement alertButton;
	
	public AlertDemoPage() {
		PageFactory.initElements(Setup.driver, this);
	}

}
