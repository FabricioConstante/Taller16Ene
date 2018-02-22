
package taller16ene.rnegocio.entidades;


import java.util.Date;
import java.util.*;

public class Cooperativa {
    
    private int Id_Coop;
    private Vehiculo Id_Vehiculo;
    private String Nombre;
    private String Ciudad;

    public Cooperativa() {
    }

    public Cooperativa(int Id_Coop, Vehiculo Id_Vehiculo, String Nombre, String Ciudad) {
        this.Id_Coop = Id_Coop;
        this.Id_Vehiculo = Id_Vehiculo;
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
    }

    public int getId_Coop() {
        return Id_Coop;
    }

    public void setId_Coop(int Id_Coop) {
        this.Id_Coop = Id_Coop;
    }

    public Vehiculo getId_Vehiculo() {
        return Id_Vehiculo;
    }

    public void setId_Vehiculo(Vehiculo Id_Vehiculo) {
        this.Id_Vehiculo = Id_Vehiculo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    
    

}