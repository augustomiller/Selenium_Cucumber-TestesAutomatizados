package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TestandoActionsSteps {

	@Quando("acionar o submenu customField")
	public void acionarOSubmenuCustomField() {
	    Na(TelaInicialPage.class).acessarMenuCustomField();
	}

	@Entao("o sistema apresentara a tela custonField")
	public void oSistemaApresentaraATelaCustonField() {
	    assertEquals("Remaining number of custom fields: 9", driver.findElement(By.id("fieldsleft")).getText());
	}
}
