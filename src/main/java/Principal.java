import builder.Produto;
import builder.ProdutoBuilder;
import builder.Vendedor;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataCadastro = LocalDate.of(2021, 11,3);
        LocalDate dataAtualizacao = LocalDate.of(2021, 11, 3);
        Vendedor vendedor = new Vendedor(1, "Joao");
        Produto produto = new ProdutoBuilder()
                .setTitulo("Celular")
                .setDescricao("Galaxy")
                .setMarca("Samsung")
                .setModelo("S20")
                .setPreco(5000)
                .setDataCadastro(LocalDate.now())
                .setDataUltimaAtualizacao(LocalDate.now())
                .setCategoria("Eletro portátil")
                .setVendedor(vendedor)
                .createProduto();
        System.out.println(produto);
    }
}
