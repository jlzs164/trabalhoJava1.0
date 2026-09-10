import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new
                Scanner(System.in);

        System.out.println("Digite uma mensagem:");
        String mensagem = entrada.nextLine().toLowerCase();

        int pontos = 0;

        String[] palavrasSuspeitas = {
                "acesse o link",
                "clique aqui",
                "conta será bloqueada",
                "confirme seus dados",
                "você ganhou",
                "receba seu prêmio",
                "confirme sua senha"
        };

        int[] pontosPalavras = {
                1,
                1,
                2,
                2,
                3,
                4,
                5
        };

        for (int i = 0; i < palavrasSuspeitas.length; i++) {
            if (mensagem.contains(palavrasSuspeitas[i])) {
                pontos += pontosPalavras[i];
                System.out.println("Pontos de suspeita: " + pontos);
            }
        }

        if (pontos >= 4) {
            System.out.println("Sinais suspeitos encontrados.");
        } else if (pontos >= 2) {
            System.out.println("Baixa suspeita.");
        } else {
            System.out.println("Mínima suspeita.");
        }
    }
}