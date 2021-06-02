package Application;

import java.io.IOException;

import Controller.ArquivoControllerFunc;

public class Principal {
	public static void main(String[] args) {
		ArquivoControllerFunc control = new ArquivoControllerFunc();
		
		String arquivo = "C:/exemplo/generic_food.csv";
		try {
			control.lerArquivo(arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
