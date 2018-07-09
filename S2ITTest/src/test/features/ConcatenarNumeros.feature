Feature: Concatenar números

Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes
regras:
O primeiro número de C é o primeiro número de A;
O segundo número de C é o primeiro número de B;
O terceiro número de C é o segundo número de A;
O quarto número de C é o segundo número de B;
Assim sucessivamente...
Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
Caso C seja maior que 1.000.000, retornar -1

Scenario: Concatenar com sucesso números A e B, sendo A de maior tamanho e portanto completar o restante com A

Given Usuario rode a aplicação com os valores "A=13 B=2"
Then C deve ser 123

Scenario: Concatenar com sucesso números A e B, sendo B de maior tamanho e portanto completar o restante com B

Given Usuario rode a aplicação com os valores "A=3 B=21"
Then C deve ser 321

Scenario: Concatenar com sucesso números A e B, sendo o merge dos dois resulte em um número maior que 1.000.000 para retornar -1

Given Usuario rode a aplicação com os valores "A=10256 B=512"
Then C deve ser -1