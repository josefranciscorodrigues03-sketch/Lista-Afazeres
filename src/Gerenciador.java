import java.io.*;
import java.util.ArrayList;

public class Gerenciador {

    ArrayList<Tarefas> lista = new ArrayList<>();
    public void adicionar(String novaTarefa) {
        if (!novaTarefa.isBlank()) {
            lista.add(new Tarefas(novaTarefa));
            System.out.println("Nova tarefa adicionada com sucesso\n" + lista);
        } else {
            System.out.println("Você não escreveu a tarefa");
        }
    }
    public void remover(int local) {
        if (local >= 0 && local < lista.size()) {
            lista.remove(local);
            System.out.println("lista atual " + lista);
        } else {
            System.out.println("Posição invalida");
        }
    }
    public void visualizar() {
        lista.forEach(System.out::println);
    }
    public void concluirTarefa(int local){
        if (local >= 0 && local < lista.size()) {
            lista.get(local).concluir();
            System.out.println(lista.get(local));
        } else {
            System.out.println("escolha invalida");
        }
    }
    public void salvarEmArquivo(){
        String nomeArquivo = "tarefas.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Tarefas t : lista) {
                writer.write(t.getDescricao() + ";" + t.isConcluida());
                writer.newLine();
                System.out.println("Dados salvos com sucesso!");
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
    public void carregarDeArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("tarefas.txt"))) {
            String linha;


            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                String descricao = partes[0];
                boolean concluida = Boolean.parseBoolean(partes[1]);
                Tarefas tarefa = new Tarefas(descricao);
                if (concluida) {
                    tarefa.concluir();
                }
                lista.add(tarefa);
            }
            System.out.println("Tarefas carregadas!");
        } catch (IOException e) {
            System.out.println("Nenhum arquivo encontrado. Lista iniciada vazia.");
        }
    }
}
