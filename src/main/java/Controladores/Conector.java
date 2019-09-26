/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import Clases.Excepcion1;
import Clases.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author yelbetto
 */
public class Conector {
    private final String user = "root";
    private final String password = "Cristeptesico_65";
    private final String urlConnection = "jdbc:mysql://localhost:3306/Revista";

    public Conector() {
        
    }
    
    public boolean ingreso(Usuario usuario) throws Excepcion1{
        int aceptar = 5;
        Connection db = null;
        try {
            
            db = DriverManager.getConnection(urlConnection,user,password);
            PreparedStatement ps = db.prepareStatement("SELECT COUNT(*) as total FROM Prueba WHERE nombre= ?");
            ps.setString(1, usuario.getUser());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                aceptar = rs.getInt("total");
            }
        } catch (SQLException ex) {
           throw new Excepcion1("problema "+ex.getMessage());
        }
        return aceptar==0;
    }
}
