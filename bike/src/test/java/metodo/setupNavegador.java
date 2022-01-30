package metodo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import elemento.Elemento;


public class setupNavegador extends Elemento {

	WebDriver driver;
	public void acessarUrl(String url) {
		try {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println("***Erro no Navegacao***\n" + e.getMessage());
		}

	}

}
