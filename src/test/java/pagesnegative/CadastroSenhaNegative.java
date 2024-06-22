package pagesnegative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroSenhaNegative {
    static WebDriver driver;

    public CadastroSenhaNegative(WebDriver driver) {
        this.driver = driver;
    }
    public void preencherCampo() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement senha = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Passwd")));
        senha.sendKeys("098");
        WebElement repetir = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("PasswdAgain")));
        repetir.sendKeys("098");
        WebElement botaoAvancar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Avançar')]")));
        botaoAvancar.click();
        WebDriverWait waitPg2 = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public String validarMensagemNome() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement mensagem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Use 8 caracteres ou mais para sua senha')]")));
        return mensagem.getText();
    }
}
