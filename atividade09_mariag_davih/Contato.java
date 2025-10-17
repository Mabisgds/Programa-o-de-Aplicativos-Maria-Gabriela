
package atividade09_mariag_davih;

public class Contato {
    private  String nome;
    private int telefone;
    private String gmail;
    
    public Contato(String nome, int telefone, String gmail){
        this.nome = nome;
        this.telefone = telefone;
        this.gmail = gmail;
   
    }
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public void setGmail(String gmail){
        this.gmail = gmail;
    }
    
    public int getTelefone(){
        return telefone;
    }
}
