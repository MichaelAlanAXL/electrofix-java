package br.com.electrofix.domain;

public class Notebook extends Produto {
    private String sistemaOperacional;
    private int memoriaRam;
    private String tamanhoTela;
    private boolean temSSD;

    public Notebook(String marca, String modelo, String sistemaOperacional, int memoriaRam, String tamanho, boolean temSSD) {
        super(marca, modelo, "Notebook");
        this.sistemaOperacional = sistemaOperacional;
        this.memoriaRam = memoriaRam;
        this.tamanhoTela = tamanho;
        this.temSSD = temSSD;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public boolean isTemSSD() {
        return temSSD;
    }

    public void setTemSSD(boolean temSSD) {
        this.temSSD = temSSD;
    }

    @Override
    public String descrever() {
        return "Notebook: " + getMarca() + " " + getModelo() + " | SO: " + sistemaOperacional +
               " | RAM: " + memoriaRam + "GB | Tela: " + tamanhoTela + " polegadas" +
               (temSSD ? " | Com SSD" : " | Sem SSD");
    }
    
}
