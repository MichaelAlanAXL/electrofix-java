package br.com.electrofix.repository;

import br.com.electrofix.domain.OrdemServico;
import java.util.ArrayList;
import java.util.List;

public class OrdemServicoRepository {
    private static List<OrdemServico> ordens = new ArrayList<>();

    public static void salvar(OrdemServico os) {
        ordens.add(os);
    }

    public static List<OrdemServico> listarTodas() {
        return ordens;
    }
    
}
