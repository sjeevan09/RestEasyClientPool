package com.jeevan.rest.easy.model;

public class Data
{
    private String name;

    private String salary;

    private String age;

    private int id;

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setSalary(String salary){
        this.salary = salary;
    }
    
    public String getSalary(){
        return this.salary;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getAge(){
        return this.age;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}

