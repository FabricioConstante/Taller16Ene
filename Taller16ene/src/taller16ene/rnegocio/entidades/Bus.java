package taller16ene.rnegocio.entidades;
import java.util.Date;
public class Bus {
    private int idbus;
    private Ciudad idciudad;    
    private Cooperativa idcoop;
    private String horario;

    public Bus() { 
    }

    public Bus(int idbus, Ciudad idciudad, Cooperativa idcoop, String horario) {
        this.idbus = idbus;
        this.idciudad = idciudad;
        this.idcoop = idcoop;
        this.horario = horario;
    }

    public int getIdbus() {
        return idbus;
    }

    public void setIdbus(int idbus) {
        this.idbus = idbus;
    }

    public Ciudad getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(Ciudad idciudad) {
        this.idciudad = idciudad;
    }
    
    public Cooperativa getIdcoop() {
        return idcoop;
    }

    public void setIdcoop(Cooperativa idcoop) {
        this.idcoop = idcoop;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
 
}
