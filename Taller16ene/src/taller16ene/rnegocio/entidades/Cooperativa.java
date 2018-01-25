
package taller16ene.rnegocio.entidades;

import java.util.Date;
import java.util.*;

public class Cooperativa {
    
    private long Id_Coop;
    private long Id_Vehiculo;
    private String Nombre;
    private Date Ciudad;

    public Cooperativa() {
    }

    public Cooperativa(long Id_Coop, long Id_Vehiculo, String Nombre, Date Ciudad) {
        this.Id_Coop = Id_Coop;
        this.Id_Vehiculo = Id_Vehiculo;
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
    }

    public long getId_Coop() {
        return Id_Coop;
    }

    public void setId_Coop(long Id_Coop) {
        this.Id_Coop = Id_Coop;
    }

    public long getId_Vehiculo() {
        return Id_Vehiculo;
    }

    public void setId_Vehiculo(long Id_Vehiculo) {
        this.Id_Vehiculo = Id_Vehiculo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getCiudad() {
        return Ciudad;
    }

    public void setCiudad(Date Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    
    
}