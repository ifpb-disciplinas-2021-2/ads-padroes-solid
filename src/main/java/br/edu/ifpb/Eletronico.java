package br.edu.ifpb;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/11/2021, 09:14:13
 */
public class Eletronico extends Item implements Taxavel{

    public Eletronico(String produto,double valor) {
        super("eletrônico",produto,valor);
    }

    @Override   
    public double taxas(LocalDate data) {
        if(Month.OCTOBER.equals(data.getMonth())){
            return this.preco() * 0.1; // 10% de desconto
        }
        return this.preco() * 0.2;
    }

}
