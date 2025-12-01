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
public class Avaliacao {
    private int id;
    private int nota;
    private String comentario;
    private LocalDate data;

    public Avaliacao(int id, int nota, String comentario) {
        this.id = id;
        this.nota = nota;
        this.comentario = comentario;
        this.data = LocalDate.now();
    }
}
