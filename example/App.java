package org.example;

public class App {
    public static void main(String[] args) {
        Tabung tabung = new Tabung("tabung");
        Kubus kubus = new Kubus("kubus");
        Balok balok = new Balok("balok");

        balok.setName("Balok");
        System.out.println("Nama bangun: " + balok.getName());

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.setName("Kubus");
        System.out.println("Nama bangun: " + kubus.getName());

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.setName("Tabung");
        System.out.println("Nama bangun: " + tabung.getName());

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}
