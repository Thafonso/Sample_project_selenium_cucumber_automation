package advantageShoppingAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class SearchProductPage {
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));

    public WebElement addCartProductButton(){
        return  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='save_to_cart']")));
    }

    public WebElement checkOutButton(){
        return  wait.until(ExpectedConditions.elementToBeClickable(By.id("checkOutPopUp")));
    }

    public WebElement productTypeLabel(String productType){
        return wait.until(ExpectedConditions.elementToBeClickable(By.id(productType+"Img")));
    }

    public WebElement productSelect(String product){
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), '"+product+"')]")));
    }

    public WebElement productQuantityInput(){
        return  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='quantity']")));
    }

    public WebElement productColorSelect(String color){
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='"+color+"']")));
    }

    public WebElement productCartLabel(String productCart){
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(), '" + productCart + "')]")));
    }

}

