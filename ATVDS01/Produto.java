package ATVDS01;

public class Produto {
    //atributos
    String nome;
    float preco;
    int codigo;
    int quantidade;
    String cor;

    //métodos
    public Produto(){}//padrão

    //1
    public Produto(String nome, float preco, int codigo, int quantidade, String cor){
        this.nome = nome; //o nome do atributo é igual ao nome do parâmetro do método
        this.preco = preco;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.cor = cor;
    }

    //2

    //3
    
    //enclapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
