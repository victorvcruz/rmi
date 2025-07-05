package server;

import shared.Calculadora;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Calculadora calculadora = new CalculadoraImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("CalculadoraService", calculadora);
            System.out.println("Servidor pronto na porta 1099...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
