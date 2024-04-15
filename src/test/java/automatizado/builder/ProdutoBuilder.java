package automatizado.builder;

        /**Classe que sabe construir ou adicionar um produto na tela */
public class ProdutoBuilder {
    
    public String codigo = "00001";
    public String nome = "Produto Padrão";
    public Integer quantidade = 1;
    public Double valor = 1.0;
    public String data = "03/11/2021";

        /**
        * Metodo que sabe add um codigo ao builder
        * @param codigo
        * @return
        */
    public ProdutoBuilder adicionarCodigo(String codigo){
        this.codigo = codigo;
        return this;
    }

        /**
        * Metodo que sabe add um nome ao builder
        * @param nome
        * @return
     *  */
    public ProdutoBuilder adicionarNome(String nome){
        this.nome = nome;
        return this;
    }

        /**
         * Metodo que sabe add uma quantidade ao builder
        * @param quantidade
        * @return
        */
    public ProdutoBuilder adicionarQuantidade(Integer quantidade){
        this.quantidade = quantidade;
        return this;
    }

        /**
         * Metodo que sabe add um valor ao builder
        * @param valor
        * @return
        */
    public ProdutoBuilder adicionarValor(Double valor){
        this.valor = valor;
        return this;
    }

        /**
         * Metodo que sabe add uma data ao builder
         * @param data
        * @return
        */
    public ProdutoBuilder adicionarData(String data){
        this.data = data;
        return this;
    }
}
