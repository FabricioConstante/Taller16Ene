package taller16ene.rnegocio.dao;

import java.util.*;
import taller16ene.rnegocio.Impl.Cooperativa;

public interface ICooperativa {
    public int insertar (Cooperativa cooperativa) throws Exception;
    public int modificar (Cooperativa cooperativa) throws Exception; 
    public int eliminar (Cooperativa cooperativa) throws Exception;
    public Cooperativa obtener (long id) throws Exception;
    public ArrayList<Cooperativa> obtener() throws Exception;
}