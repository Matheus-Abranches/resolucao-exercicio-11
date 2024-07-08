import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operations operations = new Operations();
        operations.setName("Matheus Abranches");

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o resultado da sua Nota1 (0/10):");
        int nota1 = scanner.nextInt();
        System.out.println("digite o resultado da sua Nota2 (0/10):");
        int nota2 = scanner.nextInt();
        System.out.println("digite o resultado da sua Nota3 (0/10):");
        int nota3 = scanner.nextInt();

        int soma123 = operations.sum(nota1, nota2, nota3);
        int media = operations.divi(soma123, 3);

        if (media >= 7){
            System.out.println(operations.getName() + " Sua nota final foi " + media + " você foi aprovado, parabéns!");
        }if (media < 7){
            System.out.println(operations.getName() + " Sua nota final foi " + media + " Você foi reprovado, estude mais da próxima vez");
        }

    }

}