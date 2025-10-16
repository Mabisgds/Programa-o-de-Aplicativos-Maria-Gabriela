
package desafio1.pkg2_mariag_davih;

import java.util.Collections;

import java.util.ArrayList;

public class ExtratoBancario {
    ArrayList<Movimentacao> extrato = new ArrayList<>();
    int cont = 0,capacidade = 10;
    
    public void adicionar(Movimentacao m){
        ++cont;
        if(cont <= capacidade){
            extrato.add(m);
        }
    }
    
    public void mostrar(){
        System.out.println("Extrato Bancario.");
        if(cont == 0){
            System.out.println("Nenhuma movimentação realizada ainda.");
        }else{
            for(int i = 0; i < capacidade; i++){
                extrato.get(i).mostrar();
            } 
        }
        
    }
}

