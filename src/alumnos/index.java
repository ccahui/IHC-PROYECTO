package alumnos;

import java.io.IOException;
import java.util.List;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class index extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		//UserService us = UserServiceFactory.getUserService();
		//User user = us.getCurrentUser();

		HttpSession sesion = req.getSession();
		
	/*	if(user == null){
			resp.sendRedirect(us.createLoginURL(req.getRequestURI()));}
		else if(us.isUserAdmin() || user.getEmail().equals("richarteq@gmail.com") ||sesion.getAttribute("usuario") != null ){
	
			try {
				req.getRequestDispatcher("/WEB-INF/Vistas/Alumnos/index.html").forward(req, resp);
			} catch (ServletException e) {
				e.printStackTrace();
			}
		
		}*/
		if(sesion.getAttribute("usuario") != null){
			try {
				req.getRequestDispatcher("/WEB-INF/Vistas/Alumnos/index.html").forward(req, resp);
			} catch (ServletException e) {
				e.printStackTrace();
			}
		}
		else {
			
			try {
				req.getRequestDispatcher("/WEB-INF/Vistas/AccesoDenegado.jsp").forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
