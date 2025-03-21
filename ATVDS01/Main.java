package ATVDS01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int max = 3;
        int i = 0;
        int index = 0;
        int op;

        System.out.println("1 - criar um produto:");
        System.out.println("2 - alterar dados do produto:");
        System.out.println("3 - excluir um produto:");
        System.out.println("4 - listar todos os produtos:");
        System.out.println("0 - sair.");

        Produto[] listaProduto = new Produto[max];// aloca o espaço da memória mas objetos Produto ainda não existem

        do {
            System.out.println("escolha uma opções acima:");
            op = read.nextInt();
            read.nextLine();

            switch (op) {
                case 1: {
                    if (index < max) {
                        System.out.println("---criando um produto---:");

                        System.out.println("digite o nome do produto:");
                        String nome = read.nextLine();

                        System.out.print("Digite o preço do produto: ");
                        float preco = read.nextFloat();

                        System.out.println("digite o código do produto:");
                        int codigo = read.nextInt();

                        System.out.print("Digite a quantidade: ");
                        int quantidade = read.nextInt();

                        System.out.print("Digite a cor do produto: ");
                        read.nextLine(); // limpando o buffer
                        String cor = read.nextLine();

                        listaProduto[index] = new Produto(nome, preco, codigo, quantidade, cor);// não entendi direito isso aqui
                        System.out.println("produto adicionado com sucesso!!");
                        index++;
                    }
                    else{
                        System.out.println("a lista de produtos está cheia!");
                    }
                }
                    break;

                case 2: {//alteração de dados

                }
                    break;

                case 3: {
                    System.out.println("digite o produto que quer excluir:");
                    i = read.nextInt();
                    if (listaProduto[i] != null) {
                        listaProduto[i] = null;
                    }
                    else{
                        System.out.println("esse produto não existe.");
                    }
                }
                    break;

                case 4: {
                    for (i = 0; i < max; i++) {
                        System.out.println("---produto:" + i + "---");
                        System.out.print("Nome: " + listaProduto[i].getNome());
                        System.out.print(" Preço: " + listaProduto[i].getPreco());
                        System.out.print(" Código: " + listaProduto[i].getCodigo());
                        System.out.println(" Quantidade: " + listaProduto[i].getQuantidade());
                    }
                }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);

        read.close();

        System.out.println("saindo...");
    }
}