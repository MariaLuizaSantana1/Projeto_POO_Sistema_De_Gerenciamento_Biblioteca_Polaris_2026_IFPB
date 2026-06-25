package br.edu.ifpb.poo.ui;



import br.edu.ifpb.poo.controller.GerenciadorDeItens;
import br.edu.ifpb.poo.controller.GerenciadorDeUsuario;
import br.edu.ifpb.poo.controller.GerenciadorEmprestimos;
import br.edu.ifpb.poo.model.Aluno;
import br.edu.ifpb.poo.model.AudioLivro;
import br.edu.ifpb.poo.model.Cd;
import br.edu.ifpb.poo.model.Dvd;
import br.edu.ifpb.poo.model.Editora;
import br.edu.ifpb.poo.model.FuncionarioAdministrativo;
import br.edu.ifpb.poo.model.Livro;
import br.edu.ifpb.poo.model.LivroFisico;
import br.edu.ifpb.poo.model.PosGraduado;
import br.edu.ifpb.poo.model.Professor;
import br.edu.ifpb.poo.model.Revista;
import br.edu.ifpb.poo.model.Usuario;



public class TelaPrincipalUI {
    private Console console;
    int resposta = 1;

    

    public TelaPrincipalUI(){
        this.console = new Console();
    }
    

    

    public int iniciarMenuPrincipal(){
        console.println("""

                _____________Biblioteca Polaris____________
                [1] Gerenciar Itens do Acervo
                [2] Gerenciar Usuários
                [3] Emprestimos
                [4] Devoluções
                [5] Consultar
                [0] Sair
             """);
        resposta = Integer.parseInt(console.nextLine());
        return resposta;
    }

    
    public int iniciarMenuGerenciadorUsuarios(){
        console.println("""

                Qual tipo de usuário você gostaria de adicionar? 
                [1] Aluno
                [2] Professor
                [3] Pós-Graduado
                [4] Funcionário Administrativo
                [0] Voltar
            """);
        resposta = Integer.parseInt(console.nextLine());
        return resposta;
    }


    public int iniciarMenuGereciarItem(){
        console.println("""

                Qual tipo de item você gostaria de adicionar? 
                [1] Livro
                [2] Revista
                [3] Cd
                [4] Dvd
                [0] Voltar
            """);
        resposta = Integer.parseInt(console.nextLine());
        return resposta;
    }


    public int iniciarMenuConsultar(){
        console.println("""

               O que você gostaria de fazer? 
               [1] Listar Usuários
               [2] Listar Itens do Acervo
               [3] Listar Empréstimos
               [4] Pesquisar Usuário
               [5] Pesquisar Item do Acervo
               [0] Voltar
            """);
        resposta = Integer.parseInt(console.nextLine());
        return resposta;
    }



    public int iniciarMenuOpçõesEmprestimos(){
        console.println("""

               Como você gostaria de listar os empréstimos? 
               [1] Listar todos os empréstimos
               [2] Listar por Item
               [0] Voltar
            """);
        resposta = Integer.parseInt(console.nextLine());
        return resposta;
    }



    public int iniciarMenuBuscarUsuario(){
        console.println("""

               Que usuário você gostaria de buscar? 
               [1] Pesquisar Aluno
               [2] Pesquisar Professor
               [3] Pesquisar Pós-Graduado
               [4] Pesquisar Funcionário Administrativo
               [0] Voltar
            """);
        resposta = Integer.parseInt(console.nextLine());
        return resposta;
    }



    public void iniciarMenuBuscarItem(){
        console.println("""

               Que item do acervo você gostaria de buscar? 
               [1] Pesquisar Livro
               [2] Pesquisar Revista
               [3] Pesquisar Cd
               [4] Pesquisar Dvd
               [0] Voltar
            """);
    }

    public void iniciarMenuRealizarEmprestimo(){
        console.println("""
            ---------------------Empréstimo de item---------------------------

                Para qual tipo de usuário você deseja realizar um empréstimo? 
                [1] Aluno
                [2] Professor
                [3] Pós-Graduado
                [4] Funcionário Administrativo
                [0] Voltar
            """);
        
    }

