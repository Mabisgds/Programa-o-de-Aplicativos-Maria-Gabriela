package trabalho_maria_gabriela;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Trabalho_maria_gabriela {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vagas = new int[10];
        Veiculo[] vagasOcupadas = new Veiculo[10];
        String[] pagamento = new String[100];

        double valor = 0;
        int opcao;
        char voltar = ' ';
        String placa, condutor, marca, modelo, cor, metodo = " ";
        int horaEntrada, minutoEntrada, tipo, codigo = 0;

        ArrayList<Pagamento> historicoPagamentos = new ArrayList<>();

        boolean menu = true;
        boolean erro;

        // Distribuição correta conforme PDF:
        // 1–3 = tipo 2 (motos); 4–5 = tipo 3 (caminhão); 6–10 = tipo 1 (carro)
        for (int i = 0; i < vagas.length; i++) {
            if (i < 3) vagas[i] = 2;
            else if (i < 5) vagas[i] = 3;
            else vagas[i] = 1;
        }

        do {
            System.out.println("==== MENU INICIAL DO ESTACIONAMENTO ====");
            System.out.println("\n1 - REGISTRAR VEÍCULO EM VAGA"
                    + "\n2 - FINALIZAR USO DO VEÍCULO NA VAGA"
                    + "\n3 - CONSULTAR DISPONIBILIDADE DE VAGAS"
                    + "\n4 - CONSULTAR SALDO E HISTÓRICO DE PAGAMENTOS"
                    + "\n0 - SAIR"
                    + "\nDIGITE A OPÇÃO DESEJADA: ");

            try {
                opcao = input.nextInt();
                input.nextLine(); // limpa buffer

                switch (opcao) {
                    case 1 -> {
                        Veiculo nvVeiculos = new Veiculo();

                        // leitura do tipo (corrigido)
                        boolean validoTipo = false;
                        do {
                            System.out.println("--- Tipo de Veículo ---"
                                    + "\n1 - Carro"
                                    + "\n2 - Moto"
                                    + "\n3 - Caminhão / Caminhonete\n");
                            System.out.print("Digite o tipo do veículo: ");
                            try {
                                tipo = input.nextInt();
                                input.nextLine();
                                if (tipo >= 1 && tipo <= 3) {
                                    nvVeiculos.setTipo(tipo);
                                    validoTipo = true;
                                } else {
                                    System.out.println("Tipo inválido. Por favor, digite 1, 2 ou 3.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("O tipo deve ser indicado em números.");
                                input.nextLine();
                            }
                        } while (!validoTipo);

                        // leitura da placa
                        do {
                            System.out.print("Digite a placa do veículo: ");
                            placa = input.nextLine();
                            if (placa.isBlank()) {
                                System.out.println("A placa não pode ficar em branco.");
                            } else {
                                nvVeiculos.setPlaca(placa);
                            }
                        } while (placa.isBlank());

                        // leitura do condutor
                        do {
                            System.out.print("Digite o nome do condutor: ");
                            condutor = input.nextLine();
                            if (condutor.isBlank()) {
                                System.out.println("O nome do condutor não pode ficar em branco.");
                            } else {
                                nvVeiculos.setCondutor(condutor);
                            }
                        } while (condutor.isBlank());

                        // marca
                        do {
                            System.out.print("Digite a marca do veículo: ");
                            marca = input.nextLine();
                            if (marca.isBlank()) {
                                System.out.println("A marca não pode ficar em branco.");
                            } else {
                                nvVeiculos.setMarca(marca);
                            }
                        } while (marca.isBlank());

                        // modelo
                        do {
                            System.out.print("Digite o modelo do veículo: ");
                            modelo = input.nextLine();
                            if (modelo.isBlank()) {
                                System.out.println("O modelo não pode ficar em branco.");
                            } else {
                                nvVeiculos.setModelo(modelo);
                            }
                        } while (modelo.isBlank());

                        // cor
                        do {
                            System.out.print("Digite a cor do veículo: ");
                            cor = input.nextLine();
                            if (cor.isBlank()) {
                                System.out.println("A cor não pode ficar em branco.");
                            } else {
                                nvVeiculos.setCor(cor);
                            }
                        } while (cor.isBlank());

                        // hora de entrada
                        boolean validoHora = false;
                        do {
                            try {
                                System.out.print("Digite a hora de entrada (0-23): ");
                                horaEntrada = input.nextInt();
                                if (horaEntrada >= 0 && horaEntrada <= 23) {
                                    nvVeiculos.setHora(horaEntrada);
                                    validoHora = true;
                                } else {
                                    System.out.println("Hora inválida, insira um número entre 0 e 23.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Digite apenas números inteiros.");
                                input.nextLine();
                            }
                        } while (!validoHora);

                        // minuto de entrada
                        boolean validoMinuto = false;
                        do {
                            try {
                                System.out.print("Digite o minuto de entrada (0-59): ");
                                minutoEntrada = input.nextInt();
                                input.nextLine();
                                if (minutoEntrada >= 0 && minutoEntrada <= 59) {
                                    nvVeiculos.setMinuto(minutoEntrada);
                                    validoMinuto = true;
                                } else {
                                    System.out.println("Minuto inválido! Deve estar entre 0 e 59.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Digite apenas números inteiros!");
                                input.nextLine();
                            }
                        } while (!validoMinuto);

                        // buscar vaga compatível
                        int vagaLivre = -1;
                        for (int i = 0; i < vagas.length; i++) {
                            if (vagasOcupadas[i] == null && vagas[i] == nvVeiculos.getTipo()) {
                                vagaLivre = i;
                                break;
                            }
                        }

                        if (vagaLivre != -1) {
                            vagasOcupadas[vagaLivre] = nvVeiculos;
                            System.out.println("Veículo registrado com sucesso na vaga " + (vagaLivre + 1));
                            System.out.println("Código do veículo: " + nvVeiculos.getCodigo());
                        } else {
                            System.out.println("Não há vagas disponíveis para este tipo de veículo.");
                        }

                        // voltar ao menu
                        do {
                            try {
                                System.out.print("Deseja voltar ao menu? (s/n): ");
                                voltar = input.next().charAt(0);
                                if (voltar == 's') menu = true;
                                else if (voltar == 'n') menu = false;
                                else System.out.println("Opção inválida.");
                                erro = false;
                            } catch (InputMismatchException e) {
                                System.out.println("Digite apenas uma letra (s/n).");
                                erro = true;
                            }
                        } while (erro);
                    }

                    case 2 -> {
                        System.out.println("\n--- VEÍCULOS ESTACIONADOS ---");
                        boolean temVeiculo = false;
                        for (int i = 0; i < vagasOcupadas.length; i++) {
                            if (vagasOcupadas[i] != null) {
                                Veiculo v = vagasOcupadas[i];
                                System.out.println("Código: " + v.getCodigo() +
                                        " | Placa: " + v.getPlaca() +
                                        " | Vaga: " + (i + 1));
                                temVeiculo = true;
                            }
                        }

                        if (!temVeiculo) {
                            System.out.println("Nenhum veículo estacionado.");
                            break;
                        }

                        System.out.print("Digite o código do veículo para saída: ");
                        int codigoSaida = input.nextInt();
                        input.nextLine();

                        Veiculo vSaida = null;
                        int indice = -1;
                        for (int i = 0; i < vagasOcupadas.length; i++) {
                            if (vagasOcupadas[i] != null && vagasOcupadas[i].getCodigo() == codigoSaida) {
                                vSaida = vagasOcupadas[i];
                                indice = i;
                                break;
                            }
                        }

                        if (vSaida == null) {
                            System.out.println("Código não encontrado!");
                            break;
                        }

                        int horaSaida = 0, minutoSaida = 0;
                        boolean valido = false;
                        do {
                            try {
                                System.out.print("Hora de saída (0-23): ");
                                horaSaida = input.nextInt();
                                if (horaSaida >= vSaida.getHora() && horaSaida <= 23) valido = true;
                                else System.out.println("Hora de saída inválida.");
                            } catch (InputMismatchException e) {
                                System.out.println("Digite apenas números.");
                                input.nextLine();
                            }
                        } while (!valido);

                        valido = false;
                        do {
                            try {
                                System.out.print("Minuto de saída (0-59): ");
                                minutoSaida = input.nextInt();
                                if (minutoSaida >= 0 && minutoSaida <= 59) valido = true;
                                else System.out.println("Minuto inválido.");
                            } catch (InputMismatchException e) {
                                System.out.println("Digite apenas números.");
                                input.nextLine();
                            }
                        } while (!valido);

                        int minutosEntrada = vSaida.getHora() * 60 + vSaida.getMinutos();
                        int minutosSaida = horaSaida * 60 + minutoSaida;
                        int totalMinutos = minutosSaida - minutosEntrada;

                        if (totalMinutos < 0) {
                            System.out.println("Hora de saída não pode ser menor que a de entrada.");
                            break;
                        }

                        valor = Calculadora.calcularValor(totalMinutos, vSaida.getTipo());
                        System.out.printf("Valor a pagar: R$ %.2f%n", valor);

                        System.out.println("--- Forma de Pagamento ---");
                        System.out.println("1 - Dinheiro\n2 - PIX\n3 - Cartão");
                        int opPag = input.nextInt();
                        input.nextLine();
                        metodo = switch (opPag) {
                            case 1 -> "Dinheiro";
                            case 2 -> "PIX";
                            case 3 -> "Cartão";
                            default -> "Desconhecido";
                        };

                        Pagamento pag = new Pagamento(vSaida.getCodigo(), valor, metodo);
                        historicoPagamentos.add(pag);
                        vagasOcupadas[indice] = null;

                        System.out.println("Uso do veículo finalizado com sucesso!");
                        System.out.println(pag.recibo());
                    }

                    case 3 -> {
                        int livre = 0;
                        int ocupadas = 0;

                        System.out.println("\n=== SITUAÇÃO DAS VAGAS ===");
                        for (int i = 0; i < vagas.length; i++) {
                            String tipoNome = switch (vagas[i]) {
                                case 1 -> "Tipo 1";
                                case 2 -> "Tipo 2";
                                case 3 -> "Tipo 3";
                                default -> "Desconhecido";
                            };

                            if (vagasOcupadas[i] == null) {
                                System.out.println("Vaga " + (i + 1) + " (" + tipoNome + ") - LIVRE");
                                livre++;
                            } else {
                                Veiculo v = vagasOcupadas[i];
                                System.out.println("Vaga " + (i + 1) + " (" + tipoNome + ") - OCUPADA por Placa: " + v.getPlaca());
                                ocupadas++;
                            }
                        }

                        System.out.println("Total de vagas ocupadas: " + ocupadas);
                        System.out.println("Total de vagas livres: " + livre);

                        do {
                            try {
                                System.out.print("Deseja voltar ao menu? (s/n): ");
                                voltar = input.next().charAt(0);
                                if (voltar == 's') menu = true;
                                else if (voltar == 'n') menu = false;
                                else System.out.println("Opção inválida.");
                                erro = false;
                            } catch (InputMismatchException e) {
                                System.out.println("Digite apenas uma letra (s/n).");
                                erro = true;
                            }
                        } while (erro);
                    }

                    case 4 -> {
                        double total = 0;
                        System.out.println("\n=== HISTÓRICO DE PAGAMENTOS ===");
                        if (historicoPagamentos.isEmpty()) {
                            System.out.println("Nenhum pagamento registrado ainda.");
                        } else {
                            for (Pagamento p : historicoPagamentos) {
                                System.out.println("----------------------------------");
                                System.out.println("Código: " + p.getCodigo());
                                System.out.printf("Valor Pago: R$ %.2f%n", p.getValor());
                                System.out.println("Forma de Pagamento: " + p.getMetodo());
                                total += p.getValor();
                            }
                            System.out.println("----------------------------------");
                            System.out.printf("SALDO TOTAL ARRECADADO: R$ %.2f%n", total);
                        }
                    }

                    case 0 -> {
                        System.out.println("Encerrando o programa...");
                        menu = false;
                    }

                    default -> System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite apenas números!");
                input.nextLine();
            }
        } while (menu);
    }
}
