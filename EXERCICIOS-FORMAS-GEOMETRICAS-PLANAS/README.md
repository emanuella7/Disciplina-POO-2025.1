# Projeto: Figuras Geométricas com Programação Orientada a Objetos

Este projeto demonstra a aplicação dos princípios da Programação Orientada a Objetos (POO) no cálculo de áreas e volumes de figuras geométricas planas e espaciais. Os conceitos são explorados através de três módulos distintos: abstração, encapsulamento e herança.

---

## Conceitos de POO Utilizados

- **Abstração**: Esconde os detalhes internos das classes, expondo apenas o necessário.
- **Encapsulamento**: Protege os atributos e permite acesso controlado via métodos públicos.
- **Herança**: Permite a reutilização de código entre classes com hierarquia.

---

## Estrutura do Projeto

O projeto está dividido em três diretórios, cada um representando um conceito da POO.

### 1. `figurasGeometricas - Abstração`

Demonstra a ocultação de detalhes internos das figuras, focando na interface com o usuário.

**Pacotes:**
- `br.edu.principal`: Contém a classe principal com testes.
- `br.edu.figurasgeometricasplanas`: Inclui classes abstratas e concretas.

**Diagrama UML (Abstração):**  
![Abstração](https://github.com/user-attachments/assets/680759c0-c425-4bc8-935a-736292f7537c)

---

### 2. `figurasGeometricas - Encapsulamento`

Exemplifica a proteção de atributos com acesso controlado por métodos `get` e `set`.

**Pacotes:**
- `br.edu.principal`: Classe principal para execução.
- `br.edu.figurasgeometricasplanas`: Triângulo, Retângulo, etc.
- `br.edu.figurasgeometricasespacias`: Esfera, Cubo, Cone, etc.

**Diagrama UML (Encapsulamento):**  
![Encapsulamento](https://github.com/user-attachments/assets/97535320-bfa7-4d7c-af14-a0544285c153)

---

### 3. `figurasGeometricas - Herança`

Explora a herança entre superclasses e subclasses para evitar redundância de código.

**Pacotes:**
- `br.edu.principal`: Classe principal do módulo.
- `br.edu.figurasgeometricasplanas`: Subclasses que herdam de `FiguraPlana`.
- `br.edu.figurasgeometricasespacias`: Subclasses de `FiguraEspacial`.

**Diagrama UML (Herança):**  
![Herança](https://github.com/user-attachments/assets/d94644c8-ee11-4d58-852b-f6f6184e3bed)

---

## Figuras Geométricas Implementadas

### Figuras Planas

- Triângulo
- Retângulo
- Quadrado
- Círculo
- Trapézio
- Paralelogramo
- Losango
- Pentágono
- Hexágono

### Figuras Espaciais

- Cubo
- Prisma
- Esfera
- Pirâmide
- Cone
- Cilindro
- Paralelepípedo
- Tetraedro

---

## Estrutura das Classes

Cada classe segue a mesma estrutura:

- Atributos privados
- Construtor com parâmetros
- Métodos públicos:
  - `calcArea()`
  - `calcVolume()` (apenas para figuras espaciais)

---

## Como Executar o Projeto

1. Clone o repositório com o seguinte comando:

   ```bash
   git clone https://github.com/Jotinha085/figurasGeometricasPOO.git
