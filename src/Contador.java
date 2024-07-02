import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite outro número: ");
        int parametroDois = terminal.nextInt();

        terminal.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (SecondNumberIsLessException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws SecondNumberIsLessException {
        if (parametroDois < parametroUm) {
            throw new SecondNumberIsLessException();
        }

        int contador = parametroDois - parametroUm;

        for (int i = 1; i <= contador; i++) {
            System.out.println(i);
        }
    }
}
