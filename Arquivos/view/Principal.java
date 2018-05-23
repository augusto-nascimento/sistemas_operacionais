package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {
	public static void main(String[] args) {
		IArquivosController ac = new ArquivosController();
		String path = "C:\\TEMP";
		String arq = "novoArquivo.txt";
		try {
			ac.leArquivo(path, arq);
//			ac.escArquivo(path, arq);
//			ac.leDiretorio(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
