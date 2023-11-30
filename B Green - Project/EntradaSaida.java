import java.util.Scanner;

public class EntradaSaida {

    public static void mostrarMenu() {
        System.out.println("________________________________________\n");
        System.out.println("           B GREEN PROJECT ");
        System.out.println("________________________________________");
        System.out.println("1 - Cadastrar voluntário ");
        System.out.println("2 - Cadastrar empresa ");
        System.out.println("3 - Listar empresas parceiras ");
        System.out.println("4 - Listar eventos ");
        System.out.println("5 - Criar evento ");
        System.out.println("6 - Listar eventos com presença marcada ");
        System.out.println("0 - Sair ");

    }

    public static int pedirOpcao(String msg) {
        Scanner leitor = new Scanner(System.in);
        System.out.print(msg + "Insira a opção desejada: ");
        return leitor.nextInt();
    }

    public static String pedirDados(String msg) {
        System.out.print("Insira " + msg);
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }

    public static void mostrarEmpresasParceiras(String empresas){
        System.out.println(empresas);
    }

    public static void mostrarEventos(String eventos){
        System.out.println(eventos);
    }
}
   