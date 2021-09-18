package stepsDefinitions;

import static utils.Utils.acessarSistema;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before(order = 1, value = "@login")
	public void setup() {
		acessarSistema();
	}

	@Before(order = 2, value = "@login")
	public void exemplo002() {
		acessarSistema();
	}
	
	@Before(order = 3, value = "@login")
	public void exemplo003() {
		acessarSistema();
	}
	
	@After(order = 3, value = "@login")
	public void tearDown003() {
		
	}

	@After(order = 2, value = "@login")
	public void tearDown002() {
		
	}
	@After(order = 1, value = "@login")
	public void tearDown001() {
		
	}
	
	@After(order = 0, value = "@login")
	public void tearDown000() {
		
	}	
}
