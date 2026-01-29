public class Tarefas {
    private String descricao;
    private boolean concluida;

    // Construtor: define como a tarefa nasce
    public Tarefas(String descricao) {
        this.descricao = descricao;
        this.concluida = false; // Por padrão, começa não feita
    }

    // Métodos para acessar e modificar os dados (Encapsulamento)
    public String getDescricao() {
        return descricao;
    }
    public boolean isConcluida() {
        return concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    // Define como a tarefa aparece quando dermos um System.out.println
    @Override
    public String toString() {
        return (concluida ? "[Concluída] " : "[Pendente] ") + descricao;
    }
}
