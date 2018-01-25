package taller16ene.accesodatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conexion {

       Scanner entrada = new Scanner(System.in);
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://172.30.3.59:1433;databaseName=Taller16";
    String usuario = "Joss";
    String conraseña = "111";
    Connection con = null;

    public void conectar() {
            try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, conraseña);
            System.out.println("Conexion Establecida!!!");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar Driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error en conexion: " + e.getMessage());
        }
    }

    public ResultSet ejecutaQuery(String sql, List<Parametro> lst) {
        ResultSet rst = null;
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            if (lst != null) {
                for (Parametro p : lst) {
                    if (p.getValor() instanceof java.util.Date) {
                        pstm.setObject(p.getPosicion(),
                        new java.sql.Date(((java.util.Date) p.getValor())
                                .getTime()));
                    } else {
                        pstm.setObject(p.getPosicion(), p.getValor());
                    }

                }
            }
            rst = pstm.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en ejecución: "
                    + e.getMessage());
        }
        return rst;
    }

    public int ejecutaComando(String sql, List<Parametro> lst) {
        int numFilasAfectadas = 0;
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            if (lst != null) {
               for (Parametro p : lst) {
                  if (p.getValor() instanceof java.util.Date) {
                    pstm.setObject(p.getPosicion(),
                    new java.sql.Date(((java.util.Date) p.getValor())
                           .getTime()));
                   } else {
                       pstm.setObject(p.getPosicion(), p.getValor());
                   }
               }
            }
            numFilasAfectadas = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en ejecución: "
                    + e.getMessage());
        }
        return numFilasAfectadas;
    }

    public void desconectar() {
        try {
            if (con != null) {
                if (!con.isClosed()) {
                    con.close();
                }
            }
        } catch (Exception e) {
            System.out.println("Error desconocido al desconectar:"
                    + e.getMessage());
        }
    }

    public int ejecutarComando(String sqlC, ArrayList<Parametro> lisParametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet ejecutarQuery(String sqlC, ArrayList<Parametro> lisParametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}