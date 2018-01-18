package taller16ene.rnegocio.Impl;

import taller16ene.rnegocio.dao.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import taller16ene.accesodatos.*;
import taller16ene.rnegocio.entidades.Editorial;
import java.util.Date;

public class EditorialImpl implements IEditorial{
    
      @Override
    public int insertar(Editorial editorial) throws Exception{
        int numFilasAfectadas=0;
        String sql="insert into editorial values(?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, editorial.getIdeditorial()));
        lstPar.add(new Parametro(2, editorial.getNombre()));
        lstPar.add(new Parametro(3, editorial.getCiudad()));
        lstPar.add(new Parametro(4, editorial.getTelefono()));
        lstPar.add(new Parametro(5, editorial.getDireccion()));
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            numFilasAfectadas=con.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return numFilasAfectadas;
    }
    @Override
    public List<Editorial> obtener() throws Exception{
        List<Editorial> lista = new ArrayList<>();
        
        String sql="SELECT * FROM editorial;";
        Conexion con = null;
        try{
            Editorial editorial = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                editorial = new Editorial();
                editorial.setIdeditorial(rst.getInt(1));
                editorial.setNombre(rst.getString(2));
                editorial.setCiudad(rst.getString(3));
                editorial.setTelefono(rst.getString(4));
                editorial.setDireccion(rst.getString(5));

                lista.add(editorial);
           }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return lista;
    }  
    @Override 
    public Editorial obtener(int codigo) throws Exception{
        Editorial editorial = null;
        String sql="SELECT * FROM editorial where ideditorial=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()){
                editorial = new Editorial();
                editorial.setIdeditorial(rst.getInt(1));
                editorial.setNombre(rst.getString(2));
                editorial.setCiudad(rst.getString(3));
                editorial.setTelefono(rst.getString(4));
                editorial.setDireccion(rst.getString(5));
            }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return editorial;
    }  
}
