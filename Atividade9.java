import java.util.Scanner;

public class Atividade9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os graus em °F: ");
        double f = sc.nextDouble();

        double c = (f - 32)/1.8;
        System.out.println("O valor de " + f + "°F equivale à " + c +" °C.");
        
        sc.close();

    }
    
}