    public int iniciarMenuEscolherItemEmprestimo(){
        console.println("""

                Qual item você deseja pegar emprestado 
                [1] Livro
                [2] Revista
                [3] Jogo
                [0] Voltar
            """);
        resposta = Integer.parseInt(console.nextLine());
        return resposta;
    }






    public void lerNovoLivro(GerenciadorDeItens itens){
        System.out.println("\nQue tipo de livro você deseja cadastrar?\n[1]Livro Físico\n[2]Audio Livro\n Digite sua opção: ");
                    int r = Integer.parseInt(console.nextLine());
                    switch (r) {
                        case 1:{
                            System.out.println("\n----------------------Cadastro de Livro Físico---------------------------");
                            System.out.println("\nDigite o isbn do livro: ");
                            String isbn = console.nextLine();
                            System.out.println("\nDigite o titulo do livro: ");
                            String titulo = console.nextLine();
                            System.out.println("\nDigite o nome do autor do livro: ");
                            String autor = console.nextLine();
                            System.out.println("\nDigite o ano de Publicação do livro: ");
                            int anoPublicacao = Integer.parseInt(console.nextLine());
                            System.out.println("\nDigite o nome da editora: ");
                            String nomeEditora = console.nextLine();
                            Editora editoraEncontrada = itens.buscarEditora(nomeEditora);
                            if (editoraEncontrada == null) {
                                System.out.println("\nEditora não encontrada");
                                break;
                            } else {
                                System.out.println(editoraEncontrada.toString());
                            }
                            System.out.println("\nDigite o genero literário do livro: ");
                            String generoLiterario = console.nextLine();
                            System.out.println("\nDigite o numero de páginas do livro: ");
                            int numeroPaginas = Integer.parseInt(console.nextLine());
                            System.out.println("\nDigite a sinopse do livro: ");
                            String sinopse = console.nextLine();
            
                            LivroFisico livros = new LivroFisico(isbn, titulo, autor, editoraEncontrada, anoPublicacao, generoLiterario, sinopse, numeroPaginas);
                            itens.addLivro(livros);
                            System.out.println("\n Livro Fisico Cadastrado com sucesso!\n");
                        }
                        case 2:{
                            System.out.println("\n----------------------Cadastro de Audio Livro----------------------------");
                            System.out.println("\nDigite o isbn do livro: ");
                            String isbn = console.nextLine();
                            System.out.println("\nDigite o titulo do livro: ");
                            String titulo = console.nextLine();
                            System.out.println("\nDigite o nome do autor do livro: ");
                            String autor = console.nextLine();
                            System.out.println("\nDigite o ano de Publicação do livro: ");
                            int anoPublicacao = Integer.parseInt(console.nextLine());
                            System.out.println("\nDigite o nome da editora: ");
                            String nomeEditora = console.nextLine();
                            Editora editoraEncontrada = itens.buscarEditora(nomeEditora);
                            if (editoraEncontrada == null) {
                                System.out.println("\nEditora não encontrada");
                                break;
                            } else {
                                System.out.println(editoraEncontrada.toString());
                            }

                            System.out.println("\nDigite o genero literário do livro: ");
                            String generoLiterario = console.nextLine();
                            System.out.println("\nDigite a duração do audio livro(em minutos): ");
                            String duracao = console.nextLine();
                            System.out.println("\nDigite a sinopse do livro: ");
                            String sinopse = console.nextLine();
            
                            AudioLivro livros = new AudioLivro(isbn, titulo, autor, editoraEncontrada, anoPublicacao, generoLiterario, duracao, sinopse);
                            itens.addLivro(livros);
                            System.out.println("\n Audio Livro Cadastrado com sucesso!\n");
                        }
                    }
    }



