import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int idade = input.nextInt();

        do{
            System.out.println("Você não tem permissão para entrar");
            idade++;
        } while (idade <18);
    }
}
