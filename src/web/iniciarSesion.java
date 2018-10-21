package web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;



@SuppressWarnings("serial")
public class iniciarSesion extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");


			try {
				req.getRequestDispatcher("/WEB-INF/Vistas/iniciar-sesion.html").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");

		String usuario = req.getParameter("username");
		String password = req.getParameter("password");
        

		//Cree la Session, tengo una variable de Session
		if(usuario.equals(password)){
			HttpSession session = req.getSession();
			session.setAttribute("usuario", usuario);
		}
		resp.sendRedirect("/colegio/alumnos");
		

	}
}
