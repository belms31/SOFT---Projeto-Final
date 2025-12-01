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
public class Item {
    private int id;
    private String nome;
    private String tipo;
    private BigDecimal preco;
    private boolean disponivel;

    public Item(int id, String nome, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.disponivel = true;
    }
}
