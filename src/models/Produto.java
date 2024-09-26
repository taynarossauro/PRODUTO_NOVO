package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* A classe "Produto" tem o objetivo de criar um produto
 * e os atributos que o compoem.
 * 
 * @author taynara
 * @version 1.0
 */

public class Produto {
	//Declarando os atributos
	private String nome;
	private int custo;
	private int venda;
	private LocalDate fabricacao;
	private LocalDate validade;
	
	/*
	 * Construtor da classe Produto
	 * 
	 * @return: descrição do produto
	 */
	public Produto(String nome, int custo, int venda, String fabricacao ) {
		this.nome = nome;
		this.custo = custo;
		this.venda = venda;
		this.fabricacao = conversaoData(fabricacao);
		this.validade = dataValidade();
	}
	
	//Convertendo de String para data 
	private LocalDate conversaoData(String fabricacao) {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fabricacao_formatada = LocalDate.parse(fabricacao, formatador);
		return fabricacao_formatada;
	}
	
	/*
	 * Método que cria a data de validade dos produtos
	 * @return: 1 mes após a data de fabricação
	 */
	public LocalDate dataValidade(){
		return fabricacao.plusMonths(1);
	}
	
	/*
	 * Retorna as informações do produto e as datas mais legíveis para o usuário.
	 */
	
	public String getProduto() {
		return "Nome: " + nome +
		"\nValor de custo: " + custo + 
		"\nValor de venda: " + venda +
		"\nData de fabricação: " + fabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
		"\nData de validade: " + validade.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}


