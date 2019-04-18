programa
{
	
	funcao inicio()
	{
		inteiro N, div, cont, qimpar=0
		para(cont=1; cont<=10; cont++){
			escreva("Informe um valor: ")
			leia(N)
			div = N % 2
			se (div != 0){
				qimpar ++
			}
		}
		limpa()	
		escreva("A quantidade de números ímpares foi de: ", qimpar)		
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 106; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */