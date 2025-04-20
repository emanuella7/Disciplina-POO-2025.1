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


## Questão 11.
Faça um programa que receba a hora do início de um jogo e a hora do término (cada hora é composta
por duas variáveis inteiras: hora e minuto). Calcule e mostre a duração do jogo (horas e minutos),
sabendo que o tempo máximo de duração do jogo é de 24 horas e que ele pode começar em um dia e
terminar no dia seguinte.
Solução:
###### ALGORITMO
###### DECLARE hora_i, min_i, hora_f, min_f, hora_d, min_d NUMÉRICO
###### ESCREVA “Digite o horário inicial”
###### ESCREVA “hora: “
###### LEIA hora_i

###### ESCREVA “minuto: “
###### LEIA min_i
###### ESCREVA “Digite o horário final “
###### ESCREVA “hora: “
###### LEIA hora_f
###### ESCREVA “minuto: “
###### LEIA min_f
###### SE min_i > min_f
###### ENTÃO INÍCIO
###### min_f ← min_f + 60
###### hora_f ← hora_f – 1
###### FIM
###### SE hora_i > hora_f
###### ENTÃO hora_f ← hora_f + 24
###### min_d ← min_f - min_i;
###### hora_d ← hora_f - hora_i;
###### ESCREVA “O jogo durou “,hora_d,” hora(s) e “,min_d,” minuto(s)”
###### FIM_ALGORITMO.


## Questão 12.
Faça um programa que receba o código correspondente ao cargo de um funcionário e seu salário atual
e mostre o cargo, o valor do aumento e seu novo salário. Os cargos estão na tabela a seguir.

| CÓDIGO | CARGO       | PERCENTUAL         |
|--------|-------------|--------------------|
| 1      | Escriturário| 50%                |
| 2      | Secretário  | 35%                |
| 3      | Caixa       | 20%                |
| 4      | Gerente     | 10%                |
| 5      | Diretor     | Não tem aumento    |


Solução:
###### ALGORITMO
###### DECLARE salario, aumento, novo_sal, cargo NUMÉRICO
###### ESCREVA “Digite o cargo do funcionário (1,2,3,4 ou 5)”
###### LEIA cargo
###### ESCREVA “Digite o valor do salário: “
###### LEIA salario
###### SE cargo = 1
###### ENTÃO INÍCIO
###### ESCREVA “O cargo é Escriturário”
###### aumento ← salario * 50 / 100
###### ESCREVA “O valor do aumento é: “, aumento


###### novo_sal ← salario + aumento
###### ESCREVA “O novo salário é: “, novo_sal
###### FIM
###### SENÃO SE cargo = 2
###### ENTÃO INÍCIO
###### ESCREVA “O cargo é Secretário”
###### aumento ← salario * 35 / 100
###### ESCREVA “O valor do aumento é: “, aumento
###### novo_sal ← salario + aumento
###### ESCREVA “O novo salário é: “, novo_sal
###### FIM
###### SENÃO SE cargo = 3
###### ENTÃO INÍCIO
###### ESCREVA “O cargo é Caixa”
###### aumento ← salario * 20 / 100
###### ESCREVA “O valor do aumento é: “, aumento
###### novo_sal ← salario + aumento
###### ESCREVA “O novo salário é: “,novo_sal
###### FIM
###### SENÃO SE cargo = 4
###### ENTÃO INÍCIO
###### ESCREVA “O cargo é Gerente”
###### aumento ← salario * 10 / 100
###### ESCREVA “O valor do aumento é: “, aumento
###### novo_sal ← salario + aumento
###### ESCREVA “O novo salário é: “, novo_sal
###### FIM
###### SENÃO SE cargo = 5
###### ENTÃO INÍCIO
###### ESCREVA “O cargo é Diretor”
###### aumento ← salario * 0 / 100
###### ESCREVA “O valor do aumento é: “, aumento
###### novo_sal ← salario + aumento
###### ESCREVA “O novo salário é: “, novo_sal
###### FIM
###### SENÃO ESCREVA “Cargo Inexistente !”

###### FIM_ALGORITMO.


## Questão 13.
Faça um programa que apresente o menu a seguir, permita ao usuário escolher a opção desejada, re-
ceba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de

opção inválida e não se preocupe com restrições, como salário negativo.
Menu de opções:
1. Imposto
2. Novo salário
3. Classificação
Digite a opção desejada.

Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as regras
a seguir.

| SALÁRIO                                     | PERCENTUAL DO IMPOSTO |
|--------------------------------------------|------------------------|
| Menor que R$ 500,00                         | 5%                     |
| De R$ 500,00 (inclusive) a R$ 850,00        | 10%                    |
| Acima de R$ 850,00                          | 15%                    |


Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor do novo salário, usando as
regras a seguir.

