package controller;

import java.io.IOException;

public interface IArquivosController {
	public void leDiretorio(String path) throws IOException;
	public void leArquivo(String path, String arq) throws IOException;
	public void escArquivo(String path, String arq) throws IOException;
	
}
