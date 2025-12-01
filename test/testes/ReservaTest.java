/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import hotel.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author mari
 */
public class ReservaTest {
    
    @Test
    public void testGettersAndSetters(){
        //cria uma reserva
        Reserva r = new Reserva (
            10,
            LocalDate.of(2025, 1, 10),
            LocalDate.of(2025, 1, 15),
            BigDecimal.valueOf(300),
            2
        );
        //coloca nos atributos
        r.setId(20);
        r.setQtdHospedes(4);
        r.setValorDiaria(BigDecimal.valueOf(500));
        //verifica os atributos
        assertEquals(20, r.getId());
        assertEquals(4, r.getQtdHospedes());
        assertEquals(BigDecimal.valueOf(500), r.getValorDiaria());
    }
    
    
    @Test
    public void testCriaReserva(){
        //teste bem simples de criacao de reserva
        Reserva r = new Reserva(
                10,
                LocalDate.of(2025, 12, 15),
                LocalDate.of(2025, 12, 20),
                BigDecimal.valueOf(350),
                2
        );
    //imprime oid da reserva, nao altera na compilacao do teste
    System.out.println("Reserva criada: ID = " + r.getId());
    }
    
    @Test
    public void testAlterarDatas() {
        //criacao da data inicial
        Reserva r = new Reserva(
            1,
            LocalDate.of(2025, 1, 10),
            LocalDate.of(2025, 1, 12),
            BigDecimal.valueOf(200),
            2
        );
        
        //novas datas
        LocalDate novaEntrada = LocalDate.of(2025, 2, 1);
        LocalDate novaSaida = LocalDate.of(2025, 2, 5);
        
        //acao da alteracao de datas
        r.alterarDatas(novaEntrada, novaSaida);
        
        //verfica a alteracao
        assertEquals(novaEntrada, r.getDataCheckInPrevista());
        assertEquals(novaSaida, r.getDataCheckOutPrevista());
        System.out.println("novaEntrada: " + r.getDataCheckInPrevista());
        System.out.println("novaSaida: " + r.getDataCheckOutPrevista());
    }
    
    @Test
    public void testCheckinCheckout() {
        //reserva criada
        Reserva r = new Reserva(
                1,
                LocalDate.of(2025, 1, 10),
                LocalDate.of(2025, 1, 12),
                BigDecimal.valueOf(200),
                2
        );
        
        //confirma a reserva
        r.confirmarReserva();
        assertEquals(StateReserva.CONFIRMADA, r.getStatus());
        System.out.println("Status: " + r.getStatus());
        
        //faz o checkIn
        r.checkinReserva();
        assertEquals(StateReserva.CHECKIN, r.getStatus());
        System.out.println("Status: " + r.getStatus());
        
        //faz o checkOut
        r.checkoutReserva();
        assertEquals(StateReserva.CHECKOUT, r.getStatus());
        System.out.println("Status: " + r.getStatus());
    }
    
    @Test
    public void testConfirmarReserva() {
        //cria uma reserva que esta no estado criada
        Reserva r = new Reserva(
                1,
                LocalDate.of(2025, 1, 10),
                LocalDate.of(2025, 1, 12),
                BigDecimal.valueOf(200),
                2
        );
        
        //acao de confirmar
        r.confirmarReserva();
        //verifica
        assertEquals(StateReserva.CONFIRMADA, r.getStatus());
        System.out.println("Status: " + r.getStatus());
    }
    
    @Test
    public void testCalcularTotal(){
        //cria reserva de 3 diarias
        Reserva r = new Reserva(
        1,
        LocalDate.of(2025, 12, 01),
        LocalDate.of(2025, 12, 04),
        BigDecimal.valueOf(200),
        2);
        // esperado tem o valor de 600 = 3 * 200
        BigDecimal esperado = BigDecimal.valueOf(600);
        //verifica o calculo do total
        assertEquals(esperado, r.calcularTotal());
    }
}