| SALÁRIO                                             | AUMENTO      |
|-----------------------------------------------------|--------------|
| Maior que R$ 1.500,00                               | R$ 25,00     |
| De R$ 750,00 (inclusive) a R$ 1.500,00 (inclusive)   | R$ 50,00     |
| De R$ 450,00 (inclusive) a R$ 750,00                 | R$ 75,00     |
| Menor que R$ 450,00                                  | R$ 100,00    |


Na opção 3: receber o salário de um funcionário e mostrar sua classificação usando a tabela a seguir.

| SALÁRIO                        | CLASSIFICAÇÃO     |
|-------------------------------|-------------------|
| Até R$ 700,00 (inclusive)      | Mal remunerado    |
| Maiores que R$ 700,00          | Bem remunerado    |

Solução:
###### ALGORITMO
###### DECLARE op, sal, imp, aum, novo_sal NUMÉRICO
###### ESCREVA “MENU DE OPÇÕES”
###### ESCREVA “1 – IMPOSTO”
###### ESCREVA “NOVO SALÁRIO”
###### ESCREVA “CLASSIFICAÇÃO”
###### ESCREVA “DIGITE A OPÇÃO DESEJADA”
###### LEIA op
###### SE op = 1
###### ENTÃO INÍCIO
###### LEIA sal
###### SE sal < 500
###### ENTÃO imp ← sal * 5/100
###### SE sal >= 500 E sal <= 850
###### ENTÃO imp ← sal * 10/100
###### SE sal > 850
###### ENTÃO imp ← sal * 15/100


###### FIM
###### SE op = 2
###### ENTÃO INÍCIO
###### LEIA sal
###### SE sal > 1500
###### ENTÃO aum ← 25
###### SE sal >= 750 E sal <= 1500
###### ENTÃO aum ← 50
###### SE sal >= 450 E sal < 750
###### ENTÃO aum ← 75
###### SE sal < 450
###### ENTÃO aum ← 100 novo_sal ← sal + aum
###### ESCREVA novo_sal
###### FIM
###### SE op = 3
###### ENTÃO INÍCIO
###### LEIA sal
###### SE sal <= 700
###### ENTÃO ESCREVA”Mal Remunerado”
###### SE sal > 700
###### ENTÃO ESCREVA”Bem Remunerado”
###### FIM
###### SE op < 1 OU op > 3
###### ENTÃO ESCREVA “Opção Inválida”
###### FIM_ALGORITMO.

## Questão 14.
Faça um programa que receba o salário inicial de um funcionário, calcule e mostre o novo salário,
acrescido de bonificação e de auxílio escola.
| SALÁRIO                            | BONIFICAÇÃO         |
|-----------------------------------|---------------------|
| Até R$ 500,00                     | 5% do salário       |
| Entre R$ 500,00 e R$ 1.200,00     | 12% do salário      |
| Acima de R$ 1.200,00              | Sem bonificação     |

| SALÁRIO               | AUXÍLIO ESCOLA |
|-----------------------|----------------|
| Até R$ 600,00         | R$ 150,00       |
| Acima de R$ 600,00    | R$ 100,00       |


Solução:
###### ALGORITMO
###### DECLARE sal, novo_sal, boni, aux NUMÉRICO
###### LEIA sal
###### SE sal <= 500
###### ENTÃO boni ← sal * 5/100
###### SENÃO SE sal <= 1200
###### ENTÃO boni ← sal * 12/100
###### SENÃO boni ← 0

###### SE sal <= 600
###### ENTÃO aux ← 150
###### SENÃO aux ← 100
###### novo_sal ← sal + boni + aux
###### ESCREVA novo_sal
###### FIM_ALGORITMO.



## Questão 15.
Faça um programa que receba o valor do salário mínimo, o número de horas trabalhadas, o número
de dependentes do funcionário e a quantidade de horas extras trabalhadas. Calcule e mostre o salário
a receber do funcionário de acordo com as regras a seguir:
° O valor da hora trabalhada é igual a 1/5 do salário mínimo.

° O salário do mês é igual ao número de horas trabalhadas multiplicado pelo valor da hora traba-
lhada.

° Para cada dependente, acrescentar R$ 32,00.
° Para cada hora extra trabalhada, calcular o valor da hora trabalhada acrescida de 50%.
° O salário bruto é igual ao salário do mês mais o valor dos dependentes mais o valor das horas
extras.
° Calcular o valor do imposto de renda retido na fonte de acordo com a tabela a seguir:


| IRRF    | SALÁRIO BRUTO                          |
|---------|----------------------------------------|
| Isento  | Inferior a R$ 200,00                   |
| 10%     | De R$ 200,00 até R$ 500,00             |
| 20%     | Superior a R$ 500,00                   |


■■ O salário líquido é igual ao salário bruto menos IRRF.
■■ A gratificação é de acordo com a tabela a seguir:

