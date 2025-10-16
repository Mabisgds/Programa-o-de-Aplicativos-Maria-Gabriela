
package desafio1.pkg2_mariag_davih;

public class Movimentacao {
   String tipo;
    double valor;
    
    Movimentacao(String tipo,double valor){
        this.tipo = tipo;
        this.valor = valor;
    }
public void mostrar(){
    if(tipo.equals("Depósito em Dólar ")){
        System.out.println(tipo+"de U$: "+valor);
    }else{
    System.out.println(tipo+"de R$: "+valor);}
    }
}