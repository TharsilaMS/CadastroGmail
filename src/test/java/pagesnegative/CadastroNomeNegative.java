package pagesnegative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroNomeNegative {
    static WebDriver driver;

        public CadastroNomeNegative(WebDriver driver) {
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement mensagem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Tem certeza de que inseriu seu nome corretamente?')]")));
        return mensagem.getText();
    }
    public void preencherCampo1(){
        WebElement nome = driver.findElement(By.id("firstName"));
        nome.sendKeys("");

        WebElement sobrenome = driver.findElement(By.id("lastName"));
        sobrenome.sendKeys("");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(),'Avançar')]"));
        botaoAvancar.click();

        WebDriverWait waitPg2 = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    public String validarMensagemNome1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        WebElement mensagem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Digite o nome')]")));
        return mensagem.getText();
    }
    }



