programa
{
	
	funcao inicio()
	{
		inteiro n=0, cont=0, soma=0
		escreva("=====SOMANDO VALORES=====")
		escreva("\n")
		enquanto(n!=31){
			escreva("Digite um valor para a soma: ")
			leia(n)
			se (n>7){
				soma = soma + n
			}
		}
		escreva("O valor da soma foi de: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 151; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */