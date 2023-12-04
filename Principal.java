public class Principal{
    public static void main(String[] args ){
        int opcao=0;
        Aplicativo a = new Aplicativo();
        boolean usuarioLogado=false;
        
        do{
            EntradaSaida.mostrarMenuVisitante();
            opcao = EntradaSaida.pedirOpcao("");
            boolean opcaoValida = Validacao.validarOpcao(opcao);
            while (opcaoValida == false) {
                opcao = EntradaSaida.pedirOpcao("Opção Inválida! ");
                opcaoValida = Validacao.validarOpcao(opcao);
            }
            switch (opcao) {
                case 1: //ok
                    Voluntario v = new Voluntario();
                    v.setSenha(EntradaSaida.pedirDados("o nome: "));
                    v.setNomeUsuario(EntradaSaida.pedirDados("o nome de usuário: "));
                    v.setEmail(EntradaSaida.pedirDados("o e-mail: "));
                    v.setSenha(EntradaSaida.pedirDados("a senha: "));
                    String senha = EntradaSaida.pedirDados("a senha novamente: ");
                    while (!senha.equals(v.getSenha())) {
                        System.out.println("As senhas não coincidem! ");
                        v.setSenha(EntradaSaida.pedirDados("senha: "));
                        senha = EntradaSaida.pedirDados("senha novamente: ");
                    }
                    a.adicionarVoluntario(v);

                    String nome = EntradaSaida.pedirDados("o nome de usuário para logar: ");
                    while (a.procurarVoluntario(nome)==false) {
                        System.out.print("Usuário não encontrado! ");
                        nome = EntradaSaida.pedirDados("o nome de usuário novamente: ");
                        a.procurarVoluntario(nome);
                    }

                    usuarioLogado = a.logarUsuario(nome);
                    while(usuarioLogado==false) {
                        a.logarUsuario(nome);
                    }
                    usuarioLogado = true;
                    System.out.println("Usuário logado com sucesso!");
                    
                    break;
                case 2: 
                    Empresa c = new Empresa();
                    c.setNome(EntradaSaida.pedirDados("o nome da empresa: "));
                    c.setNome(c.getNome().toUpperCase());
                    c.setCnpj(EntradaSaida.pedirDados("o CNPJ: "));
                    c.setUsuarioResponsavel(EntradaSaida.pedirDados("o usuário responsável: "));
                    c.setSenha(EntradaSaida.pedirDados("a senha: "));
                    senha = EntradaSaida.pedirDados("a senha novamente: ");
                    while (!senha.equals(c.getSenha())) {
                        System.out.println("As senhas não coincidem! ");
                        c.setSenha(EntradaSaida.pedirDados("senha: "));
                        senha = EntradaSaida.pedirDados("senha novamente: ");
                    }
                    c.setDescricao(EntradaSaida.pedirDados("para onde vai este material: "));
                    c.setPosto(Empresa.adicionarPosto());
                    a.adicionarEmpresa(c);
                    break;
                case 3:
                    EntradaSaida.mostrarEmpresasParceiras(a.listarEmpresas());
                    break;
                case 4: //ok
                    EntradaSaida.mostrarEventos(a.listarEventos());
                    break;
                case 5: //ok
                    if (usuarioLogado==false) {
                        String nomeUsuario = EntradaSaida.pedirDados("o nome de usuário para logar: ");
                        while (a.procurarVoluntario(nomeUsuario)==false) {
                            System.out.print("Usuário não encontrado! Deseja se cadastrar ou tentar novamente? \n");
                            opcao = EntradaSaida.pedirOpcao("1 - Cadastrar-ser \n" +
                            "2 - Tentar novamente\n");
                            if (opcao == 1) {
                                v = new Voluntario();
                                v.setSenha(EntradaSaida.pedirDados("o nome: "));
                                v.setNomeUsuario(EntradaSaida.pedirDados("o nome de usuário: "));
                                v.setEmail(EntradaSaida.pedirDados("o e-mail: "));
                                v.setSenha(EntradaSaida.pedirDados("a senha: "));
                                senha = EntradaSaida.pedirDados("a senha novamente: ");
                                while (!senha.equals(v.getSenha())) {
                                    System.out.println("As senhas não coincidem! ");
                                    v.setSenha(EntradaSaida.pedirDados("senha: "));
                                    senha = EntradaSaida.pedirDados("senha novamente: ");
                                }
                                a.adicionarVoluntario(v);
                            } else {
                                nomeUsuario = EntradaSaida.pedirDados("o nome de usuário novamente: ");
                                a.procurarVoluntario(nomeUsuario);
                            }
                        }
                    
                        nome = EntradaSaida.pedirDados("o nome de usuário para logar: ");
                        while (a.procurarVoluntario(nome)==false) {
                            System.out.print("Usuário não encontrado! ");
                            nome = EntradaSaida.pedirDados("o nome de usuário novamente: ");
                            a.procurarVoluntario(nome);
                        }

                        while(a.logarUsuario(nomeUsuario)==false) {
                            a.logarUsuario(nomeUsuario);
                        }
                        System.out.println("Usuário logado com sucesso!");
                    }
                    v = new Voluntario();

                    Evento e = new Evento();
                    e.nome = EntradaSaida.pedirDados("o nome do evento: ");
                    e.data = EntradaSaida.pedirDados("o data do evento: ");
                    e.endereco = EntradaSaida.pedirDados("o endereço do evento: ");
                    e.organizador = v.getNomeUsuario();
                    a.criarEvento(e);
                    break;
                case 6:
                    //1- registrar 2- logar
                    // se opcao = 1
                    //novo obj V
                    //cadastrarusuario()
                    //se opcao = 2
                    //pra funcionar precisa de um arquivo com os nomes de usuario
                    //logar usuario()
                    //se nomeUsuario nao ta na lista
                    //usuario nao cadastrado
                    //cadastar usuario
                    //loga
                    //mostrar eventos
                    //digite o nome do evento que deseja marcar presença
                    //verifica se evento existe
                    //se existe
                    //atribui o evento pra lista de eventos marcados
                    //senao "evento nao encontrado"
                    //listar eventos marcados
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