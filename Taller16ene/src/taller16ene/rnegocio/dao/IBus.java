package taller16ene.rnegocio.dao;
import taller16ene.rnegocio.entidades.*;
import java.util.List;

public interface IBus {
     public int insertar(Bus bus) throws Exception;
     public List<Bus> obtener() throws Exception;
     public Bus obtener(int codigo) throws Exception;   
}
 