package app;
import models.*;
/*
 * Essa é a classe principal que instancia os objetos mencionados
 * nas classes em "models".
 * 
 * @author taynara
 * version 1.0
 */


public class Main {

	public static void main(String[] args) {
		
		//Instanciando objeto
		Produto prod1 = new Produto("Amaciante", 10, 5, "22/11/2024");
		//Printando a descrição do produto
		System.out.println(prod1.getProduto());
		
	}
}
