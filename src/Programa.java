import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("# Calculadora");
        Scanner escolha = new Scanner(System.in);

        String continua;
        do {
            System.out.println("Digite quantos valores serão adicionados: ");
            int tamanho = escolha.nextInt();
            escolha.nextLine(); // Consumir a quebra de linha pendente

            double[] lista = new double[tamanho];

            System.out.println("Digite os valores: ");
            for (int i = 0; i < tamanho; i++) {
                lista[i] = escolha.nextDouble();
            }
            System.out.println("Escolha a operação: ");
            String operation = escolha.next();

            double soma = 0.0, sub = 0, div = lista[0], multi = 1, maiorValor = lista[0], menorValor = lista[0];
            switch (operation) {
                case "+":
                    for (int i = 0; i < tamanho; i++) {
                        soma += lista[i];
                    }
                    System.out.println("Resultado: "+soma);
                    break;
                case "-":
                    for (int i = 0; i < tamanho; i++) {
                        sub -= lista[i];
                    }
                    System.out.println("Resultado: "+sub);
                    break;
                case "/":
                    for (int i = 1; i < tamanho; i++) {
                        div /= lista[i];
                    }
                    System.out.println("Resultado: "+div);
                    break;
                case "*":
                    for (int i = 0; i < tamanho; i++) {
                        multi *= lista[i];
                    }
                    System.out.println("Resultado: "+multi);
                    break;
                case "max":
                    for (int i = 1; i < lista.length; i++) {
                        maiorValor = Math.max(maiorValor, lista[i]);
                    }
                    System.out.println("Resultado: "+maiorValor);
                case "min":
                    for (int i = 1; i < lista.length; i++) {
                        menorValor = Math.min(menorValor, lista[i]);
                    }
                    System.out.println("Resultado: "+menorValor);
            }
            System.out.println("Deseja fazer mais alguma operação?");
            escolha.nextLine(); // Consumir a quebra de linha pendente
            continua = escolha.nextLine();
        } while (continua.equals("s") || continua.equals("sim"));
    }
}
