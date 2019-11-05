/*
 * Faça um algoritmo que leia 4 números inteiros e informe a quantidade de números pares.
 */
programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro N, div, cont=1, qpar=0
		enquanto (cont<=4){
			escreva("Informe um número:")
			leia(N)
			div = N % 2
			se (div==0){
				qpar++	
			}//Fim do se
			cont++
		}//Fim do enquanto
		limpa()
		escreva("Quantidade de números pares lidos: ", qpar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */