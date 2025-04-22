
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

