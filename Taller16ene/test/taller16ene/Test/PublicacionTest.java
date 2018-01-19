package taller16ene.Test;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import taller16ene.rnegocio.dao.*;
import taller16ene.rnegocio.entidades.*;
import taller16ene.rnegocio.Impl.*;

public class PublicacionTest {
    public PublicacionTest() {
    }
    @Test
    public void pruebageneral() throws Exception{
////////////////////////////////////////////////////////////////////////////////
        int filasAfectadas =0;
        IPublicacion publicacionDao = new PublicacionImpl();
        IEditorial editorialDao = new EditorialImpl();
        Editorial editorial = editorialDao.obtener(1);
        Publicacion publicacion = new Publicacion(1,editorial,"Quito","limitada",new Date(),new Date());
        
        try{
            filasAfectadas = publicacionDao.insertar(publicacion);
            System.out.println("Ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);

////////////////////////////////////////////////////////////////////////////////        
        List<Publicacion> lista = new ArrayList<>();
        try {
            lista = publicacionDao.obtener();
            for (Publicacion c:lista){
                System.out.println("---Datos publicacion---");
                System.out.println("Id :"+c.getIdpublicacion());
                System.out.println("Editorial :"+c.getEditorial().getIdeditorial());
                System.out.println("Ciudad :"+c.getCiudad());
                System.out.println("Edicion :"+c.getEdicion());
                System.out.println("Fecha creado :"+c.getF_creacion());
                System.out.println("Fecha actualizado :"+c.getF_actualizacion());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

}



