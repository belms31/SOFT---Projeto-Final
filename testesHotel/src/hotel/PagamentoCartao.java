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
public class PagamentoCartao implements StrategyPagamento {
    @Override
    public boolean processar(BigDecimal valor) { return false; }

    @Override
    public boolean pagar(BigDecimal valorTotal) {
        return true;
    }
}
