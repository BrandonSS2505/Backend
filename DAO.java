
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class DAO {
    
    public static Conexion c = new Conexion();

    public static List<Equipos> dameEquipos(){
        Statement stm = null;
        ResultSet rs = null;
        List<Equipos> resultado = new ArrayList<>();
        Connection cc = null;

        // falto conectarme
        cc = c.getConnection();
        try {
            String sql = "select * from equipos";
            stm = (Statement) cc.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Equipos e = new Equipos(rs.getInt("idEquipos"),
                 rs.getString("Nombre"), rs.getInt("V"), rs.getInt("P"), rs.getString("Porcentaje"), rs.getFloat("PD"), rs.getString("Inicio"), rs.getString("Visitante"), rs.getString("Div"), rs.getFloat("PPg"), rs.getFloat("OOP"));
                 resultado.add(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // vamos a liberar en este bloque todos los recursos empleando
            // se hace en orden inverso a su creación
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                    sqlEx.printStackTrace();
                }
                rs = null;
            }

            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException sqlEx) {
                    sqlEx.printStackTrace();
                }
                stm = null;
            }
            try {
                cc.close();
                System.out.println("Closed  connection!");
            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            }
        }
        
        return resultado;
    }

    public static List<Jugadores> dameJugadores(){
        Statement stm = null;
        ResultSet rs = null;
        List<Jugadores> resultado = new ArrayList<>();
        Connection cc = null;

        // falto conectarme
        cc = c.getConnection();
        try {
            String sql = "select * from jugadores";
            stm = (Statement) cc.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Jugadores j = new Jugadores(rs.getInt("idjugadores"),
                 rs.getString("Nombre"), rs.getInt("J"), rs.getInt("GS"), rs.getFloat("Min"), rs.getFloat("PTS"), rs.getFloat("OR"), rs.getFloat("DR"));
                 resultado.add(j);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // vamos a liberar en este bloque todos los recursos empleando
            // se hace en orden inverso a su creación
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                    sqlEx.printStackTrace();
                }
                rs = null;
            }

            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException sqlEx) {
                    sqlEx.printStackTrace();
                }
                stm = null;
            }
            try {
                cc.close();
                System.out.println("Closed  connection!");
            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            }
        }
        
        return resultado;
    }

}
