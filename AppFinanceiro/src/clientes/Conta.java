/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import eventos.Eventos;
import tarifasEImpostos.Impostos;

/**
 *
 * @author 0219013
 */
public class Conta implements Eventos, Impostos{
    // Atributo
    private float saldo;
    // Construtores
    public Conta(){
    this.saldo = 0.0f;
    }
    public Conta(float valor){
    this.saldo = valor;
    }
    // Métodos

    /**
     * @return the saldo
     */
    @Override
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(float valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(float valor) {
        this.saldo -= valor + valor*CPMF;
       // this.saldo = this.saldo - (valor + valor * CPMF);
    }
    @Override
    public String toString(){
        String saida = "\n Saldo atual R$ ";
       saida += this.getSaldo();
       return saida;
    }
}
