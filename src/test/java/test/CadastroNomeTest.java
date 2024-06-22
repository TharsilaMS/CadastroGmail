package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagespositive.*;


public class CadastroNomeTest {
 static WebDriver driver;
 static  CadastroNome cadastroNome;
 static CadastroIdade cadastroIdade;
 static CadastroEmail cadastroEmail;
 static CadastroSenha cadastroSenha;
 static CadastroNumero cadastroNumero;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
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

        cadastroNumero = new CadastroNumero(driver);

        cadastroNumero.preencherCampo();
    }


    @After
    public void tearDown() throws Exception {
    }
}