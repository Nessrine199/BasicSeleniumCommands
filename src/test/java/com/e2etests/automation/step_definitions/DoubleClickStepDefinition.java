package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_object.AlertDemoPage;
import com.e2etests.automation.page_object.DoubleClickPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoubleClickStepDefinition {
	private DoubleClickPage doubleClickPage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	private ConfigFileReader configFileReader;
	
	public DoubleClickStepDefinition() {
		this.doubleClickPage = new DoubleClickPage();
		this.seleniumUtils = new SeleniumUtils();
		this.configFileReader = new ConfigFileReader();
		this.validations = new Validations();
	}

	@Given("Je me connecte sur le site DemoQAbuttons")
	public void jeMeConnecteSurLeSiteDemoQAbuttons() {
	seleniumUtils.get(configFileReader.getProperties("button.url"));   
	}
	@When("Je clique deux fois sur le boutton DoubleClick me")
	public void jeCliqueDeuxFoisSurLeBouttonDoubleClickMe() {
	seleniumUtils.doubleclickOnElementUsingActions(doubleClickPage.doubleClickButton);

	}
	@Then("Un message {string} est affiche")
	public void unMessageEstAffiche(String text) {
	validations.assertEquals(doubleClickPage.message, text);
	    
	}



}
