package br.edu.ifpb;

import java.time.LocalDate;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/11/2021, 09:26:30
 */
// TODO: Poderia transfomar esta classe em uma interface?
public interface Taxavel { 

//    public Taxavel(String categoria,String produto,double valor) {
//        super(categoria,produto,valor);
//    }

    public abstract double taxas(LocalDate data);
}
