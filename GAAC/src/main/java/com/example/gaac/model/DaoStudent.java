package com.example.gaac.model;

import com.example.gaac.model.Utils.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class DaoStudent {
    public boolean newStudent(BeanStudent student){
        boolean result=false;
        try(Connection con = MySQLConnection.getConnection();
            PreparedStatement pstm=con.prepareStatement(
                    "insert into estudiante (NombreCompleto,Correo,Telefono,Sexo,ID_carrera,contrasena) values (?,?,?,?,?,?)")
        ){
            pstm.setString(1,student.getName());
            pstm.setString(2,student.getEmail());
            pstm.setString(3,student.getTelefono());
            pstm.setString(4,String.valueOf(student.getSexo()));
            pstm.setString(5,student.getCarrera());
            pstm.setString(6,student.getPassword());

            result=pstm.executeUpdate()==1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
