package Atividades;

import java.util.Random;

public class Tabuleiro {
    public static void main(String[] args) {
        int posicao = 0;
        int posicao1 = 0;

        boolean fim = false;

        do {
            Random random = new Random();

            int dado1 = random.nextInt(6) + 1;
            System.out.println("O valor do dado do primeiro jogador é: " + dado1);
            posicao += dado1;
            System.out.println("A sua posição é " + posicao);


            switch (posicao) {

                case 1:
                    System.out.println("Você está na posição 1.\n");
                    break;

                case 2:
                    System.out.println("Você está na posição 2.\n");
                    break;

                case 3:
                    System.out.println("Ande 3 casas.\n");
                    posicao += 3;
                    break;

                case 4:
                    System.out.println("Você está na posição 4.\n");
                    break;

                case 5:
                    System.out.println("Volte uma casa.\n");
                    posicao -= 1;
                    break;

                case 6:
                    System.out.println("Você está na posição 6.\n");
                    break;

                case 7:
                    System.out.println("Ande 6 casas.\n");
                    posicao += 6;
                    break;

                case 8:
                    System.out.println("Você voltou no tempo. Volte 2 casas.\n");
                    posicao -= 2;
                    break;

                case 9:
                    System.out.println("Você ficou muito grande e pode atravessar as casas mais rapidamente. Ande 4 casas.\n");
                    posicao += 4;
                    break;

                case 10:
                    System.out.println("Você encolheu. Volte 4 casas.\n");
                    posicao -= 4;
                    break;

                case 11:
                    System.out.println("Ande 2 casas.\n");
                    posicao += 2;
                    break;

                case 12:
                    System.out.println("Volte 6 casas.\n");
                    posicao -= 6;
                    break;

                case 13:
                    System.out.println("Você está na posição 13.\n");
                    break;

                case 14:
                    System.out.println("O Gato Risonho acha que você deve ter a chance de percorrer o seu caminho mais rapidamente. Ande 5 casas.\n");
                    posicao += 5;
                    break;

                case 15:
                    System.out.println("Volte duas casa.\n");
                    posicao -= 2;
                    break;

                case 16:
                    System.out.println("Você está na posição 16.\n");
                    break;

                case 17:
                    System.out.println("Você achou o portal para o país das maravilhas. Ande 7 casas.\n");
                    posicao += 7;
                    break;

                case 18:
                    System.out.println("Volte 5 casas.\n");
                    posicao -= 5;
                    break;

                case 19:
                    System.out.println("Você está na posição 19.\n");
                    break;

                case 20:
                    System.out.println("O chapeleiro conhece um atalho maluco. Vá para a casa 24.\n");
                    posicao += 4;
                    break;

                case 21:
                    System.out.println("A Rainha de Copas ordenou que você fosse preso. Volte 8 casas.\n");
                    posicao -= 8;
                    break;

                case 22:
                    System.out.println("Você está na posição 22.\n");
                    break;

                case 23:
                    System.out.println("Ande 1 casa.\n");
                    posicao += 1;
                    break;

                case 24:
                    System.out.println("Você está na posição 24.\n");
                    break;

                case 25:
                    System.out.println("O coelho acha que você está atrasado. Se apresse e ande 2 casas.\n");
                    posicao += 2;
                    break;

                case 26:
                    System.out.println("Você terá que se atrasar para a linha de chegada, pois é hora do chá. Volte duas casas.\n");
                    posicao -= 2;
                    break;

                case 27:
                    System.out.println("Você está na posição 27.\n");
                    break;

                case 28:
                    System.out.println(" Ande 2 casas.\n");
                    posicao += 2;
                    break;

                case 29:
                    System.out.println(" Volte 5 casas.\n");
                    posicao -= 5;
                    break;

                case 30:
                    System.out.println("Você está na posição 30.\n");
                    break;

                case 31:
                    System.out.println("O guardião Absolem disse que você deve voltar 7 casas, em busca de melhores resultados.\n");
                    posicao -= 7;
                    break;
            }

            int dado2 = random.nextInt(6) + 1;
            System.out.println("O valor do dado do segundo jogador é: " + dado2);
            posicao1 += dado2;
            System.out.println("A sua posição é " + posicao1);


            switch (posicao1) {

                case 1:
                    System.out.println(" Você está na posição 1.\n");
                    break;

                case 2:
                    System.out.println(" Você está na posição 2.\n");
                    break;

                case 3:
                    System.out.println(" Ande 3 casas.\n");
                    posicao1 += 3;
                    break;

                case 4:
                    System.out.println(" Você está na posição 4.\n");
                    break;

                case 5:
                    System.out.println(" Volte uma casa.\n");
                    posicao1 -= 1;
                    break;

                case 6:
                    System.out.println(" Você está na posição 6.\n");
                    break;

                case 7:
                    System.out.println(" Ande 6 casas.\n");
                    posicao1 += 6;
                    break;

                case 8:
                    System.out.println(" Você voltou no tempo. Volte 2 casas.\n");
                    posicao1 -= 2;
                    break;

                case 9:
                    System.out.println(" Você ficou muito grande e pode atravessar as casas mais rapidamente. Ande 4 casas.\n");
                    posicao1 += 4;
                   break;

                case 10:
                    System.out.println(" Você encolheu. Volte 4 casas.\n");
                    posicao1 -= 4;
                    break;

                case 11:
                    System.out.println("Ande 2 casas.\n");
                    posicao1 += 2;
                    break;

                case 12:
                    System.out.println("Volte 6 casas.\n");
                    posicao1 -= 6;
                    break;

                case 13:
                    System.out.println("Você está na posição 13.\n");
                    break;

                case 14:
                    System.out.println("O Gato Risonho acha que você deve ter a chance de percorrer o seu caminho mais rapidamente. Ande 5 casas.\n");
                    posicao1 += 5;
                    break;

                case 15:
                    System.out.println("Volte duas casa.\n");
                    posicao1 -= 2;
                    break;

                case 16:
                    System.out.println("Você está na posição 16.\n");
                    break;

                case 17:
                    System.out.println("Você achou o portal para o país das maravilhas. Ande 7 casas.\n");
                    posicao1 += 7;
                    break;

                case 18:
                    System.out.println("Volte 5 casas.\n");
                    posicao1 -= 5;
                    break;

                case 19:
                    System.out.println("Você está na posição 19.\n");
                    break;

                case 20:
                    System.out.println("O chapeleiro conhece um atalho maluco. Vá para a casa 24.\n");
                    posicao1 += 4;
                    break;

                case 21:
                    System.out.println("A Rainha de Copas ordenou que você fosse preso. Volte 8 casas.\n");
                    posicao1 -= 8;
                    break;

                case 22:
                    System.out.println("Você está na posição 22.\n");
                    break;

                case 23:
                    System.out.println("Ande 1 casa.\n");
                    posicao1 += 1;
                    break;

                case 24:
                    System.out.println("Você está na posição 24.\n");
                    break;

                case 25:
                    System.out.println("O coelho acha que você está atrasado. Se apresse e ande 2 casas.\n");
                    posicao1 += 2;
                    break;

                case 26:
                    System.out.println("Você terá que se atrasar para a linha de chegada, pois é hora do chá. Volte duas casas.\n");
                    posicao1 -= 2;
                    break;

                case 27:
                    System.out.println("Você está na posição 27.\n");
                    break;

                case 28:
                    System.out.println(" Ande 2 casas.\n");
                    posicao1 += 2;
                    break;

                case 29:
                    System.out.println(" Volte 5 casas.\n");
                    posicao1 -= 5;
                    break;

                case 30:
                    System.out.println("Você está na posição 30.\n");
                    break;

                case 31:
                    System.out.println("O guardião Absolem disse que você deve voltar 7 casas, em busca de melhores resultados.\n");
                    posicao1 -= 7;
                    break;

            }

            if (posicao >= 32) {
                System.out.println("Parabens jogador 1!!! Você é o vencedor!!!\n");
                fim = true;
            } else if (posicao1 >= 32) {
                System.out.println("Parabéns jogador 2!!! Você é o vencedor!!!\n");
                fim = true;
            }
        }

        while (!fim);
    }
}

