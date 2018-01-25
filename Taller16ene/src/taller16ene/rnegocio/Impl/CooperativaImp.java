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
import taller16ene.rnegocio.dao.ICooperativa;
import taller16ene.rnegocio.entidades.Cooperativa;

/**
 *
 * @author Usuario
 */
public  class CooperativaImp  implements ICooperativa{
    
        @Override
    public int insertar(Cooperativa cooperativa) throws Exception {
        int numFilas = 0;
        String sqlC = "INSERT INTO Etiqueta (id, nombre, creado, actualizado) VALUES (?,?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, cooperativa.getId_Coop()));
        lisParametros.add(new Parametro(2, cooperativa.getId_Vehiculo()));
        lisParametros.add(new Parametro(3, cooperativa.getNombre()));
        lisParametros.add(new Parametro(4, cooperativa.getCiudad()));
        if (cooperativa.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(3, new java.sql.Date(((java.util.Date) cooperativa.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(3, cooperativa.getCreado()));
        }
        if (cooperativa.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) cooperativa.getActualizado()).getTime())));
        } else {
            lisParametros.add(new Parametro(4, cooperativa.getActualizado()));
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
    public int modificar(Cooperativa cooperativa) throws Exception {
        int numFilas = 0;
        String sqlC = "UPDATE Etiqueta SET id=?, nombre=?, creado=? actualizado=? WHERE id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, cooperativa.getId_Coop()));
        lisParametros.add(new Parametro(2, cooperativa.getId_Vehiculo()));
        lisParametros.add(new Parametro(3, cooperativa.getNombre()));
        lisParametros.add(new Parametro(4, cooperativa.getCiudad()));
        if (cooperativa.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(3, new java.sql.Date(((java.util.Date) cooperativa.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(3, cooperativa.getCreado()));
        }
        if (cooperativa.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) cooperativa.getActualizado()).getTime())));
        } else {
            lisParametros.add(new Parametro(4, cooperativa.getActualizado()));
        }
        lisParametros.add(new Parametro(5, cooperativa.getId_Coop()));
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
    public int eliminar(Cooperativa cooperativa) throws Exception {
        int numFilas = 0;
        String sqlC = "DELETE FROM Etiqueta WHERE id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, cooperativa.getId_Coop()));
        lisParametros.add(new Parametro(1, cooperativa.getId_Vehiculo()));
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
    public Cooperativa  obtener(int Id_Coop) throws Exception {
        Cooperativa  coop = null;
        String sqlC = "SELECT id, nombre, creado, actualizado FROM Etiqueta Where id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, Id_Coop));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, lisParametros);
            while (rst.next()) {
                coop = new Cooperativa ();
                coop.setId_Coop(rst.getInt(1));
                coop.setNombre(rst.getString(2));
                coop.setCreado(rst.getDate(3));
                coop.setActualizado(rst.getDate(4));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return coop;
    }

    @Override
    public ArrayList<Cooperativa> obtener() throws Exception {
        
        ArrayList<Cooperativa> listEtiqueta = new ArrayList<>();
        Cooperativa coop = null;
        String sqlC = "Select id, nombre, creado, actualizado from Etiqueta";
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, null);
            while (rst.next()) {
                coop= new Cooperativa();
                coop.setId_Coop(rst.getInt(1));
                coop.setNombre(rst.getString(2));
                coop.setCreado(rst.getDate(3));
                coop.setActualizado(rst.getDate(4));
                
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

    @Override
    public int insertar(CooperativaImp cooperativa) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificar(CooperativaImp cooperativa) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(CooperativaImp cooperativa) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
}
