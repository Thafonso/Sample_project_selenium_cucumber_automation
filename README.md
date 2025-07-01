# 🛍️ Automação de Testes - Advantage Shopping

Projeto de automação de testes em Java utilizando **Serenity BDD**, **Selenium WebDriver** e **Cucumber**, simulando o comportamento do usuário ao selecionar
e adicionar um produto ao carrinho no e-commerce *Advantage Shopping*.

---

## 📌 Funcionalidades Automatizadas

- Acesso à página inicial
- Seleção de categoria de produto
- Escolha de produto específico
- Seleção de cor e quantidade
- Adição ao carrinho
- Verificação do produto no carrinho

---

## 🧪 Tecnologias Utilizadas

- Java 21+
- [Serenity BDD](https://serenity-bdd.github.io/)
- [Cucumber](https://cucumber.io/)
- Selenium WebDriver
- JUnit 5
- Allure Reports
- Maven/Gradle (dependendo da sua configuração)

---

## 📊 Relatórios

Este projeto gera relatórios em múltiplos formatos:

📊 Serenity Report: target/site/serenity/index.html

📈 Allure Report: allure-results/ (executar allure serve allure-results)

---

## 📁 Estrutura do Projeto

├── actions/ # Lógica de interação com a interface
│ └── SearchProductActions.java
├── pages/ # Elementos da interface (PageObjects)
│ └── SearchProductPage.java
├── steps/ # Definição dos passos em Gherkin
│ ├── CommonSteps.java
│ └── SearchProductSteps.java
├── features/ # Cenários de teste (Gherkin) - NÃO INCLUÍDO AQUI
├── RunCucumberTest.java # Classe de execução dos testes com JUnit + Cucumber
└── resources/
└── features/ # Arquivos .feature (ex: adicionar_produto.feature)

