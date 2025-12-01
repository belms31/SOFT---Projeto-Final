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
public interface StrategyPagamento {    
    public boolean processar(BigDecimal valor);

    public boolean pagar(BigDecimal valorTotal);
}
