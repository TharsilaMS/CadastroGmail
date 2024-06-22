package pagesnegative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroEmailNegative {
    static WebDriver driver;
    WebDriverWait wait;

    public CadastroEmailNegative(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void preencherCampo() {

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Username")));
        email.sendKeys("T$@hy");

        WebElement botaoAvancar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Avançar')]")));
        botaoAvancar.click();
    }

    public String validarMensagemNome() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement mensagem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Somente letras (a - z), números (0 - 9) e pontos (.) são permitidos.')]")));
        return mensagem.getText().trim();
    }

}