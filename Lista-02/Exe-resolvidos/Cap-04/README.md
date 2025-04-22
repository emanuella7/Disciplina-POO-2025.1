## Questão 1.
A nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. A média das três notas mencionadas

obedece aos pesos a seguir:

| Nota | PESO |
|------| :---:|
|Trabalho de laboratório| 2|
|Avaliação semestral| 3|
|Exame final| 5|

Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito que segue
a tabela:

|MÉDIA PONDERADA| CONCEITO|
|---------------| :---:   |
|8,0 a 10,0 |A|
|7,0 a 8,0| B|
|6,0 a  7,0| C|
|5,0 a 6,0| D|
|0,0 a 5,0| E|

Solução:
###### ALGORITMO
###### DECLARE nota_trab, aval_sem, exame, media NUMÉRICO
###### ESCREVA “Digite a nota do trabalho de laboratório: “
###### LEIA nota_trab
###### ESCREVA “Digite a nota da avaliação semestral: “
###### LEIA aval_sem
###### ESCREVA “Digite a nota do exame final: “
###### LEIA exame
###### media ← (nota_trab * 2 + aval_sem * 3 + exame * 5) / 10
###### ESCREVA “Média ponderada: “ , media
###### SE media >= 8 E media <= 10

###### ENTÃO ESCREVA “Obteve conceito A”
###### SE media >= 7 E media < 8
###### ENTÃO ESCREVA “Obteve conceito B”
###### SE media >= 6 E media < 7
###### ENTÃO ESCREVA “Obteve conceito C”
###### SE media >= 5 E media < 6
###### ENTÃO ESCREVA “Obteve conceito D”
###### SE media >= 0 E media < 5
###### ENTÃO ESCREVA “Obteve conceito E”
###### FIM_ALGORITMO.


## Questão 2.
   Faça um programa que receba três notas de um aluno, calcule e mostre a média aritmética e a mensagem
constante na tabela a seguir. Aos alunos que ficaram para exame, calcule e mostre a nota que deverão
tirar para serem aprovados, considerando que a média exigida é 6,0.
| MÉDIA ARITMÉTICA | MENSAGEM   |
|------------------|------------|
| 0,0 — 3,0        | Reprovado  |
| 3,0 — 7,0        | Exame      |
| 7,0 — 10,0       | Aprovado   |


Solução:
###### ALGORITMO
###### DECLARE nota1, nota2, nota3, media, nota_exame NUMÉRICO
###### ESCREVA “Digite a primeira nota: “
###### LEIA nota1
###### ESCREVA “Digite a segunda nota: “
###### LEIA nota2
###### ESCREVA “Digite a terceira nota: “
###### LEIA nota3
###### media ← (nota1 + nota2 + nota3) / 3
###### ESCREVA “Média aritmética: “,media
###### SE media >= 0 E media < 3
###### ENTÃO ESCREVA “Reprovado”
###### SE media >= 3 E media < 7
###### ENTÃO INÍCIO
###### ESCREVA “Exame”
###### nota_exame ← 12 - media



###### ESCREVA “Deve tirar nota”, nota_exame, “para ser aprovado”
###### FIM

###### SE media >= 7 E media <= 10
###### ENTÃO ESCREVA “Aprovado”
###### FIM_ALGORITMO.


## Questão 3.
  Faça um programa que receba dois números e mostre o maior.

Solução:
###### ALGORITMO
###### DECLARE num1, num2 NUMÉRICO
###### ESCREVA “Digite o primeiro número: “
###### LEIA num1
###### ESCREVA “Digite o segundo número: “
###### LEIA num2
###### SE num1 > num2
###### ENTÃO ESCREVA “O maior número é: “, num1
###### SE num2 > num1
###### ENTÃO ESCREVA “O maior número é: “, num2
###### SE num1 = num2
###### ENTÃO ESCREVA “Os números são iguais “
###### FIM_ALGORITMO.


## Questão 4.
Faça um programa que receba três números e mostre-os em ordem crescente. Suponha que o usuário
digitará três números diferentes.
Solução:
###### ALGORITMO
###### DECLARE num1, num2, num3 NUMÉRICO
###### ESCREVA “Digite o primeiro número: “
###### LEIA num1
###### ESCREVA “Digite o segundo número: “
###### LEIA num2
###### ESCREVA “Digite o terceiro número: “
###### LEIA num3
###### SE num1 < num2 E num1 < num3
###### ENTÃO SE num2 < num3
###### ENTÃO ESCREVA “A ordem crescente é: “,num1,“-”,num2,“-”,num3
###### SENÃO ESCREVA “A ordem crescente é: “,num1,“-”,num3,“-”,num2
###### SE num2 < num1 E num2 < num3
###### ENTÃO SE num1 < num3
###### ENTÃO ESCREVA “A ordem crescente é: “,num2,“-”,num1,“-”,num3
###### SENÃO ESCREVA “A ordem crescente é: “,num2,“-”,num3,“-”,num1
###### SE num3 < num1 E num3 < num2
###### ENTÃO SE num1 < num2
###### ENTÃO ESCREVA “A ordem crescente é: “,num3,“-”,num1,“-”,num2
###### SENÃO ESCREVA “A ordem crescente é: “,num3,“-”,num2,“-”,num1
###### FIM_ALGORITMO.



