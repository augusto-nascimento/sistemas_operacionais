package view;

import java.util.Properties;
import java.util.Set;

import controller.ProcController;

public class Principal {
	public static void main(String[] args) {
		ProcController pCont = new ProcController();
//		String os = pCont.os();
//		System.out.println(os);
//		pCont.propriedades();
		String caminhoProcesso = "C:\\Windows\\regedit.exe";
		pCont.chamaProcesso(caminhoProcesso);
	}

}
