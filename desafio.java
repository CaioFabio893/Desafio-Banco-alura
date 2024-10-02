import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldo = 2500.0;
        System.out.println("*****************************");
        System.out.println("Dados iniciais do cliente");
        System.out.println();
        System.out.println("Nome:             Caio Fábio");
        System.out.println("Tipo de conta:    Corrente");
        System.out.println("Saldo inicial     R$ 2500,00");
        System.out.println();
        System.out.println("*****************************");

        while (true) {
            while (true) {
                System.out.println();
                System.out.println("Operações");
                System.out.println();
                System.out.println("1 - consultar saldo");
                System.out.println("2 - receber valor");
                System.out.println("3 - Transferir valor");
                System.out.println("4 - Sair");
                System.out.println();
                System.out.println("Digite a opção dejesada:");
                double op = leitura.nextDouble();
                if (op == 1.0) {
                    System.out.println("Seu saldo atual é: " + saldo + " reais.");
                } else {
                    double valorTransferido;
                    if (op == 2.0) {
                        System.out.println("informe o valor recebido:");
                        valorTransferido = leitura.nextDouble();
                        saldo += valorTransferido;
                        System.out.println("Você recebeu: " + valorTransferido + " reais. Seu novo saldo é: " + saldo + " reias.");
                    } else if (op == 3.0) {
                        System.out.println("informe o valor que foi transferido:");
                        valorTransferido = leitura.nextDouble();
                        if (valorTransferido <= saldo) {
                            saldo -= valorTransferido;
                            System.out.println("Você transferiu: " + valorTransferido + " reais. Seu novo saldo é: " + saldo + " reais");
                        } else {
                            System.out.println("valor insuficiente!");
                        }
                    } else {
                        if (op == 4.0) {
                            System.out.println("Operção finalizada!");
                            return;
                        }

                        System.out.println("Operação invalida, tente novamente!");
                    }
                }
            }
        }
    }
}

