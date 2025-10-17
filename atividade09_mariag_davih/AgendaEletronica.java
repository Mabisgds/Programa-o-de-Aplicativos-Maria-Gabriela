
package atividade09_mariag_davih;

import java.util.List;
import java.util.ArrayList;

public class AgendaEletronica {
    String nome;
    int telefone;
    String gmail;
    private List<Contato> contatos;
    
    public AgendaEletronica(){
        this.contatos = new ArrayList<>();
        
    }
    
    public void cadastro(String nome, int telefone, String gmail){
        Contato novo = new Contato(nome, telefone, gmail);
        this.contatos.add(novo);
    }
    
    public void listar(){
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
            return;}
        System.out.println("\n--- LISTA DE CONTATOS ---");
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println("[" + i + "] " + contatos.get(i).toString());
        
        }
    }
    
    public void busca(String nomes){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nomes)) {
                return contato; 
            }
           
        }
       
    }
    public boolean verificarTell(int telefone) {
        for (Contato contato : this.contatos) {
            
            if (contato.getTelefone() == telefone) { 
                return true; 
            }
        }
        return false;
    }
}

