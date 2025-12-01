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
public class QuartoTest {
    
    @Test
    public void testGettersAndSetters() {
        //cria um quarto
        Quarto q = new Quarto(101, "Luxo", 3);
        
        //modifica atributos
        q.setNumero(202);
        q.setCategoria("Premium");
        q.setCapacidade(4);
        q.setStatus(StateQuarto.MANUTENCAO);
        
        //verifica se os setters e getters tao certos
        assertEquals(202, q.getNumero());
        assertEquals("Premium", q.getCategoria());
        assertEquals(4, q.getCapacidade());
        assertEquals(StateQuarto.MANUTENCAO, q.getStatus());
        System.out.println("Status: " + q.getStatus());
    }
    
    @Test
    public void testCriaQuarto(){
        //cria um quarto
        Quarto q = new Quarto (101, "Luxo", 2);
        System.out.println("Quarto criado: " + q.getNumero());
        //espera que o status do quarto seja livre
        System.out.println("Status: " + q.getStatus());
    }
    
    @Test
    public void testAtualizarStatus() {
        //cria quarto
        Quarto q = new Quarto(101, "Luxo", 3);
        
        //ocupa o quarto
        q.ocupar();
        assertEquals(StateQuarto.OCUPADO, q.getStatus());
        System.out.println("Status: " + q.getStatus());
        
        //libera o quarto
        q.liberar();
        assertEquals(StateQuarto.LIVRE, q.getStatus());
        System.out.println("Status: " + q.getStatus());
        
        //em limpeza
        q.limpar();
        assertEquals(StateQuarto.LIMPEZA, q.getStatus());
        System.out.println("Status: " + q.getStatus());
        
        //em manutencao
        q.manutencao();
        assertEquals(StateQuarto.MANUTENCAO, q.getStatus());
        System.out.println("Status: " + q.getStatus());
    }
}
