package taller16ene.rnegocio.dao;

import java.util.*;

import taller16ene.rnegocio.Impl.VehiculoImp;

public interface IVehiculo {
    public int insertar (VehiculoImp vehiculo) throws Exception;
    public int modificar (VehiculoImp vehiculo) throws Exception; 
    public int eliminar (VehiculoImp vehiculo) throws Exception;
    public VehiculoImp obtener (int Id_Vehiculo) throws Exception;
    public ArrayList<VehiculoImp> obtener() throws Exception;
}