import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Pessoa> pessoas; 

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void addPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }
}
