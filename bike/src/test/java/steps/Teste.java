package steps;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodo.Metodos;

public class Teste {

	Metodos met = new Metodos();

	@Given("que eu acesse o site {string}")
	public void que_eu_acesse_o_site(String url) {
		met.acessarUrl(url);

	}

	@When("clicar na opcao seguro para seus bens")
	public void clicar_na_opcao_seguro_para_seus_bens() throws InterruptedException {
		met.clicar(met.getBotaoSegurosBens());

	}

	@When("clicar no botao faca uma cotacao")
	public void clicar_no_botao_faca_uma_cotacao() throws InterruptedException {
		met.clicar(met.getBotaoCookies());
		met.clicar(met.getBotaofacaCotacao());

	}

	@When("preencher os campos obrigatorios de cadastro {string} {string} {string}")
	public void preencher_os_campos_obrigatorios_de_cadastro(String nome, String sbnome, String email) {
		met.escrever(nome, met.getNome());
		met.escrever(sbnome, met.getSobreNome());
		met.escrever(email, met.getEmail());

	}

	@When("clicar no botao bike")
	public void clicar_no_botao_bike() throws InterruptedException {
		met.clicar(met.getBotaoBikes());

	}

	@When("clicar no botao avancar")
	public void clicar_no_botao_avancar() throws InterruptedException {
		met.clicar(met.getBotaoAvancar());
	}

	@When("escolher a marca da bike")
	public void escolher_a_marca_da_bike() throws InterruptedException {
		met.clicar(met.getBotaOutraOpco());
		met.rolagemBaixo();
		met.clicar(met.getBotaoMarca());

	}

	@When("preencher o valor de mercado {string}")
	public void preencher_o_valor_de_mercado(String valor) throws InterruptedException {
		met.escrever(valor, met.getValorMercado());

	}

	@When("clicar no botao simular cotacao")
	public void clicar_no_botao_simular_cotacao() throws InterruptedException {
		met.clicar(met.getSimularCota());

	}

	@When("clicar no botao solicite uma cotacao personalizada")
	public void clicar_no_botao_solicite_uma_cotacao_personalizada() throws InterruptedException {
		met.aguardarElemento(5000, met.getBotaoSoliCota());
		met.clicar(met.getBotaoSoliCota());
		

	}

	@Then("sera validado {string}, {string} e {string}")
	public void sera_validado_e(String email, String fone, String whats) throws IOException {
	   met.validarOpcoes(email, met.getValEmail());
	   met.validarOpcoes(fone, met.getValFone());
	   met.validarOpcoes(whats, met.getValWhats());
	   met.screnShot("Validar Opções");
	}

	@Then("ao clicar em uma das tres opcoes validar a mensagem {string}")
	public void ao_clicar_em_uma_das_tres_opcoes_validar_a_mensagem(String Msg) throws InterruptedException {
	   met.aguardarElemento(4000, met.getClicarEmail());
	   met.clicar(met.getClicarEmail());
       met.clicar(met.getBotaoEnviar());
	   met.validarOpcoes(Msg, met.getValMsg());
	   met.fecharNavegador();
	  
		}

}