    public void lerNovaRevista(GerenciadorDeItens itens){
        System.out.println("\nDigite o id da revista: ");
        String id = console.nextLine();
        System.out.println("\nDigite o nome da revista: ");
        String titulo = console.nextLine();
        System.out.println("\nDigite o nome do autor da revista: ");
        String autor = console.nextLine();
        System.out.println("\nDigite o volume do livro: ");
        int volume = Integer.parseInt(console.nextLine());
        System.out.println("\nDigite o nome da editora: ");
        String nomeEditora = console.nextLine();
        Editora editoraEncontrada = itens.buscarEditora(nomeEditora);
        if (editoraEncontrada == null) {
            System.out.println("\nEditora não encontrada");
        } else {
            System.out.println(editoraEncontrada.toString());
        }
        System.out.println("\nDigite a data de publicação da revista: ");
        String dataPublicacao = console.nextLine();

        Revista revistas = new Revista(id, titulo, autor, volume, editoraEncontrada, dataPublicacao);
        itens.addRevista(revistas);
        System.out.println("\n Revista Cadastrado com sucesso!\n");
    }

    public void lerNovoCd(GerenciadorDeItens itens){
        System.out.println("\nDigite o id do Cd: ");
        String id = console.nextLine();
        System.out.println("\nDigite o nome do Cd: ");
        String titulo = console.nextLine();
        System.out.println("\nDigite o nome do artista do Cd: ");
        String autor = console.nextLine();
        System.out.println("\nQuantas faixas tem o Cd? ");
        int numFaixas = Integer.parseInt(console.nextLine());
        String[] faixas = new String[numFaixas];
        System.out.println("\nDigite o nome das faixas do Cd: ");
        for (int i = 0; i < numFaixas; i++) {
            String faixa = console.nextLine();
            faixas[i] = faixa;
        }

        Cd cds = new Cd(id, titulo, autor, faixas);
        itens.addCd(cds);
        System.out.println("\nCd Cadastrado com sucesso!\n");
    }


    public void lerNovoDvd(GerenciadorDeItens itens){
        System.out.println("\nDigite o id do Dvd: ");
        String id = console.nextLine();
        System.out.println("\nDigite o nome do Dvd: ");
        String titulo = console.nextLine();
        System.out.println("\nDigite o nome do diretor: ");
        String autor = console.nextLine();
        System.out.println("\nDigite a duracao do Dvd(em minutos): ");
        int duracao = Integer.parseInt(console.nextLine());
        System.out.println("\nDigite a classificacao indicativa do Dvd: ");
        String classificacaoIndicativa = console.nextLine();

        Dvd dvds = new Dvd(id, titulo, autor, duracao, classificacaoIndicativa);
        itens.addDvd(dvds);
        System.out.println("\nDvd Cadastrado com sucesso!\n");
    }
    




    public void gerenciarUsuarios(GerenciadorDeUsuario usuarios) {
        int resp = 1;
        while (resp != 0) {
            resp = Integer.parseInt(console.nextLine());
            switch (resp) {
                case 1: {
                    System.out.println("\nDigite o nome do aluno: ");
                    String nome = console.nextLine();
                    System.out.println("\nDigite a matricula do aluno: ");
                    String matricula = console.nextLine();
                    System.out.println("\nDigite o curso do aluno: ");
                    String curso = console.nextLine();

                    Aluno alunos = new Aluno(nome, matricula, curso);
                    usuarios.addAluno(alunos);
                    System.out.println("\n Aluno Cadastrado com sucesso!\n");
                }
                break;
                case 2: {
                    System.out.println("\nDigite o nome do professor: ");
                    String nome = console.nextLine();
                    System.out.println("\nDigite a matricula do professor: ");
                    String matricula = console.nextLine();

                    Professor professores = new Professor(nome, matricula);
                    usuarios.addProfessor(professores);
                    System.out.println("\n Professor Cadastrado com sucesso!\n");
                }
                break;
                case 3: {
                    System.out.println("\nDigite o nome do pós-graduado: ");
                    String nome = console.nextLine();
                    System.out.println("\nDigite a matricula do pós-graduado: ");
                    String matricula = console.nextLine();

                    PosGraduado posGraduados = new PosGraduado(nome, matricula);
                    usuarios.addPosGraduado(posGraduados);
                    System.out.println("\n pós-graduado Cadastrado com sucesso!\n");
                }
                break;
                case 4: {
                    System.out.println("\nDigite o nome do Funcionário Administrativo: ");
                    String nome = console.nextLine();
                    System.out.println("\nDigite a matricula do Funcionário Administrativo: ");
                    String matricula = console.nextLine();

                    FuncionarioAdministrativo funcionarios = new FuncionarioAdministrativo(nome, matricula);
                    usuarios.addFuncionarioAdministrativo(funcionarios);
                    System.out.println("\n Funcionário Administrativo Cadastrado com sucesso!\n");
                }
                break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpção inválida\n");
            }
        }

    }


