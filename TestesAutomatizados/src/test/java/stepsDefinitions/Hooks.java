package stepsDefinitions;

import static utils.Utils.Na;
import static utils.Utils.acessarSistema;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks { 
	
	@Before()
	public void setup() {
		acessarSistema();
		Na(LoginPage.class).realizarLogin("Admin", "admin123");
	}
	
	@Before(value = "@login")
	public void funcionalidadeLogin() {
		acessarSistema();
	}
	
	@After
	public void tearDown(){
//		driver.quit();
	}

}
