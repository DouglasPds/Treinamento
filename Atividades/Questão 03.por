programa
{
	
	funcao inicio()
	{
		real idade, altura, peso, pesvelha=0, medialtu, porcentagem, cont=0, qpessoas=0, soma=0, pes40=0

		enquanto(cont<=5){
			escreva("Pessoa: ", cont+1)
			escreva("\nInforme a idade: ")
			leia(idade)
			escreva("Informa a altura: ")
			leia(altura)
			escreva("Informe o peso: ")
			leia(peso)
			escreva("\n")
	
			se (idade>50){
				pesvelha++
			}
			se (idade>10 e idade<20){
				soma = soma + altura
				qpessoas++
			}
			se (peso<40){
				pes40++
			}
			cont++
		}
		escreva("A quantidade de pessoas com idade superior a 50 anos", pesvelha)
		medialtu = soma/qpessoas
		escreva("\nA média das alturas das pessoas com idade entre 10 e 20 anos", medialtu)
		porcentagem = (pes40.100)/5
		escreva("\nA porcentagem de pessoas com o peso inferior a 40 kg", porcentagem)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 744; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */