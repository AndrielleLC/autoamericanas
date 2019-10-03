package autoamericanas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompraElementMap {
    @FindBy (xpath = "//input[@id='h_search-input']")
    protected WebElement input;

    @FindBy (xpath = "//button[@id='h_search-btn']")
    protected WebElement btnSubmeter;

    @FindBy (xpath = "//h1[@class='h1 page-title']")
    protected WebElement pageTitle;

    @FindBy (xpath = "//img[@alt='iPhone 7 128GB Preto Matte Desbloqueado IOS 10 Wi-fi + 4G Câmera 12MP - Apple']")
    protected WebElement escolherProduto;

    @FindBy (id = "product-name-default")
    protected WebElement titleWrapper;

    @FindBy (xpath = "//div[@class='Wrapper-sc-1i9za0i-3 hyuQAM ViewUI-sc-1ijittn-6 iXIDWU']")
    protected WebElement clicarComprar;

    @FindBy (id = "btn-continue")
    protected WebElement continuarCompra;

    @FindBy(xpath = "//h2[@class='basket-productTitle']")
    protected WebElement productTitle;
}
