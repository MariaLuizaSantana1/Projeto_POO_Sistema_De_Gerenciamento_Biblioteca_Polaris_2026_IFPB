package br.edu.ifpb.poo.controller;


import java.time.LocalDate;

import br.edu.ifpb.poo.model.Aluno;
import br.edu.ifpb.poo.model.Dvd;
import br.edu.ifpb.poo.model.Editora;
import br.edu.ifpb.poo.model.Emprestimo;
import br.edu.ifpb.poo.model.FuncionarioAdministrativo;
import br.edu.ifpb.poo.model.LivroFisico;
import br.edu.ifpb.poo.model.Professor;
import br.edu.ifpb.poo.model.Revista;
import br.edu.ifpb.poo.ui.TelaPrincipalUI;

public class GerenciadorDeInterface {
    private static final int RESPOSTA_MENU = 1;
    TelaPrincipalUI telaUi = new TelaPrincipalUI();
    
    GerenciadorDeUsuario usuarios = new GerenciadorDeUsuario();
    GerenciadorDeItens itens = new GerenciadorDeItens();
    GerenciadorEmprestimos emprestimos = new GerenciadorEmprestimos();
    GerenciadorDeVenda venda = new GerenciadorDeVenda();
    

    

    public static int getRespostaMenu() {
            return RESPOSTA_MENU;
        }

    public GerenciadorDeInterface(TelaPrincipalUI ui) {
        telaUi = ui;
    }

    public void execute(){
        int resposta = RESPOSTA_MENU;
        do{
            telaUi.limpeTela();
            resposta = telaUi.iniciarMenuPrincipal();
            telaUi.limpeTela();
            menuSecundario(resposta);
            break;
        }
        while(resposta != RESPOSTA_MENU);
    }


    public void menuSecundario(int resposta){
        switch (resposta) {
            case 1 :{
                 telaUi.iniciarMenuGereciarItem();
                 gerenciadorItens();
                 break;
            }
            case 2: {
                 telaUi.iniciarMenuGerenciadorUsuarios();
                 gerenciadorUsuarios();
                 break;
            }
            case 3: {
                 telaUi.iniciarMenuRealizarEmprestimo();
                 gerenciadorEmprestimo();
                 break;
                }
            case 4: { 
                telaUi.realizarDevolucao(emprestimos);}
            case 5: { 
                 telaUi.iniciarMenuConsultar();
                 gerenciadorConsultar();
                 break;
            }
            case 6:{
                telaUi.realizarVenda(usuarios, itens, venda);
            }
            case 0: { 
                System.out.println("Você saiu.");
                break;
            }
            default :{ 
                System.out.println("Opção inválida");
            }
        }
    }

    public void gerenciadorItens(){
        telaUi.gerenciarItensAcervo(itens);
        execute();
    }

    public void gerenciadorUsuarios(){
        telaUi.gerenciarUsuarios(usuarios);
        execute();
    }

    public void gerenciadorEmprestimo(){
        telaUi.realizarEmprestimos(usuarios, itens, emprestimos);
        execute();
    }

    public void gerenciadorConsultar(){
        telaUi.consultar(usuarios, itens, emprestimos);
        execute();
    }


    public void inicializadorDeDadosPadrao(){

        Editora harperCollins = new Editora("1", "Harper Collins", "1234412113");
        Editora darkSide = new Editora("2", "DarkSide", "12222222");
        Editora penguin = new Editora("3", "Penguin", "12000000");
        Editora principis = new Editora("4", "Principis", "12000001");
        Editora abril = new Editora("5", "Abril", "12000003");

        LivroFisico livroDefault = new LivroFisico("3791", "O Senhor dos Aneis",
                "J.R.R.Tolkien", harperCollins, 2020, "Fantasia",
                "Frodo Bolseiro embarca numa missão com seu seus amigos hobbits,\nseu guia Gandalf, elfos, um anão e humanos para levar o Um Anel para a\nMontanha da Perdição e salvar a Terra Média.", 1100);
        itens.addLivro(livroDefault);
        LivroFisico livroDefault4 = new LivroFisico("3790", "O Silmarillion",
                "J.R.R.Tolkien", harperCollins, 2020, "Fantasia",
                "O épico narra a criação do universo de Tolkien, as joias lendárias\nchamadas Silmarils e as guerras ancestrais entre elfos e o primeiro\n Senhor Sombrio.", 1100);
        itens.addLivro(livroDefault4);
        LivroFisico livroDefault2 = new LivroFisico("1880", "Sherlock Holmes",
                "Arthur Conan Doyler", harperCollins, 2021, "Romance Policial",
                "O Dr. Watson acompanha a resolução dos mistérios por seu amigo\nSherlock Holmes Detetive de Londres.", 220);
        itens.addLivro(livroDefault2);
        LivroFisico livroDefault3 = new LivroFisico("1700", "1984",
                "George Orwell", darkSide, 1983, "Ficção Distopica"
                ,"Winston Smith desafia o Partido e o Grande Irmão, buscando\nliberdade e amor em um mundo vigiado de controle absoluto.", 336);
        itens.addLivro(livroDefault3);
        LivroFisico livroDefault5 = new LivroFisico("1891", "Hamlet",
                "Willian Shakespeare", penguin, 2018, "Drama",
                 "O Príncipe Hamlet busca vingar a morte de seu pai, assassinado\npelo tio que usurpou o trono e casou-se com sua mãe, simulando loucura\nenquanto pondera sobre a existência", 220);
        itens.addLivro(livroDefault5);
        LivroFisico livroDefault6 = new LivroFisico("1899", "Dom Casmurro",
                "Machado de Assis", principis, 2018, "Romance",
                 "Bento narra sua paixão juvenil por Capitu e o ciúme doentio\nque o faz suspeitar de traição com seu melhor amigo. Capitu traiu ou foi\napenas obsessão?", 280);
        itens.addLivro(livroDefault6);

        Revista revistaDefault = new Revista("1001", "Veja", "Julio Verne", 1, abril, "11/08/2019");
        itens.addRevista(revistaDefault);
        Dvd dvdDefault = new Dvd("1234","Titanic", "James Cameron", 194, "12+");
        itens.addDvd(dvdDefault);
        Dvd dvdDefault2 = new Dvd("1985","De Volta Para O Futuro", "Robert Zemeckis", 116, "12+");
        itens.addDvd(dvdDefault2);

        Aluno alunoDefault = new Aluno("Anna Silva", "2024137300", "Sistemas");
        usuarios.addAluno(alunoDefault);
        Aluno alunoDefault2 = new Aluno("Harry Osborn", "2024137100", "Redes", "inativo");
        usuarios.addAluno(alunoDefault2);
        Professor professorDefault = new Professor("Rafael", "2024137000");
        usuarios.addProfessor(professorDefault);
        FuncionarioAdministrativo funcionarioDefault = new FuncionarioAdministrativo("Maria Janette Jonnes", "2024137001");
        usuarios.addFuncionarioAdministrativo(funcionarioDefault);

        Emprestimo emprestimoDefault = new Emprestimo(alunoDefault, livroDefault3, "Anna Silva", "1984", LocalDate.of(2026,04,21), LocalDate.of(2026,04,28));
        alunoDefault.setItensEmprestados(1);
        livroDefault3.setDisponibilidade("Emprestado");
        emprestimos.addEmprestimo(emprestimoDefault);
    }
}
