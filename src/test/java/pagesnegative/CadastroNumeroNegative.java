package pagesnegative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroNumeroNegative {
    static WebDriver driver;

    public CadastroNumeroNegative(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement numero = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("phoneNumberId")));
        numero.sendKeys("a993372556");

        WebElement botaoAvancar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Próxima')]")));
        botaoAvancar.click();
    }
    public String validarMensagemNome() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement mensagem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Este formato de número de telefone não é válido. Verifique o país e o número.')]")));
        return mensagem.getText().trim();
    }
    }

