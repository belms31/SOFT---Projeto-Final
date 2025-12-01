/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author mari
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("=== SISTEMA DO HOTEL ===");
    
    //criando um hospede
    Hospede h = new Hospede(1, "Mariana", "123.456.789-00");
    System.out.println("Hospede criado: " + h.getNome());
    
    //criando um quarto
    Quarto q = new Quarto (101, "Luxo", 2);
    System.out.println("Quarto criado: " + q.getNumero());
    
    //criando uma reserva
    Reserva r = new Reserva(
                10,
                LocalDate.of(2025, 12, 15),
                LocalDate.of(2025, 12, 20),
                BigDecimal.valueOf(350),
                2
        );
    
    System.out.println("Reserva criada: ID = " + r.getId());
    System.out.println("Valor total estimado: R$ " + r.calcularTotal());
    
    Pagamento pagamento = new Pagamento(99, r.calcularTotal(), new PagamentoPIX("email@pix.com"));
        pagamento.processarPagamento();

        if (pagamento.isConfirmado()) {
            System.out.println("Pagamento confirmado!");
        } else {
            System.out.println("Pagamento falhou!");
        }
    
    r.checkinReserva();
        System.out.println("Check-in realizado. Status agora: " + r.getStatus());   
    
    r.checkoutReserva();
        System.out.println("Check-out realizado. Status final: " + r.getStatus());
    
    Manutencao man = new Manutencao();
        System.out.println("Manutenção aberta. Estado inicial: " + man.getStatus());

        System.out.println("\n=== SISTEMA FINALIZADO ===");
    
    }
    
}