| SALÁRIO LÍQUIDO        | GRATIFICAÇÃO  |
|------------------------|---------------|
| Até R$ 350,00          | R$ 100,00     |
| Superior a R$ 350,00   | R$ 50,00      |

°O salário a receber do funcionário é igual ao salário líquido mais a gratificação.

Solução:
###### ALGORITMO
###### DECLARE sal_min, nht, ndep, nhet NUMÉRICO
###### sal_receber, vh, smes, vdep, vhe, imp NUMÉRICO
###### sbruto, sliq, grat NUMÉRICO
###### LEIA sal_min, nht, ndep, nhet
###### vh ← 1/5 * sal_min
###### smes ← nht * vh
###### vdep ← 32 * ndep
###### vhe ← nhet * (vh + (vh * 50/100))
###### sbruto ← smes + vdep + vhe
###### SE sbruto < 200
###### ENTÃO imp ← 0
###### SE sbruto >= 200 E sbruto <= 500
###### ENTÃO imp ← sbruto * 10/100
###### SE sbruto > 500
###### ENTÃO imp ← sbruto * 20/100
###### sliq ← sbruto – imp
###### SE sliq <= 350
###### ENTÃO grat ← 100
###### SE sliq > 350
###### ENTÃO grat ← 50
###### sal_receber ← sliq + grat
###### ESCREVA sal_receber
###### FIM_ALGORITMO.


## Questão 16.
Um supermercado deseja reajustar os preços de seus produtos usando o seguinte critério: o produto
poderá ter seu preço aumentado ou diminuído. Para o preço ser alterado, o produto deve preencher
pelo menos um dos requisitos a seguir:
| VENDA MÉDIA MENSAL | PREÇO ATUAL                   | % DE AUMENTO | % DE DIMINUIÇÃO |
|--------------------|-------------------------------|--------------|-----------------|
| < 500              | < R$ 30,00                    | 10%          | -               |
| 500 ≤ venda < 1200 | R$ 30,00 ≤ preço < R$ 80,00   | 15%          | -               |
| ≥ 1200             | ≥ R$ 80,00                    | -            | 20%             |

Faça um programa que receba o preço atual e a venda média mensal do produto, calcule e mostre o
novo preço.
Solução:
###### ALGORITMO
###### DECLARE pre, venda, novo_pre NUMÉRICO
###### LEIA pre, venda
###### SE venda<500 OU pre<30
###### ENTÃO novo_pre ← pre + 10/100 * pre
###### SENÃO SE (venda>=500 E venda<1200) OU (pre>=30 E pre<80)
###### ENTÃO novo_pre ← pre + 15/100 * pre
###### SENÃO SE venda>=1200 OU pre>=80
###### ENTÃO novo_pre ← pre – 20/100 * pre

###### ESCREVA novo_pre
###### FIM_ALGORITMO.


## Questão 17.
Faça um programa para resolver equações do 2o grau.

###### ax2
###### + bx + c = 0
###### A variável a deve ser diferente de zero.
###### ∆ = b2 -4 * a * c
###### ∆ < 0 → não existe raiz real
###### ∆ = 0 → existe uma raiz real
###### x = (-b) / (2 * a)
###### ∆ > 0 → existem duas raízes reais
###### x1 = (-b + ∆)/ (2 * a)
###### x2 = (-b - ∆)/ (2 * a)


Solução:
###### ALGORITMO
###### DECLARE a, b, c, delta, x1, x2 NUMÉRICO
###### LEIA a, b, c
###### SE a = 0
###### ENTÃO ESCREVA “Estes valores não formam uma equação de segundo grau”
###### SENÃO INÍCIO
###### delta ← (b * b) – ( 4 * a * c)
###### SE delta < 0
###### ENTÃO ESCREVA “Não existe raiz real”
###### SE delta = 0
###### ENTÃO INÍCIO
###### ESCREVA “Existe uma raiz real”
###### x1 ← (– b) / (2 * a)
###### ESCREVA x1
###### FIM
###### SE delta > 0
###### ENTÃO INÍCIO
###### ESCREVA “Existem duas raízes reais”
###### x1 ← (- b + delta) / ( 2 * a)
###### x2 ← (- b - delta) / ( 2 * a)
###### ESCREVA x1, x2
###### FIM

###### FIM
###### FIM_ALGORITMO.

## Questão 18.
Dados três valores X, Y e Z, verifique se eles podem ser os comprimentos dos lados de um triângulo e, se forem, verifique se é um triângulo equilátero, isósceles ou escaleno. Se eles não formarem um
triângulo, escreva uma mensagem. Considere que:

° o comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados;
° chama-se equilátero o triângulo que tem três lados iguais;
° denomina-se isósceles o triângulo que tem o comprimento de dois lados iguais;
° recebe o nome de escaleno o triângulo que tem os três lados diferentes.

