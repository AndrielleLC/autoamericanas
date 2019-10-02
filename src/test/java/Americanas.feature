#language:pt

Funcionalidade: Compra produto
  Sendo um visitante do site
  Quero pesquisar pelo iphone 7
  Para adicioná-lo ao carrinho para realizar a compra

    Cenário: Pesquisar produtos e validar seu retorno
      Dado selecionei a opção Telefonia
      E pesquisei por Iphone 7
      E uma lista de produtos foi exibida
      Quando eu realizar a compra
      Então o produto deve ser adicionado a minha cesta



