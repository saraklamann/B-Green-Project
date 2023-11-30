
public class Validacao {

    public static boolean validarOpcao(int opcao) {
        boolean opcaoValida=false;
        if (opcao >= 0 && opcao <=6) {
            opcaoValida = true;
        }
        return opcaoValida;
    }

}
