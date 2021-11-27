package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/11/2021, 08:39:48
 */
public abstract class Item {

    private final String categoria;
    private final String produto;
    private final double preco;

    Item(String categoria,String produto,double valor) {
        this.preco = valor;
        this.produto = produto;
        this.categoria = categoria;
    }
    
//    public abstract double taxas();
    
//    public double taxas(){
//        if("eletrônico".equals(this.categoria())){
//            return this.preco() * 0.2;
//        }
//        if("comida".equals(this.categoria())){
//            return this.preco() * 0.1;
//        }
//        if("bebida".equals(this.categoria())){
//            return 0.0; //sem taxas
//        }
//        return 0.0;
//    }
    
    public double preco(){
        return this.preco;
    }

    public String categoria() {
        return this.categoria;
    }

}
