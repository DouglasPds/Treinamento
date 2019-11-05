/*
 * Faça um algoritmo que receba 10 números inteiros, calcule e mostre a quantidade de números ímpares.
 */
programa
{
	
	funcao inicio()
	{
		inteiro N, div, cont=1, qimpar=0
		enquanto (cont<=10){
			escreva("Informe um número:")
			leia(N)
			div = N % 2
			se (div != 0){
				qimpar++
			}//Fim se
			cont++
		}//Fim enquanto
		escreva("A quantidade de números ímpares digitados é de: ", qimpar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */