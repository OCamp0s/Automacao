package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class  BasePO {

    protected WebDriver driver;
/**
 * Construtor base p fabrica de elementos (Page Factory)
 * @param driver 
 */
    public BasePO(WebDriver driver){
       this.driver = driver; 
       PageFactory.initElements(driver, this);
    }

    /**
     * Metodo que retorna titulo da pag atual
     * @return
     */
    public String obterTituloPagina(){
        return driver.getTitle(); 
      }

      /**
       * Metodo que escreve em qualquer WebElement do tipo inpute da um TAB no final
       * @param input Input a qual será escrito.
       * @param texto Texto que será escrito no input.
       */

    public void escrever(WebElement input, String texto){
        input.clear();
        input.sendKeys(texto + Keys.TAB);
    }

}

