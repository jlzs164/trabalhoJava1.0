void main() {

    Scanner entrada = new Scanner(System.in);

    IO.println("Digite uma mensagem:");
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
            IO.println("Pontos de suspeita: " + pontos);
        }
    }

    if (pontos >= 4) {
        IO.println("Sinais suspeitos encontrados.");
    } else if (pontos >= 2) {
        IO.println("Baixa suspeita.");
    } else {
        IO.println("Mínima suspeita.");
    }
}