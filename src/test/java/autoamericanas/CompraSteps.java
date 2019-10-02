package autoamericanas;

import cucumber.api.java.pt.*;

public class CompraSteps {
    @Dado ("selecionei a opção Telefonia")
    public void selecionarTelefonia(){
        CompraPage compraPage = new CompraPage();
        compraPage.selecionarTelefonia();
    }

    @E ("pesquisei por Iphone 7")
    public void pesquisarProduto(){
        CompraPage compraPage = new CompraPage();
        compraPage.pesquisarProduto();
    }

    @E("uma lista de produtos foi exibida")
    public void validarLista(){
        CompraPage compraPage = new CompraPage();
        compraPage.validarLista();
    }

    @Quando ("eu realizar a compra")
    public void realizarCompra(){
        CompraPage compraPage = new CompraPage();
        compraPage.realizarCompra();
    }

    @Então("o produto deve ser adicionado a minha cesta")
    public void validarCesta(){
        CompraPage compraPage = new CompraPage();
        compraPage.validarCesta();
    }
}
