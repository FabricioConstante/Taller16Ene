package taller16ene.rnegocio.entidades;
import java.util.Date;
public class Publicacion {
    private int idpublicacion;
    private Editorial editorial;
    private String ciudad;
    private String edicion;
    private Date f_creacion;
    private Date f_actualizacion;

    public Publicacion() {
    }

    public Publicacion(int idpublicacion, Editorial editorial, String ciudad, String edicion , Date f_creacion, Date f_actualizacion) {
        this.idpublicacion = idpublicacion;
        this.editorial = editorial;
        this.ciudad = ciudad;
        this.edicion = edicion;
        this.f_creacion = f_creacion;
        this.f_actualizacion = f_actualizacion;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public int getIdpublicacion() {
        return idpublicacion;
    }

    public void setIdpublicacion(int idpublicacion) {
        this.idpublicacion = idpublicacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public Date getF_creacion() {
        return f_creacion;
    }

    public void setF_creacion(Date f_creacion) {
        this.f_creacion = f_creacion;
    }

    public Date getF_actualizacion() {
        return f_actualizacion;
    }

    public void setF_actualizacion(Date f_actualizacion) {
        this.f_actualizacion = f_actualizacion;
    }



    
}
