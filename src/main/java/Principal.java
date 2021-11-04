import builder.Produto;
import builder.ProdutoBuilder;
import builder.Vendedor;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataCadastro = LocalDate.of(2021, 11,3);
        LocalDate dataAtualizacao = LocalDate.of(2021, 11, 3);
        Vendedor vendedor = new Vendedor(1, "Joao");
        Produto produto = new ProdutoBuilder("titulo", "descrição", 100.0, dataCadastro, dataAtualizacao,"categoria", vendedor)
                .setId(1)
                .setMarcaModelo("marca", "modelo")
                .createProduto();
        System.out.println(produto);
    }
}
