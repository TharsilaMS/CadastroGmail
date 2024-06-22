package test;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesnegative.CadastroNumeroNegative;
import pagespositive.*;

public class CadastroNumeroNegativeTest extends TestCase {

    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmail cadastroEmail;
    static CadastroSenha cadastroSenha;
    static CadastroNumeroNegative cadastroNumeroNegative;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testNumeroNegative(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNome= new CadastroNome(driver);

        cadastroNome.preencherCampo();

        cadastroIdade = new CadastroIdade(driver);

        cadastroIdade.preencherCampo();

        cadastroEmail = new CadastroEmail(driver);

        cadastroEmail.preencherCampo();

        cadastroSenha = new CadastroSenha(driver);

        cadastroSenha.preencherCampo();

        cadastroNumeroNegative = new CadastroNumeroNegative(driver);

        cadastroNumeroNegative.preencherCampo();


        String mensagem = cadastroNumeroNegative.validarMensagemNome();
        Assert.assertEquals("Este formato de número de telefone não é válido. Verifique o país e o número.", mensagem);

        driver.quit();
}

}