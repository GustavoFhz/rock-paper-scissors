# Rock Paper Scissors

Este é um jogo simples de Pedra, Papel e Tesoura implementado em Java. O jogador escolhe uma das opções e o computador faz uma escolha aleatória. O resultado é determinado de acordo com as regras clássicas do jogo.

## Regras do Jogo
1. O jogador escolhe entre "rock" (pedra), "paper" (papel) ou "scissors" (tesoura).
2. O computador gera uma escolha aleatória.
3. As escolhas são comparadas:
   - Pedra vence tesoura.
   - Tesoura vence papel.
   - Papel vence pedra.
   - Se ambos escolherem a mesma opção, é um empate.

## Como Executar o Projeto

1. Certifique-se de ter o Java instalado em seu sistema.
2. Baixe ou clone este repositório.
3. Compile o arquivo `RockPaperScissors.java`:
   ```sh
   javac RockPaperScissors.java
   ```
4. Execute o programa:
   ```sh
   java RockPaperScissors
   ```
5. Siga as instruções exibidas no terminal para jogar.

## Estrutura do Código
O código é composto por:
- O método `main()`, que gerencia a interação do jogador.
- O método `computerChoice()`, que gera uma escolha aleatória para o computador.
- O método `result()`, que determina o vencedor do jogo.
- O método `printResult()`, que imprime o resultado da partida.

## Exemplo de Saída
```sh
Let's play Rock Paper Scissors.
When I say 'shoot', Choose: rock, paper, or scissors.

Are you ready? Write 'yes' if you are.
> yes
Great!
rock - paper - scissors, shoot!
> rock
You chose: rock
The computer chose: scissors
You win!
```

## Melhorias Futuras
- Adicionar validação para entradas inválidas do jogador.
- Implementar um placar para contar vitórias e derrotas.
- Criar uma interface gráfica para o jogo.
- Permitir que o jogador escolha o número de rodadas.

## Licença
Este projeto é de uso livre para estudos e melhorias.

