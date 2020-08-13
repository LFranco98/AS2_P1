package com.PIAnalisis2.Model;

public class Estudiantes implements IEstudiantes{
    private String id_estudiante;
    private String name;
    private String surname;
    private String email;
    private String birthdate;
    private String studen_id;
    private String phone1;
    private String phone2;
    private String address1;
    private String address2;

    @Override
    public String getId_estudiante() {
        return id_estudiante;
    }

    @Override
    public void setId_estudiante(String id_estudiante) {
        this.id_estudiante = id_estudiante;
    }
    
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getBirthdate() {
        return birthdate;
    }

    @Override
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String getStuden_id() {
        return studen_id;
    }

    @Override
    public void setStuden_id(String studen_id) {
        this.studen_id = studen_id;
    }

    @Override
    public String getPhone1() {
        return phone1;
    }

    @Override
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    @Override
    public String getPhone2() {
        return phone2;
    }

    @Override
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @Override
    public String getAddress1() {
        return address1;
    }

    @Override
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Override
    public String getAddress2() {
        return address2;
    }

    @Override
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    
    
}
