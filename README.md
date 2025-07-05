# RMI Calculator Project

This project is a simple Java Remote Method Invocation (RMI) application that demonstrates how to create a distributed calculator service. The calculator allows clients to perform basic arithmetic operations (addition, subtraction, multiplication, and division) remotely via RMI.

## Project Structure

```
src/
├── client/
│   └── Client.java
├── server/
│   ├── CalculadoraImpl.java
│   └── Server.java
└── shared/
    └── Calculadora.java
```

- **shared/Calculadora.java**: Defines the remote interface for the calculator, specifying the available operations.
- **server/CalculadoraImpl.java**: Implements the `Calculadora` interface, providing the logic for each operation.
- **server/Server.java**: Starts the RMI registry and binds the calculator implementation to a name.
- **client/Client.java**: Connects to the remote calculator service and allows the user to perform operations via the command line.

## Requirements

- Java 21 (see `.tool-versions` for details)
- No external dependencies

## How to Run

### 1. Compile the Project

Navigate to the project root and compile all Java files:

```sh
javac -d out src/shared/Calculadora.java src/server/CalculadoraImpl.java src/server/Server.java src/client/Client.java
```

### 2. Start the Server

Run the server in one terminal:

```sh
java -cp out server.Server
```

You should see:  
`Servidor pronto na porta 1099...`

### 3. Start the Client

In another terminal, run the client:

```sh
java -cp out client.Client
```

You should see:  
`Conectado ao servidor.`

### 4. Usage

- Enter the operation (`soma`, `subtrai`, `multiplica`, `divide`) or `sair` to exit.
- Enter the two numbers when prompted.
- The result will be displayed.

Example:
```
Digite a operação (soma, subtrai, multiplica, divide) ou 'sair': soma
Digite o primeiro número: 5
Digite o segundo número: 3
Resultado: 8.0
```

## Notes

- The server listens on port 1099.
- Division by zero will throw an exception.
- The client and server must be able to communicate over the network (localhost by default).

## License

This project is for educational purposes.