    public void gerenciarItensAcervo(GerenciadorDeItens itens) {
        int resp = 1;
        while (resp != 0) {
            resp = Integer.parseInt(console.nextLine());
            switch (resp) {
                case 1: {
                    lerNovoLivro(itens);
                }
                break;
                case 2: {
                    lerNovaRevista(itens);
                }
                break;
                case 3: {
                    lerNovoCd(itens);
                }
                break;
                case 4: {
                    lerNovoDvd(itens);
                }
                break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpção inválida\n");
            }
        }
    }



    public void consultar(GerenciadorDeUsuario usuarios, GerenciadorDeItens itens, GerenciadorEmprestimos emprestimos) {

        int respconsult = 1;
        while (respconsult != 0) {
            respconsult = Integer.parseInt(console.nextLine());
            switch (respconsult) {
                case 1:
                    System.out.println("\nAlunos cadastrados: ");
                    usuarios.listarAlunos();
                    System.out.println("\nProfessores cadastrados: ");
                    usuarios.listarProfessores();
                    System.out.println("\nPós-Graduados cadastrados: ");
                    usuarios.listarPosGraduados();
                    System.out.println("\nFuncionário Administrativos cadastrados: ");
                    usuarios.listarFuncionariosAdministrativos();
                    break;
                case 2:
                    System.out.println("\nLivros cadastrados: ");
                    itens.listarLivros();
                    System.out.println("\nRevistas cadastradas: ");
                    itens.listarRevistas();
                    System.out.println("\nCDs cadastrados: ");
                    itens.listarCds();
                    System.out.println("\nDVDs cadastrados: ");
                    itens.listarDvds();
                    break;
                case 3:
                    consultarEmprestimosOpcoes(emprestimos);
                    break;
                case 4:
                    buscarUsuario(usuarios);
                    break;
                case 5:
                    buscarItem(itens);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpção inválida\n");
            }
        }
    }



    public void consultarEmprestimosOpcoes( GerenciadorEmprestimos emprestimos) {
        int respcons = 1;
        while (respcons != 0) {
            respcons = Integer.parseInt(console.nextLine());
            switch (respcons) {
                case 1:
                    System.out.println("\nEmpréstimos Cadastrados: ");
                    emprestimos.listaEmprestimos();
                    break;
                case 2:
                    System.out.println("Digite o item que deseja pesquisar histórico de empréstimos: ");
                    String nomeItem = console.nextLine();
                    emprestimos.listarEmprestimosPorItem(nomeItem);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpção Inválida");
            }
        }
    }


