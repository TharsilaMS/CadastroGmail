package test;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesnegative.CadastroNomeNegativ;

import static test.CadastroNomeTest.driver;

public class CadastroNomeNegativTest {

    static CadastroNomeNegativ cadastroNomeNegativ;
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNomeNegativ = new CadastroNomeNegativ(driver);

        cadastroNomeNegativ.preencherCampo();

        cadastroNomeNegativ.validarMensagemNome();

        String mensagem = cadastroNomeNegativ.validarMensagemNome();
        Assert.assertEquals("Tem certeza de que inseriu seu nome corretamente?", mensagem);

        driver.quit();
    }


}