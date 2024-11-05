package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class ArquivosControllerEx01 implements IArquivosControllerEx01{
		
	public void readFile (String caminho, String nome) throws IOException {
		File arq = new File (caminho, nome);
		if (arq.exists() && arq.isFile()) {
			System.out.printf("%-25s\t%-25s\t%s%n", "FOOD NAME", "SCIENTIFIC NAME", "SUBGROUP");
			System.out.print("\n");
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader (fluxo); 
			BufferedReader buffer = new BufferedReader (leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				String[] separacao = linha.split(",");
				if (linha.contains("fruits")) {
					String foodName = separacao[0];String scientificName = separacao[1];
                    String subGroup = separacao[3];

                    System.out.printf("%-25s\t%-25s\t%s%n", foodName, scientificName, subGroup);
					
				}
					linha = buffer.readLine();
				
			}
			buffer.close();
			leitor.close();
			fluxo.close(); 			
		} else {
			throw new IOException ("Arquivo Inválido!");
		}
			
	}

}
