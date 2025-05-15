#language: pt

  Funcionalidade: Adicionar produtos ao carrinho da Advantage Shop
    Eu como usuário
    Quero adicionar produtos que selecionei ao carrinho
    Para decidir sobre a compra

  Contexto: Entrar na pagina da Advantage Shop
    Dado que acesso a pagina inicial da Advantage shop

  Cenario: Adicionar Produto ao carrinho
    Dado que eu seleciono a categoria "laptops"
    E seleciono o produto "HP ENVY - 17t Touch Laptop"
    E seleciono a cor "GRAY" e a quantidade "2"
    Quando adiciono o produto ao carrinho
    Entao acesso o carrinho e o produto "HP ENVY - 17t Touch Laptop" é exibido.

