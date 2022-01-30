#Author: br.com.trinca

 @executa
 Feature: Simulacao de uma cotacao de Bikes, seguro para seus bens.
  Eu, enquanto interessado em realizar uma cotacao de bikes,
  Quero realizar uma simulacao de valores,
  Para tomar uma decisao quanto a contratacao de seguro.

 @executa1
 Scenario: Simulacao de cotacao
    Given que eu acesse o site "https://azuq1-br-protector-store.azurewebsites.net/para-voce"
    When clicar na opcao seguro para seus bens
    And clicar no botao faca uma cotacao
    And preencher os campos obrigatorios de cadastro "Lorenzo" "Mata" "LLMMAA@hotmail.com"
    And clicar no botao bike
    And clicar no botao avancar
    And escolher a marca da bike
    And preencher o valor de mercado "10000000"
    And clicar no botao simular cotacao
    And clicar no botao solicite uma cotacao personalizada 
    Then sera validado "E-MAIL", "TELEFONE" e "WHATSAPP"
    And ao clicar em uma das tres opcoes validar a mensagem "Pronto! Sua solicitação foi encaminhada para um de nossos corretores parceiros."


