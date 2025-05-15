package advantageShoppingAutomation.steps;

import advantageShoppingAutomation.actions.SearchProductActions;
import io.cucumber.java.pt.*;
import net.serenitybdd.annotations.Steps;

public class SearchProductSteps {
    @Steps
    SearchProductActions searchProductActions;

    @Dado("que eu seleciono a categoria {string}")
    public void que_eu_seleciono_a_categoria(String productCategory) {
        searchProductActions.selectProductCategory(productCategory);
    }
    @Dado("seleciono o produto {string}")
    public void seleciono_o_produto(String product) {
        searchProductActions.selectProduct(product);
    }
    @Dado("seleciono a cor {string} e a quantidade {string}")
    public void seleciono_a_cor_e_a_quantidade(String color, String productsQuantity) {
        searchProductActions.selectColor(color);
        searchProductActions.productQuantity(productsQuantity);
    }
    @Quando("adiciono o produto ao carrinho")
    public void adiciono_o_produto_ao_carrinho() {
        searchProductActions.addProductCart();
    }
    @Entao("acesso o carrinho e o produto {string} é exibido.")
    public void acesso_o_carrinho_e_o_produto_é_exibido(String product) {
        searchProductActions.cartProductVerify(product.toUpperCase());
    }

}
