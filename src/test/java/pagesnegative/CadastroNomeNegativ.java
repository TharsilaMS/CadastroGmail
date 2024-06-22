package pagesnegative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroNomeNegativ {
    static WebDriver driver;

        public CadastroNomeNegativ(WebDriver driver) {
            this.driver = driver;
        }
        public void preencherCampo(){
            WebElement nome = driver.findElement(By.id("firstName"));
            nome.sendKeys("a");

            WebElement sobrenome = driver.findElement(By.id("lastName"));
            sobrenome.sendKeys("f");

            WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(),'Avançar')]"));
            botaoAvancar.click();

            WebDriverWait waitPg2 = new WebDriverWait(driver, Duration.ofSeconds(10));

        }

    public String validarMensagemNome() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement mensagem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Tem certeza de que inseriu seu nome corretamente?')]")));
        return mensagem.getText();
    }
    }



