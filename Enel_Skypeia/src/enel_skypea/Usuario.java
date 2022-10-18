package enel_skypea;

public class Usuario {
	//Autores: Matheus Marano de Vasconcelos - 219013
	//Autores: Marcus Vinicius da Silva Souza - 223230
	//Autores: Felipe Victor da Silva - 227648
	//Autores: Guilherme Pedro Bugola Salmazzi 228016
	//Autores: Edmilson Barcauscas Junior - 215708
	//Autores: Murilo Manoel Mello - 167325
	//Autores: Beatriz Regina Laginestra Sampedro Pierallini - 198297
        //Autores: Vinícius Manoel Mello - 218063
	
	//Atributos
	public int consumo_kwh;
	public int subGrupo_icms; //1 = A1 B1 RESIDENCIAL // 2 = Poder Público (Municipal) // 3 = Poder Público (Estadual´) // 4 = outros
	public int subGrupo_cosip;//1 = A1 - Residencial // 2 = Residencial - Baixar Renda// 3 = B1 - Residencial Rural // 4 = Serviço público // 5 = outros
        
        //Construtor;
            @SuppressWarnings("static-access")
                public Usuario(int consumo_kwh, int subGrupo_icms, int subGrupo_cosip) {
                    this.consumo_kwh = consumo_kwh;
                    this.subGrupo_icms = subGrupo_icms;
                    this.subGrupo_cosip = subGrupo_cosip;
                }

                public int Consumo_kwh(){
                    if(consumo_kwh < 50 && subGrupo_cosip == 1){
                        return 50;
                    }else if(consumo_kwh < 50 && subGrupo_cosip == 3){
                        return 50;
                    }else if(consumo_kwh < 50 && subGrupo_cosip == 4){
                        return 50;
                    }else if(consumo_kwh < 50 && subGrupo_cosip == 5){
                        return 50;
                    }/*else if(subGrupo_cosip == 2){
                        return consumo_kwh; */
                    else{
                        return consumo_kwh;
                    }
                }
	//Métodos
		//Adendo 1, Responsáveis: Matheus, Marcos e Vinicius;
			public float Energia_TE() {
				return (float) 0.26046 * Consumo_kwh();
			}
			public float Energia_TUSD() {
				return (float) 0.39603 * Consumo_kwh();
			}
			public int Desconto_TUSD() {
				if(subGrupo_cosip == 1) {
					return 0;
				} else if(subGrupo_cosip == 2 && Consumo_kwh() > 0 && Consumo_kwh() < 30){
					return 72;
				} else if(subGrupo_cosip == 2 && Consumo_kwh() >= 30 && Consumo_kwh() < 100) {
					return 50;
				} else if(subGrupo_cosip == 2 && Consumo_kwh() >= 101 && Consumo_kwh() < 220) {
					return 30;
				} else if(subGrupo_cosip == 2 && Consumo_kwh() >= 220) {
					return 25;
				} else if(subGrupo_cosip == 3) {
					return 30;
				} else if(subGrupo_cosip == 4) {
					return 40;
				} else if(subGrupo_cosip == 5) {
					return 0;
				}
				return Desconto_TUSD();
			}
			public int Desconto_TE() {
				if(subGrupo_cosip == 1) {
					return 0;
				} else if(subGrupo_cosip == 2 && Consumo_kwh() > 0 && Consumo_kwh() < 30){
					return 65;
				} else if(subGrupo_cosip == 2 && Consumo_kwh() >= 30 && Consumo_kwh() < 100) {
					return 40;
				} else if(subGrupo_cosip == 2 && Consumo_kwh() >= 101 && Consumo_kwh() < 220) {
					return 10;
				} else if(subGrupo_cosip == 2 && Consumo_kwh() >= 220) {
					return 0;
				} else if(subGrupo_cosip == 3) {
					return 20;
				} else if(subGrupo_cosip == 4) {
					return 40;
				} else if(subGrupo_cosip == 5) {
					return 0;
				}
				return Desconto_TE();
			}
			
		//Adendo 2. Responsaveis: Edmilson, Murilo e Felipe;
			public float Pis() {
				if(subGrupo_cosip == 1) {
					return (float) 0.79;
				}else if(subGrupo_cosip == 2) {
					return (float) 0.79;
				}else if(subGrupo_cosip == 3) {
					return (float) 0.79;
				}else if(subGrupo_cosip == 4) {
					return (float) 0;
				}else {
					return(float) 1.65;
				}
			}
			
