package client;

import shared.Calculadora;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String url = "rmi://1099/CalculadoraService";
            Calculadora calc = (Calculadora) Naming.lookup(url);
            System.out.println("Conectado ao servidor.");

            while (true) {
                System.out.print("Digite a operação (soma, subtrai, multiplica, divide) ou 'sair': ");
                String operacao = scanner.nextLine();
                if ("sair".equalsIgnoreCase(operacao)) break;

                System.out.print("Digite o primeiro número: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.print("Digite o segundo número: ");
                double b = Double.parseDouble(scanner.nextLine());

                double resultado;
                switch (operacao.toLowerCase()) {
                    case "soma": resultado = calc.somar(a, b); break;
                    case "subtrai": resultado = calc.subtrair(a, b); break;
                    case "multiplica": resultado = calc.multiplicar(a, b); break;
                    case "divide": resultado = calc.dividir(a, b); break;
                    default:
                        System.out.println("Operação inválida!");
                        continue;
                }
                System.out.println("Resultado: " + resultado);
            }

            System.out.println("Cliente encerrado.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
