package com.example.gaac.model;

public class BeanStudent {
    private String name;
    private String email;
    private char sexo;
    private String telefono;
    private String carrera;
    private String password;
    public BeanStudent(){

    }
    public BeanStudent(String email, String name/*, char sexo*/){
        this.email=email;
        this.name=name;
        this.sexo=sexo;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getSexo(){
        return sexo;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
