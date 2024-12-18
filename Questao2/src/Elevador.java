public class Elevador {
    private int andarAtual, totalAndares, capacidadeElevador, pessoasNoElevador;

    public Elevador(int totalAndares, int capacidadeElevador) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.pessoasNoElevador = 0;
        this.capacidadeElevador = capacidadeElevador;
    }

    public void entra() {
        if(this.pessoasNoElevador < this.capacidadeElevador) {
            this.pessoasNoElevador++;
        }
    }

    public void sai() {
        if(this.pessoasNoElevador > 0) {
            this.pessoasNoElevador--;
        }
    }

    public void sobe() {
        if(this.andarAtual < this.totalAndares) {
            this.andarAtual++;
        }
    }

    public void desce() {
        if(this.andarAtual > 0) {
            this.andarAtual--;
        }
    }

    // getters e setters
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getPessoasNoElevador() {
        return pessoasNoElevador;
    }

    public void setPessoasNoElevador(int pessoasNoElevador) {
        this.pessoasNoElevador = pessoasNoElevador;
    }
}
