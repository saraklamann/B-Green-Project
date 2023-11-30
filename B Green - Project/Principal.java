
public class Principal{
    public static void main(String[] args ){
        int opcao=0;
        Aplicativo a = new Aplicativo();
        
        do{
            EntradaSaida.mostrarMenu();
            opcao = EntradaSaida.pedirOpcao("");
            boolean opcaoValida = Validacao.validarOpcao(opcao);
            while (opcaoValida == false) {
                opcao = EntradaSaida.pedirOpcao("Opção Inválida! ");
                opcaoValida = Validacao.validarOpcao(opcao);
            }
            switch (opcao) {
                case 1:
                    Voluntario v = new Voluntario();
                    v.nome = EntradaSaida.pedirDados("o nome: ");
                    v.nomeUsuario = EntradaSaida.pedirDados("o nome de usuário: ");
                    v.email = EntradaSaida.pedirDados("o e-mail: ");
                    v.senha = EntradaSaida.pedirDados("a senha: ");
                    String senha = EntradaSaida.pedirDados("a senha novamente: ");
                    while (!senha.equals(v.senha)) {
                        System.out.println("As senhas não coincidem! ");
                        v.senha = EntradaSaida.pedirDados("senha: ");
                        senha = EntradaSaida.pedirDados("senha novamente: ");
                    }
                    a.adicionarVoluntario(v);
                    //pedir para logar
                    //logado recebe true
                    break;
                case 2:
                    Empresa c = new Empresa();
                    c.nome = EntradaSaida.pedirDados("o nome da empresa: ");
                    c.nome = c.nome.toUpperCase();
                    c.cnpj = EntradaSaida.pedirDados("o CNPJ: ");
                    c.usuarioResponsavel = EntradaSaida.pedirDados("o usuário responsável: ");
                    c.senha = EntradaSaida.pedirDados("a senha: ");
                    senha = EntradaSaida.pedirDados("a senha novamente: ");
                    while (!senha.equals(c.senha)) {
                        System.out.println("As senhas não coincidem! ");
                        c.senha = EntradaSaida.pedirDados("senha: ");
                        senha = EntradaSaida.pedirDados("senha novamente: ");
                    }
                    c.descricao = EntradaSaida.pedirDados("para onde vai este material: ");
                    c.posto = Empresa.adicionarPosto();
                    a.adicionarEmpresa(c);
                    break;
                case 3:
                    EntradaSaida.mostrarEmpresasParceiras(a.listarEmpresas());
                    break;
                case 4:
                    EntradaSaida.mostrarEventos(a.listarEventos());
                    break;
                case 5:
                    //verifica se esta logado
                    //se nao
                    //pede pra logar
                    //se usuario nao ta na lista
                    //pede pra cadastrar
                    //pede pra logar
                    //logado recebe true
                    Evento e = new Evento();
                    e.nome = EntradaSaida.pedirDados("o nome do evento: ");
                    e.data = EntradaSaida.pedirDados("o data do evento: ");
                    e.endereco = EntradaSaida.pedirDados("o endereço do evento: ");
                    e.organizador = EntradaSaida.pedirDados("o organizador do evento: ");
                    a.criarEvento(e);
                    break;
                case 6:
                    break;
            }
        } while(opcao != 0);
        
        
        
        
        
        //escolha opcao
        //caso 1:
            /*
            */
        //caso 2:
        //caso 3:
        //caso 4:
        //caso 5:
        //caso 6:
        //caso 0:
            /* sair */
    }    
}