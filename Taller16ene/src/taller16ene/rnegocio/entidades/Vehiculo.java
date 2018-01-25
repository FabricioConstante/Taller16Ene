/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller16ene.rnegocio.entidades;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    
    
    private int Id_vehiculo;
    private String TipoV;
    private String Cap_pasajeros;
    private String Marca;

    public Vehiculo() {
    }

    public Vehiculo(int Id_vehiculo, String TipoV, String Cap_pasajeros, String Marca) {
        this.Id_vehiculo = Id_vehiculo;
        this.TipoV = TipoV;
        this.Cap_pasajeros = Cap_pasajeros;
        this.Marca = Marca;
    }

    public int getId_vehiculo() {
        return Id_vehiculo;
    }

    public void setId_vehiculo(int Id_vehiculo) {
        this.Id_vehiculo = Id_vehiculo;
    }

    public String getTipoV() {
        return TipoV;
    }

    public void setTipoV(String TipoV) {
        this.TipoV = TipoV;
    }

    public String getCap_pasajeros() {
        return Cap_pasajeros;
    }

    public void setCap_pasajeros(String Cap_pasajeros) {
        this.Cap_pasajeros = Cap_pasajeros;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    
    
}
