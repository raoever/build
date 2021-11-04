package builder;

import java.time.LocalDate;

public class ProdutoBuilder {
    private long id;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String urlFoto;
    private String categoria;
    private Vendedor vendedor;
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;

    //obrigatórios
    public ProdutoBuilder(String titulo, String descricao, double preco, LocalDate dataCadastro, LocalDate dataUltimaAtualizacao, String categoria, Vendedor vendedor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.categoria = categoria;
        this.vendedor = vendedor;
    }

    //atributos em conjunto
    public ProdutoBuilder setMarcaModelo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder setEstoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public ProdutoBuilder setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
        return this;
    }

    public ProdutoBuilder setPeso(double peso) {
        this.peso = peso;
        return this;
    }

    public ProdutoBuilder setAltura(double altura) {
        this.altura = altura;
        return this;
    }

    public ProdutoBuilder setLargura(double largura) {
        this.largura = largura;
        return this;
    }

    public ProdutoBuilder setProfundidade(double profundidade) {
        this.profundidade = profundidade;
        return this;
    }

    public Produto createProduto() {
        return new Produto(id, titulo, descricao, marca, modelo, estoque, preco, dataCadastro, dataUltimaAtualizacao, urlFoto, categoria, vendedor, peso, altura, largura, profundidade);
    }
}