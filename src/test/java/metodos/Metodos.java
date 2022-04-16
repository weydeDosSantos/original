package metodos;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void preencher(By elemento, String texto)  {
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	public void validarTexto(String texto, By elemento) {
		String mensagem = driver.findElement(elemento).getText();
		System.out.println(mensagem);
		assertEquals(texto, mensagem);

	}

	public void ExecutarNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	}



