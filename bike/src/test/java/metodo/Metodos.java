package metodo;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos extends setupNavegador {

	public void clicar(By elemento) throws InterruptedException {
		try {
			driver.findElement(elemento).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("***Erro em Clicar***\n" + e.getMessage());
		}

	}

	public void escrever(String texto, By elemento) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("***Erro ao Escrever***\n" + e.getMessage());
		}

	}

	public void rolagemBaixo() throws InterruptedException {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("scrollBy(0,300)", "");
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("***Erro Rolagem Baixo***\n" + e.getMessage());
		}

	}

	public void rolagemCima() throws InterruptedException {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("scrollBy(0,-300)", "");
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println("***Erro Rolagem Cima***\n" + e.getMessage());
		}

	}

	public void validarOpcoes(String texto, By elemento) {
		try {
			String textoEsperado = driver.findElement(elemento).getText();
			assertEquals(texto, textoEsperado);
		} catch (Exception e) {
			System.out.println("***Erro Validar Opções***\n" + e.getMessage());
		}

	}

	public void screnShot(String nome) throws IOException {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File desFile = new File("./src/evidencias/" + nome + ".png");
			FileUtils.copyFile(scrFile, desFile);
		} catch (Exception e) {
			System.out.println("***Erro screenShot***\n" + e.getMessage());
		}

	}

	public void aguardarElemento(int tempo, By elemento) {
		try {
			WebDriverWait aguardar = new WebDriverWait(driver, tempo);
			aguardar.until(ExpectedConditions.elementToBeClickable(elemento));
		} catch (Exception e) {
			System.out.println("***Erro Guardar Elemento***\n" + e.getMessage());
		}

	}

	public void fecharNavegador() {
		try {

		} catch (Exception e) {
			System.out.println("***Erro na Navegação***\n" + e.getMessage());
		}
		driver.quit();
	}
}
