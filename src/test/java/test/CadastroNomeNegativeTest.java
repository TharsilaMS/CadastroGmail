package test;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesnegative.CadastroNomeNegative;
import pagesnegative.CadastroSenhaNegative;

import static test.CadastroNomeTest.driver;


public class CadastroNomeNegativeTest {

    static CadastroNomeNegative cadastroNomeNegative;
    static CadastroSenhaNegative cadastroSenhaNegative;

    @Test
    public void testCadastroNegative() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNomeNegative = new CadastroNomeNegative(driver);

        cadastroNomeNegative.preencherCampo();

        cadastroNomeNegative.validarMensagemNome();

        String mensagem = cadastroNomeNegative.validarMensagemNome();
        Assert.assertEquals("Tem certeza de que inseriu seu nome corretamente?", mensagem);

        driver.quit();


    }

    @Test
    public void testCadastroNegative2() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNomeNegative = new CadastroNomeNegative(driver);

        cadastroNomeNegative.preencherCampo1();

        cadastroNomeNegative.validarMensagemNome1();

        String mensagem = cadastroNomeNegative.validarMensagemNome1();
        Assert.assertEquals("Digite o nome", mensagem);

        driver.quit();
    }
}