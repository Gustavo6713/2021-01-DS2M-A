package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {

		Cliente pedro = new Cliente();
		pedro.setNome("Pedro Alvares Cabral");
		pedro.setCpf("53425676583");
		pedro.setTelefone("(11)4305-6726");
		pedro.setCep("986764789");
		
		// Criar da conta do Pedro
		Conta contaPedro = new Conta();
		contaPedro.setTitular(pedro);
		contaPedro.depositar(100);
		contaPedro.setNumero("2222-2");
		
		System.out.println(contaPedro.getTitular().getTelefone());
		System.out.println(contaPedro.getTitular().getNome());
		contaPedro.getTitular().setNome("Pedro da Silva");
		System.out.println(contaPedro.getTitular().getNome());
		System.out.println(pedro.getNome());
	}

}
