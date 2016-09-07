/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author user
 */
public class Fraccionario {

    int numerador;
    int denominador;

    public Fraccionario(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccionario sumar(Fraccionario f2) {
        Fraccionario f;
        int num, den;

        num = this.numerador * f2.denominador + this.denominador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num, den);
        return f;
    }

    public Fraccionario restar(Fraccionario f2) {
        Fraccionario f;
        int num, den;

        num = this.numerador * f2.denominador - this.denominador * f2.numerador;
        den = this.denominador * f2.denominador;
        f = new Fraccionario(num, den);
        return f;
    }

    
    public Fraccionario multiplicar(Fraccionario f2){
        Fraccionario f;
        int num, den;
        
        num = this.numerador*f2.numerador;
        den = this.denominador*f2.denominador;
        f = new Fraccionario(num, den);
        return f;
    }
    
    
    public Fraccionario dividir(Fraccionario f2){
        Fraccionario f;
        int num, den;
        
        num = this.numerador*f2.denominador;
        den = this.denominador*f2.numerador;
        f = new Fraccionario(num, den);
        return f;
    }
    
    
    
}
