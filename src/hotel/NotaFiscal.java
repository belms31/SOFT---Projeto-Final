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
public class NotaFiscal {
    private int id;
    private String numero;
    private LocalDateTime dataEmissao;
    private BigDecimal valor;
    private String emailEnvio;

    public NotaFiscal(int id, String numero, BigDecimal valor, String emailEnvio) {
        this.id = id;
        this.numero = numero;
        this.valor = valor;
        this.emailEnvio = emailEnvio;
        this.dataEmissao = LocalDateTime.now();
    }
}
