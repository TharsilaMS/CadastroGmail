package test;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesnegative.CadastroIdadeNegative;

import pagespositive.CadastroNome;


public class CadastroIdadeNegativeTest extends TestCase {
    static CadastroNome cadastroNome;
    static CadastroIdadeNegative cadastroIdadeNegative;

    @Test
    public void testIdadeNegative() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNome = new CadastroNome(driver);

        cadastroNome.preencherCampo();

        cadastroIdadeNegative = new CadastroIdadeNegative(driver);

        cadastroIdadeNegative.preencherCampo();

        String mensagem = cadastroIdadeNegative.validarMensagemNome();
        Assert.assertEquals("Insira uma data válida", mensagem);

        driver.quit();
    }
}