package com.github.leonardo029.poo.t22;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Venda {

    private LocalDate data;
    private LocalTime hora;
    private Funcionario queRealizouAVenda;
    private CentroDeVenda ondeFoiFeitaAVenda;
    private Set<Bilhete> bilhetesVendidos;
}