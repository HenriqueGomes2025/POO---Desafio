package iPhone;

import apps.AparelhoTelefonico.AparelhoTelefonico;
import apps.NavegadorInternet.NavegadorInternet;
import apps.ReprodutorMusical.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void tocar() {
		System.out.println("Tocando Música...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada.");
		
	}

	@Override
	public void selecionarMusicar(String muisca) {
		System.out.println("Selecionado Música:" + muisca);
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para : " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Chamada atendida.");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
		
	}

	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Abrindo página: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba criada.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atulizada.");
		
	}

}