			public float Cofins() {
				if(subGrupo_cosip == 1) {
					return (float) 3.62;
				}else if(subGrupo_cosip == 2) {
					return (float) 3.62;
				}else if(subGrupo_cosip == 3) {
					return (float) 3.62;
				}else if(subGrupo_cosip == 4) {
					return (float) 0.00;
				}else if(subGrupo_cosip == 5) {
					return (float) 7.60;
				}
				return Cofins();
			}
			
			public float Cosip() {
				if(subGrupo_cosip == 1) {
					return (float) 4.5;
				}else if(subGrupo_cosip == 2) {
					return (float) 0.00;
				}else if(subGrupo_cosip == 3) {
					return (float) 29.96;
				}else if(subGrupo_cosip == 4) {
					return (float) 0.00;
				}else if(subGrupo_cosip == 5) {
					return (float) 29.96;
				}
				return Cosip();
			}
			
			public int Icms() {
				
				if(subGrupo_icms == 1 && Consumo_kwh() >= 0 && Consumo_kwh() <= 90) {
					return 0;
				}else if(subGrupo_icms == 1 && Consumo_kwh() >= 91 && Consumo_kwh() < 200) {
					return 12;
				}else if(subGrupo_icms == 1 && Consumo_kwh() > 200) {
					return 25;
				}else if(subGrupo_icms == 2) {
					return 18;
				}else if(subGrupo_icms == 3) {
					return 0;
				}else if(subGrupo_icms == 4) {
					return 18;
				}
				return Icms();
			}
			//transformando os valores e aumentando na porcentagem, sendo eles o TE e o TUSD
			public float Calc_porcentagem_TE() {
				return (Energia_TE() * Desconto_TE())/100 ;
			}
			public float Calc_Porcentagem_final_TE() {
				return Energia_TE() - Calc_porcentagem_TE();
			}
			public float Calc_porcentagem_TUSD() {
				return (Energia_TUSD() * Desconto_TUSD())/100 ;
			}
			public float Calc_Porcentagem_final_TUSD() {
				return Energia_TUSD() - Calc_porcentagem_TUSD();
			}
			//Calculando Imposto
                            //Cofins TE (1)
				public float Calculando_Imposto_Cofins_TE() {
                                    return (Energia_TE() * Cofins())/100;
				}
                                public float Calculando_Imposto_Cofins_TE_Final() {
                                    return Energia_TE() + Calculando_Imposto_Cofins_TE();
					}
				
				//Cosip TE (2)
                                        public float Calculando_Imposto_Cosip_TE() {
                                            return (Energia_TE() + Cosip());
					}
					public float Calculando_Imposto_Cosip_TE_Final() {
                                            return Energia_TE() + Calculando_Imposto_Cosip_TE();
					}
				
				//ICMS TE (3)
					public float Calculando_Imposto_Icms_TE() {
                                            return (Energia_TE() * Icms())/100;
					}
					public float Calculando_Imposto_Icms_TE_Final() {
                                            return Energia_TE() + Calculando_Imposto_Icms_TE();
					}
				
				//Cofins TUSD (4)
					public float Calculando_Imposto_Cofins_TUSD() {
                                            return (Energia_TUSD() * Cofins())/100;
					}
					public float Calculando_Imposto_Cofins_TUSD_Final() {
                                            return Energia_TUSD() + Calculando_Imposto_Cofins_TUSD();
					}
				
				//Cosip TUSD (5)
					public float Calculando_Imposto_Cosip_TUSD() {
                                            return (Energia_TUSD() + Cosip());
					}
					/*public float Calculando_Imposto_Cosip_TUSD_Final() {
						return Energia_TUSD() + Calculando_Imposto_Cosip_TUSD();
					}*/
					
				//Icms TUSD (6)
					public float Calculando_Imposto_Icms_TUSD() {
                                            return (Energia_TUSD() * Icms())/100;
					}
					public float Calculando_Imposto_Icms_TUSD_Final() {
                                            return Energia_TUSD() + Calculando_Imposto_Icms_TUSD();
					}
			
			//Resultado dos valores + Imposto cobrado;
			
