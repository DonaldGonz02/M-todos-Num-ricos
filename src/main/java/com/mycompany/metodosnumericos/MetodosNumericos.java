/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodosnumericos;
import java.lang.Math;
import java.io.*;
/**
 *
 * @author rexgr
 */
public class MetodosNumericos {

     //Metodo Constructor
  public static void main(String args[]){
  MetodosNumericos Proyecto = new MetodosNumericos();
  Proyecto.menu();  //solo se manda a llamar a menu desde aqui, ya que menu llama a los demas metodos posteriromente
  }
    
  
    //(1)Metodo Biseccion  
  public void MetodoBiseccion(){
    double a;
    double b;
    double tol;
    System.out.println("\t\t\t\"METODO DE BISECCION\"");
    System.out.println("Extremo Izquierdo: ");
    a=lee();
    System.out.println("Extremo Derecho: ");
    b=lee();
    System.out.println("Tolerancia: ");
    tol=lee();
    double c;
    do{
    c=(a+b)/2.0;
    if(((c*c-5)*(a*a-5))<0){
      b=c;
    }
    else{
      a=c;
    }
      }while(Math.abs(a-b)>tol);
      System.out.println("La raiz es: "+c);      
  }
  
  
  //para leer desde teclado
  public double lee(){
    double num;
    try{
      InputStreamReader isr = new InputStreamReader (System.in);
      BufferedReader br = new BufferedReader(isr);
      String sdato;
      sdato = br.readLine();
      num = Double.parseDouble(sdato);
    }
    catch(IOException ioe){
      num=0.0;
    }
    return num;
    }
  //para  leer un entero
  public int leeint(){
    int num;
    try{
      InputStreamReader isr = new InputStreamReader (System.in);
      BufferedReader br = new BufferedReader(isr);
      String sdato;
      sdato = br.readLine();
      num = Integer.parseInt(sdato);
    }
    catch(IOException ioe){
      num=0;
    }
    return num;
    }
  
  
  //para salir del programa
  public int Fuera(){
    int sal; 
    System.out.println("\n\n\nSI DESEAS OTRO METODO PRESIONA [1]");
    sal=leeint();
    return sal;
    }
  //despliega menu
  public void menu(){
    int a;
    int p;
    do{
    do{
    System.out.println("\n\n\t\t\tMETODOS NUMERICOS\n\n");
    System.out.println("\t1.-Biseccion\n\t2.-Newton-Raphson\n\t3.-Gauss\n\t4.-Gauss-Seidel\n\t5.-Gauss-Jordan\n\t6.-LU\n\t7.-Interpolacion Newton\n\t8.-Interpolacion Lagrange");
    System.out.println("\n\nEscoja el numero del metodo que desea usar:");
    a=leeint();
    }while(a<1 || a>8);
    switch(a){
      case 1:
      MetodoBiseccion();  //manda a llamara a cada uno de los metodos
      p=Fuera();
      break;
      case 2:
      //MetodoNewtonRaphson();
      p=Fuera();
      break;
      case 3:
      //MetodoGauss();
      p=Fuera();
      break;
      case 4:
      //MetodoGaussSeidel();
      p=Fuera();
      break;
      case 5:
      //MetodoGaussJordan();
      p=Fuera();
      break;
      case 6:
      //MetodoLu();
      p=Fuera();
      break;
      case 7:
      //MetodoInterNewton();
      p=Fuera();
      break;
      case 8:
      //MetodoInterLagrange();
      p=Fuera();
      break;
      default:
      System.out.println("Opcion incorrecta");
      p=1;
      break;
      }
    }while(p==1);
    }
    
}
