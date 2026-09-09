# 🧮 Calculadora de Taxa Metabólica Basal

Aplicação desktop desenvolvida em **Java** utilizando **Java Swing**, criada para calcular a **Taxa Metabólica Basal (TMB)** de uma pessoa a partir de informações como peso, altura, idade e gênero.

O projeto foi desenvolvido com foco em praticar **Programação Orientada a Objetos (POO)**, criação de interfaces gráficas e organização do código em diferentes responsabilidades.

---

## 📌 Sobre o projeto

A **Taxa Metabólica Basal (TMB)** representa uma estimativa da quantidade de energia que o organismo necessita diariamente para manter suas funções básicas em repouso.

A aplicação permite inserir os dados do usuário e realizar o cálculo automaticamente, apresentando o resultado em **kcal/dia**.

### ✨ Funcionalidades

* ⚖️ Entrada do peso
* 📏 Entrada da altura
* 🎂 Entrada da idade
* ⚧️ Seleção do gênero
* 🧮 Cálculo automático da TMB
* ✅ Validação dos dados inseridos
* ⚠️ Mensagem de erro para valores inválidos
* 🖥️ Interface gráfica utilizando Java Swing
* 📊 Exibição do resultado em kcal/dia

---

## 🛠️ Tecnologias utilizadas

* **Java**
* **Java Swing**
* **Programação Orientada a Objetos (POO)**
* **IntelliJ IDEA**
* **JAR**
* **JPackage** para geração do executável

---

## 📂 Estrutura do projeto

O projeto possui uma organização baseada na separação das responsabilidades:

```text
src/
└── BMR/
    ├── Main.java
    │
    ├── model/
    │   └── CalculatorBmr.java
    │
    ├── util/
    │   └── Validator.java
    │
    └── view/
        └── MainWindow.java
```

### 📄 Principais classes

**`Main.java`**

Responsável por iniciar a aplicação e criar a janela principal utilizando a fila de eventos do Swing.

**`CalculatorBmr.java`**

Contém a lógica responsável pelo cálculo da Taxa Metabólica Basal de acordo com os dados informados.

**`Validator.java`**

Responsável por verificar se os valores inseridos nos campos são números válidos e maiores que zero.

**`MainWindow.java`**

Responsável pela interface gráfica da aplicação, recebendo os dados do usuário, acionando o cálculo e exibindo o resultado.

---

## 🖥️ Interface

A aplicação possui uma interface simples e objetiva, contendo campos para:

```text
Peso
Altura
Idade
Gênero

[ Calcular ]

Resultado: XX.XX kcal/dia
```

O objetivo é facilitar a utilização e manter a aplicação direta, sem elementos desnecessários.

---

## 🚀 Como executar

### Opção 1 — Executar pelo IntelliJ IDEA

1. Clone este repositório:

```bash
git clone https://github.com/SEU-USUARIO/basalMetabolicRate.git
```

2. Abra o projeto no **IntelliJ IDEA**.
3. Localize:

```text
src/BMR/Main.java
```

4. Execute a classe `Main.java`.

---

### Opção 2 — Executar o arquivo JAR

Caso o Java esteja instalado na máquina, também é possível executar a versão compilada:

```bash
java -jar CalculadoraTMB.jar
```

---

### Opção 3 — Executável Windows

O projeto também possui uma versão executável para Windows:

```text
CalculadoraTMB.exe
```

Basta executar o arquivo para iniciar a aplicação.

---

## 🧠 Conceitos praticados

Durante o desenvolvimento foram utilizados conceitos importantes de desenvolvimento de software, como:

* Programação Orientada a Objetos
* Separação de responsabilidades
* Classes e objetos
* Encapsulamento
* Validação de dados
* Tratamento de eventos
* Interfaces gráficas
* Organização em pacotes
* Compilação e geração de executáveis Java

---

## 📚 Objetivo acadêmico

Este projeto foi desenvolvido como forma de **praticar Java e desenvolvimento de aplicações desktop**, colocando em prática conceitos aprendidos durante os estudos de **Desenvolvimento de Sistemas**.

Além do cálculo em si, o projeto busca demonstrar a utilização de **Java Swing para criação de interfaces gráficas** e uma estrutura de código organizada entre diferentes camadas.

---

## ⚠️ Observação

Os valores apresentados pela aplicação são **estimativas** e possuem finalidade educacional. O resultado não deve ser utilizado como substituto de avaliação ou orientação de um profissional de saúde.

---

## 👨‍💻 Desenvolvedor

Desenvolvido por **Anderson**.

Projeto criado para fins de estudo, aprendizado e portfólio.

---

⭐ Se este projeto foi útil ou interessante para você, considere deixar uma estrela no repositório!