## Questão 5.
Faça um programa que receba três números obrigatoriamente em ordem crescente e um quarto núme-
ro que não siga essa regra. Mostre, em seguida, os quatro números em ordem decrescente. Suponha

que o usuário digitará quatro números diferentes.
Solução:
###### ALGORITMO
###### DECLARE num1, num2, num3, num4 NUMÉRICO
###### ESCREVA “Digite três números em ordem crescente: “
###### LEIA num1
###### LEIA num2
###### LEIA num3
###### ESCREVA “Digite um número (fora de ordem): “
###### LEIA num4
###### SE num4 > num3


###### ENTÃO ESCREVA “A ordem decrescente é: “,num4,“-”,num3,“-”,num2,“-”,num1
###### SE num4 > num2 E num4 < num3
###### ENTÃO ESCREVA “A ordem decrescente é: “,num3,“-”,num4,“-”,num2,“-”,num1
###### SE num4 > num1 E num4 < num2
###### ENTÃO ESCREVA “A ordem decrescente é: “,num3,“-”,num2,“-”,num4, “-”,num1
###### SE num4 < num1
###### ENTÃO ESCREVA “A ordem decrescente é: “,num3,“-”,num2,“-”,num1,“-”,num4
###### FIM_ALGORITMO.

## Questão 6.
Faça um programa que receba um número inteiro e verifique se é par ou ímpar.

Solução:
###### ALGORITMO
###### DECLARE num, r NUMÉRICO
###### ESCREVA “Digite um número: “
###### LEIA num
###### r ← RESTO(num/2)
###### SE r = 0
###### ENTÃO ESCREVA “O número é par”
###### SENÃO ESCREVA “O número é ímpar”
###### FIM_ALGORITMO.


## Questão 7.
Faça um programa que receba quatro valores: I, A, B e C. Desses valores, I é inteiro e positivo, A, B e
C são reais. Escreva os números A, B e C obedecendo à tabela a seguir.
Suponha que o valor digitado para I seja sempre um valor válido, ou seja, 1, 2 ou 3, e que os números
digitados sejam diferentes um do outro.

| VALOR DE I | FORMA A ESCREVER                                |
|------------|--------------------------------------------------|
| 1          | A, B e C em ordem crescente                      |
| 2          | A, B e C em ordem decrescente                    |
| 3          | O maior fica entre os outros dois números       |


Solução:
###### ALGORITMO
###### DECLARE A, B, C, I NUMÉRICO
###### ESCREVA “Digite um valor para A:”
###### LEIA A
###### ESCREVA “Digite um valor para B:”
###### LEIA B
###### ESCREVA “Digite um valor para C:”
###### LEIA C
###### ESCREVA “Digite um valor para I (1, 2 ou 3):”
###### LEIA I
###### SE I=1
###### ENTÃO INÍCIO
###### SE A<B E A<C
###### ENTÃO SE B<C
###### ENTÃO ESCREVA “A ordem crescente dos números é:”,A,” -”,B,”-”,C
###### SENÃO ESCREVA “A ordem crescente dos números é:”,A,” -”,C,”-”,B
###### SE B<A E B<C
###### ENTÃO SE A<C
###### ENTÃO ESCREVA “A ordem crescente dos números é:”,B,”-”,A,”-”,C
###### SENÃO ESCREVA “A ordem crescente dos números é: “,B,”-”,C,”-”,A
###### SE C<A E C<B
###### ENTÃO SE A<B
###### ENTÃO ESCREVA “A ordem crescente dos números é: “,C,”-”,A,”-”,B
###### SENÃO ESCREVA “A ordem crescente dos números é: “,C,”-”,B,”-”,A
###### FIM
###### SE I=2
###### ENTÃO INÍCIO
###### SE A>B E A>C
###### ENTÃO SE B>C
###### ENTÃO ESCREVA “A ordem decrescente dos números é: “,A,” -”,B,”-”,C
###### SENÃO ESCREVA “A ordem decrescente dos números é: “,A,” -”,C,”-”,B
###### SE B>A E B>C
###### ENTÃO SE A>C
###### ENTÃO ESCREVA “A ordem decrescente dos números é: “,B,” -”,A,”-”,C
###### SENÃO ESCREVA “A ordem decrescente dos números é: “,B,” -”,C,”-”,A
###### SE C>A E C>B
###### ENTÃO SE A>B
###### ENTÃO ESCREVA “A ordem decrescente dos números é: “,C,” -”,A,”-”,B
###### SENÃO ESCREVA “A ordem decrescente dos números é: “,C,” -”,B,”-”,A
###### FIM
###### SE I=3



###### ENTÃO INÍCIO
###### SE A>B E A>C
###### ENTÃO ESCREVA “A ordem desejada é: “,B,”-”,A,”-”,C
###### SE B>A E B>C
###### ENTÃO ESCREVA “A ordem desejada é: “,A,”-”,B,”-”,C
###### SE C>A E C>B
###### ENTÃO ESCREVA “A ordem desejada é: “,A,”-”,C,”-”,B
###### FIM
###### FIM_ALGORITMO.