Solução:

###### ALGORITMO
###### DECLARE x, y, z NUMÉRICO
###### LEIA x, y, z
###### SE x < y + z E y < x + z E z < x + y
###### ENTÃO INÍCIO
###### SE x = y E y = z
###### ENTÃO ESCREVA “Triângulo Equilátero”


###### SENÃO SE x = y OU x = z OU y = z
###### ENTÃO ESCREVA “Triângulo Isósceles”
###### SENÃO SE x ≠ y E x ≠ z E y ≠ z
###### ENTÃO ESCREVA “Triângulo Escaleno”

###### FIM
###### SENÃO ESCREVA “Essas medidas não formam um triângulo”
###### FIM_ALGORITMO.


## Questão 19.
Faça um programa que receba a altura e o peso de uma pessoa. De acordo com a tabela a seguir, veri-
fique e mostre a classificação dessa pessoa.

| ALTURA              | PESO                         |                         |                        |
|---------------------|------------------------------|-------------------------|------------------------|
|                     | ATÉ 60                       | ENTRE 60 E 90 (INCLUSIVE) | ACIMA DE 90           |
| Menores que 1,20    | A                            | D                       | G                      |
| De 1,20 a 1,70      | B                            | E                       | H                      |
| Maiores que 1,70    | C                            | F                       | I                      |

Solução:
###### ALGORITMO
###### DECLARE altura, peso NUMÉRICO
###### LEIA altura, peso
###### SE altura < 1.20
###### ENTÃO INÍCIO
###### SE peso <= 60
###### ENTÃO ESCREVA “A”
###### SE peso > 60 E peso <= 90
###### ENTÃO ESCREVA “D”
###### SE peso > 90
###### ENTÃO ESCREVA “G”
###### FIM

###### SE altura >= 1.20 E altura <= 1.70
###### ENTÃO INÍCIO
###### SE peso <= 60
###### ENTÃO ESCREVA “B”
###### SE peso > 60 E peso <= 90
###### ENTÃO ESCREVA “E”
###### SE peso > 90
###### ENTÃO ESCREVA “H”
###### FIM
###### SE altura > 1.70
###### ENTÃO INÍCIO
###### SE peso <= 60
###### ENTÃO ESCREVA “C”
###### SE peso > 60 E peso <= 90



###### ENTÃO ESCREVA “F”
###### SE peso > 90
###### ENTÃO ESCREVA “I”
###### FIM
###### FIM_ALGORITMO.


## Questão 20.
Faça um programa que receba:
° O código de um produto comprado, supondo que a digitação do código do produto seja sempre
válida, isto é, um número inteiro entre 1 e 10.
° O peso do produto em quilos.

° O código do país de origem, supondo que a digitação do código seja sempre válida, isto é, um nú-
mero inteiro entre 1 e 3.

Tabelas:
### Tabela 1: Código do País de Origem e Imposto

| CÓDIGO DO PAÍS DE ORIGEM | IMPOSTO |
|---------------------------|---------|
| 1                         | 0%      |
| 2                         | 15%     |
| 3                         | 25%     |

### Tabela 2: Código do Produto e Preço por Grama

| CÓDIGO DO PRODUTO | PREÇO POR GRAMA |
|-------------------|------------------|
| 1 a 4             | 10               |
| 5 a 7             | 25               |
| 8 a 10            | 35               |


Calcule e mostre:
° o preço total do produto comprado;
° o valor do imposto, sabendo que ele é cobrado sobre o preço total do produto comprado e depende
do país de origem;
° o valor total, preço total do produto mais imposto.
Solução:
###### ALGORITMO
###### DECLARE cod_prod, peso_quilos NUMÉRICO
###### cod_pais, peso_gramas, pre_total NUMÉRICO
###### imposto, valor_total, pre_grama NUMÉRICO
###### LEIA cod_prod, peso_quilos, cod_pais
###### peso_gramas ← peso_quilos * 1000
###### ESCREVA peso_gramas
###### SE cod_prod >= 1 E cod_prod <= 4


###### ###### ENTÃO pre_grama ← 10
###### SE cod_prod >= 5 E cod_prod <= 7
###### ENTÃO pre_grama ← 25
###### SE cod_prod >= 8 E cod_prod <= 10
###### ENTÃO pre_grama ← 35
###### pre_total ← peso_gramas * pre_grama
###### ESCREVA pre_total
###### SE cod_pais = 1
###### ENTÃO imposto ← 0
###### SE cod_pais = 2
###### ENTÃO imposto ← pre_total * 15/100
###### SE cod_pais = 3
###### ENTÃO imposto ← pre_total * 25/100
###### ESCREVA imposto
###### valor_total ← pre_total + imposto
###### ESCREVA valor_total
###### FIM_ALGORITMO.
