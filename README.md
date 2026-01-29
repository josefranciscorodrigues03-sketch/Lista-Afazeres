# To-Do List em Java (Console)

Projeto de **Lista de Tarefas** desenvolvido em **Java**, com foco em **Programação Orientada a Objetos**, organização de código e persistência de dados.

O objetivo do projeto é demonstrar domínio dos **fundamentos sólidos da linguagem Java**, indo além de exemplos básicos.

---

## 🧠 Conceitos de Java Aplicados

Este projeto utiliza e demonstra, na prática:

- Programação Orientada a Objetos (POO)
  - Criação de classes e objetos
  - Encapsulamento (`private`, métodos de acesso)
  - Responsabilidade única por classe
- Uso de coleções (`ArrayList`)
- Controle de fluxo (`if`, `while`, `for-each`)
- Manipulação de entrada do usuário (`Scanner`)
- Leitura e escrita de arquivos (`BufferedReader`, `BufferedWriter`)
- Tratamento de exceções (`try-catch`, `IOException`)
- Sobrescrita de métodos (`@Override`, `toString`)
- Organização lógica entre camadas do projeto

---

## 📂 Estrutura do Projeto

- `Main`
  - Responsável pela interação com o usuário (menu)
  - Atua como controlador da aplicação

- `Gerenciador`
  - Gerencia a lista de tarefas
  - Contém as regras de negócio
  - Responsável por salvar e carregar dados do arquivo

- `Tarefas`
  - Representa o modelo de uma tarefa
  - Controla seu próprio estado (concluída ou não)

Essa separação segue boas práticas de organização e legibilidade do código.

---

## ⚙️ Funcionalidades

- Adicionar novas tarefas
- Remover tarefas existentes
- Visualizar todas as tarefas
- Marcar tarefas como concluídas
- Persistência de dados em arquivo `.txt`
  - As tarefas são salvas ao sair do programa
  - As tarefas são carregadas automaticamente ao iniciar

---

## 💾 Persistência de Dados

As tarefas são armazenadas em um arquivo de texto no formato:
