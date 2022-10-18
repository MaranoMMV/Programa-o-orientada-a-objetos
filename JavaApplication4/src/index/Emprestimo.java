package index;


public class Emprestimo {
	//atributos
	public float valor;
	float ano;
	static float tempo_anos;
	static float taxa_anual;
	static float ano_meses = 12;
	
	//construtor
	
	public float Zerando_Int() {
		return valor = 0;
	}
	public float Zerando_Float() {
		return ano = tempo_anos = taxa_anual = ano_meses = 0;
	}
	//
	@SuppressWarnings("static-access")
	public Emprestimo(float valor, float taxa_anual, float tempo_anos) {
		this.valor = valor;
		this.taxa_anual = taxa_anual;
		this.tempo_anos = tempo_anos;
	}
	

	
	
	
	//Comportamento (MÃ©todos)
	
	//Converter os anos em meses
	public static float Convert_meses() {
		return tempo_anos * ano_meses;
	}
	//Calcula a PotÃªncia
	static double Calcular_Potencia() {
		return Math.pow(Convert_meses(), taxa_anual);
	}
	//Converte a taxa
	public float Convert_taxa() {//valor da taxa anual.
		return ((taxa_anual / 100) / 12);
	}
	
	//construindo a formula
	
        public float formula() {
		//return (((((1 + Convert_taxa())*Calcular_Potencia())*Convert_taxa())/((1 + Convert_taxa())*Calcular_Potencia()-1))*valor);
                return (float) (valor *((Convert_taxa()*(Math.pow((1+Convert_taxa()), Convert_meses())))/(Math.pow((1+Convert_taxa()), Convert_meses())-1)));
        }
        
        @Override
        public String toString(){
        String mostrar = "Valor empréstimo";
        mostrar += "\n  valor = " + valor;
        mostrar += "\n  taxa_anual = " + taxa_anual; 
        mostrar += "\n  ano_meses = " + tempo_anos;
        mostrar += "\n  Convertendo meses = " + Convert_meses();
        mostrar += "\n  Calcular Potencia = " + Calcular_Potencia();
        mostrar += "\n  Convertendo taxa = " + Convert_taxa();
        mostrar += "\n  formula = " + formula();
        
            return mostrar;
        }
	
}
