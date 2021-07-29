/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejooperadores;

/**
 *
 * @author carlo
 */
public class operaciones {

    int dato1, dato2, resultado;

    public void hacerSuma(int a, int b) {
        this.dato1 = a;
        this.dato2 = b;
        this.resultado = dato1 + dato2;
    }

    public void hacerResta(int a, int b) {
        this.dato1 = a;
        this.dato2 = b;
        this.resultado = dato1 - dato2;
    }
    
    public void imprimirResultado(){
        System.out.println("El resultado de la operación es: " +resultado);
    }
}
