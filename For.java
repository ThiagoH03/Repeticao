import java.util.Scanner;

public class For {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Até quanto deseja contar?");
        int contador = input.nextInt();

        for(int i = 0; i < contador; i++){
            System.out.println("Número atual: " + i);
        }
    }
}
