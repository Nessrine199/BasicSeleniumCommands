package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_object.AlertDemoPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertDemoStepDefinition {
	private AlertDemoPage alertDemoPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private ConfigFileReader configFileReader;
	
	public AlertDemoStepDefinition() {
		this.alertDemoPage = new AlertDemoPage();
		this.seleniumUtils = new SeleniumUtils();
		this.configFileReader = new ConfigFileReader();
		this.validations = new Validations();
	}
	
	@Given("Je me connecte sur le site DemoQA")
	public void jeMeConnecteSurLeSiteDemoQA() {
	seleniumUtils.get(configFileReader.getProperties("alert.url"));
	   
	}
	@When("Je clique sur le boutton Click me")
	public void jeCliqueSurLeBouttonClickMe() {
	seleniumUtils.click(alertDemoPage.alertButton);
	    
	}
	@Then("Une Alterte est affichée")
	public void uneAlterteEstAffichée() throws InterruptedException {
	Long mediumWait =  seleniumUtils.getWait("ShortWait");
	Thread.sleep(mediumWait);
	seleniumUtils.acceptAlert();
	
	}



}
