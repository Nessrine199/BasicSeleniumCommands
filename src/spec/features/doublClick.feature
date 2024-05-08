
Feature: Test Double Clickbutton 
  Je souhaite tester la fonctionalité du boutton Double Click me sur DemoQA

  @DoubleClickDemo 
  Scenario: Test Double Clickbutton
    Given Je me connecte sur le site DemoQAbuttons 
    When Je clique deux fois sur le boutton DoubleClick me
    Then Un message "You have done a double click" est affiche 