    public void buscarUsuario(GerenciadorDeUsuario usuarios) {
        int respcons = 1;
        while (respcons != 0) {
            respcons = Integer.parseInt(console.nextLine());
            switch (respcons) {
                case 1:
                    System.out.println("\nDigite a matricula do aluno que deseja buscar: ");
                    String matriculaAluno = console.nextLine();
                    Usuario alunoEncontrado = usuarios.buscarUsuario(matriculaAluno);
                    if (alunoEncontrado == null) {
                        System.out.println("\nAluno não encontrado");
                    } else {
                        System.out.println(alunoEncontrado.toString());
                    }
                    break;
                case 2:
                    System.out.println("\nDigite a matricula do Professor que deseja buscar: ");
                    String matriculaProfessor = console.nextLine();
                    Usuario professorEncontrado = usuarios.buscarUsuario(matriculaProfessor);
                    if (professorEncontrado == null) {
                        System.out.println("\nProfessor não encontrado");
                    } else {
                        System.out.println(professorEncontrado.toString());
                    }
                    break;
                case 3:
                    System.out.println("\nDigite a matricula do Pós-Graduado que deseja buscar: ");
                    String matriculaPos = console.nextLine();
                    Usuario posGraduadoEncontrado = usuarios.buscarUsuario(matriculaPos);
                    if (posGraduadoEncontrado == null) {
                        System.out.println("\nPosGraduado não encontrado");
                    } else {
                        System.out.println(posGraduadoEncontrado.toString());
                    }
                    break;
                case 4:
                    System.out.println("\nDigite a matricula do Funcionário Administrativo que deseja buscar: ");
                    String matriculaFuncionario = console.nextLine();
                    Usuario funcionarioEncontrado = usuarios.buscarUsuario(matriculaFuncionario);
                    if (funcionarioEncontrado == null) {
                        System.out.println("\nFuncionario não encontrado");
                    } else {
                        System.out.println(funcionarioEncontrado.toString());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpção inválida");
            }
        }
    }

    public void buscarItem(GerenciadorDeItens itens) {
        int respco = 1;
        while (respco != 0) {
            
            respco = Integer.parseInt(console.nextLine());
            switch (respco) {
                case 1:
                    System.out.println("\nDigite o título do livro que deseja buscar: ");
                    String tituloLivro = console.nextLine();
                    Livro livroEncontrado = itens.buscarLivro(tituloLivro);
                    if (livroEncontrado == null) {
                        System.out.println("\nLivro não encontrado");
                    } else {
                        System.out.println(livroEncontrado.toString());
                    }
                    break;
                case 2:
                    System.out.println("\nDigite o título da revista que deseja buscar: ");
                    String tituloRevista = console.nextLine();
                    Revista revistaEncontrada = itens.buscarRevista(tituloRevista);
                    if (revistaEncontrada == null) {
                        System.out.println("\nRevista não encontrado");
                    } else {
                        System.out.println(revistaEncontrada.toString());
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o título do cd que deseja buscar: ");
                    String tituloCd = console.nextLine();
                    Cd cdEncontrado = itens.buscarCd(tituloCd);
                    if (cdEncontrado == null) {
                        System.out.println("\nCd não encontrado");
                    } else {
                        System.out.println(cdEncontrado.toString());
                    }
                    break;
                case 4:
                    System.out.println("\nDigite o título do dvd que deseja buscar: ");
                    String tituloDvd = console.nextLine();
                    Dvd dvdEncontrado = itens.buscarDvd(tituloDvd);
                    if (dvdEncontrado == null) {
                        System.out.println("\nDvd não encontrado");
                    } else {
                        System.out.println(dvdEncontrado.toString());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpção inválida");
            }
        }
    }

    public void realizarEmprestimos(GerenciadorDeUsuario usuarios, GerenciadorDeItens itens, GerenciadorEmprestimos emprestimos) {
        int resp = 1;
        while (resp != 0) {
            resp = Integer.parseInt(console.nextLine());
            switch (resp) {
                case 1: {
                    System.out.println("---------------------Empréstimo de item---------------------------");
                    System.out.println("Digite a Matricula do Aluno que deseja emprestar");
                    String matriculaAluno = console.nextLine();
                    Usuario usuarioEncontrado = usuarios.buscarUsuario(matriculaAluno);
                    if (usuarioEncontrado == null) {
                        System.out.println("\nAluno não encontrado\n");
                    }else if (usuarios.validarUsuarioParaEmpréstimo(matriculaAluno) == false) {
                        System.out.println("\nAluno não pode fazer empréstimo pois está inativo\n");
                    } else {
                        EmprestimosEscolherItem(itens, emprestimos, usuarioEncontrado);
                    } break;
                }
                case 2:{
                    System.out.println("---------------------Empréstimo de item---------------------------");
                    System.out.println("Digite a Matricula do Professor que deseja emprestar");
                    String matricula = console.nextLine();
                    Usuario usuarioEncontrado = usuarios.buscarUsuario(matricula);
                    if (usuarioEncontrado == null) {
                        System.out.println("\nProfessor não encontrado\n");
                    }else if (usuarios.validarUsuarioParaEmpréstimo(matricula) == false) {
                        System.out.println("\nProfessor não pode fazer empréstimo pois está inativo\n");
                    } else {
                        EmprestimosEscolherItem(itens, emprestimos, usuarioEncontrado);
                    } break;
                }
                case 3:{
                    System.out.println("---------------------Empréstimo de item---------------------------");
                    System.out.println("Digite a Matricula do Pós-Graduado que deseja emprestar");
                    String matricula = console.nextLine();
                    Usuario usuarioEncontrado = usuarios.buscarUsuario(matricula);
                    if (usuarioEncontrado == null) {
                        System.out.println("\nPós-Graduado não encontrado\n");
                    }else if (usuarios.validarUsuarioParaEmpréstimo(matricula) == false) {
                        System.out.println("\nPós-Graduado não pode fazer empréstimo pois está inativo\n");
                    } else {
                        EmprestimosEscolherItem(itens, emprestimos, usuarioEncontrado);
                    } break;
                }
                case 4:{
                    System.out.println("---------------------Empréstimo de item---------------------------");
                    System.out.println("Digite a Matricula do Funcionário que deseja emprestar");
                    String matricula = console.nextLine();
                    Usuario usuarioEncontrado = usuarios.buscarUsuario(matricula);
                    if (usuarioEncontrado == null) {
                        System.out.println("\nFuncionario não encontrado\n");
                    }else if (usuarios.validarUsuarioParaEmpréstimo(matricula) == false) {
                        System.out.println("\nFuncionario não pode fazer empréstimo pois está inativo\n");
                    } else {
                        EmprestimosEscolherItem(itens, emprestimos, usuarioEncontrado);
                    } break;
                }
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }

    


    public void EmprestimosEscolherItem(GerenciadorDeItens itens, GerenciadorEmprestimos emprestimos, Usuario usuarioEncontrado) {
        int resp = 1;
        while (resp != 0) {
            
            resp = Integer.parseInt(console.nextLine());
            switch (resp) {
                case 1: {
                    System.out.println("Digite o titulo do livro que deseja emprestar");
                    String tituloLivro = console.nextLine();
                    Livro livroEncontrado = itens.buscarLivro(tituloLivro);
                    if (itens.validarLivroParaEmpréstimo(tituloLivro) != null) {
                        emprestimos.emprestarItemParaAluno(usuarioEncontrado, livroEncontrado);
                        break;
                    } break;
                    
                }
                case 2:{
                    System.out.println("Digite o titulo da Revista que deseja emprestar");
                    String tituloRevista = console.nextLine();
                    Revista revistaEncontrada = itens.buscarRevista(tituloRevista);
                    if (itens.validarRevistaParaEmpréstimo(tituloRevista) != null) {
                        emprestimos.emprestarItemParaAluno(usuarioEncontrado, revistaEncontrada);
                        break;
                    } break;
                }
                case 3:{
                    System.out.println("Digite o titulo do Jogo que deseja emprestar");
                    String tituloJogo = console.nextLine();
                }
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }



    public void realizarDevolucao(GerenciadorEmprestimos emprestimos) {
        System.out.println("Digite o titulo do item que deseja devolver: ");
            String tituloDevolucao = console.nextLine();
            emprestimos.registrarDevolução(tituloDevolucao);
        System.out.println("Usuário tinha multa?(S/N) ");
        String respMulta = console.nextLine().toUpperCase();
        switch (respMulta){
            case "S":{
                System.out.println("Usuário pagou a multa?(S/N) ");
                String respPagou = console.nextLine().toUpperCase();
                switch (respPagou){
                    case "S":{
                        emprestimos.pagarMulta(tituloDevolucao);
                        System.out.println("Pagamento de multa confirmado!");  
                        break;}
                    case "N":
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
            case "N":
                break;
            default:
                System.out.println("Opção inválida");
        }
    }


    public void limpeTela() {
        this.console.clrscr();
    }

    public void pause() {
        console.pause();
    }

    public void exibaCursor() {
        console.showCursor();
    }

    public void oculteCursor() {
        console.clearCursor();
    }

    
}

