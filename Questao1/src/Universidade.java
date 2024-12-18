import java.util.ArrayList;

public class Universidade {
    private String nome;
    private ArrayList<Departamento> departamentos;
    private int quantDep;

    public Universidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void addDepartamento(Departamento dep) {
        if(quantDep < 10) {
            this.departamentos.add(dep);
            quantDep++;
        }
    }
}
