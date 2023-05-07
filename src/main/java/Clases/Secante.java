/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author rexgr
 */
public class Secante {
    String Fun;
    double Xi;
    double Xo;
    double Tol;

    public Secante() {
    }

    public Secante(String Fun, double Xi, double Xo, double Tol) {
        this.Fun = Fun;
        this.Xi = Xi;
        this.Xo = Xo;
        this.Tol = Tol;
    }

    public String getFun() {
        return Fun;
    }

    public void setFun(String Fun) {
        this.Fun = Fun;
    }

    public double getXi() {
        return Xi;
    }

    public void setXi(double Xi) {
        this.Xi = Xi;
    }

    public double getXo() {
        return Xo;
    }

    public void setXo(double Xo) {
        this.Xo = Xo;
    }

    public double getTol() {
        return Tol;
    }

    public void setTol(double Tol) {
        this.Tol = Tol;
    }

    
}
