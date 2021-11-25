package builder;

public class Vendedor {
    long id;
    String nome;

    public Vendedor(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
