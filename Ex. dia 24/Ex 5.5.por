programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real result=1, num=33, den=1, cont=0, soma=0
		enquanto(result>0.01){
			
			result=num/(den*den)
			soma = soma + result
			num = num -2
			den = den +1
			cont++
		}
		escreva("A quantidade de termos utilizada foi de " , cont)
		escreva("\n", result)
		escreva("\nA soma da série foi de ", soma)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */