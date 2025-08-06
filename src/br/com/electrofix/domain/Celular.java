package br.com.electrofix.domain;

public class Celular extends Produto {
    private String sistemaOperacional;
    
    public Celular(String marca, String modelo, String sistemaOperacional) {
        super(marca, modelo, "Celular");
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String descrever() {
        return "Celular: " + getMarca() + " " + getModelo() + " | SO: " + sistemaOperacional;
    }
}