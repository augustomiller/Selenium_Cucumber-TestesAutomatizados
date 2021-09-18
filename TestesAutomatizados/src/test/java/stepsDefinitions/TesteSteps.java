package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import static utils.Utils.acessarSistema;

public class TesteSteps {
	
	@Dado("que eu estou acessando o sistema")
	public void que_eu_estou_acessando_o_sistema() {
		acessarSistema();
	}
	
	@Quando("eu informar usuário")
	public void euInformarUsuário() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Quando("informar a senha")
	public void informarASenha() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Então("o sistema apresenta o usuário logado")
	public void oSistemaApresentaOUsuárioLogado() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
