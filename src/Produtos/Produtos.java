package Produtos;

public class Produtos {

	public static int tabule[][] = {
		{1, 0, 0, 0, 0, 0, 0},		//carboidratos
		{2, 3, 4, 5, 6, 7, 0},		//horaliças, legumes e verduras
		{8, 9, 13, 14, 0, 0, 0}		//proteínas
	};

	public static int faouche[][] = {
		{15, 0, 0, 0, 0, 0, 0},		//carboidratos
		{10, 5, 11, 4, 2, 3, 12},	//horaliças, legumes e verduras,
		{9, 13, 14, 0, 0, 0, 0} 	//proteínas
	};

	public static int arrozMarroquinoCarneiro[][] = {
		{20, 0, 0, 0, 0, 0, 0},		//carboidratos
		{18, 9, 0, 0, 0, 0, 0},		//horaliças, legumes e verduras,
		{16, 17, 21, 22, 0, 0, 0}	//proteínas
	};
	
	public static void prato (int escolha){
		String[] lista = new String[10];

		switch(escolha){
			case 1:
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 7; i++){
						if(tabule[i][j] == 1){
							lista[i+j] = "trigo para quibe";
						}
						else if(tabule[i][j] == 2){
							lista[i+j] = "salsa";
						}
						else if(tabule[i][j] == 3){
							lista[i+j] = "hortelã";
						}
						else if(tabule[i][j] == 4){
							lista[i+j] = "cebola";
						}
						else if(tabule[i][j] == 5){
							lista[i+j] = "tomate";
						}
						else if(tabule[i][j] == 6){
							lista[i+j] = "pepino";
						}
						else if(tabule[i][j] == 7){
							lista[i+j] = "cebolinha";
						}
						else if(tabule[i][j] == 8){
							lista[i+j] = "limão";
						}
						else if(tabule[i][j] == 9){
							lista[i+j] = "azeite";
						}
						else if(tabule[i][j] == 10){
							lista[i+j] = "rabanete";
						}
						else if(tabule[i][j] == 11){
							lista[i+j] = "pepino japonês";
						}
						else if(tabule[i][j] == 12){
							lista[i+j] = "alface";
						}
						else if(tabule[i][j] == 13){
							lista[i+j] = "sal";
						}
						else if(tabule[i][j] == 14){
							lista[i+j] = "pimenta";
						}
						else if(tabule[i][j] == 15){
							lista[i+j] = "torradas";
						}
						else if(tabule[i][j] == 16){
							lista[i+j] = "carne de carneiro";
						}
						else if(tabule[i][j] == 17){
							lista[i+j] = "coalhada";
						}
						else if(tabule[i][j] == 18){
							lista[i+j] = "alho";
						}
						else if(tabule[i][j] == 19){
							lista[i+j] = "água";
						}
						else if(tabule[i][j] == 20){
							lista[i+j] = "arroz";
						}
						else if(tabule[i][j] == 21){
							lista[i+j] = "manteiga";
						}
						else if(tabule[i][j] == 22){
							lista[i+j] = "carne de patinho";
						}
						else if(tabule[i][j] == 23){
							lista[i+j] = "pimenta síria";
						}
					}
				}
			for(int i=0; i < lista.length; i++){
				System.out.print(lista[i]);
			}
			break;
			case 2:
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 7; i++){
						if(faouche[i][j] == 1){
							lista[i+j] = "trigo para quibe";
						}
						else if(faouche[i][j] == 2){
							lista[i+j] = "salsa";
						}
						else if(faouche[i][j] == 3){
							lista[i+j] = "hortelã";
						}
						else if(faouche[i][j] == 4){
							lista[i+j] = "cebola";
						}
						else if(faouche[i][j] == 5){
							lista[i+j] = "tomate";
						}
						else if(faouche[i][j] == 6){
							lista[i+j] = "pepino";
						}
						else if(faouche[i][j] == 7){
							lista[i+j] = "cebolinha";
						}
						else if(faouche[i][j] == 8){
							lista[i+j] = "limão";
						}
						else if(faouche[i][j] == 9){
							lista[i+j] = "azeite";
						}
						else if(faouche[i][j] == 10){
							lista[i+j] = "rabanete";
						}
						else if(faouche[i][j] == 11){
							lista[i+j] = "pepino japonês";
						}
						else if(faouche[i][j] == 12){
							lista[i+j] = "alface";
						}
						else if(faouche[i][j] == 13){
							lista[i+j] = "sal";
						}
						else if(faouche[i][j] == 14){
							lista[i+j] = "pimenta";
						}
						else if(faouche[i][j] == 15){
							lista[i+j] = "torradas";
						}
						else if(faouche[i][j] == 16){
							lista[i+j] = "carne de carneiro";
						}
						else if(faouche[i][j] == 17){
							lista[i+j] = "coalhada";
						}
						else if(faouche[i][j] == 18){
							lista[i+j] = "alho";
						}
						else if(faouche[i][j] == 19){
							lista[i+j] = "água";
						}
						else if(faouche[i][j] == 20){
							lista[i+j] = "arroz";
						}
						else if(faouche[i][j] == 21){
							lista[i+j] = "manteiga";
						}
						else if(faouche[i][j] == 22){
							lista[i+j] = "carne de patinho";
						}
						else if(faouche[i][j] == 23){
							lista[i+j] = "pimenta síria";
						}
					}
				}
			for(int i=0; i < lista.length; i++){
				System.out.print(lista[i]);
			}
			break;
			case 3:
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 7; i++){
						if(arrozMarroquinoCarneiro[i][j] == 1){
							lista[i+j] = "trigo para quibe";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 2){
							lista[i+j] = "salsa";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 3){
							lista[i+j] = "hortelã";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 4){
							lista[i+j] = "cebola";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 5){
							lista[i+j] = "tomate";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 6){
							lista[i+j] = "pepino";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 7){
							lista[i+j] = "cebolinha";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 8){
							lista[i+j] = "limão";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 9){
							lista[i+j] = "azeite";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 10){
							lista[i+j] = "rabanete";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 11){
							lista[i+j] = "pepino japonês";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 12){
							lista[i+j] = "alface";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 13){
							lista[i+j] = "sal";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 14){
							lista[i+j] = "pimenta";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 15){
							lista[i+j] = "torradas";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 16){
							lista[i+j] = "carne de carneiro";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 17){
							lista[i+j] = "coalhada";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 18){
							lista[i+j] = "alho";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 19){
							lista[i+j] = "água";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 20){
							lista[i+j] = "arroz";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 21){
							lista[i+j] = "manteiga";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 22){
							lista[i+j] = "carne de patinho";
						}
						else if(arrozMarroquinoCarneiro[i][j] == 23){
							lista[i+j] = "pimenta síria";
						}
					}
				}
			for(int i=0; i < lista.length; i++){
				System.out.print(lista[i]);
			}
			break;
		}
	}
}
