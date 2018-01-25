package taller16ene.rnegocio.dao;
import taller16ene.rnegocio.entidades.*;
import java.util.List;

public interface ICiudad {
     public int insertar(Ciudad ciudad) throws Exception;
     public List<Ciudad> obtener() throws Exception;
     public Ciudad obtener(int codigo) throws Exception;   
}
 