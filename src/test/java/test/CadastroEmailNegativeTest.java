package test;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesnegative.CadastroEmailNegative;
import pagespositive.*;



public class CadastroEmailNegativeTest extends TestCase {
    static WebDriver driver;
    static CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmailNegative cadastroEmailNegative;


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testEmailNegative(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroNome= new CadastroNome(driver);

        cadastroNome.preencherCampo();

        cadastroIdade = new CadastroIdade(driver);

        cadastroIdade.preencherCampo();

        cadastroEmailNegative = new CadastroEmailNegative(driver);

        cadastroEmailNegative.preencherCampo();
        String mensagem = cadastroEmailNegative.validarMensagemNome();
        Assert.assertEquals("Somente letras (a - z), números (0 - 9) e pontos (.) são permitidos.", mensagem);
        driver.quit();
}

}