package Meu_IPhone;

import iPhone.iPhone;

public class Steve_Jobs {
	public static void main(String[] args) {
		iPhone meuIphone = new iPhone();
		/*
		// testa Reprodutor Muscial
		System.out.println("=== Funcionalidades Musicais ===");
		meuIphone.tocar();
		meuIphone.selecionarMusicar("Bohemian Rhapsody");
		meuIphone.pausar();
		
		// testa Aparelho Telefonico
		System.out.println("=== Funcionalidades Telefônicas ===");
		meuIphone.ligar("(99 88888-7777) ");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();
		
		// testa Navegador Internet
		System.out.println("=== Funcionalidades de Navegação ===");
		meuIphone.exibirPagina("https://www.google.com");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
		*/
		
//-------------------------------------------------------------------------------------
		
		String appEscolhido = "Navegação"; //Musicais, Telefônicas e Navegação
		
		switch (appEscolhido) {
			case "Musicais": {
				System.out.println("=== Funcionalidades Musicais ===");
				meuIphone.tocar();
				meuIphone.selecionarMusicar("Bohemian Rhapsody");
				meuIphone.pausar();
				break;
			}
			case "Telefônicas":{
				System.out.println("=== Funcionalidades Telefônicas ===");
				meuIphone.ligar("(99 88888-7777) ");
				meuIphone.atender();
				meuIphone.iniciarCorreioVoz();
				break;
			}
			case "Navegação":{
				System.out.println("=== Funcionalidades de Navegação ===");
				meuIphone.exibirPagina("https://www.google.com");
				meuIphone.adicionarNovaAba();
				meuIphone.atualizarPagina();
				break;
			}
			
		}	
	}
}
