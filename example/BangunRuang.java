package org.example;

public class BangunRuang {
    private String name;

    public BangunRuang(String name){
        this.name = name;
    }

    public void inputNilai(){
        System.out.println("\nInput nilai " + name);
    }

    public void luasPermukaan(){
        System.out.println("\nMenghitung luas permukaan bangun " + name);
    }

    public void volume(){
        System.out.println("Menghitung volume bangun " + name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
