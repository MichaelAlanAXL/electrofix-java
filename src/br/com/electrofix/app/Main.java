package br.com.electrofix.app;

import br.com.electrofix.domain.*;
import br.com.electrofix.service.OrdemServicoService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do { 
            System.out.println("\n=== Sistema EletroFix ===");
            System.out.println("1. Criar Ordem de Serviço");
            System.out.println("2. Listar Ordens de Serviço");
            System.out.println("3. Atualizar Status da Ordem de Serviço");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do Cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF do Cliente: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Telefone do Cliente: ");
                    String telefone = scanner.nextLine();
                    Cliente cliente = new Cliente(nome, cpf, telefone);

                    System.out.print("Tipo de produto (1 - Celular / 2 - Notebook): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    Produto produto;
                    if (tipo == 1) {
                        System.out.print("Marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = scanner.nextLine();
                        System.out.print("Sistema Operacional: ");
                        String so = scanner.nextLine();

                        produto = new Celular(marca, modelo, so);
                    } else {
                        System.out.print("Marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = scanner.nextLine();
                        System.out.print("Sistema Operacional: ");
                        String so = scanner.nextLine();
                        System.out.print("Memória RAM (GB): ");
                        int memoriaRam = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Tamanho da Tela: ");
                        String tamanho = scanner.nextLine();
                        System.out.print("Possui SSD? (true/false): ");
                        boolean temSSD = scanner.nextBoolean();
                        scanner.nextLine();

                        produto = new Notebook(marca, modelo, so, memoriaRam, tamanho, temSSD);
                    }

                    OrdemServico os = (OrdemServico) OrdemServicoService.criarOrdem(cliente, produto);
                    System.out.println("Ordem de Serviço criada com sucesso!");
                    System.out.println(os.detalhes());
                    break;
                }
                case 2 -> {
                    System.out.println("\n=== Lista de Ordens de Serviço ===");
                    for (Object ordem : OrdemServicoService.listarOrdens()) {
                        System.out.println(((OrdemServico) ordem).detalhes());
                        System.out.println("---------------------------");
                    }
                    break;
                }
                case 3 -> {
                    System.out.print("Número da Ordem de Serviço: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo Status: ");
                    String status = scanner.nextLine();

                    boolean atualizado = OrdemServicoService.atualizarStatus(numero, status);
                    if (atualizado) {
                        System.out.println("Status atualizado com sucesso!");
                    } else {
                        System.out.println("Ordem de Serviço não encontrada.");
                    }
                    break;
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();

    }
}