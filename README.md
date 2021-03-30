## Core Java Lang

### Loops infinitos em Java

# 1. Visão Geral
Neste tutorial rápido, exploraremos maneiras de criar um loop infinito em Java.

Simplificando, um loop infinito é uma sequência de instruções que executa um loop infinito quando uma condição de término não é atendida. Criar um loop infinito pode ser um erro de programação, mas também pode ser intencional com base no comportamento do aplicativo.

# 2. Usando enquanto
Vamos começar com o loop while. Aqui, usaremos o literal booleano true para escrever a condição do loop while:

```
public void infiniteLoopUsingWhile() {
    while (true) {
        // do something
    }
}
```

# 3. Usando para
Agora, vamos usar o loop for para criar um loop infinito:

```
public void infiniteLoopUsingFor() {
    for (;;) {
        // do something
    }
}
```

# 4. Usando do-while
Um loop infinito também pode ser criado usando o loop do-while menos comum em Java. Aqui, a condição de loop é avaliada após a primeira execução:

```
public void infiniteLoopUsingDoWhile() {
    do {
        // do something
    } while (true);
}
```

# 5. Conclusão
Embora, na maioria dos casos, vamos evitar a criação de loops infinitos, mas pode haver alguns casos em que precisaremos criar um. Em tais cenários, o loop será encerrado quando o aplicativo for encerrado.