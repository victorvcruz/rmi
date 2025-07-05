package server;

import shared.Calculadora;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {
    public CalculadoraImpl() throws RemoteException {
        super();
    }

    public double somar(double a, double b) {
        System.out.println("Cliente solicitou soma: " + a + " + " + b);
        return a + b;
    }

    public double subtrair(double a, double b) {
        System.out.println("Cliente solicitou subtração: " + a + " - " + b);
        return a - b;
    }

    public double multiplicar(double a, double b) {
        System.out.println("Cliente solicitou multiplicação: " + a + " * " + b);
        return a * b;
    }

    public double dividir(double a, double b) {
        System.out.println("Cliente solicitou divisão: " + a + " / " + b);
        if (b == 0) throw new ArithmeticException("Divisão por zero");
        return a / b;
    }
}
