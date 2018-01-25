package taller16ene.rnegocio.dao;

import java.util.*;
import taller16ene.rnegocio.Impl.Cooperativa;
import taller16ene.rnegocio.Impl.Vehiculo;

public interface IVehiculo {
    public int insertar (Vehiculo vehiculo) throws Exception;
    public int modificar (Vehiculo vehiculo) throws Exception; 
    public int eliminar (Vehiculo vehiculo) throws Exception;
    public Cooperativa obtener (long id) throws Exception;
    public ArrayList<Vehiculo> obtener() throws Exception;
}