package pagespositive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroSenha {

    static WebDriver driver;

    public CadastroSenha(WebDriver driver) {
        this.driver = driver;
    }
    public void preencherCampo() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement senha = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Passwd")));
        senha.sendKeys("BAt800336n");
        WebElement repetir = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("PasswdAgain")));
        repetir.sendKeys("BAt800336n");
        WebElement botaoAvancar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Avançar')]")));
        botaoAvancar.click();

    }
}
