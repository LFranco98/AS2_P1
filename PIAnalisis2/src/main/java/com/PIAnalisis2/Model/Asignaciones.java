package com.PIAnalisis2.Model;

public class Asignaciones implements IAsignaciones{
    private String id_student;
    private String id_course;

    @Override
    public String getId_student(){
        return id_student;
    }

    @Override
    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

    @Override
    public String getId_course() {
        return id_course;
    }

    @Override
    public void setId_course(String id_course) {
        this.id_course = id_course;
    }
    
    
}
