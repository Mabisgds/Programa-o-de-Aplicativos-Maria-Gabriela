
package atividade09_mariag;

import java.util.*;

public class Atividade09_mariag {

    public static void main(String[] args) {
/*      Scanner e = new Scanner(System.in);
        AgendaEletronica agenda = new AgendaEletronica();
        char op;

        do {
            System.out.println("\n=== AGENDA ELETRÔNICA ===");
            System.out.println("1 - Cadastrar novo contato");
            System.out.println("2 - Consultar agenda");
            System.out.println("3 - Editar contato");
            System.out.println("4 - Excluir contato");
            System.out.println("5 - Sair");
            System.out.print("Selecione uma opção: ");
            op = e.next().charAt(0);
            e.nextLine();

            switch (op) {
                case '1' -> {
                    String nome, gmail;
                    int telefone;

                    do {
                        System.out.print("Nome: ");
                        nome = e.nextLine();
                        if (nome.isBlank()) System.out.println("O nome não pode estar em branco.");
                    } while (nome.isBlank());

                    while (true) {
                        try {
                            System.out.print("Telefone: ");
                            telefone = e.nextInt();
                            e.nextLine();
                            if (agenda.verificarTell(telefone)) {
                                System.out.println("Já existe um contato com esse número!");
                            } else {
                                break;
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Telefone inválido. Digite apenas números.");
                            e.nextLine();
                        }
                    }

                    do {
                        System.out.print("E-mail: ");
                        gmail = e.nextLine();
                        if (!gmail.endsWith("@gmail.com")) {
                            System.out.println("O e-mail deve terminar com '@gmail.com'");
                        }
                    } while (!gmail.endsWith("@gmail.com"));

                    agenda.cadastrar(nome, telefone, gmail);
                    System.out.println("Contato cadastrado com sucesso!");
                }

                case '2' -> agenda.listar();

                case '3' -> {
                    System.out.print("Informe o nome do contato que deseja editar: ");
                    String nome = e.nextLine();
                    agenda.editar(nome, e);
                }

                case '4' -> {
                    System.out.print("Informe o nome do contato que deseja excluir: ");
                    String nome = e.nextLine();
                    agenda.excluir(nome, e);
                }

                case '5' -> System.out.println("Saindo...");

                default -> System.out.println("Opção inválida!");
            }

        } while (op != '5');
    
*/



          Scanner sc = new Scanner(System.in);
        Biblioteca bib = new Biblioteca();
        char op;

        do {
            System.out.println("\n=== BIBLIOTECA ===");
            System.out.println("1 - Consultar acervo");
            System.out.println("2 - Pegar livro emprestado");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            op = sc.next().charAt(0);
            sc.nextLine();

            switch (op) {
                case '1' -> bib.consultarAcervo();
                case '2' -> bib.pegarEmprestado(sc);
                case '3' -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (op != '3');
    }
}