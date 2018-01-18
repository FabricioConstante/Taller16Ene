package taller16ene.rnegocio.dao;
import taller16ene.rnegocio.entidades.*;
import java.util.List;

public interface IEditorial {
     public int insertar(Editorial editorial) throws Exception;
     public List<Editorial> obtener() throws Exception;
     public Editorial obtener(int codigo) throws Exception;   
}
 