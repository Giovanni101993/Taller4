package com.example.calculadora;

public class Suma {

    private int n1, n2, res;

    public void setResultado(int n1, int n2){

        this.n1=n1;
        this.n2=n2;
    }

    private int Operacion(){
        res= n1+n2;
        return res;
    }

    public int getRes(){
        return Operacion();
    }

}
