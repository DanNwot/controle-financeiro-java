import java.util.*;
import java.util.Locale;

class Transacao {
    String tipo;
    double valor;

    Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
}

class ControleFinanceiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // 👈 permite usar ponto decimal

        List<Transacao> lista = new ArrayList<>();
        double saldo = 0;

        while (true) {
            System.out.println("\n1- Receita  2- Despesa  3- Saldo  4- Sair");
            int op = sc.nextInt();

            if (op == 4) break;

            if (op == 1 || op == 2) {
                System.out.print("Valor: ");
                double valor = sc.nextDouble();

                if (op == 1) {
                    saldo += valor;
                    lista.add(new Transacao("Receita", valor));
                } else {
                    saldo -= valor;
                    lista.add(new Transacao("Despesa", valor));
                }
            }

            if (op == 3) {
                System.out.println("Saldo atual: " + saldo);
            }
        }
    }
}
