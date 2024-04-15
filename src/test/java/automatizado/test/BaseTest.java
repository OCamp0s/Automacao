package automatizado.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Classe base que serve de herança para todas as classes de teste.
 */
public abstract class BaseTest {

    /** Driver do navegador da pagina atual */
    protected static WebDriver driver;
    protected final static String URL_BASE = "file:///C:/Users/Pedro/Downloads/controle-de-produtos/sistema/login.html";
    protected final static String CAMINHO_DRIVER = "src/test/java/automatizado/resource/chromedriver-10205005.exe";
    
    /** Método para iniciar driver do navegador antes de qualquer classe de teste*/
    @BeforeClass
    public static void iniciar(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Pedro/Downloads/controle-de-produtos/sistema/login.html");

    }

     /** Método para finaqlizar driver do navegador antes de qualquer classe de teste*/
    @AfterClass
    public static void finalizar(){
        driver.quit();
    }
}
