
public class Validacao {

    public static boolean validarOpcao(int opcao) {
        boolean opcaoValida=false;
        if (opcao >= 0 && opcao <=6) {
            opcaoValida = true;
        }
        return opcaoValida;
    }

    public static boolean validarResposta(String resposta) {
        boolean respostaValida=false;
        if (resposta.equals("sim") || resposta.equals("nao") || resposta.equals("não")) {
            respostaValida = true;
        }
        return respostaValida;
    }

}
