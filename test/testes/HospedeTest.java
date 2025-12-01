/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import hotel.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author mari
 */
public class HospedeTest {
    @Test
    public void testGettersAndSetters() {
        //cria um hospede com dados 
        Hospede h = new Hospede(1, "Mariana", "12345678900");
        
        //ajusta atributos
        h.setEndereco("Rua A");
        h.setEmail("teste@email.com");
        h.setTelefone("99999999");
        h.setPreferencias("Silencioso");
        
        //confere os atributos
        assertEquals("Rua A", h.getEndereco());
        assertEquals("teste@email.com", h.getEmail());
        assertEquals("99999999", h.getTelefone());
        assertEquals("Silencioso", h.getPreferencias());
    }
    
    @Test
    public void testCancelarReserva(){
        //cria uma reserva
        Reserva r = new Reserva(
            1,
            java.time.LocalDate.of(2025, 1, 10),
            java.time.LocalDate.of(2025, 1, 12),
            java.math.BigDecimal.valueOf(100),
            2
        );
        //o metodo deve mudar o status para cancelada
        r.cancelar();
        //verifica se foi atualizado
        assertEquals(StateReserva.CANCELADA, r.getStatus());
        System.out.println("Status: " + r.getStatus());

    }
}
