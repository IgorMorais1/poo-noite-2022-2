/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.lista1;

/**
 *
 * @author 1090482113007
 */
public class Lista1 {

    public static void main(String[] args) {
        Produto obj1 = new Produto();
        obj1.nome = "Mascara";
        obj1.qtde = 100;
        obj1.preco = 5;
        obj1.comprar(10);
        obj1.vender(5);
        System.out.println(" Nome: " + obj1.nome + " Qtde: " + obj1.qtde + " Preco: " + obj1.preco);
        

        
        Produto obj2 = new Produto("Bola de basquete" ,10,93.90);
        obj2.comprar(3);
        obj2.vender(2);
        System.out.println(" Nome: " + obj2.nome + " Qtde: " + obj2.qtde + " Preco: " + obj2.preco);

       
        
        Produto obj3 = new Produto("Fortnite" ,1,39.90);
        obj3.comprar(1);
        obj3.vender(3);
        System.out.println(" Nome: " + obj3.nome + " Qtde: " + obj3.qtde + " Preco: " + obj3.preco);
        
       
        
      
        
        
       
    }
}
