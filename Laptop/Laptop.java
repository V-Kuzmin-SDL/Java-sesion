
package Laptop;

public class Laptop {
    private String os;  
    private int ram;    
    private int hdd;    
    private String color; 

    
    public Laptop(String os, int ram, int hdd, String color) {
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;
    }

    // Геттеры для каждого поля
    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", color='" + color + '\'' +
                '}';
    }
}
