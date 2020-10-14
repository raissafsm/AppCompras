package Default;

import java.util.*;

public class geral {

	public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        
        int resp1, resp2=0, cep1, op1;
        String usuario;
       
        String email="teste",senha="teste",emailCad="generation@gmail.com",senhaCad="g1234";
        
        String[][] tabule = {
    			{"trigo para quibe", "nulo", "nulo", "nulo", "nulo", "nulo", "nulo"}, 
    			{"salsa", "hortelã", "cebola", "tomate", "pepino", "cebolinha", "nulo"},
    			{"limão", "azeite", "sal", "pimenta", "nulo", "nulo", "nulo"}
    		};

    		String[][] fatouche = {
    			{"torrada", "nulo", "nulo", "nulo", "nulo", "nulo", "nulo"},
    			{"rabanete", "tomate", "pepino japonês", "cebola", "salsa", "hortelã", "alface"},
    			{"azeite", "sal", "pimenta", "nulo", "nulo", "nulo", "nulo"}
    		};

    		String[][] arrozMarroquinoCarneiro = {
    			{"arroz", "nulo", "nulo", "nulo", "nulo", "nulo", "nulo"},
    			{"alho", "nulo", "nulo", "nulo", "nulo", "nulo", "nulo"},
    			{"carne de carneiro", "coalhada", "manteiga", "carne patinho", "nulo", "nulo", "nulo"}
    		};

        System.out.println("Bem vindo(a) ao Your Kitchen");
        
        

        System.out.println("\n1 - Fazer cadastro");
        System.out.println("2 - Fazer login");
        System.out.printf("\nDigite 1 ou 2 para a op��o desejada: ");
        op1 = ler.nextInt();
        
        if(op1==1){
        	System.out.println("Digite seu nome: ");
        	usuario = ler.next();
            System.out.printf("\n" + usuario + " cadastre seu e-mail: ");
            email = ler.next();
            System.out.printf("Cadastre uma senha: ");
            senha = ler.next();
            /*
             * 	if(Objects.equals(senha, senha0))
             * 
             */
         //   System.out.println("\n Usuário logado!");

        }else if (op1==2){
		int cont = 0;
            do {

                if(Objects.equals(email,emailCad) == false && cont >= 1){
                	System.out.println("\nE-mail inv�lido!");
                }
                if(Objects.equals(senha,senhaCad) == false && cont >= 1){
                    System.out.println("Senha inv�lida!");
                }

            	System.out.printf( "\nInsira seu e-mail: ");
            	email = ler.next();

            	System.out.printf("Insira uma senha: ");
            	senha = ler.next();
	    

            	cont++;

            }while(Objects.equals(email,emailCad) == false || Objects.equals(senha,senhaCad) == false);
        System.out.println("\nUsu�rio logado!");
        }
    
        System.out.println("Digite 1 para o prato do dia");
    	System.out.println("Digite 2 para lista de mercados");
    	resp1 = ler.nextInt();
    	
    	switch (resp1) {
    		case 1:
    			System.out.println("Os nossos pratos são:");
    			System.out.println("Tabule");
    			System.out.println("Fatouche");
    			System.out.println("Arroz Marroquino de Carneiro");	
    			
    			System.out.println("\nDigite 1 para Tabule ");
    			System.out.println("Digite 2 para Fatouche ");
    			System.out.println("Digite 3 Arroz Marroquino de Carneiro");
    			resp2 = ler.nextInt();
    			break;
    		case 2: 
    			do {
    			System.out.println("Insira seu cep:");
    			cep1 = ler.nextInt();
    		  			
    			
    			/*
    			System.out.println("Digite seu CEP, não precisa do zero do começo e nem dos prefixos(3 ultimos do final): ");
    			cep=ler.nextInt();
    			
    			*/
    				
    			if(cep1>=1000 && cep1<=1599){
    				System.out.println("A sua região é no Centro");
    				System.out.println("\nTemos os seguintes mercados nessa região: Supermercado Dia, Roldão, Extra, Comprebem.");
    			}
    			
    			else if (cep1>=2000 && cep1<=2999){
    				System.out.println("A sua região é na zona Norte");
    				System.out.println("\nTemos os seguintes mercados nessa região: Supermercado Dia, Roldão, Extra, Comprebem.");
    			}
    			else if (cep1>=4000 && cep1<=5899){
    				System.out.println("A sua região é na zona Sul");
    				System.out.println("\nTemos os seguintes mercados nessa região: Supermercado Dia, Roldão, Extra, Comprebem.");
    			}
    			else if (cep1>=3000 && cep1<=3999 || cep1>=8000 && cep1<=8499){
    				System.out.println("A sua região é na zona Leste");
    				System.out.println("\nTemos os seguintes mercados nessa região: Supermercado Dia, Roldão, Extra, Comprebem.");
    			}
    			else if (cep1>=5000 && cep1<=5599){
    				System.out.println("A sua região é na zona Sul");
    				System.out.println("\nTemos os seguintes mercados nessa região: Supermercado Dia, Roldão, Extra, Comprebem.");
    			}
    			else{
    				System.out.println("Desculpa sua região ainda não foi mapeada, digite um CEP valido para cidade de São Paulo");
    			}
    			
    			} while(cep1 <= 1000 || cep1 >= 5599);
    			
    	}
    
		
		switch(resp2){
			case 1:
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 7; j++){
						if(tabule[i][j] != "nulo")
							System.out.println(tabule[i][j]);
					}
				}
				break;

			case 2:
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 7; j++){
						if(fatouche[i][j] != "nulo")
							System.out.println(fatouche[i][j]);
					}
				}
				break;

			case 3:
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 7; j++){
						if(arrozMarroquinoCarneiro[i][j] != "nulo")
							System.out.println(arrozMarroquinoCarneiro[i][j]);
					}
				}
				break;
		}
	
	}
	
}
	    
	
