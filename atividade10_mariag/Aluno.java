
package atividade10_mariag;


public class Aluno {
    private int id;
    private String nome;
    
    public Aluno(){
        
    }
    
    public Aluno(int id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getId(){
        return id;
    }
    
    public void setNome( String nome){
        this.nome = nome;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    
}
