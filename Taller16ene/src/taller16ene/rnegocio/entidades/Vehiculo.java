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
    
    
    private long id_vehiculo;
    private String TipoV;
    private String Cap_pasajeros;
    private String Marca;

    public Vehiculo() {
    }

    public Vehiculo(long id_vehiculo, String TipoV, String Cap_pasajeros, String Marca) {
        this.id_vehiculo = id_vehiculo;
        this.TipoV = TipoV;
        this.Cap_pasajeros = Cap_pasajeros;
        this.Marca = Marca;
    }

    public long getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(long id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
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
