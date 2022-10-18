package index;

import java.util.Scanner;

public class APL{
	
			public static void main(String[] args) {
		        //Emprestimo emprestimo;
		        //INTERFACE TEXTO COM O USUÃ�RIO//
		        Emprestimo emprestimo;
		        	Scanner scan = new Scanner ( System.in );
				System.out.print("Valor: ");
                                float valor = scan.nextFloat();
						
				System.out.print("Taxa Anual: ");
				float taxa_anual = scan.nextFloat();
						
                                System.out.print("Tempo (anos): ");
				float tempo_anos = scan.nextFloat();
						
    

			emprestimo = new Emprestimo(valor, taxa_anual, tempo_anos);
    		System.out.println(emprestimo);
        	
        }
    }