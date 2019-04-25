/*exercício 5.19 Foi realizada uma pesquisa em Porto Alegre, com um número desconhecido de pessoas. De cada entrevistado foram colhidos os seguintes dados:
 * ■	qual seu clube de futebol de preferência (1-Grêmio; 2-Internacional; 3-Outros); ■	qual seu salário; ■	qual a sua cidade natal (0-Porto Alegre; 1-Outras).
 Escreva um programa que informe:
 
1.	número de torcedores por clube; 2.	média salarial dos torcedores do Grêmio e do Internacional; 3.	número de pessoas nascidas em Porto Alegre que não torcem por qualquer dos dois pri-
meiros clubes; 4.	número de pessoas entrevistadas.
	Alunos: Douglas Paulo e Lígia.
 */

programa
{
	
	funcao inicio()
	{
		real cont=0 , clube, sal, cidade, gremio=0, inter=0, outro=0, soma1=0, soma2=0, media1=0, media2=0, nump=0
		caracter R='S'
		
		enquanto(R!='N'){
			escreva("Qual seu clube de futebol de preferência: sendo 1-Grêmio, 2-Internacional, 3-Outros: ")
			leia(clube)
			se (clube == 1){
				gremio = gremio + 1
			}
			senao {
				se (clube == 2){
					inter = inter + 1
				}
				senao outro = outro + 1
			}
			escreva("Qual seu salário: ")
			leia(sal)
			se (clube == 1){
				soma1 = soma1 + sal
			}
			senao se (clube == 2){
				soma2 = soma2 + sal 
			}
			escreva("Qual a sua cidade natal: sendo 0-Porto Alegre, 1-Outras: ")
			leia(cidade)
			se (cidade == 0 e clube == 3){
				nump = nump + 1
			}
			
			cont++
			
			escreva("\nQuer continuar?(S/N) ")
			leia(R)

			limpa()
		}
		media1 = soma1 / gremio
		media2 = soma2 / inter
		escreva("\nA quantidade de torcedores por clube, Grêmio: " , gremio, ", Internacional: " , inter, ", Outros:" , outro)
		escreva("\nA média salarial dos torcedores do Grêmio: ", media1, ", e do Internacional:" , media2)
		escreva("\nO número de pessoas nascidas em Porto Alegre que não torcem para qualquer dos dois primeiros clubes é de: ", nump)
		escreva("\nO número de pessoas entrevistados foi de: ", cont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 626; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */