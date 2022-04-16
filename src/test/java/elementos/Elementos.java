package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirConta = By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]/a");
	private By btnAbrirContaPf = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("telefone");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	private By validacao = By.xpath("/html/body/div[3]/div[1]/div/div[1]/p/span[1]");
	
	
	public By getValidacao() {
		return validacao;
	}

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getBtnAbrirContaPf() {
		return btnAbrirContaPf;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoTelefone() {
		return campoTelefone;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}
}
