package desafio1.pkg2_mariag_davih;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio12_mariag_davih {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        double dol = 0, deposito, sr = 0, sd = 0,emprestimo = 0;
        int op,qtd = 0;
        char t = ' ', conf = ' ';

        ContaBancaria conta = new ContaBancaria(100.00, 0.00);
        ExtratoBancario extrato = new ExtratoBancario();
        ServicoCambio cambio = new ServicoCambio(dol);
        
        

        do {
            System.out.println("\nBanco");
            System.out.println("1 - Ver Saldo.");
            System.out.println("2 - Depositar.");
            System.out.println("3 - Extrato");
            System.out.println("4 - Simular Emprestimo");
            System.out.println("5 - Comprar dolares");
            System.out.println("0 - Sair.");
            System.out.print("Escolha: ");
            op = e.nextInt();

            switch (op) {
                case 1 -> {
                    conta.mostrarSaldo();
                     do{
                        System.out.print("\nDeseja voltar ao menu (V) ou encerrar o programa (E)? ");
                        t = e.next().charAt(0);
                            if(t !='V' ){
                                System.out.print("Opção invalida");
                            }
                    }
                    while(t !='V');}

                case 2 -> {
                    System.out.print("Insira o valor do depósito: ");
                    deposito = e.nextDouble();
                    if (deposito > 0 && deposito <= 5000) {
                        conta.depositar(deposito);
                        
                    } else {
                        System.out.println("Valor inválido!");
                    }
                     do{
                        System.out.print("\nDeseja voltar ao menu (V) ou encerrar o programa (E)? ");
                        t = e.next().charAt(0);
                            if(t !='V' ){
                                System.out.print("Opção invalida");
                            }
                    }
                    while(t !='V');
                }

                case 3 -> {
                    extrato.mostrar();
                     do{
                        System.out.print("\nDeseja voltar ao menu (V) ou encerrar o programa (E)? ");
                        t = e.next().charAt(0);
                            if(t !='V' ){
                                System.out.print("Opção invalida");
                            }
                    }
                    while(t =='V');
                }
                
                case 4 -> {
                    do{
                        System.out.println("Valor do emprestimo: ");
                        emprestimo = e.nextDouble();
                         if(emprestimo<200 || emprestimo>100000){
                                System.out.print("\nO valor do emprstimo dve ser entre R$200,00 e R$100.000,00");
                            }}
                    while(emprestimo<200 || emprestimo>100000);
                    System.out.println("Salario bruto: ");
                    double slario = e.nextDouble();
//                    do{
                        System.out.println("Insira a quantidade de parcelas (6, 12, 18, 24, 30, 36, 40, 48, 56, 60 ou 72.):  ");
                        qtd = e.nextInt();
                        Simuladoremprestimo empres = new Simuladoremprestimo(emprestimo, qtd);
                        empres.conta(slario);
                    }
//                    while(qtd)
                    
                
                    
                case 5 -> {
                    conta.mostrarSaldo();
                    System.out.print("Quantos dólares deseja comprar? ");
                    dol = e.nextDouble();
                    conta.comprar(dol);
                     do{
                         System.out.print("Voltar ao menu (V) ou Encerrar o programa (E): ");
                            t = e.next().charAt(0);}
                     while(t =='R');
                     }


                case 0 -> {System.out.println("Fechando o programa.");
                        t = 'E';}

                default -> System.out.println("Opção inválida!");
            }
        } while(t !='E');

//        e.close();
    }
}