package br.com.zup.modelo;

public class Facebook extends RedeSocial {
	private int numeroCutucadas;

	public Facebook( int numerosCurtidas, int numeroCompartilhamento, String nomeUsuario, int numeroCutucadas ) {
		super(numerosCurtidas, numeroCompartilhamento, nomeUsuario);
		this.numeroCutucadas = numeroCutucadas;

	}

	public int getNumeroCutucadas() {
		return numeroCutucadas;
	}

	public void setNumeroCutucadas(int numeroCutucadas) {
		this.numeroCutucadas = numeroCutucadas;
	}
	@Override
	public String darLike() {
		return "Você deu um like...";
	}
	@Override
	public String  compartilhar() {
		String frase = "VOCÊ COMPARTILHOUUUU....";
			return frase;
	}
	public String cutucar() {
		
		String cutucada = "Cutucando...";
		return cutucada;
	}
	public String toString() {
		String modelo = "";
		modelo += "Nome do Usuario -> " + super.getNomeUsuario() + "\n";
		modelo += "Número de Curtidas -> " + super.getNumeroCurtidas() +  "\n";
		modelo += "Numero de comparlithamento -> " + super.getNumeroCompartilhamentos() + "\n";
		modelo += "Cutucadas -> " + this.numeroCutucadas + "\n";
		return modelo;
	}
}
