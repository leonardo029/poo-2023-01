package com.github.leonardo029.poo.t21;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Pedido {

    private LocalDate dia;
    private LocalTime horario;
    private LocalTime horaEntrega;
    private NotaFiscal notaFiscal;
    private Trabalhador coletadoPor;
    private Mesa mesa;
    private Domicilio destino;
    private List<ItemPedido> itensDoPedido;
}