/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import hotel.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


/**
 *
 * @author mari
 */
public class PagamentoTest {

        @Test
        public void testGettersAndSetters() {
            //cria um pagamento
            Pagamento pg = new Pagamento(1, BigDecimal.valueOf(500), null);
            
            //modifica os getters e setters
            pg.setId(10);
            pg.setValorTotal(BigDecimal.valueOf(750));
            pg.setDataHora(LocalDateTime.of(2025, 1, 10, 10, 10));
            pg.setConfirmado(true);
            
            //verifica
            assertEquals(10, pg.getId());
            assertEquals(BigDecimal.valueOf(750), pg.getValorTotal());
            assertEquals(LocalDateTime.of(2025, 1, 10, 10, 10), pg.getDataHora());
            assertTrue(pg.isConfirmado());
            System.out.println("Status: " + pg.isConfirmado());

        }
    
        @Test 
        public void testProcessarPagamento(){
            //pagamento usando o dinheiro
            Pagamento pg = new Pagamento(1, BigDecimal.valueOf(300),
                    new PagamentoDinheiro());
            //teste para ver se o metodo nao lanca excecoes
          try {
                pg.processarPagamento();
            } catch (Exception e) {
                fail("processarPagamento lançou exceção: " + e.getMessage());
            }
          System.out.println("Status: " + pg.isConfirmado());
        }

        @Test
        public void testPagamento() {
        //cria uma reserva
            Reserva r = new Reserva(
                    1,
                    java.time.LocalDate.of(2025, 1, 10),
                    java.time.LocalDate.of(2025, 1, 12),
                    BigDecimal.valueOf(100),
                    2
            );
            
            //chama o metodo para calcular
            BigDecimal total = r.calcularTotal();
            
            //cria um pagamento usanso estrategia PIX
            Pagamento pagamento = new Pagamento(
                    99,
                    total,
                    new PagamentoPIX("email@pix.com")
            );
            
            //testa apenas se o metodo nao lenca excecoes
            try {
                pagamento.processarPagamento(); 
            } catch (Exception e) {
                fail("processarPagamento lançou exceção: " + e.getMessage());
            }

        System.out.println("Pagamento confirmado? " + pagamento.isConfirmado());
    }
}
