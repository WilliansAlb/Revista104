
package Servlets;

import Clases.Excepcion1;
import Clases.Usuario;
import Controladores.Conector;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yelbetto
 */
@WebServlet("/InicioSesion")
public class InicioSesion extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuarios= new Usuario(request);
        Conector cdb = new Conector();

        try {
            if (!cdb.ingreso(usuarios)) {
                HttpSession s = request.getSession();
                s.setAttribute("usuario", usuarios.getUser());
                response.sendRedirect("views/crear_usuario.jsp");
            }
        } catch (Excepcion1 ex) {
            Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
