package elemento;

import org.openqa.selenium.By;

public class Elemento {

	private By botaoSegurosBens = By.cssSelector("div.Topo__ProductWrapper-sc-1aigqsp-3:nth-child(3) > div:nth-child(1)");
	private By botaoCookies = By.cssSelector("#onetrust-button-group-parent");
	private By botaofacaCotacao = By.cssSelector("div.kFWiLb:nth-child(3) > button:nth-child(1)");
	private By nome = By.cssSelector("#\\31 ");
	private By sobreNome = By.cssSelector("input.InputText__StyledInput-sc-1lvck04-0:nth-child(3)");
	private By email = By.cssSelector("fieldset.Fieldset-sc-1nhytgi-0:nth-child(2) > label:nth-child(1) > input:nth-child(2)");
	private By botaoBikes = By.cssSelector(".SelectBox__StyledBox-hrfuf-0");
	private By botaoAvancar = By.cssSelector(".CallToAction__Label-sc-1dgyvm3-1");
	private By botaOutraOpco = By.cssSelector("div.SelectBox__StyledBox-hrfuf-0:nth-child(7)");
	private By botaoMarca = By.cssSelector("div.Radio__StyledCheckbox-sc-1rn1eu4-1:nth-child(4) > label:nth-child(1) > div:nth-child(1)");
	private By valorMercado = By.cssSelector("#\\31 1");
	private By simularCota = By.cssSelector(".CallToAction__StyledButton-sc-1dgyvm3-0");
	private By botaoSoliCota = By.xpath("//button[@class=\"CallToAction__StyledButton-sc-1dgyvm3-0 fHnTSI QuotationCard__CustomButton-sc-19us9ni-8 fDEkks\"]");
	private By valEmail = By.cssSelector("div.Radio__StyledCheckbox-sc-1rn1eu4-1:nth-child(1) > label:nth-child(1) > div:nth-child(1) > span:nth-child(1)"); 
	private By valFone = By.cssSelector("div.Radio__StyledCheckbox-sc-1rn1eu4-1:nth-child(2) > label:nth-child(1) > div:nth-child(1) > span:nth-child(1)");
	private By valWhats = By.cssSelector("div.Radio__StyledCheckbox-sc-1rn1eu4-1:nth-child(3) > label:nth-child(1) > div:nth-child(1) > span:nth-child(1)");
	private By clicarEmail = By.cssSelector("div.Radio__StyledCheckbox-sc-1rn1eu4-1:nth-child(1) > label:nth-child(1) > div:nth-child(1)");
	private By botaoEnviar = By.cssSelector("button[class=\"CallToAction__StyledButton-sc-1dgyvm3-0 fHnTSI\"]");	
	private By valMsg = By.cssSelector(".Title-ylsufo-0");

	public By getBotaoSegurosBens() {
		return botaoSegurosBens;
	}

	public By getBotaoCookies() {
		return botaoCookies;
	}

	public By getBotaofacaCotacao() {
		return botaofacaCotacao;
	}

	public By getNome() {
		return nome;
	}

	public By getSobreNome() {
		return sobreNome;
	}

	public By getEmail() {
		return email;
	}

	public By getBotaoBikes() {
		return botaoBikes;
	}

	public By getBotaoAvancar() {
		return botaoAvancar;
	}

	public By getBotaOutraOpco() {
		return botaOutraOpco;
	}

	public By getBotaoMarca() {
		return botaoMarca;
	}

	public By getValorMercado() {
		return valorMercado;
	}

	public By getSimularCota() {
		return simularCota;
	}

	public By getBotaoSoliCota() {
		return botaoSoliCota;
	}

	public By getValEmail() {
		return valEmail;
	}

	public By getValFone() {
		return valFone;
	}

	public By getValWhats() {
		return valWhats;
	}

	public By getClicarEmail() {
		return clicarEmail;
	}

	public By getBotaoEnviar() {
		return botaoEnviar;
	}

	public By getValMsg() {
		return valMsg;
	}









}
