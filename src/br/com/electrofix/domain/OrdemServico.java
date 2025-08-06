package br.com.electrofix.domain;

import br.com.electrofix.utils.DataUtils;

public class OrdemServico {

    private int numeroOS;
    private Cliente cliente;
    private Produto produto;
    private String status;
    private String dataEntrada;
    private static int contadorOS = 1;

    public OrdemServico(Cliente cliente, Produto produto) {
        this.numeroOS = contadorOS++;
        this.cliente = cliente;
        this.produto = produto;
        this.status = "Aguardando análise";

        this.dataEntrada = DataUtils.dataHoraAtual();
    }

    public int getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(int numeroOS) {
        this.numeroOS = numeroOS;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String detalhes() {
        return "=== Ordem de Serviço #" + numeroOS + " ===\n"
        + "Cliente: " + cliente.getNome() + "\n" 
        + "Produto: " + produto.getMarca() + " " + produto.getModelo() + "\n"
        + "Tipo: " + produto.getTipo() + "\n"
        + "Status: " + status + "\n"
        + "Data de Entrada: " + dataEntrada;
    }


    
}
