/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mari
 */
public class Reserva {
    
    private int id;
    private LocalDate dataCheckInPrevista;
    private LocalDate dataCheckOutPrevista;
    private LocalDate dataCheckOutInReal;
    private LocalDate dataCheckOutReal;
    private StateReserva status;
    
    private BigDecimal valorDiaria;
    private int qtdHospedes;
    
    private List<Observer> observers = new ArrayList<>();
    private LocalDate dataCheckInReal;
    
    public Reserva(int id, LocalDate in, LocalDate out, BigDecimal diaria, int qtdHospedes){
        this.id = id;
        this.dataCheckInPrevista = in;
        this.dataCheckOutPrevista = out;
        this.valorDiaria = diaria;
        this.qtdHospedes = qtdHospedes;
        this.status = StateReserva.CRIADA;
    }
    
    public void cancelar(){
        this.status = StateReserva.CANCELADA; 
    }
    
    public BigDecimal calcularTotal(){
        long dias = java.time.temporal.ChronoUnit.DAYS.between(
                dataCheckInPrevista, 
                dataCheckOutPrevista);
        if (dias <= 0){
            dias = 1;
        }
        return valorDiaria.multiply(BigDecimal.valueOf(dias));
    }

    public void registrarObserver(Observer o) {}
    public void removerObserver(Observer o) {}
    public void notificarObservers() {}

    
    public int getId() {
    return id;
}

    public void setId(int id) {
    this.id = id;
}

    public LocalDate getDataCheckInPrevista() {
    return dataCheckInPrevista;
}

    public void setDataCheckInPrevista(LocalDate dataCheckInPrevista) {
    this.dataCheckInPrevista = dataCheckInPrevista;
}

    public LocalDate getDataCheckOutPrevista() {
    return dataCheckOutPrevista;
}

    public void setDataCheckOutPrevista(LocalDate dataCheckOutPrevista) {
    this.dataCheckOutPrevista = dataCheckOutPrevista;
}

    public LocalDate getDataCheckInReal() {
    return dataCheckInReal;
}

    public void setDataCheckInReal(LocalDate dataCheckInReal) {
    this.dataCheckInReal = dataCheckInReal;
}

    public LocalDate getDataCheckOutReal() {
    return dataCheckOutReal;
}

    public void setDataCheckOutReal(LocalDate dataCheckOutReal) {
    this.dataCheckOutReal = dataCheckOutReal;
}

    public StateReserva getStatus() {
    return status;
}

    public void setStatus(StateReserva status) {
    this.status = status;
}

    public BigDecimal getValorDiaria() {
    return valorDiaria;
}

    public void setValorDiaria(BigDecimal valorDiaria) {
    this.valorDiaria = valorDiaria;
}

    public int getQtdHospedes() {
    return qtdHospedes;
}

    public void setQtdHospedes(int qtdHospedes) {
    this.qtdHospedes = qtdHospedes;
}

    public void confirmarReserva() {
    this.status = StateReserva.CONFIRMADA;
    }

    public void checkinReserva() {
    this.status = StateReserva.CHECKIN;
    }

    public void checkoutReserva() {
    this.status = StateReserva.CHECKOUT;
    }
    
    public void alterarDatas(LocalDate novaEntrada, LocalDate novaSaida) {
    this.dataCheckInPrevista = novaEntrada;
    this.dataCheckOutPrevista = novaSaida;
    }

}
