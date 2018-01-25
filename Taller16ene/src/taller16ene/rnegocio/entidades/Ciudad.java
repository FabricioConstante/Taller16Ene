package taller16ene.rnegocio.entidades;
import java.util.Date;
public class Ciudad {
    private int idciudad;
    private String nombre;
    private String provincia;
 
    public Ciudad() {
    }
 
    public Ciudad(int idciudad, String nombre, String provincia) {
        this.idciudad = idciudad;
        this.nombre = nombre;
        this.provincia = provincia;
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    
}
