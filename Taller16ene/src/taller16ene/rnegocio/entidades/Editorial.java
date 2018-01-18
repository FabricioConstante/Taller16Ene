package taller16ene.rnegocio.entidades;
import java.util.Date;
public class Editorial {
    private int ideditorial;
    private String nombre;
    private String ciudad;
    private String telefono;
    private String direccion;

    public Editorial() {
    }
 
    public Editorial(int ideditorial, String nombre, String ciudad, String telefono, String direccion) {
        this.ideditorial = ideditorial;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIdeditorial() {
        return ideditorial;
    }

    public void setIdeditorial(int ideditorial) {
        this.ideditorial = ideditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
