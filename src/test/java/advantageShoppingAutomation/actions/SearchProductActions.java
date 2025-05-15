package advantageShoppingAutomation.actions;


import advantageShoppingAutomation.pages.SearchProductPage;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;


@Slf4j
public class SearchProductActions extends UIInteractionSteps {

    SearchProductPage searchProductPage = new SearchProductPage();

    @Step("Selecionar categoria do produto")
    public void selectProductCategory(String productType){
        searchProductPage.productTypeLabel(productType).click();
    }

    @Step("Selecionar produto")
    public void selectProduct(String product){
        searchProductPage.productSelect(product).click();
    }

    @Step("Escolher cor")
    public void selectColor(String color){
        searchProductPage.productColorSelect(color).click();
    }

    @Step("Quantidade de produtos")
    public void productQuantity(String quantity){
        searchProductPage.productQuantityInput().clear();
        searchProductPage.productQuantityInput().sendKeys(quantity);
    }

    @Step("Adicionar produto ao carrinho")
    public void addProductCart(){
        searchProductPage.addCartProductButton().click();
        waitFor(searchProductPage.checkOutButton());
        searchProductPage.checkOutButton().click();
    }

    @Step("Verificar se o produto está no carrinho")
    public void cartProductVerify(String product){
        WebElement productCart = searchProductPage.productCartLabel(product);
        String productName = productCart.getText().trim();
        boolean productVerify = productName.contains(product);
        log.info("O Produto que está no carrinho é " +productName);
        Assertions.assertTrue(productVerify, "O produto adcionado ao carrinho não corresponde ao produto que está no carrinho");
    }


}
