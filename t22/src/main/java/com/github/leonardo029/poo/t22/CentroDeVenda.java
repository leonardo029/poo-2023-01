package com.github.leonardo029.poo.t22;

import java.util.List;

public class CentroDeVenda {
    
    private String idVenda;
    private List<Venda> vendasFeitas;
    private List<TrocaAporB> trocasFeitas;

    public List<Venda> getVendasFeitas() {
        return vendasFeitas;
    }

    public void setVendasFeitas(List<Venda> vendasFeitas) {
        this.vendasFeitas = vendasFeitas;
    }
}