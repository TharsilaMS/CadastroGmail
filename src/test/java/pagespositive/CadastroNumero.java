package pagespositive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroNumero {
    static WebDriver driver;

    public CadastroNumero(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement numero = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("phoneNumberId")));
        numero.sendKeys("51993372556");

        WebElement botaoAvancar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Próxima')]")));
        botaoAvancar.click();
    }
}
