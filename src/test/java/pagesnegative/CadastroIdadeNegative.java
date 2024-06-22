package pagesnegative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroIdadeNegative {
    static WebDriver driver;

    public CadastroIdadeNegative(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo() {

        WebElement dia = driver.findElement(By.id("day"));
        dia.sendKeys("0");

        WebElement monthElement = driver.findElement(By.id("month"));
        Select month = new Select(monthElement);
        monthElement.sendKeys("Janeiro");

        WebElement year = driver.findElement(By.id("year"));
        year.sendKeys("0000");

        WebElement genderEllements = driver.findElement(By.id("gender"));
        Select gender = new Select(genderEllements);
        genderEllements.sendKeys("Mulher");

        WebElement botaoAvancar = driver.findElement(By.xpath("*//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();

    }
    public String validarMensagemNome() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement mensagem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Insira uma data válida')]")));
        return mensagem.getText().trim();
    }

}