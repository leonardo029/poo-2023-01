package com.github.leonardo029.poo.t17.empregado;

import java.util.List;

public class Funcionario {
    private String nome;
    private int id;
    private boolean possuiGerente;
    private Funcionario gerente;
    private List<Funcionario> empregados;
}
