/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiojava_mariag_davih;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;
/**
 *
 * @author Aluno
 */
public class DesafioJava_mariag_davih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e  = new Scanner(System.in);
        
        double sr = 100,sd = 0,d = 0, em, v1, sb, emj, dol, vr, j;
        int op = 0,cont = 0,i = 0, par;
        String x;
        char t = ' ', conf = ' ';
        ArrayList<String> extrato = new ArrayList<>(); 
        ArrayList<String> parcela = new ArrayList<>(); 


        do{
            System.out.println("==== Caixa Rapido ==== "
                    + "\n1 - Saldo. "
                    + "\n2 - Deposito."
                    + "\n3 - Extrato. "
                    + "\n4 - Simular emprestimo."
                    + "\n5 - Comprar Dolar."
                    + "\n0 - Sair. "
                    + "\nEscolha um opcao: ");
                    
            op = e.nextInt();
            
            switch(op){
                case 1 -> {
                    System.out.printf("Saldo em Reais: R$ %.2f",sr);
                    System.out.printf("\nSaldo em Dolar: US$ %.2f",sd);
                    do{
                        System.out.print("\nDeseja voltar ao menu (V) ou encerrar o programa (E)? ");
                        t = e.next().charAt(0);
                            if(t !='V' ){
                                System.out.print("Opção invalida");
                            }
                    }
                    while(t !='V');
                    
                }
                
                case 2 ->{
                    do{
                        System.out.print("\nInsira o valor do deposito em reais: ");
                        d = e.nextDouble();
                        if(d>0 && d <=5000){
                            sr += d;
                            System.out.println("Deposito realizado com sucesso!");
                            extrato.add("Deposito +"+d);
                        }
                       
                        else{
                            System.out.println("Valor invalido."
                            + "\nO depeosito deve ser maior que R$0,00 e maior que R$5000,00."
                            + "\nDigite Novamente.");
                        }
                    
                    } while(d<=0 || d > 5000);
                   
                
                    do{
                    System.out.print("Deseja voltar ao menu (V ou encerrar o programa (E)? ");
                    t = e.next().charAt(0);
                        if(t !='V' ){
                           System.out.print("Opção invalida");
                        }
                    }
                    while(t !='V');
                }
                
                case 3 ->{
                    
                    if(extrato.size() > 0 ){
                        Collections.reverse(extrato);
                        int max = Math.min(10, extrato.size());
                        for (int a = 0; a < max; a++) {
                            System.out.println(extrato.get(a));
                        }
                    }
                    else{
                        System.out.println("Nenhum extrato.");
                    }
                    
                    do{
                    System.out.print("Deseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    t = e.next().charAt(0);
                    if(t !='V' ){
                        System.out.print("Opção invalida");
                    }

                    }
                    while(t !='V');
                        
                }
                case 4->{
                    do{
                        System.out.print("Informe o valor do emprestimo: ");
                        em = e.nextDouble();
                        if(em<200 || em>100000){
                            System.out.print("\nO valor do emprstimo dve ser entre R$200,00 e R$100.00,00");
                        }
                    }
                    while(em<200 || em>100000);
                    
                    System.out.print("Informe o seu salario bruto: ");
                    sb = e.nextDouble();
                    do{
                        System.out.print("Insira a quantidade de parcelas (6, 12, 18, 24, 30, 36, 40, 48, 56, 60 ou 72.): ");
                        par = e.nextInt();
                        
                        if(!(par == 6 || par == 12 || par == 18 || par == 24 || par == 30 || par == 36 || 
                        par == 40 || par == 48 ||par ==  56 || par == 60 || par == 72)){
                           System.out.print("A quantidade de parcelas deve par 6, 12, 18, 24, 30, 36, 40, 48, 56, 60 ou 72.");
                        
                    
                        }
                    } 
                    while(!(par == 6 || par == 12 || par == 18 || par == 24 || par == 30 || par == 36 || 
                        par == 40 || par == 48 ||par ==  56 || par == 60 || par == 72));
                    
                    v1 = em/par;
                    v1+= (2*em)/100;
                    emj = v1*par;
                    j= (30*sb)/100;
                    
                    if(v1 <= j){
                        int pro = (int)(Math.random() * 99999) + 10000;
                        System.out.printf("\nEmprestimo disponivel, entre em contato com a central e informe o numero de protocolo EM%d", pro);
                    }
                    else{
                        System.out.printf("\nEmprestimo indiponivel O valor da parcela não pode ultrapassar %.2f\n", j);
                    }
                   
                    System.out.printf("\nValor da parcela: %.2f"
                            + "\nValor do emprestimo: %.2f"
                            + "\nValor total do emprestimo a ser pago: %.2f", v1,em,emj);
                    do{
                    System.out.print("\nDeseja voltar ao menu (V) ou encerrar o programa (E)? ");
                    t = e.next().charAt(0);
                    if(t !='V' ){
                        System.out.print("Opção invalida");
                    }

                    }
                    while(t != 'V');
                }
                
                case 5 -> {
                    do{
                        System.out.printf("Saldo disponivel em reais: R$%.2f",sr );
                        System.out.print("\nQuantos dólares deseja comprar (US$): ");
                        dol = e.nextDouble();

                        vr = dol*5.;
                        if(sr<vr){
                            System.out.println("Saldo insuficiente");
                            System.out.print("Deseja simular novamente (R), voltar ao menu (V) ou encerrar o programa (E): ");
                            t = e.next().charAt(0);
                        }
                        else{
                            do{
                                System.out.print("Confirmar a compra (s/n): ");
                                conf = e.next().charAt(0);
                                
                                 if(conf!= 's' && conf != 'n'){
                                    System.out.println("Opcao invalida");
                                }

                                if(conf == 's'){
                                    sr -= vr;
                                    sd += dol;
                                    System.out.printf("Compra realizada com sucesso!! \nNovo saldo: \n"
                                            + "Reais: R$%.2f"
                                            + "\nDolares:US$%.2f", sr, sd);
                                    System.out.print("\nDeseja voltar ao menu (V ou encerrar o programa (E)? ");
                                    t = e.next().charAt(0);
                                }
                                if(conf == 'n'){
                                   System.out.println("Operação cancelada");
                                   System.out.print("Deseja simular novamente (R), voltar ao menu (V) ou encerrar o programa (E): ");
                                   t = e.next().charAt(0);
                                   if(t!= 'V' || t!= 'R' || t!= 'E'){
                                       System.out.println("Opcao invalida");
                                   }
                                }
                               
                            }
                            while(conf != 's' || conf != 'n');
                        }
                    }while(t =='R');}
                        
                    
                case 0 -> {
                    System.out.println("Encerrando o atendimento. Obrigada por utilizar o Caixa rapido");
                    t = 'E';
                }
                 
                default -> {System.out.println("Opcao invalida!");}
            
                
            
        }}while(t !='E');
        
    }
}
    

