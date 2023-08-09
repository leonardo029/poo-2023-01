package com.github.leonardo029.poo.t21;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Cardapio {

    private Set<Prato> pratos;

    public Set<Prato> pratosPorDiaDaSemana(DiaDaSemana dia) {
         Set<Prato> fornecidosNoDia = new HashSet<>();
        for (Prato prato : pratos) {
            if (prato.servidoEm(dia)) {
                fornecidosNoDia.add(prato);
            }
        }

        return fornecidosNoDia;
    }
}