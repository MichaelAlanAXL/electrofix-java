package br.com.electrofix.service;

import br.com.electrofix.domain.*;
import br.com.electrofix.repository.OrdemServicoRepository;

import java.util.List;

public class OrdemServicoService {
    public static OrdemServico criarOrdem(Cliente cliente, Produto produto) {
        OrdemServico os = new OrdemServico(cliente, produto);
        OrdemServicoRepository.salvar(os);
        return os;
    }

    public static List<OrdemServico> listarOrdens() {
        return OrdemServicoRepository.listarTodas();
    }

    public static OrdemServico buscarPorNumero(int numero) {
        for (OrdemServico os : listarOrdens()) {
            if (os.getNumeroOS() == numero) {
                return os;
            }
        }
        return null;
    }

    public static boolean atualizarStatus(int numero, String novoStatus) {
        OrdemServico os = buscarPorNumero(numero);
        if (os != null) {
            os.setStatus(novoStatus);
            return true;
        }
        return false;
    }
    
}
