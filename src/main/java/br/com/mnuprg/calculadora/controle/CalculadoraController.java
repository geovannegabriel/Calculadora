/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mnuprg.calculadora.controle;

import br.com.mnuprg.calculadora.enums7.EnumOperacao;

/**
 *
 * @author usuario
 */
public class CalculadoraController {
    
   public CalculadoraController() {
       total = 0.0;
       
   }
    
    private Double total;
    
    public Double realizaOperacao(EnumOperacao operacao, Double valor) {
        if (operacao.equals(EnumOperacao.SOMA)) {
            total += valor;
        } else if (operacao.equals(EnumOperacao.SUBTRACAO)) {
            total -= valor;
        } else if (operacao.equals(EnumOperacao.DIVISAO)) {
            total /= valor;
        } else if (operacao.equals(EnumOperacao.MULTIPLICACAO)) {
            total *= valor;
        }
        return total;
    }
    
    public Double getTotal() {
        return this.total;
    }
    
    public void zerar() {
        total = 0.0;
    }
    
}
