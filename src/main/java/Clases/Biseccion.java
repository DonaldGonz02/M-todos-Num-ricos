/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author rexgr
 */
public class Biseccion {
    
    private String funcion;
    private double a;
    private double b;
    private double Tol;

    public Biseccion() {
    }

    public Biseccion(String funcion, double a, double b, double Tol) {
        this.funcion = funcion;
        this.a = a;
        this.b = b;
        this.Tol = Tol;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getTol() {
        return Tol;
    }

    public void setTol(double Tol) {
        this.Tol = Tol;
    }    
}
