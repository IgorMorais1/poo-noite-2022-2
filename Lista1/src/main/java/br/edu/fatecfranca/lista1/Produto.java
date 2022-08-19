/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.lista1;

/**
 *
 * @author 1090482113007
 */

public class Produto {
    public String nome; 
    public int qtde; 
    public double preco; 
    
    public Produto(){}
    
    public Produto(String nome, int qtde, double preco){
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;     
    }
    
    // Um método que compra um produto aumentando sua quantidade
    // Um método não retorna nada
    
    public void comprar (int x){
        this.qtde = this.qtde + x;
    }
    
    public void vender (int x) {
       if(x <= qtde){
           this.qtde = this.qtde - x;
       }
       
       else System.out.println("Sem Estoque");
       }
        
    }
       
}
