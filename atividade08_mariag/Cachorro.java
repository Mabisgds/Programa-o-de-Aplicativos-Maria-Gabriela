/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade08_mariag;

/**
 *
 * @author Aluno
 */
public class Cachorro {
    String nome_pet;
    String raca;
    int idade;
    String nome_dono;
    String contato_dono;
    
    public Cachorro(String nome_pet,String raca,int idade,String nome_dono, String contato_dono){
        this.nome_pet = nome_pet;
        this.raca = raca;
        this.idade = idade;
        this.nome_dono = nome_dono;
        this.contato_dono = contato_dono;
        
    }
    
    public void exibirdados(){
        System.out.println("Nome...: "+nome_pet);
        System.out.println("Raça...: "+raca);
        System.out.println("Idade...: "+idade);
        System.out.println("Dono...: "+nome_dono);
        System.out.println("Contato...: "+contato_dono);
    }
}
