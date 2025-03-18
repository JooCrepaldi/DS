package ATVDS01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op;

        Scanner read = new Scanner(System.in);

        System.out.println("1 - criar um produto:");
        System.out.println("2 - alterar dados do produto:");
        System.out.println("3 - excluir um produto:");
        System.out.println("4 - listar todos os produtos:");
        System.out.println("0 - sair.");

        System.out.println("escolha uma opções acima:");
        op = read.nextInt();
        read.nextLine();//para resolver o bug do buffer

        int max = 5;
        int i = 0;
        int p = 0;

        Produto[] listaProduto = new Produto[max];
        
        do{
            switch(op){
                case 1:{
                System.out.println("criando um produto:");
                
                    for(i=0; i<max; i++){
                        System.out.println("digite o nome do produto:");
                        produto[i].setNome(read.next());
                        System.out.println("digite o preço do produto:");
                        produto[i].setPreco(read.nextFloat());
                        System.out.println("digite o código");
                        produto[i].setCodigo(read.nextInt());
                        System.out.println("digite a quantidade");
                        produto[i].setQuantidade(read.nextInt());
                        System.out.println("digite a cor do poduto:");
                        produto[i].setCor(read.next());
                        break;
                    }
                }
                break;

                case 2:{
                    System.out.println("digite qual qual produto quer alterar:");
                    p = read.nextInt();

                    if(listaProduto[p] == null){
                        System.out.println("não existe produto!");
                    }

                    switch (listaProduto) {
                        case 1:
                            
                            break;
                    
                        default:
                            break;
                    }
                }
                break;

                case 3:{
                    System.out.println("digite o produto que quer excluir:");
                    i = read.nextInt();
                    if(listaProduto[i] != null){
                        listaProduto[i] = null;
                    }
                }
                break;

                case 4:{
                    for(i=0; i<max; i++){
                        System.out.println("Nome: " + produto[i].getNome());
                        System.out.println("Preço: " + produto[i].getPreco());
                        System.out.println("Código: " + produto[i].getCodigo());
                        System.out.println("Quantidade: " + produto[i].getQuantidade());
                    }
                }
                break;

                default:
            }
        }while(op != 0);

        System.out.println("saindo...");
    }
}
