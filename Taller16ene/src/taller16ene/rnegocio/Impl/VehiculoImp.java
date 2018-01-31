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
        String sqlC = "INSERT INTO Etiqueta (id, nombre, creado, actualizado) VALUES (?,?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, vehiculo.getId()));
        lisParametros.add(new Parametro(2, vehiculo.getNombre()));
       if (vehiculo.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(3, new java.sql.Date(((java.util.Date) vehiculo.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(3, vehiculo.getCreado()));
        }
        if (vehiculo.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) vehiculo.getActualizado()).getTime())));
        } else {
            lisParametros.add(new Parametro(4, vehiculo.getActualizado()));
        }
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
        String sqlC = "UPDATE Etiqueta SET id=?, nombre=?, creado=? actualizado=? WHERE id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, vehiculo.getId()));
        lisParametros.add(new Parametro(2, vehiculo.getNombre()));
        if (vehiculo.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(3, new java.sql.Date(((java.util.Date) vehiculo.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(3, vehiculo.getCreado()));
        }
        if (vehiculo.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) vehiculo.getActualizado()).getTime())));
        } else {
            lisParametros.add(new Parametro(4, vehiculo.getActualizado()));
        }
        lisParametros.add(new Parametro(5, vehiculo.getId()));
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
        String sqlC = "DELETE FROM Etiqueta WHERE id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, vehiculo.getId()));
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
    public Vehiculo obtener(long id) throws Exception {
        Vehiculo elvehiculo = null;
        String sqlC = "SELECT id, nombre, creado, actualizado FROM Etiqueta Where id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, id));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, lisParametros);
            while (rst.next()) {
                elvehiculo = new Vehiculo();
                elvehiculo.setId(rst.getInt(1));
                elvehiculo.setNombre(rst.getString(2));
                elvehiculo.setCreado(rst.getDate(3));
                elvehiculo.setActualizado(rst.getDate(4));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return elvehiculo;
    }

    @Override
    public ArrayList<Vehiculo> obtener() throws Exception {
        ArrayList<Vehiculo> listEtiqueta = new ArrayList<>();
        Vehiculo nVehiculo = null;
        String sqlC = "Select id, nombre, creado, actualizado from Etiqueta";
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, null);
            while (rst.next()) {
                nVehiculo= new Vehiculo();
                nVehiculo.setId(rst.getInt(1));
                nVehiculo.setNombre(rst.getString(2));
                nVehiculo.setCreado(rst.getDate(3));
                nVehiculo.setActualizado(rst.getDate(4));
                listEtiqueta.add(nVehiculo);
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
    
    
    
    

 
    


