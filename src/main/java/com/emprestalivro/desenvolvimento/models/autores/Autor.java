package models.autores;

public class Autor {
    protected String nome;
    protected String nacionalidade;
    protected int qtdlivro;
    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    @Override
    public String toString() {
        return "Autor [nome=" + nome + ", nacionalidade=" + nacionalidade + "]";
    }
    

    
}
