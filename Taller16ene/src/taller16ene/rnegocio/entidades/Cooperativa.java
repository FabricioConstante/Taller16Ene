
package taller16ene.rnegocio.entidades;

import java.util.Date;
import java.util.*;

public class Cooperativa {
    
    private int Id_Coop;
    private int Id_Vehiculo;
    private String Nombre;
    private String Ciudad;

    public Cooperativa() {
    }

    public Cooperativa(int Id_Coop, int Id_Vehiculo, String Nombre, String Ciudad) {
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

    public int getId_Vehiculo() {
        return Id_Vehiculo;
    }

    public void setId_Vehiculo(int Id_Vehiculo) {
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

    public Object getCreado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getActualizado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCreado(java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setActualizado(java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}