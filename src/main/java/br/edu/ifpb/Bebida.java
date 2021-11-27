package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/11/2021, 09:14:13
 */
public class Bebida extends Item{

    public Bebida(String produto,double valor) {
        super("bebida",produto,valor);
    }

//    @Override
//    public double taxas() {
//        throw new IllegalArgumentException("item não taxável");
//    }

}
