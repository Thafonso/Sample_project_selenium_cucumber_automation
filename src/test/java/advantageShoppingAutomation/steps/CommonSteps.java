package advantageShoppingAutomation.steps;

import io.cucumber.java.pt.*;
import net.serenitybdd.core.pages.PageObject;


public class CommonSteps extends PageObject {

    @Dado("que acesso a pagina inicial da Advantage shop")
    public void que_abro_o_navegador() {
        open();
    }

}
