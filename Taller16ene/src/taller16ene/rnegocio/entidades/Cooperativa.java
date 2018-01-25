
package taller16ene.rnegocio.entidades;

import java.util.Date;
import java.util.*;

public class Cooperativa {
    
    private long id_cooperativa;
    private long id_vehiculo;
    private String nombre;
    private Date ciudad;

    public Cooperativa() {
    }

    public Cooperativa(long id_cooperativa, long id_vehiculo, String nombre, Date ciudad) {
        this.id_cooperativa = id_cooperativa;
        this.id_vehiculo = id_vehiculo;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public long getId_cooperativa() {
        return id_cooperativa;
    }

    public void setId_cooperativa(long id_cooperativa) {
        this.id_cooperativa = id_cooperativa;
    }

    public long getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(long id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCiudad() {
        return ciudad;
    }

    public void setCiudad(Date ciudad) {
        this.ciudad = ciudad;
    }

      
   
}








