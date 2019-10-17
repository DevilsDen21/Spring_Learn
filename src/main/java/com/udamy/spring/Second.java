package com.udamy.spring;

public class Second {
    private int id;
    private String name;
    private int empId;
    private Info info;

    public Second(){}
    public Second(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void print(){
        System.out.println("Sup my dudes ");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    @Override
    public String toString(){
        return "my ID is "+ id + " and my Name is "+ name + " My Emp code is " + empId +
                " Address: "+ info;
    }
}
