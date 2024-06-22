package test;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesnegative.CadastroSenhaNegative;
import pagespositive.CadastroEmail;
import pagespositive.CadastroIdade;
import pagespositive.CadastroNome;

public class CadastroSenhaNegativeTest extends TestCase {
    static  CadastroNome cadastroNome;
    static CadastroIdade cadastroIdade;
    static CadastroEmail cadastroEmail;
    static CadastroSenhaNegative cadastroSenhaNegative;
    @Test
    public void testSenhaNegative() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");
        cadastroNome= new CadastroNome(driver);

        cadastroNome.preencherCampo();

        cadastroIdade = new CadastroIdade(driver);

        cadastroIdade.preencherCampo();

        cadastroEmail = new CadastroEmail(driver);

        cadastroEmail.preencherCampo();

        cadastroSenhaNegative = new CadastroSenhaNegative(driver);

        cadastroSenhaNegative.preencherCampo();

        String mensagem = cadastroSenhaNegative.validarMensagemNome();
        Assert.assertEquals("Use 8 caracteres ou mais para sua senha", mensagem);

        driver.quit();

    }
}