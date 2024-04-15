package automatizado.test;

import static org.junit.Assert.assertEquals;


import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizado.builder.ProdutoBuilder;
import automatizado.page.ControleDeProdutoPO;
import automatizado.page.LoginPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ControleDeProdutoTeste extends BaseTest{
  
    private static LoginPO loginPage;   
    private static ControleDeProdutoPO controleProdutoPage;

    @BeforeClass
    public static void prepararTestes(){
        loginPage = new LoginPO(driver);
        loginPage.executarAcaoDeLogar("admin@admin.com", "admin@123");

        controleProdutoPage = new ControleDeProdutoPO (driver);
        assertEquals( controleProdutoPage.obterTituloPagina(), "Controle de Produtos");

}
        @Test
        public void TC001_deveAbrirModalParaCadastroAoClicarNoBotaoCriar(){
            controleProdutoPage.buttonAdicionar.click();  
            controleProdutoPage.buttonAdicionar.click(); 
 
            // Aqui aguardo o modal abrir até 1000 segundo.

 
            String titulo = controleProdutoPage.tituloModal.getText();
 
            assertEquals("Produto", titulo);
 
            controleProdutoPage.buttonSair.click();
            controleProdutoPage.buttonSair.click();
            
        }

        @Test
        public void TC002_nãoDeveSerPossivelCadastrarUmProdutoSemPrencherTodosOsCampos(){

        
            controleProdutoPage.buttonAdicionar.click();
            controleProdutoPage.buttonAdicionar.click();
            controleProdutoPage.cadastrarProduto("00001", "Martelo", 10, 59.9, "03/11/2021");

            
            String mensagem = controleProdutoPage.spanMensagem.getText();
           

            assertEquals("Todos os campos são obrigatórios para o cadastro!", mensagem);

        }

  //      @Test
 //       public void TC003_nãoDeveSerPossivelCadastrarUmProdutoSemPrencherTodosOsCampos(){
    
            
  //          controleProdutoPage.buttonAdicionar.click();
 //           controleProdutoPage.buttonAdicionar.click();

  //          ProdutoBuilder produtoBuilder = new ProdutoBuilder();

  //          controleProdutoPage.cadastrarProduto(produtoBuilder);
    
                
 //           String mensagem = controleProdutoPage.spanMensagem.getText();
    
 //           assertEquals("Todos os campos são obrigatórios para o cadastro!", mensagem);
    
 //          }
}