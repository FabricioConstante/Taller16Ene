package taller16ene.rnegocio.dao;
import taller16ene.rnegocio.entidades.*;
import java.util.List;

public interface IPublicacion {
     public int insertar(Publicacion publicacion) throws Exception;
     public List<Publicacion> obtener() throws Exception;
     public Publicacion obtener(int codigo) throws Exception;   
}
 