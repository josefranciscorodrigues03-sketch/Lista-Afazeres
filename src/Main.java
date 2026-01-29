
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Gerenciador gerenciador = new Gerenciador();
        gerenciador.carregarDeArquivo();
        while (true) {
            System.out.println("Bem vindo a lista de tarefas, digite o numero da sua opção:\n1 - adicionar tarefa\n2 - remover tarefa\n3 - visualizar tarefas\n4 - Marcar como concluida\n5 - sair");
            try {
                var escolha = scanner.nextInt();
                scanner.nextLine();
                if (escolha == 1) {
                    System.out.println("Digite a tarefa a ser adicionada: ");
                    var novaTarefa = scanner.nextLine();
                    gerenciador.adicionar(novaTarefa);
                } else if (escolha == 2) {
                    System.out.println("Digite a posição da sua tarefa na lista");
                    gerenciador.visualizar();
                    var local = scanner.nextInt() - 1;
                    gerenciador.remover(local);
                } else if (escolha == 3) {
                    gerenciador.visualizar();
                } else if (escolha == 4) {
                    System.out.println("Digite a posição da sua tarefa na lista");
                    gerenciador.visualizar();
                    var local = scanner.nextInt() - 1;
                    gerenciador.concluirTarefa(local);
                } else if (escolha == 5) {
                    gerenciador.salvarEmArquivo();
                    System.out.println("Saindo...");
                    break;
                } else {
                    System.out.println("escolha uma opção");
                }
            } catch (Exception e) {
                System.out.println("Erro: Por favor, digite apenas números!");
                scanner.nextLine();

            }
        }
    }
}