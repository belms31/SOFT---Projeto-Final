/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.time.LocalDate;

/**
 *
 * @author mari
 */
public class Manutencao {
    private int id;
    private String descricao;
    private LocalDate dataAbertura;
    private LocalDate dataConclusao;
    private StateManutencao status;
    
    public Manutencao(int id, String descricao, LocalDate abertura, LocalDate conclusao){
        this.id = id;
        this.descricao = descricao;
        this.dataAbertura = abertura;
        this.dataConclusao = conclusao;
        this.status = StateManutencao.APROVADA;
    }

    public Manutencao() {
        this.status = StateManutencao.PENDENTE;  
        this.dataAbertura = LocalDate.now(); 
    }
    
    public void abrir(){
        this.status = StateManutencao.PENDENTE;
    }
    
    public void concluir(){
        this.status = StateManutencao.CONCLUIDA;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public StateManutencao getStatus() {
        return status;
    }

    public void setStatus(StateManutencao status) {
        this.status = status;
    }

    public void aprovar() {
        this.status = StateManutencao.APROVADA;
    }

    public void executar() {
        this.status = StateManutencao.EXECUCAO;
    }
}
