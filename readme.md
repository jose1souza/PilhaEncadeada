# pilhajava2025

Este projeto implementa uma estrutura de dados do tipo **Pilha Genérica (Stack)** em Java, permitindo armazenar e manipular elementos de qualquer tipo com operações básicas de pilha.

## 📚 Descrição

A classe `Pilha<T>` permite criar uma pilha de elementos genéricos, com capacidade definida pelo usuário no momento da criação. A estrutura é baseada em um array interno e suporta as principais operações de uma pilha:

- `push(T dado)`: empilha um elemento.
- `pop()`: desempilha o elemento do topo.
- `peek()`: retorna o elemento no topo sem removê-lo.
- `isEmpty()`: verifica se a pilha está vazia.
- `isFull()`: verifica se a pilha está cheia.
- `toString()`: exibe o conteúdo da pilha do topo até a base.

## 🚀 Como usar

### Instanciação

```java
Pilha<Integer> pilha = new Pilha<>(5);
