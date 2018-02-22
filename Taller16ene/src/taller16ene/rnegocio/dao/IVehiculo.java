package taller16ene.rnegocio.dao;

import java.util.*;


import taller16ene.rnegocio.entidades.Vehiculo;

public interface IVehiculo {
    public int insertar (Vehiculo vehiculo) throws Exception;
    public int modificar (Vehiculo vehiculo) throws Exception; 
    public int eliminar (Vehiculo vehiculo) throws Exception;
    public Vehiculo obtener (int Id_Vehiculo) throws Exception;
    public ArrayList<Vehiculo> obtener() throws Exception;
}