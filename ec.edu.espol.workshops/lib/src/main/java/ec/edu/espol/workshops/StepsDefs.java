package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;



public class StepsDefs {

	private int actualAnswer;
	public Carlnsurance carInsurance = new Carlnsurance(0,"",""); 
	
	@Given("M Are over 25 years old")
	public void M_Are_over_25_years_old() {
		carInsurance.setEdad(26);
	}
	
	@When("Calculate the premium")
	public void Calculate_the_premium() {
		actualAnswer= carInsurance.getPremium();
	}
	
	@Then("Show 500")
	public void Show_500() {
		assertEquals(500,actualAnswer); 
	}
	
	//--------------------------------2-------------------------------
	@Given("M Are over 65 years old")
	public void M_Are_over_65_years_old() {
		carInsurance.setEdad(66);
	}
	
	//---------------------------------3-------------------------------
	
	@Given("M Are under 25 years old")
	public void M_Are_under_25_years_old() {
		carInsurance.setEdad(66);
	}
	
	@Then("Show_200")
	public void Show_200() {
		assertEquals(2000,actualAnswer); 
	}
	
	//---------------------------------4---------------------------------
	
	
	@Given("F Are under 45 years old")
	public void F_Are_under_45_years_old() {
		carInsurance.setEdad(43);
	}
	
	@Then("Show_300")
	public void Show_300() {
		assertEquals(300,actualAnswer); 
	}
	
	//--------------------------------5----------------------------------
	
	@Given("F Are over 65 years old")
	public void F_Are_over_65_years_old() {
		carInsurance.setEdad(66);
	}
		
	//----------------------------------6----------------------------------
	
	@Given("MF Are under 45 years old")
	public void MF_Are_under_45_years_old() {
		carInsurance.setEdad(44);
	}
	
	//----------------------------------7-----------------------------------
	
	@Given("MF Are over 65 years old")
	public void MF_Are_over_65_years_old() {
		carInsurance.setEdad(66);
	}
	
	//-----------------------------------8-----------------------------------
	
	@Given("MF Are over 80 years old")
	public void MF_Are_over_80_years_old() {
		carInsurance.setEdad(81);
	}
	
	@Then("Show menos 1")
	public void Show_menos_1() {
		assertEquals(0,actualAnswer); 
	}
	
	//-----------------------------------9----------------------------------------
	
	@Given("F Are between 45 and 65 years old")
	public void F_Are_between_45_and_65_years_old() {
		carInsurance.setEdad(50);
	}
	
	//----------------------------------10---------------------------------------
	
	@Given("M Are between 45 and 65 years old")
	public void M_Are_between_45_and_65_years_old() {
		carInsurance.setEdad(50);
	}
}
