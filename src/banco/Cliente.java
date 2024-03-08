/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author ismae
 */
public class Cliente extends Persona {

    Double saldo;
    Double id;
    Double tarjeta;
    Double fechaca;
    Double codigosegu;
    
    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getId() {
        return this.id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Double getTarjeta() {
        return this.tarjeta;
    }

    public void setTarjeta(Double tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Double getFechaca() {
        return this.fechaca;
    }

    public void setFechaca(Double fechaca) {
        this.fechaca = fechaca;
    }

    public Double getCodigosegu() {
        return this.codigosegu;
    }

    public void setCodigosegu(Double codigosegu) {
        this.codigosegu = codigosegu;
    }
      public Double retiro(double saldo, double retiro){
        return(saldo - retiro);
      
      }
      public Double inver(double saldo, double inver,double resul){
        resul = saldo + inver;
        return(resul);
      }
      
}
