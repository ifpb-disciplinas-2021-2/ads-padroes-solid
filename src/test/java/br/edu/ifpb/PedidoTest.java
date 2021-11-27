package br.edu.ifpb;

import java.time.LocalDate;
import java.time.Month;
import org.junit.Test;
import static org.junit.Assert.*;

public class PedidoTest {
    
    
    @Test
    public void testCalcularValorSubTotal() {
        //given
        Pedido pedido = new Pedido(
            LocalDate.now()
        );
        pedido.adicionar(new Eletronico( "celular", 550.00));
        pedido.adicionar(new Eletronico( "tv", 450.00));
        //then
        double total = pedido.subTotal();
        double esperado = 1000.00;
        //verify 10.0001 == 10.0002
        assertEquals(esperado,total, 0.001);
    }
    @Test
    public void testCalcularTaxas() {
        //given
        Pedido pedido = new Pedido(
            LocalDate.now()
        );
        pedido.adicionar(new Eletronico("celular", 500.00)); //100
        pedido.adicionar(new Comida("arroz", 50.00)); //5
//        pedido.adicionar("bebida", "arroz", 50.00); //5
        //then
        double total = pedido.calcularTaxas();
        double esperado = 105.00;
        //verify 
        assertEquals(esperado,total, 0.001);
    }
    
    @Test
    public void testCalcularValorTotal() {
        Pedido pedido = new Pedido(
            LocalDate.now()
        );
        pedido.adicionar(new Eletronico( "celular", 500.00)); //100
        pedido.adicionar(new Comida("arroz", 50.00)); //5
        double total = pedido.total();
        double esperado = 655.00;
        assertEquals(esperado,total, 0.001);
    }
    @Test
    public void testCalcularValorComBebida() {
         Pedido pedido = new Pedido(
            LocalDate.now()
        );
        pedido.adicionar(new Eletronico( "celular", 500.00)); //100
        pedido.adicionar(new Comida("arroz", 50.00)); //5
        pedido.adicionar(new Bebida("água", 5.00)); //sem taxas
        double total = pedido.total();
        double esperado = 660.00;
        assertEquals(esperado,total, 0.001);
    }
//    @Test(expected = IllegalArgumentException.class)
    @Test
    public void testCalcularValorComTaxas() {
         Pedido pedido = new Pedido(
            LocalDate.now()
        );
        pedido.adicionar(new Eletronico( "celular", 500.00)); //100
        pedido.adicionar(new Comida("arroz", 50.00)); //5
        pedido.adicionar(new Bebida("água", 5.00)); //sem taxas
        double total = pedido.calcularTaxas();
        double esperado = 105.00;
        assertEquals(esperado,total, 0.001);
    }
    
    @Test
    public void testCalcularValorTotalBlackFriday() {
        Pedido pedido = new Pedido(
            LocalDate.of(2021,Month.OCTOBER,26)
//            LocalDate.now()
        );
        pedido.adicionar(new Eletronico( "celular", 550.00));
        pedido.adicionar(new Eletronico( "tv", 450.00));
        double total = pedido.calcularTaxas();
        double esperado = 100.00; //10%
        assertEquals(esperado,total, 0.001);
    }
    
}
