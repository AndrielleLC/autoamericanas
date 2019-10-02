package autoamericanas;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CompraPage extends CompraElementMap {

    public CompraPage(){
        PageFactory.initElements(TesteRule.getDriver(),this);
    }

    public void selecionarTelefonia() {
        slctTelefonia.click();
    }

    public void pesquisarProduto(){
        input.sendKeys("iphone 7");
        btnSubmeter.click();
    }

    public void validarLista() {
        String validarRetorno = pageTitle.getText();
        Assert.assertEquals("iphone 7", validarRetorno);
    }

    public void realizarCompra() {
        escolherProduto.click();

        String validarProdutoSelecionado = titleWrapper.getText();
        Assert.assertEquals("iPhone 7 128GB Preto Matte Desbloqueado IOS 10 Wi-fi + 4G Câmera 12MP - Apple",
                validarProdutoSelecionado);

        clicarComprar.click();
        continuarCompra.click();
    }

    public void validarCesta() {
        String validarCesta = productTitle.getText();
        Assert.assertEquals("Iphone 7 128gb Preto Matte -bra", validarCesta);
    }
}
