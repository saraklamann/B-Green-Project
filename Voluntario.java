import java.util.ArrayList;

public class Voluntario {
    private String nome;
    private String nomeUsuario;
    private String email;
    private String senha;

    public ArrayList <Evento> eventosMarcados = new ArrayList <Evento>();

    public void setEventosMarcados(ArrayList<Evento> eventosMarcados) {
        this.eventosMarcados = eventosMarcados;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String marcarEvento(Evento evento) {
        this.eventosMarcados.add(evento);
        return "Presença marcada com sucesso!";
    }
}
