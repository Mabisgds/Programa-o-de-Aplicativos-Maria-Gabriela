package trabalho_mariag;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Trabalho_mariag {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    Veiculo veiculos = new Veiculo();
    CalculadoraTarifa calculadora = new CalculadoraTarifa();
    
    char opcao = ' ';
    String placa,condutor, marca, modelo,cor;
    int horaEntrada, minutoEntrada, tipo, codigo;
    
    System.out.println("==== MENU INICIAL DO ESTACIONAMETNTO ====");
    System.out.println("\n1 - REGISTAR VEICULO EM VAGA"
        + "\n2 - FINALIZAR USO DO VEICULO NA VAGA"
        + "\n3 - CONSULTAR DISPONIBILIDADE DE VAGAS"
        + "\n4 - CONSULTAR SALDO E HISTORICO DE PAGAMENTOS"
        + "\n0 - SAIR"
        + "\nDIGITE A OPCAO DESEJADA: ");
    
    opcao = input.next().charAt(0);
    boolean valido = false;
    
    switch(opcao){
        case 1-> {
            Veiculo nvVeiculos = new Veiculo();
            do{
                System.out.println("--- Tipo de Veiculo ---"
                        + "\n1- Carro"
                        + "\n2 - Moto"
                        + "\n3 - Caminhao / Caminhonete");
                
                try{
                    System.out.println("Digite o tipo do veiculo: ");
                    tipo = input.nextInt();
                    
                    if (tipo >= 1 && tipo <= 3) {
                        nvVeiculos.setTipo(tipo);
                        valido = true;
                    } 
                    else {
                         System.out.println("Tipo inválido. Por favor, digite 1, 2 ou 3.");
                    }
                    
                }            
                catch(InputMismatchException e){
                    System.out.println("O tipo deve ser indicado em numeros");
                    input.nextLine();
                }
            }
            while(valido == false);
            
            System.out.println("Digite a placa do veiculo: "); 
            placa = input.nextLine();
            nvVeiculos.setPlaca(placa);
            
            System.out.println("Digite a marca do veiculo: ");
            marca = input.nextLine();
            nvVeiculos.setMarca(marca);
            
            System.out.println("Digite o modelo do veiculo: ");
            modelo = input.nextLine();
            nvVeiculos.setModelo(modelo);
            
            System.out.println("Digite a cor do veiculo: ");
            cor = input.nextLine();
            nvVeiculos.setCor(cor);
            
            System.out.println("Digite a hoa de entrada (0-23): ");
            horaEntrada = input.nextInt();
            nvVeiculos.setHora(horaEntrada);
            
            System.out.println("Digite o miniuto e entrada (0-59): ");
            minutoEntrada = input.nextInt();
            nvVeiculos.setMinuto(minutoEntrada);
            

            
        }
    }
    }
    
}
