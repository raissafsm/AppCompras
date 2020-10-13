package Produtos;

public class Produtos {
/* 
 * NULO				= 0
 * trigo para quibe (triguilho)	= 1
 * folha de salsa		= 2
 * folha de hotelã		= 3
 * cebola			= 4
 * tomate			= 5
 * pepino			= 6
 * cebolinha			= 7
 * limão			= 8
 * azeite			= 9
 * rabanete			= 10
 * pepino japonês		= 11
 * alface			= 12
 * sal				= 13
 * pimenta			= 14
 * torrada (pão)		= 15
 * carne de carneiro		= 16
 * coalhada			= 17
 * alho				= 18
 * agua				= 19
 * arroz			= 20
 * manteiga			= 21
 * carne patinho		= 22
 * pimenta síria		= 23
 */

	// Mtartizes com cada um dos produto em "pacotes"
	// separados por tipo (ao lado de cada linha).
	public static int tabule[][] = {
		{1, 0, 0, 0, 0, 0, 0},		//carboidratos
		{2, 3, 4, 5, 6, 7, 0},		//horaliças, legumes e verduras
		{8, 9, 13, 14, 0, 0, 0}		//proteínas
	};

	public static int fatouche[][] = {
		{15, 0, 0, 0, 0, 0, 0},		//carboidratos
		{10, 5, 11, 4, 2, 3, 12},	//horaliças, legumes e verduras,
		{9, 13, 14, 0, 0, 0, 0} 	//proteínas
	};

	public static int arrozMarroquinoCarneiro[][] = {
		{20, 0, 0, 0, 0, 0, 0},		//carboidratos
		{18, 9, 0, 0, 0, 0, 0},		//horaliças, legumes e verduras,
		{16, 17, 21, 22, 0, 0, 0}	//proteínas
	};
	
	// Função que recebe opções de escolha do menu e transforma matrizes
	// de catalogo interno em um vetor com nomes dos ingredientes
	// que será impresso na tela do usuário.
	public static void prato (int resp2){
		int ingredientes = 0;

		switch(resp2){
			case 1:
				// Checa quantos ingredientes em cada pacote(matriz)
				for(int i = 0; i < 3; i++){
					for(int j = 0; j < 7; j++){
						if(tabule[i][j] != 0){
							ingredientes++;
						}
					}
				}

				// Cria vetor com tamanho igual a quantidade de ingredientes
				// Substitui código por nome de ingrediente e atribui nome ao vetor itens
				String[] itens = new String[ingredientes];
				

				break;
			case 2:
				// alguma coisa/lógica para encher um vetor de Strings
				break;
			case 3:
				// alguma coisa/lógica para encher um vetor de Strings
				break;
		}
	}
}
