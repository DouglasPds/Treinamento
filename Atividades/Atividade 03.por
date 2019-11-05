/*
 * Escreva um algoritmo que leia um conjunto de 5 números inteiros e mostre qual foi o maior e o menor valor fornecido.
 */
programa
{
	
	funcao inicio()
	{
		inteiro N, cont=1, Mvalor=0, mevalor=0
		escreva("Informe um número: ")
		leia(N)
		Mvalor=N
		mevalor=N
		enquanto(cont<=4){
			escreva("Informe um número: ")
			leia(N)
			se (N>Mvalor){
				Mvalor = N
			}
			se (N<mevalor){
				mevalor = N
			}
			cont++
		}
		escreva("O maior valor digitado foi ", Mvalor, ", e o menor valor digitado foi ", mevalor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 248; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */