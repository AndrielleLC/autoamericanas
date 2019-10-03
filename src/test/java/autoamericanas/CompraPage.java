package autoamericanas;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class CompraPage extends CompraElementMap {

    public CompraPage(){
        PageFactory.initElements(TesteRule.getDriver(),this);
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
        try {
            synchronized (TesteRule.getDriver()){
                TesteRule.getDriver().wait(3000);
            }
        } catch (InterruptedException e){
                e.printStackTrace();
        }

        //try{
        //    Thread.sleep(5000);
        //}
        //catch(InterruptedException ie){
        //}

        String validarCesta = productTitle.getText();
        Assert.assertEquals("Iphone 7 128gb Preto Matte -bra", validarCesta);
    }
}
