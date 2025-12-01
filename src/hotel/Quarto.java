/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author mari
 */
public class Quarto {
    private int numero;
    private String categoria;
    private int capacidade;
    private StateQuarto status;
    
    public Quarto(int numero, String categoria, int capacidade){
        this.numero = numero;
        this.categoria = categoria;
        this.capacidade = capacidade;
        this.status = StateQuarto.LIVRE;
    }
    
    public void ocupar(){
        this.status = StateQuarto.OCUPADO;
    }
    
    public void liberar(){
        this.status = StateQuarto.LIVRE;
    }
    
    public void limpar(){
        this.status = StateQuarto.LIMPEZA;
    }
    
    public void manutencao(){
        this.status = StateQuarto.MANUTENCAO;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public StateQuarto getStatus() {
        return status;
    }

    public void setStatus(StateQuarto status) {
        this.status = status;
    }

    
}
