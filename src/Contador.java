import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        
        int paramUm;
        int paramDois;

        System.out.println("Informe o primeiro parâmetro:");
        paramUm = terminal.nextInt();

        System.out.println("Informe o segundo parâmetro:");
        paramDois = terminal.nextInt();

        try {
            contar(paramUm, paramDois);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }

        terminal.close();
    }

    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException {
        if (paramDois < paramUm)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem  = paramDois - paramUm;

        for (int i = 1; i <= contagem ; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
