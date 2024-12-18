class ControleRemoto {
    private Televisao tv = new Televisao();

    public void aumentarVolume() {
        tv.volume++;
    }

    public void diminuirVolume() {
        if(tv.volume > 0) {
            tv.volume--;
        }
    }

    public void aumentarCanal() {
        tv.canal++;
    }

    public void diminuirCanal() {
        if(tv.canal > 0) {
            tv.canal--;
        }
    }

    public void trocarParaCanalIndicado(int canal) {
        tv.canal = canal;
    }

    public int consultarVolume() {
        return tv.volume;
    }

    public int consultarCanalAtual() {
        return tv.canal;
    }
}
