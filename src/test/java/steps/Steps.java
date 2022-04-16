package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import elementos.Elementos;
import metodos.Metodos;

public class Steps {

	WebDriver driver;
	Metodos m = new Metodos();
	Elementos e = new Elementos();
	Page p = new Page();

	
	

	@Dado("^que o usuario acesse a URL \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_URL(String pagina) throws Throwable {
		
		m.ExecutarNavegador(pagina);
	}

	@Dado("^selecione o campo abrir conta$")
	public void selecione_o_campo_abrir_conta() throws Throwable {
		m.clicar(e.getBtnAbrirConta());
	}

	@Dado("^selecione o tipo de pessoa fisica$")
	public void selecione_o_tipo_de_pessoa_fisica() throws Throwable {

		m.clicar(e.getBtnAbrirContaPf());
	}

	@Dado("^prencha os dados$")
	public void prencha_os_dados() throws InterruptedException  {
		m.pausa(2000);
		m.preencher(e.getCampoNome(), "sssssss");
		m.preencher(e.getCampoTelefone(), "22222222222");
		m.preencher(e.getCampoEmail(), "weyde1222@outlook.com");
		m.preencher(e.getCampoCpf(), "88270192007");
		
	}

	@Quando("^selecionar o botao quero ser cliente$")
	public void selecionar_o_botao_quero_ser_cliente() throws Throwable {
	
		m.pausa(3333);
		m.clicar(e.getBtnQueroSerCliente());
	}

	@Entao("^realizo a validacao do texto falta pouco$")
	public void realizo_a_validacao_do_texto_falta_pouco() throws Throwable {
		m.pausa(2000);
		m.validarTexto("Falta pouco!", e.getValidacao());
	}
}
