package com.example.gaac.control;
import com.example.gaac.model.BeanStudent;
import com.example.gaac.model.DaoStudent;
public class ServicesStudent {
    public boolean saveStudent(BeanStudent student){
        DaoStudent daoStudent = new DaoStudent();
        boolean result =daoStudent.newStudent(student);
        return result;
    }
}
