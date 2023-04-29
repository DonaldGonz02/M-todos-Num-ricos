/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author rexgr
 */
public class Newton {
    private String fx;
    private String dfx;
    private double xi;
    private double Tol;

    public Newton() {
    }

    public Newton(String funcion, String funcionDerivada, double Xi, double ETolerancia) {
        this.fx = fx;
        this.dfx = dfx;
        this.xi = xi;
        this.Tol = Tol;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getDfx() {
        return dfx;
    }

    public void setDfx(String dfx) {
        this.dfx = dfx;
    }

    public double getXi() {
        return xi;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public double getTol() {
        return Tol;
    }

    public void setTol(double Tol) {
        this.Tol = Tol;
    }

  
}
