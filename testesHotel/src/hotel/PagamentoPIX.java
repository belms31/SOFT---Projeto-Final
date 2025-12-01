/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.math.BigDecimal;
/**
 *
 * @author mari
 */
public class PagamentoPIX implements StrategyPagamento {
    private final String chavePix;
    
    public PagamentoPIX (String chavePix){
        this.chavePix = chavePix;
    }
    
    @Override
    public boolean processar(BigDecimal valor) {
    return chavePix != null && !chavePix.isBlank() && valor != null;
    }

    @Override
    public boolean pagar(BigDecimal valorTotal) {
        return true;
    }
    
    
}
    
    

