public class Main {
    public static void main(String args[]){
        Universidade ufpa = new Universidade("ufpa");

        Departamento secretaria = new Departamento("secretaria");
        Departamento diretoria = new Departamento("diretoria");
        Departamento corpoDocente = new Departamento("corpo docente");

        Pessoa diretor = new Pessoa("diretor", "diretor@ufpa.br", "91987654321");
        Pessoa viceDiretor = new Pessoa("vice diretor", "vicediretor@ufpa.br", "91912345678");
        Pessoa secretario = new Pessoa("secretario", "secretario@ufpa.br", "91999998888");
        Pessoa monitor = new Pessoa("monitor", "monitor@ufpa.br", "91988887777");
        Pessoa professor1 = new Pessoa("professor 1", "professor1@ufpa.br", "91999999999");
        Pessoa professor2 = new Pessoa("professor 2", "professor2@ufpa.br", "91988888888");

        ufpa.addDepartamento(secretaria);
        ufpa.addDepartamento(diretoria);
        ufpa.addDepartamento(corpoDocente);

        diretoria.addPessoa(diretor);
        diretoria.addPessoa(viceDiretor);

        secretaria.addPessoa(secretario);
        secretaria.addPessoa(monitor);

        corpoDocente.addPessoa(professor1);
        corpoDocente.addPessoa(professor2);
    }
}
