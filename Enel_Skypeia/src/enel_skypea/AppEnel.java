package enel_skypea;

import java.util.Scanner;

public class AppEnel {
	public static void main(String[] args) {
        //INTERFACE TEXTO COM O USUÃ�RIO//
		//Responsável: Guilherme, Beatriz e vinicius
        Usuario usuario;
        	try (Scanner scan = new Scanner ( System.in )) {
				System.out.print("Consumo em kWh: ");
				                int consumo_kwh = scan.nextInt();
						
				System.out.print(" Digite o seu Sub grupo / Classe / Subclasse ://1 = A1 B1 RESIDENCIAL // 2 = Poder Público (Municipal) // 3 = Poder Público (Estadual´) // 4 = outros; ");
				int subGrupo_icms = scan.nextInt();
						
				System.out.print(" Digite o seu Sub Grupo/ Classe /Subclasse ://1 = A1 - Residencial // 2 = Residencial - Baixar Renda// 3 = B1 - Residencial Rural // 4 = Serviço público // 5 = outros");
				int subGrupo_cosip = scan.nextInt();
						


usuario = new Usuario(consumo_kwh, subGrupo_icms, subGrupo_cosip);
			}
		System.out.println(usuario);
	
}
}