package taller16ene.rnegocio.dao;

import java.util.*;
import taller16ene.rnegocio.entidades.Cooperativa;


public interface ICooperativa {
    public int insertar (Cooperativa cooperativa) throws Exception;
    public int modificar (Cooperativa cooperativa) throws Exception; 
    public int eliminar (Cooperativa cooperativa) throws Exception;
    public Cooperativa obtener (int Id_Coop) throws Exception;
    public ArrayList<Cooperativa> obtener() throws Exception;
}