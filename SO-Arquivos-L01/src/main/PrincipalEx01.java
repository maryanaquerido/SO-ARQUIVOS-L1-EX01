package main;

import java.io.IOException;
import controller.ArquivosControllerEx01;
import controller.IArquivosControllerEx01;

public class PrincipalEx01 {
	public static void main (String[] args) {
		
		IArquivosControllerEx01 arqCont = new ArquivosControllerEx01();
		
		String caminho = "C:\\TEMP";
		String nome = "generic_food.csv";
		
		try {
			arqCont.readFile(caminho, nome);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