## Questão 8.
Faça um programa que mostre o menu de opções a seguir, receba a opção do usuário e os dados neces-
sários para executar cada operação.

Menu de opções:
1. Somar dois números.
2. Raiz quadrada de um número.

Digite a opção desejada:

Solução:
###### ALGORITMO
###### DECLARE num1, num2, soma, raiz, op NUMÉRICO
###### ESCREVA “ MENU”
###### ESCREVA “1- Somar dois números”
###### ESCREVA “2- Raiz quadrada de um número”
###### ESCREVA “Digite sua opção: “
###### LEIA op
###### SE op = 1
###### ENTÃO INÍCIO
###### ESCREVA “Digite um valor para o primeiro número:”
###### LEIA num1

###### ESCREVA “Digite um valor para o segundo número:”
###### LEIA num2
###### soma ← num1 + num2
###### ESCREVA “A soma de “,num1,” e “,num2,” é “,soma
###### FIM
###### SE op = 2
###### ENTÃO INÍCIO
###### ESCREVA “Digite um valor: “
###### LEIA num1
###### raiz ← 1
###### ESCREVA “A raiz quadrada de “,num1,” é “,raiz
###### FIM
###### SE op ≠ 1 E op ≠ 2
###### ENTÃO ESCREVA “Opção inválida!”
###### FIM_ALGORITMO.



## Questão 9.
Faça um programa que mostre a data e a hora do sistema nos seguintes formatos: DD/MM/AAAA –
mês por extenso e hora:minuto.
Solução:
###### ALGORITMO
###### DECLARE t, d, dia, mes, ano, hora, min NUMÉRICO
###### d ← OBTENHA_DATA;
###### dia ← OBTENHA_DIA(d)
###### mes ← OBTENHA_MÊS(d)
###### ano ← OBTENHA_ANO(d)
###### ESCREVA “Data Atual: “ , dia, “/”, mes, “/”, ano, “ – ”
###### SE mes = 1
###### ENTÃO ESCREVA “janeiro”
###### SE mes = 2
###### ENTÃO ESCREVA “fevereiro”


###### SE mes = 3
###### ENTÃO ESCREVA “março”
###### SE mes = 4
###### ENTÃO ESCREVA “abril”
###### SE mes = 5
###### ENTÃO ESCREVA “maio”
###### SE mes = 6
###### ENTÃO ESCREVA “junho”
###### SE mes = 7
###### ENTÃO ESCREVA “julho”
###### SE mes = 8
###### ENTÃO ESCREVA “agosto”
###### SE mes = 9
###### ENTÃO ESCREVA “setembro”
###### SE mes = 10
###### ENTÃO ESCREVA “outubro”
###### SE mes = 11
###### ENTÃO ESCREVA “novembro”
###### SE mes = 12
###### ENTÃO ESCREVA “dezembro”
###### t ← OBTENHA_HORÁRIO;
###### hora ← OBTENHA_HORA(t)
###### min ← OBTENHA_MINUTO(t)
###### ESCREVA “Hora Atual: “
###### ESCREVA hora, “:” , min
###### FIM_ALGORITMO.

## Questão 10.
Faça um programa que determine a data cronologicamente maior entre duas datas fornecidas pelo
usuário. Cada data deve ser composta por três valores inteiros, em que o primeiro representa o dia, o
segundo, o mês e o terceiro, o ano.


Solução:
###### ALGORITMO
###### DECLARE d1,m1,a1,d2,m2,a2 NUMÉRICO
###### ESCREVA “Digite a primeira data”
###### ESCREVA “ dia (dd): “
###### LEIA d1
###### ESCREVA “ mês (mm): “
###### LEIA m1
###### ESCREVA “ ano (aaaa): “
###### LEIA a1
###### ESCREVA “Digite a segunda data”
###### ESCREVA “ dia (dd): “
###### LEIA d2
###### ESCREVA “ mês (mm): “
###### LEIA m2
###### ESCREVA “ ano (aaaa): “
###### LEIA a2
###### SE a1>a2
###### ENTÃO ESCREVA “A maior data é: “,d1,”-”,m1,”-”,a1
###### SENÃO SE a2>a1
###### ENTÃO ESCREVA “A maior data é: “,d2,”-”,m2,”-”,a2
###### SENÃO SE m1>m2
###### ENTÃO ESCREVA “A maior data é: “,d1,”-”,m1,”-”,a1
###### SENÃO SE m2>m1
###### ENTÃO ESCREVA “A maior data é: “,d2, “-”,m2,”-”,a2
###### SENÃO SE d1>d2
###### ENTÃO ESCREVA “A maior data é: “-”,d1,”-”,m1,” -”,a1
###### SENÃO SE d2>d1
###### ENTÃO ESCREVA “A maior data é: “,d2,” -”,m2,”-”,a2
###### SENÃO ESCREVA “As datas são iguais !”

###### FIM_ALGORITMO.


