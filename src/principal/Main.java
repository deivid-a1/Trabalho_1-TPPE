package principal;

import entities.Produto;

public class Main {

	static Produto prod1 = new Produto("ACV34G", "ARROZ SEU JORGE", 12.45f, "KG"); 
	
	
	public static void main(String[] args) {
		System.out.println(prod1.getCodigoItem());
		System.out.println(prod1.getDescricao());
		System.out.println(prod1.getValor());
		System.out.println(prod1.getUnidade());
	}

}


/*
VENDA:
Uma venda consiste em uma lista de produtos comprados e possui os atributos:
	-> Data
	-> Cliente
	-> Lista de Produtos vendidos
	-> Método de pagamento (dinheiro ou cartão)

* Precisa calcular o valor do ICMS para cada produto e o total
* Precisa verificar o tipo de cliente que faz a compra para calcular os benefícios de cashback e frete
* 

PRODUTOS:
Os produtos devem ter os atributos:
	-> Código
	-> Descrição
	-> Valor
	-> Unidade



CLIENTES:
Devem possuir os atributos:
	-> Mensalidade
	-> Endereço (Estado e se é Capital ou não)
	-> Tipo

Tipos de clientes:
Cliente Padrão:
	-> Nenhum benefício

Cliente Especial:
	-> 10% de desconto no valor total da compra
	-> + 10% de desconto se a compra for no cartão da empresa (começa com 4296 13XX XXXX XXXX)
	-> 30% de desconto no frete
	
Cliente Prime:
	-> Isenção do valor do frete
	-> Cashback de R$ 0,03 a cada real gasto e R$ 0,05 se utilizar o cartão da empresa
	-> Pode usar o cashback como desconto em compras



IMPOSTO:
Para cada compra realizada é necessário calcular o ICMS e o imposto municipal:

	-> 12% de ICMS e 4% de imposto municipal em vendas para clientes fora do DF;
	-> 18% de ICMS e 0% de imposto municipal em vendas para cliende do DF.



FRETE:
Os fretes são calculados com base na tabela a seguir:

							Capital		Interior
Distrito Federal			R$ 5,00	   	   -
Regiao Centro-oeste			R$ 10,00	R$ 13,00
Regiao Nordeste				R$ 15,00	R$ 18,00
Regiao Norte				R$ 20,00	R$ 25,00
Regiao Sudeste				R$ 7,00		R$ 10,00
Regiao Sul					R$ 10,00	R$ 13,00	

Na nota fiscal da compra deve ter:
	-> ICMS e imposto municipal para CADA ITEM da compra e sua soma total também
	-> Descontos para cada tipo de cliente

*/
