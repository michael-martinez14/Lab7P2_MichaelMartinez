/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_michaelmartinez;

/**
 *
 * @author Michael Martínez
 */
public class Producto {
    private int id, category,bin,aisle;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(int id, int category, int bin, int aisle, String nombre, double precio) {
        this.id = id;
        this.category = category;
        this.bin = bin;
        this.aisle = aisle;
        this.nombre = nombre;
        this.precio = precio;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", category=" + category + ", bin=" + bin + ", aisle=" + aisle + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
