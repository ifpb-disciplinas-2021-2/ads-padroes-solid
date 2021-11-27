package br.edu.ifpb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 25/11/2021, 08:29:02
 */
public class Pedido {
    private final List<Item> itens = new ArrayList<>();
    private final LocalDate criadoEm;

    public Pedido(LocalDate criadoEm) {
        this.criadoEm = criadoEm;
    }
    
    double total() {
        return subTotal() + calcularTaxas();
    }
    
    public double calcularTaxas() {
        return itens.stream()
            .map(AplicaTaxas::new)
            .mapToDouble(item -> item.calcula(criadoEm))
            .sum();
    }
    // double calcularTaxas() {
    //     double sum = 0;
    //     sum = itens.stream()
    //         .filter((item) -> (item instanceof Taxavel))
    //         .map((item) -> (Taxavel) item)
    //         .map((t) -> t.taxas(this.criadoEm))
    //         .reduce(sum,(accumulator,_item) -> accumulator + _item);
    //     return sum;        
    // }
    
    double subTotal() {
        return this.itens.stream()
                 .mapToDouble(Item::preco)
                 .sum();
    }

    void adicionar(Item item) {
//       Item item = new Item(categoria,produto, valor);
       this.itens.add(item);
    }
//    void adicionar(String categoria,String produto, double valor) {
//       Item item = new Item(categoria,produto, valor);
//       this.itens.add(item);
//    }

    


}
