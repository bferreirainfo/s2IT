$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ConcatenarNumeros.feature");
formatter.feature({
  "line": 1,
  "name": "Concatenar números",
  "description": "\r\nDados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes\r\nregras:\r\nO primeiro número de C é o primeiro número de A;\r\nO segundo número de C é o primeiro número de B;\r\nO terceiro número de C é o segundo número de A;\r\nO quarto número de C é o segundo número de B;\r\nAssim sucessivamente...\r\nCaso os números de A ou B sejam de tamanhos diferentes, completar C com o restante dos números do inteiro maior. Ex: A \u003d 10256, B \u003d 512, C deve ser 15012256.\r\nCaso C seja maior que 1.000.000, retornar -1",
  "id": "concatenar-números",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 13,
  "name": "Concatenar com sucesso números A e B, sendo A de maior tamanho e portanto completar o restante com A",
  "description": "",
  "id": "concatenar-números;concatenar-com-sucesso-números-a-e-b,-sendo-a-de-maior-tamanho-e-portanto-completar-o-restante-com-a",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Usuario rode a aplicação com os valores \"A\u003d13 B\u003d2\"",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "C deve ser 123",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "A\u003d13 B\u003d2",
      "offset": 41
    }
  ],
  "location": "S2Steps.usuario_rode_a_aplicação_com_os_valores(String)"
});
formatter.result({
  "duration": 288185610,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 11
    }
  ],
  "location": "S2Steps.c_deve_ser(int)"
});
formatter.result({
  "duration": 1391589,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Concatenar com sucesso números A e B, sendo B de maior tamanho e portanto completar o restante com B",
  "description": "",
  "id": "concatenar-números;concatenar-com-sucesso-números-a-e-b,-sendo-b-de-maior-tamanho-e-portanto-completar-o-restante-com-b",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Usuario rode a aplicação com os valores \"A\u003d3 B\u003d21\"",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "C deve ser 321",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "A\u003d3 B\u003d21",
      "offset": 41
    }
  ],
  "location": "S2Steps.usuario_rode_a_aplicação_com_os_valores(String)"
});
formatter.result({
  "duration": 465641,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "321",
      "offset": 11
    }
  ],
  "location": "S2Steps.c_deve_ser(int)"
});
formatter.result({
  "duration": 119384,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Concatenar com sucesso números A e B, sendo o merge dos dois resulte em um número maior que 1.000.000 para retornar -1",
  "description": "",
  "id": "concatenar-números;concatenar-com-sucesso-números-a-e-b,-sendo-o-merge-dos-dois-resulte-em-um-número-maior-que-1.000.000-para-retornar--1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "Usuario rode a aplicação com os valores \"A\u003d10256 B\u003d512\"",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "C deve ser -1",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "A\u003d10256 B\u003d512",
      "offset": 41
    }
  ],
  "location": "S2Steps.usuario_rode_a_aplicação_com_os_valores(String)"
});
formatter.result({
  "duration": 140308,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "-1",
      "offset": 11
    }
  ],
  "location": "S2Steps.c_deve_ser(int)"
});
formatter.result({
  "duration": 154256,
  "status": "passed"
});
});