/*exercício 5.9 Escreva um programa que leia vários valores de X. Para cada valor lido, calcule o valor de Y dado pela fórmula:
Y=2,5*cos|X/2|
Informe todos os pares de valores X e Y.
 * Alunos: Douglas Paulo e lígia.
 */
programa
{
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{
		real x=0, y=0, cont=0, cosseno=0
		caracter R='S'
	
		enquanto(R!='N'){
			escreva("Informe um valor para x: ")
			leia(x)
			cosseno = x/2
			y=2.5*cosseno

			escreva("O valor de x ", x , " o valor de y ", y)

			escreva("\nQuer continuar?(S/N) ")
			leia(R)
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 219; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */