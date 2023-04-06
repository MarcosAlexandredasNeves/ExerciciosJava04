import java.util.Scanner;

public class EX04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual o nome do vendedor? ");
        String nome = scanner.nextLine();
        //scanner.nextLine();
        System.out.println("Qual o salário fixo do vendedor?");
        int salario = scanner.nextInt();
        System.out.println("Quantas vendas " + nome + " fez no mês?");
        int venda = scanner.nextInt();
        double comissao = (15 * venda) / 100;
        System.out.println("O vendedor " +nome+ " o qual recebe R$" +salario+ " por mês vai ganhar de comissão R$" + comissao + " de comissão, fazendo um total de saláripo de R$" + (salario + comissao));





    }
}
