package br.edu.ifpb;

import java.time.LocalDate;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/11/2021, 09:14:13
 */
public class Comida extends Item implements Taxavel{

    public Comida(String produto,double valor) {
        super("comida",produto,valor);
    }

    @Override
    public double taxas(LocalDate data) {
        return this.preco() * 0.1;
    }

}
