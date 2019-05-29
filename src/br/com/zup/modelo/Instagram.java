package br.com.zup.modelo;

public class Instagram extends RedeSocial{
	private int numeroDeStories;
	private String nomeDoArroba;

	public Instagram(int numeroCurtidas, int numeroCompartilhamentos, String nomeUsuario, 
			int numeroDeStories, String nomeDoArroba) {
		super(numeroCurtidas, numeroCompartilhamentos, nomeUsuario);
		this.numeroDeStories = numeroDeStories;
		this.nomeDoArroba = nomeDoArroba;
	}

	public int getNumeroDeStories() {
		return numeroDeStories;
	}

	public void setNumeroDeStories(int numeroDeStories) {
		this.numeroDeStories = numeroDeStories;
	}
	@Override
	public String darLike() {
		String frase = "Você curtiu...";
		return frase;
	}
	@Override
	public String compartilhar() {
		String frase = "você compartilhou.....";
		return frase;
	}
	public String postarStorys() {
		String frase = "Você postou " + numeroDeStories;
		return frase;
	}
	public String toString() {
		String modelo = "";
		modelo += "Nome do Usuario -> " + super.getNomeUsuario() + "\n";
		modelo += "Nome do Arrobas -> " + this.nomeDoArroba + "\n";
		modelo += "Numero De Curtidas -> " + super.getNumeroCurtidas() + "\n";
		modelo += "Numero De Comprtilhamentos -> " + super.getNumeroCompartilhamentos() + "\n";
		modelo += "numero de Stories -> " + this.numeroDeStories + "\n";
		return modelo;
		
	}
}
