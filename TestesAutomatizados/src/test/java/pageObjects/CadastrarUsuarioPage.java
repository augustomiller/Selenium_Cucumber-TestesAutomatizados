package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

	@FindBy(id = "systemUser_employeeName_empName")
	public WebElement campoEmployer;

	@FindBy(name = "systemUser[userName]")
	public WebElement campoUserName;

	@FindBy(name = "systemUser[password]")
	public WebElement campoPassword;
	
	@FindBy(name = "systemUser[confirmPassword]")
	public WebElement campoConfirmaPassword;

	@FindBy(name = "btnSave")
	public WebElement botaoSalvar;

	public void informarCampoEmployerName(String employerName) {
		campoEmployer.sendKeys(employerName);
	}

	public void InformarCampoUserName(String userName) {
		campoUserName.sendKeys(userName);
	}

	public void InformarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}

	public void InformarCampoConfirmarPassword(String password) {
		campoConfirmaPassword.sendKeys(password);
	}

	public void acionarBotatoSalvar() {
		botaoSalvar.click();
	}
}
