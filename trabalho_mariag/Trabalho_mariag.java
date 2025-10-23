package trabalho_mariag;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;

public class Trabalho_mariag {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int[] vagas = new int[10];
    Veiculo[] vagasOcupadas = new Veiculo[10];
    String[] estacionados = new String[10];
    String[] pagamento = new String[100];
    
    
    Veiculo veiculos = new Veiculo();
    CalculadoraTarifa calculadora = new CalculadoraTarifa();
    
    int opcao;
    String placa,condutor, marca, modelo,cor;
    int horaEntrada, minutoEntrada, tipo, codigo;
    
    System.out.println("==== MENU INICIAL DO ESTACIONAMETNTO ====");
    System.out.println("\n1 - REGISTAR VEICULO EM VAGA"
        + "\n2 - FINALIZAR USO DO VEICULO NA VAGA"
        + "\n3 - CONSULTAR DISPONIBILIDADE DE VAGAS"
        + "\n4 - CONSULTAR SALDO E HISTORICO DE PAGAMENTOS"
        + "\n0 - SAIR"
        + "\nDIGITE A OPCAO DESEJADA: ");
    
    opcao = input.nextInt();
    input.nextLine();
    boolean valido = false;
    
    
    for(int i = 0; i < vagas.length; i++){
        if(i<4){
            vagas[i] = 1;
        }
        else if(i<6){
            vagas[i] = 2;
        }
        else{
            vagas[i] = 3;
        }
    }
    
    switch(opcao){
        case 1-> {
            Veiculo nvVeiculos = new Veiculo();
            do{
                System.out.println("--- Tipo de Veiculo ---"
                        + "\n1- Carro"
                        + "\n2 - Moto"
                        + "\n3 - Caminhao / Caminhonete\n");
                
                try{
                    System.out.print("Digite o tipo do veiculo: ");
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
            
                do{ 
                    input.nextLine();
                    System.out.print("Digite a placa do veiculo: "); 
                    placa = input.nextLine();
                    
                    if(placa.isBlank()){
                        System.out.println("A placa não pode ficar em branco, insira a placa do veiculo.");
                    }
                    else{
                        nvVeiculos.setPlaca(placa);
                    }
                }
                while(placa.isBlank());
                
                
                
                do{
                    System.out.print("Digite a marca do veiculo: ");
                    marca = input.nextLine();

                    if(marca.isBlank()){
                        System.out.println("A marca não pode ficar em branco, insira a marca do veiculo.");
                    }
                    else{
                        nvVeiculos.setMarca(marca);
                    }
                }
                while(marca.isBlank());

                do{
                    System.out.print("Digite o modelo do veiculo: ");
                    modelo = input.nextLine();

                    if(modelo.isBlank()){
                        System.out.println("O modelo não pode ficar em branco, insira o modelo do veiculo.");
                    }
                    else{
                        nvVeiculos.setModelo(modelo);
                    }
                }
                    while(modelo.isBlank());
                
                do{
                    System.out.print("Digite a cor do veiculo: ");
                    cor = input.nextLine();
                    
                    if(cor.isBlank()){
                        System.out.println("A cor não pode ficar em branco, insira a cor do veiculo.");

                    }
                    else{
                        nvVeiculos.setCor(cor);
                    }
                }
                    while(cor.isBlank());
                
                do{
                    try{
                
                        System.out.print("Digite a hoa de entrada (0-23): ");
                        horaEntrada = input.nextInt();
                        nvVeiculos.setHora(horaEntrada);


                        if (horaEntrada >= 0 && horaEntrada <= 23) {
                                nvVeiculos.setHora(horaEntrada);
                                valido = true;
                        }
                        else{
                            valido = false;
                            System.out.println("Hora invalida, insira um numero entre 0 e 23");
                        }
                            }
                        catch(InputMismatchException e){
                            System.out.println("Digite apenas numeros");
                            input.nextLine();
                             valido = false;
                        }
                }
                while(!valido);

                do {
                    try {
                        System.out.print("Digite o minuto de entrada (0-59): ");
                        minutoEntrada = input.nextInt();
                        input.nextLine();

                        if (minutoEntrada >= 0 && minutoEntrada <= 59) {
                            valido = true;
                        } else {
                            System.out.println(" Minuto inválido! Deve estar entre 0 e 59.");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println(" Digite apenas números inteiros!");
                        input.nextLine();
                        valido = false;
                    }

                } while (!valido);
                
            int vagaLivre = -1;
            
            for(int i = 0; i<vagas.length; i++){
                if(vagasOcupadas[i] == null){
                    if(vagas[i] == nvVeiculos.getTipo()){
                        vagaLivre = i;
                    }
                    
                }
            }
            
            if(vagaLivre != -1){
                vagasOcupadas[vagaLivre] = nvVeiculos;
                System.out.println("Veiculo cadastrado com sucesso" + + (vagaLivre + 1));
                System.out.println("Codigo : " + nvVeiculos.getCodigo());
            }

            else{
                System.out.println("Não ha vagas disponiveis");
            }
           

            
        }
        case 2 -> {
            
            
        }
    }
    }
    
}
