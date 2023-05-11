/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author rexgr
 */
public class Raiz {
    private String Fun;
    private String FunDer;
    private String FunDer2;
    private double Xi;
    private double Tol;
    
    public Raiz(){
        
    }
    public Raiz(String Fun, String FunDer, String FunDer2, double Xi, double Tol) {
        this.Fun = Fun;
        this.FunDer = FunDer;
        this.FunDer2= FunDer2;
        this.Xi = Xi;
        this.Tol = Tol;
    }
    
    //Constructores

    public String getFun() {
        return Fun;
    }

    public void setFun(String Fun) {
        this.Fun = Fun;
    }

    public String getFunDer() {
        return FunDer;
    }

    public void setFunDer(String FunDer) {
        this.FunDer = FunDer;
    }

    public String getFunDer2() {
        return FunDer2;
    }

    public void setFunDer2(String FunDer2) {
        this.FunDer2 = FunDer2;
    }

    public double getXi() {
        return Xi;
    }

    public void setXi(double Xi) {
        this.Xi = Xi;
    }

    public double getTol() {
        return Tol;
    }

    public void setTol(double Tol) {
        this.Tol = Tol;
    }
    
}