					public float TE_Resultado() {
                                            return Calc_Porcentagem_final_TE() + Calculando_Imposto_Cofins_TE() + Cosip() + Calculando_Imposto_Icms_TE();
					}
					public float TUSD_Resultado() {
                                            return Calc_Porcentagem_final_TUSD() + Calculando_Imposto_Cofins_TUSD() + Cosip() + Calculando_Imposto_Icms_TUSD();
					}
					public float Total_imposto_TE() {
                                            return Calculando_Imposto_Cofins_TE() + Cosip() + Calculando_Imposto_Icms_TE();
					}
					public float Total_imposto_TUSD() {
                                            return Calc_Porcentagem_final_TUSD() + Calculando_Imposto_Cofins_TUSD() + Cosip() + Calculando_Imposto_Icms_TUSD();
					}
			
	        @Override
	        public String toString(){
	        String mostrar = "Cálculo de Imposto na conta de energia";
                
                mostrar += "\n";
                
	        mostrar += "\n  Consumo Inserido:  " + consumo_kwh;
	        mostrar += "\n  Insira o seu SubGrupo/Classe/Subclasse para o ICMS sendo utilizada: " + subGrupo_icms; 
	        mostrar += "\n  Insira o seu SubGrupo/Classe/Subclasse para o COSIP sendo utilizada: " + subGrupo_cosip;
                mostrar += "\n  Valor selecionado para o consumo segundo a sua classificação = " + Consumo_kwh();
	        
	        mostrar += "\n";
	        
	        mostrar += "\n  Energia_TE = " + Energia_TE();
	        mostrar += "\n  Energia_TUSD = " + Energia_TUSD();
	        
	        mostrar += "\n";
	        
	        mostrar += "\n  Desconto_TUSD = " + Desconto_TUSD();
	        mostrar += "\n  Desconto_TE = " + Desconto_TE();
	        /*mostrar += "\n  Calc_Desconto_TUSD = " + Calc_Desconto_TUSD();
	        mostrar += "\n  Calc_Desconto_TE = " + Calc_Desconto_TE();*/
	        
	        mostrar += "\n";
                
	        mostrar += "\n  Calculando Porcentagem TE = " + Calc_porcentagem_TE();
	        mostrar += "\n  Calculando Porcentagem final TE = " + Calc_Porcentagem_final_TE();
	        mostrar += "\n  Calculando Porcentagem TUSD = " + Calc_porcentagem_TUSD();
	        mostrar += "\n  Calculando Porcentagem final TUSD = " + Calc_Porcentagem_final_TUSD();
	        
	        mostrar += "\n";
	        
	        mostrar += "\n  Pis = " + Pis() + "%";
	        mostrar += "\n  Cofins = " + Cofins() + "%";
	        mostrar += "\n  ICMS = " + Icms() + "%";
                mostrar += "\n  Cosip = R$" + Cosip();
	        
	        mostrar += "\n";
	        //1
	        mostrar += "\n  Calculando Imposto Cofins TE = " + Calculando_Imposto_Cofins_TE();
	        mostrar += "\n  Calculando Imposto Cofins TE Mais Consumo De Energia = " + Calculando_Imposto_Cofins_TE_Final();
	        //2
	        mostrar += "\n  Calculando Imposto Cosip TE = " + Cosip();
	        mostrar += "\n  Calculando Imposto Cosip TE Mais Consumo De Energia = " + Calculando_Imposto_Cosip_TE_Final();
	        //3
	        mostrar += "\n  Calculando Imposto Icms TE = " + Calculando_Imposto_Icms_TE();
	        mostrar += "\n  Calculando Imposto Icms TE Mais Consumo De Energia = " + Calculando_Imposto_Icms_TE_Final();
	        
	        mostrar += "\n";
	        //4
	        mostrar += "\n  Calculando Imposto Cofins TUSD = " + Calculando_Imposto_Cofins_TUSD();
	        mostrar += "\n  Calculando Imposto Cofins TUSD Mais Consumo De Energia = " + Calculando_Imposto_Cofins_TUSD_Final();
	        //5
	        mostrar += "\n  Calculando Imposto Cosip TUSD = " + Cosip();
	        mostrar += "\n  Calculando Imposto Cosip TUSD Mais Consum De Energia = " + Calculando_Imposto_Cosip_TUSD();
	        //6
	        mostrar += "\n  Calculando Imposto Icms TUSD = " + Calculando_Imposto_Icms_TUSD();
	        mostrar += "\n  Calculando Imposto Icms TUSD Mais Consumo De Energia = " + Calculando_Imposto_Icms_TUSD_Final();
	        
	        mostrar += "\n";
	        
	        mostrar += "\n  Resultado TE = " + TE_Resultado();
	        mostrar += "\n  Resultado TUSD= " + TUSD_Resultado();
	        
	            return mostrar;
	        }
	}