/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller16ene.rnegocio.Impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import taller16ene.accesodatos.Conexion;
import taller16ene.accesodatos.Parametro;
import taller16ene.rnegocio.dao.IVehiculo;
import taller16ene.rnegocio.entidades.Vehiculo;

/**
 *
 * @author Usuario
 */
public abstract class VehiculoImp implements IVehiculo{
    
     @Override
    public int insertar(Vehiculo vehiculo) throws Exception {
        int numFilas = 0;
        String sqlC = "INSERT INTO Vehiculo (Id_Vehiculo, Marca, TipoV)"
                + " VALUES (?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, vehiculo.getId_vehiculo()));
        lisParametros.add(new Parametro(2, vehiculo.getMarca()));
        lisParametros.add(new Parametro(3, vehiculo.getTipoV()));
       
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public int modificar(Vehiculo vehiculo) throws Exception {
        int numFilas = 0;
        String sqlC = "UPDATE Etiqueta SET idVehiculo=?, Marca=?, TipoV=?  WHERE IdVehiculo=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, vehiculo.getId_vehiculo()));
        lisParametros.add(new Parametro(2, vehiculo.getMarca()));
        lisParametros.add(new Parametro(3, vehiculo.getTipoV()));
       
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public int eliminar(Vehiculo vehiculo) throws Exception {
        int numFilas = 0;
        String sqlC = "DELETE FROM Vehiculo WHERE IdVehiculo=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, vehiculo.getId_vehiculo()));
        lisParametros.add(new Parametro(2, vehiculo.getMarca()));
        lisParametros.add(new Parametro(3, vehiculo.getTipoV()));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public Vehiculo obtener(int IdVehiculo) throws Exception {
        Vehiculo vehiculo = null;
        String sqlC = "SELECT IdVehiculo, Marca, TipoV  FROM Etiqueta Where IdVehiculo=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, IdVehiculo));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, lisParametros);
            while (rst.next()) {
                vehiculo = new Vehiculo();
                vehiculo.setId_vehiculo(rst.getInt(1));
                vehiculo.setMarca(rst.getString(2));
               vehiculo.setTipoV(rst.getString(3));
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return vehiculo;
    }

    @Override
    public ArrayList<Vehiculo> obtener() throws Exception {
        ArrayList<Vehiculo> listEtiqueta = new ArrayList<>();
        Vehiculo nVehiculo = null;
        String sqlC = "Select IdVehiculo, Marca, TipoV  FROM Vehiculo=";
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, null);
            while (rst.next()) {
                nVehiculo= new Vehiculo();
                nVehiculo.setId_vehiculo(rst.getInt(1));
                nVehiculo.setMarca(rst.getString(2));
               nVehiculo.setTipoV(rst.getString(3));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return listEtiqueta;
    }
}
    
    
    
    

 
    


