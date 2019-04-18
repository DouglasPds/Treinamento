/*
 * A série de Fibonacci é dada pela sequência 1, 1, 2, 3, 5, 8, 13, 21, 34, 55... 
 * Os dois primeiros termos são iguais a 1 e, a partir do terceiro termo, o termo é dado pela sema dos dois termos anteriores.
 * Dado um número N, que corresponde ao N-ésimo termo, exiba a sequência de Fibonacci até N.
 */
programa
{
	
	funcao inicio()
	{
		inteiro N, p1, p2, p3, cont=3
		escreva("Digite até qual posição você quer contar: ")
		leia(N)
		p1=1
		p2=1
		escreva(p1, " ", p2)
		enquanto(cont<=N){
			p3 = p1+p2
			escreva( " ", p3 ," ")
			p1 = p2
			p2 = p3
			cont++
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 575; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */