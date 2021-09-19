package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void setup() {
	  acessarSistema();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}	
}
