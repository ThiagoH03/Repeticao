import java.util.Scanner;

public class While{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int idade = input.nextInt();

        while(idade < 18){
            System.out.println("Você é menor de idade");
            idade++;
        }
    }
}