package com.github.leonardo029.poo.t22;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Ocorrencia {
    
    private String local;
    private LocalDate data;
    private LocalTime hora;
    private String descricaoDoAcontecimento;
    private List<Pessoa> pessoasEnvolvidasNaOcorrencia;
}