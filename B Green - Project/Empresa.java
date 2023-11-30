import java.util.ArrayList;

public class Empresa {
    public String nome;
    public String cnpj;
    public String usuarioResponsavel;
    public String senha;
    public String descricao;
    public Postos posto;

    public ArrayList<Postos> listaDePostosDeColeta = new ArrayList<Postos>();

    public static Postos adicionarPosto() {
        Postos p = new Postos();
                    p.cidade = EntradaSaida.pedirDados("a cidade em que se encontra o posto de coleta: ");
                    p.rua = EntradaSaida.pedirDados("a rua em que se encontra o posto de coleta: ");
                    p.numero = EntradaSaida.pedirDados("o numero em que se encontra o posto de coleta: ");
        return p;
    }
}
