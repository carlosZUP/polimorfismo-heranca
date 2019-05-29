package br.com.zup.modelo;

public abstract class RedeSocial {
	private int numeroCurtidas;
	private int numeroCompartilhamentos;
	private String nomeUsuario;

	

	public RedeSocial(int numeroCurtidas, int numeroCompartilhamentos, String nomeUsuario) {
		this.numeroCurtidas = numeroCurtidas;
		this.numeroCompartilhamentos = numeroCompartilhamentos;
		this.nomeUsuario = nomeUsuario;
	}

	public int getNumeroCurtidas() {
		return numeroCurtidas;
	}

	public void setNumeroCurtidas(int numeroCurtidas) {
		this.numeroCurtidas = numeroCurtidas;
	}

	public int getNumeroCompartilhamentos() {
		return numeroCompartilhamentos;
	}

	public void setNumeroCompartilhamentos(int numeroCompartilhamentos) {
		this.numeroCompartilhamentos = numeroCompartilhamentos;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String darLike() {
		String frase = "curtindo";
		return frase;
	}

	public String darLike(String nomeUsuario) {
		String like = "Vocẽ curtiu algo do ";
		return like;
	}

	public String compartilhar() {
		String share = "Você compartilhou algo do ";
		return share;
	}

}
