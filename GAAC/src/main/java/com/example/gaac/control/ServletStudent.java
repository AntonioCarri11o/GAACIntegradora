package com.example.gaac.control;

import com.example.gaac.model.BeanStudent;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(
        name = "ServletStudent",
        urlPatterns = {
                "/login",//get
                "/DocenteRegistro",//get
                "/EstudiantesRegistro",//get
                "/CRegistro",//get
                "/save-student"//post
        }

)
public class ServletStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String option = request.getServletPath();
        switch (option){
            case "/login":
                request.getRequestDispatcher("WEB-INF/view/login.jsp").forward(request,response);
                break;
            case "/DocenteRegistro":
                request.getRequestDispatcher("WEB-INF/view/DocenteRegistro.jsp").forward(request,response);
                break;
            case "/EstudiantesRegistro":
                request.getRequestDispatcher("WEB-INF/view/EstudiantesRegistro.jsp").forward(request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String option=request.getServletPath();
        switch (option){
            case "/save-student":
                try{
                    //String name=request.getParameter("name")!=null? request.getParameter("name"):"";
                    String correo= request.getParameter("email")!=null? request.getParameter("email"):"";
                    String name= request.getParameter("name")!=null? request.getParameter("name"):"";
                    String sexotochar= request.getParameter("sexo")!=null? request.getParameter("sexo"):"";
                    char sexo=sexotochar.charAt(0);
                    String telefono= request.getParameter("tNum")!=null? request.getParameter("tNum"):"";
                    String carrera=request.getParameter("carrera")!=null? request.getParameter("carrera"):"";
                    String contrasena=request.getParameter("password")!=null? request.getParameter("password"):"";
                    ServicesStudent servicesStudent = new ServicesStudent();
                    BeanStudent student= new BeanStudent();
                    student.setEmail(correo);
                    student.setName(name);
                    student.setSexo(sexo);
                    student.setCarrera(carrera);
                    student.setTelefono(telefono);
                    student.setPassword(contrasena);
                    boolean result= servicesStudent.saveStudent(student);
                    response.sendRedirect("EstudiantesRegistro");
                    //request.getRequestDispatcher("WEB-INF/view/").forward(request,response);
                }catch (Exception e){
                    e.printStackTrace();
                    response.sendRedirect("EstudiantesRegistro");
                }
                break;
        }
    }
}
