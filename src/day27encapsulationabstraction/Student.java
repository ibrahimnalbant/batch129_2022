package day27encapsulationabstraction;

public class Student {

    private String stdId = "AC123";
    private double gpa = 3.99;
    private boolean poor = true;


    //Encapsulation yapilmis data'yi okuyabilir miyiz?
    //get method'lar(getter) encapsule edilmi(saklanmis) data'yi okumamiza yarar
    //get method'lar (getter) her zaman "public" olur.
    //get method'larin (getter) return type'i variable'in data type'i ile ayni olur.
    //get method'larin (getter) isimleri "get + variable name" seklinde olur.(naming convention)
        //variable'in data type'i "boolean" ise get method'larin ismi "is" ile baslar.
        // "is + variable name" seklinde olur.
    //get method'lar (getter) herhangi bir parametre kullanmazlar.


    public String getStdId() {  //"Getter" Saklanmis data'yi okumaya yarar
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }


            //Encapsulation yapilmis data'larin degeri degistirilebilir mi?

    //set method'lar(setter) encapsule edilmis data'lari update etmemize (degistirmemize)yarar.
    //set method'lar(setter) her zaman "public" olur.
    //set method'larin(setter) return type'i her zaman void olur.
    //set method'larin (setter) isimleri "set + variable name" seklinde olur.(naming convention)
    //set method'lar(setter) variable ile ayni data type'inda parametre kullanirlar.


    //getter ve setter'larin ikisine birden "Java Beans" denir.
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

}//class
