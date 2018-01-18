package taller16ene.rnegocio.Impl;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import taller16ene.accesodatos.Conexion;
import taller16ene.accesodatos.Parametro;
import taller16ene.rnegocio.entidades.*;
import taller16ene.rnegocio.dao.*;

public class PublicacionImpl implements IPublicacion{
      @Override
    public int insertar(Publicacion publicacion) throws Exception{
        int numFilasAfectadas=0;
          String sql = "insert into publicacion values(?,?,?,?,?,?)";
          List<Parametro> lstPar = new ArrayList<>();
          lstPar.add(new Parametro(1, publicacion.getIdpublicacion()));
          lstPar.add(new Parametro(2, publicacion.getEditorial().getIdeditorial()));
          lstPar.add(new Parametro(3, publicacion.getCiudad()));
          lstPar.add(new Parametro(4, publicacion.getEdicion()));
          lstPar.add(new Parametro(5, publicacion.getF_creacion()));
          lstPar.add(new Parametro(6, publicacion.getF_actualizacion()));
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
    public List<Publicacion> obtener() throws Exception{
        List<Publicacion> lista = new ArrayList<>();
        
        String sql="SELECT * FROM publicacion;";
        Conexion con = null;
        try{
            Publicacion publicacion = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                publicacion = new Publicacion();
                publicacion.setIdpublicacion(rst.getInt(1));
                 IEditorial editorialdao = new EditorialImpl();
                Editorial editorial = editorialdao.obtener(rst.getInt(2));
                publicacion.setEditorial(editorial);
                publicacion.setCiudad(rst.getString(3));
                publicacion.setEdicion(rst.getString(4));
                publicacion.setF_creacion(rst.getDate(5));
                publicacion.setF_actualizacion(rst.getDate(6));
                lista.add(publicacion);
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
    public Publicacion obtener(int codigo) throws Exception{
        Publicacion publicacion = null;
        String sql="SELECT * FROM publicacion where idpublicacion=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()){
                publicacion = new Publicacion();
                publicacion.setIdpublicacion(rst.getInt(1));
                 IEditorial editorialdao = new EditorialImpl();
                Editorial editorial = editorialdao.obtener(rst.getInt(2));
                publicacion.setEditorial(editorial);
                publicacion.setCiudad(rst.getString(3));
                publicacion.setEdicion(rst.getString(4));
                publicacion.setF_creacion(rst.getDate(5));
                publicacion.setF_actualizacion(rst.getDate(6));
            }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return publicacion;
}
    }
