package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {

    @FindBy(name ="q")
    public WebElement inputPesquisa;

    @FindBy(id ="result-stats")
    public WebElement divResultadoPesquisa;

    /**
     * Contrutor da pagina do goole
     * @param driver Driver da pagiana do Gloogle
     */
    public GooglePO(WebDriver driver) {
        super(driver);
    }
    
    /**
     * Método que irá efetuar uma pesquisa no google baseado no texto inf e no enter
     * @param texto Texto a ser pesquisado
     */
    public void pesquisar(String texto){
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    /**
     * Metodo que retorna o resultado aproximado da pesquisa.
     * @returnRetorna o resultado da pesquisa
     */
    public String obterResultadoDaPesquisa(){
        return divResultadoPesquisa.getText();
    }

}
