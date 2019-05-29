package br.com.zup.modelo;

public class TesteRedeSocial {

	public static void main(String[] args) {

		Facebook facebook = new Facebook(299, 60, "um tal de Cleitinho", 4);
		System.out.println(facebook);
		
		Instagram instagram = new Instagram(243, 444, "Malukinho", 5, "@EusouUmMulekeDoido..");
		System.out.println(instagram);
	}

}

