/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author mari
 */
public class Pagamento {
    private int id;
    private LocalDateTime dataHora;
    private BigDecimal valorTotal;
    private StrategyPagamento forma;
    private boolean confirmado;
    
    public Pagamento(int id, BigDecimal valorTotal, StrategyPagamento forma){
        this.id = id;
        this.valorTotal = valorTotal;
        this.forma = forma;
        this.dataHora = LocalDateTime.now();
        this.confirmado = false;
    }
    
    
    public int getId() {
    return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StrategyPagamento getForma() {
        return forma;
    }

    public void setForma(StrategyPagamento forma) {
        this.forma = forma;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }
    
    public boolean processarPagamento(){
        if (forma == null)
            return false;
        boolean sucesso =forma.pagar (valorTotal);
        
        if (sucesso){
            this.confirmado = true;
        }
        return sucesso;
    }

}
