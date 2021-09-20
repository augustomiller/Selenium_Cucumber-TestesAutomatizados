package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import  static utils.Utils.*;

import org.openqa.selenium.By;

public class CadastrarUsuarioSteps {
	
	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
	    Na(TelaInicialPage.class).acionarAbaAdmin();
	}

	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
	    Na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("informar no campo employer name {string}")
	public void informarNoCampoEmployerName(String employerName) {
	    Na(CadastrarUsuarioPage.class).informarCampoEmployerName(employerName);
	}

	@Quando("informar no campo username {string}")
	public void informarNoCampoUsername(String userName) {
	    Na(CadastrarUsuarioPage.class).InformarCampoUserName(userName);
	}

	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String password) {
	    Na(CadastrarUsuarioPage.class).InformarCampoPassword(password);
	}

	@Quando("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String confirmaPassword) {
	    Na(CadastrarUsuarioPage.class).InformarCampoConfirmarPassword(confirmaPassword);
	}

	@Quando("acionar o botao salvar")
	public void acionarOBotaoSalvar() {
	    Na(CadastrarUsuarioPage.class).acionarBotatoSalvar();
	}

	@Entao("o sistema cadastra o usuario. {string}")
	public void oSistemaCadastraOUsuario(String userName) {
	    assertTrue(driver.findElement(By.xpath("//a[text()='"+userName+"']")).isDisplayed());
	}
}
