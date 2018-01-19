package taller16ene.Test;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import taller16ene.rnegocio.dao.*;
import taller16ene.rnegocio.entidades.*;
import taller16ene.rnegocio.Impl.*;

public class EditorialTest {
    public EditorialTest() {
    }
    @Test
    public void pruebageneral(){
//////////////////////////////////////////////////////////////////////////////////////////
        int filasAfectadas =0;
        IEditorial editorialDao = new EditorialImpl();
        Editorial editorial = new Editorial(1,"Norma","Quito","0987654321","El Inca");
        try{
            filasAfectadas = editorialDao.insertar(editorial);
            System.out.println("Editorial ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
////////////////////////////////////////////////////////////////////////////////////////////
        List<Editorial> lista = new ArrayList<>();
        try {
            lista = editorialDao.obtener();
            for (Editorial c:lista){
                System.out.println("---Datos editoriales---");
                System.out.println("Id :"+c.getIdeditorial());
                System.out.println("Nombre :"+c.getNombre());
                System.out.println("Ciudad :"+c.getCiudad());
                System.out.println("Telefono :"+c.getTelefono());
                System.out.println("Direccion :"+c.getDireccion());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

}