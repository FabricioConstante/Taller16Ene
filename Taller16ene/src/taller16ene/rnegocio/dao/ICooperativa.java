package taller16ene.rnegocio.dao;

import java.util.*;
import taller16ene.rnegocio.Impl.CooperativaImp;

public interface ICooperativa {
    public int insertar (CooperativaImp cooperativa) throws Exception;
    public int modificar (CooperativaImp cooperativa) throws Exception; 
    public int eliminar (CooperativaImp cooperativa) throws Exception;
    public CooperativaImp obtener (int Id_Coop) throws Exception;
    public ArrayList<CooperativaImp> obtener() throws Exception;
}