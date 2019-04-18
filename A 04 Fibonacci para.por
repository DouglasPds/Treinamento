programa
{
	
	funcao inicio()
	{
		inteiro N, p1, p2, p3, cont
		escreva("Informe até quanto você quiser contar: ")
		leia(N)
		p1=1
		p2=2
		escreva(p1, " ", p2)
		para(cont=3; cont<=N; cont++){
			p3 = p1 + p2
			escreva (" ", p3, " ")
			p1 = p2
			p2 = p3
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */