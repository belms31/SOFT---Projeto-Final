/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import hotel.*;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author mari
 */
public class ManutencaoTest {
    
    @Test
    public void testEstadoInicial() {
        Manutencao m = new Manutencao(); //cria uma manutencao pendente
        
        assertEquals(StateManutencao.PENDENTE, m.getStatus()); 
        // vai verificar se esta como estado pendente
        assertNotNull(m.getDataAbertura());
        //verifica se a data de abertura foi preenchida automaticamente
        System.out.println("Data: " + m.getDataAbertura());
    }
    
    @Test
    public void testGettersAndSetters() {
        Manutencao m = new Manutencao();
        //ajusta os valores atributos
        m.setId(50);
        m.setDescricao("Troca de lâmpada");
        LocalDate agora = LocalDate.now();
        m.setDataAbertura(agora);
        m.setStatus(StateManutencao.PENDENTE);
        
        //verifica se os getters retornaram corretamente
        assertEquals(50, m.getId());
        assertEquals("Troca de lâmpada", m.getDescricao());
        System.out.println("Manutenção status: " + m.getDescricao());
        
        assertEquals(agora, m.getDataAbertura());
        assertEquals(StateManutencao.PENDENTE, m.getStatus());
        System.out.println("Manutenção status: " + m.getStatus());
    }

    @Test
    public void testFluxoDeManutencao() {
        //testa a sequencia: aprovar -> execucao -> concluida
        Manutencao m = new Manutencao();
        m.aprovar();
        assertEquals(StateManutencao.APROVADA, m.getStatus());
        System.out.println("Manutenção status: " + m.getStatus());

        m.executar();
        assertEquals(StateManutencao.EXECUCAO, m.getStatus());
        System.out.println("Manutenção status: " + m.getStatus());

        m.concluir();
        assertEquals(StateManutencao.CONCLUIDA, m.getStatus());
        System.out.println("Manutenção status: " + m.getStatus());
    }
    
    @Test
    public void testAbrirManutencao() {
        //verifica se a funcao abrir() deixa em estado pendente
        Manutencao m = new Manutencao();

        assertEquals(StateManutencao.PENDENTE, m.getStatus());
        assertNotNull(m.getDataAbertura());
        System.out.println("Manutenção aberta com status: " + m.getStatus());
    }
    
    @Test
    public void testConcluirManutencao() {
        //para concluir a manutencao, precisa antes aprovar e exucutar
        Manutencao m = new Manutencao();
        //aprovando, executando e por fim concluido
        m.aprovar();
        m.executar();
        m.concluir();
        //conferi se foi concluido
        assertEquals(StateManutencao.CONCLUIDA, m.getStatus());
        System.out.println("Manutenção concluída com status: " + m.getStatus());
    }
}