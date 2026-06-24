package br.edu.ifpb.poo.app;

import java.time.LocalDate;

import br.edu.ifpb.poo.controller.GerenciadorDeInterface;
import br.edu.ifpb.poo.controller.GerenciadorDeItens;
import br.edu.ifpb.poo.controller.GerenciadorDeUsuario;
import br.edu.ifpb.poo.controller.GerenciadorEmprestimos;
import br.edu.ifpb.poo.model.Aluno;
import br.edu.ifpb.poo.model.Dvd;
import br.edu.ifpb.poo.model.Emprestimo;
import br.edu.ifpb.poo.model.FuncionarioAdministrativo;
import br.edu.ifpb.poo.model.LivroFisico;
import br.edu.ifpb.poo.model.Professor;
import br.edu.ifpb.poo.model.Revista;


public class Main {

    public static void main(String[] args) {
        
        GerenciadorDeUsuario usuarios = new GerenciadorDeUsuario();
        GerenciadorDeItens itens = new GerenciadorDeItens();
        GerenciadorEmprestimos emprestimos = new GerenciadorEmprestimos();

        LivroFisico livroDefault = new LivroFisico("37910", "O Senhor dos Aneis",
                "J.R.R.Tolkien", "Harper Collins", 2020, "Fantasia",
                "Frodo Bolseiro embarca numa missão com seu seus amigos hobbits,\nseu guia Gandalf, elfos, um anão e humanos para levar o Um Anel para a\nMontanha da Perdição e salvar a Terra Média.", 1100);
        itens.addLivro(livroDefault);

        LivroFisico livroDefault4 = new LivroFisico("37911", "O Silmarillion",
                "J.R.R.Tolkien", "Harper Collins", 2020, "Fantasia",
                "O épico narra a criação do universo de Tolkien, as joias lendárias\nchamadas Silmarils e as guerras ancestrais entre elfos e o primeiro\n Senhor Sombrio.", 1100);
        itens.addLivro(livroDefault4);

        LivroFisico livroDefault2 = new LivroFisico("18800", "Sherlock Holmes",
                "Arthur Conan Doyler", "Harper Collins", 2021, "Romance Policial",
                "O Dr. Watson acompanha a resolução dos mistérios por seu amigo\nSherlock Holmes Detetive de Londres.", 220);
        itens.addLivro(livroDefault2);
        LivroFisico livroDefault3 = new LivroFisico("17000", "1984",
                "George Orwell", "Darkside", 1983, "Ficção Distopica"
                ,"Winston Smith desafia o Partido e o Grande Irmão, buscando\nliberdade e amor em um mundo vigiado de controle absoluto.", 336);
        itens.addLivro(livroDefault3);
        LivroFisico livroDefault5 = new LivroFisico("18910", "Hamlet",
                "Willian Shakespeare", "Penguin", 2018, "Drama",
                 "O Príncipe Hamlet busca vingar a morte de seu pai, assassinado\npelo tio que usurpou o trono e casou-se com sua mãe, simulando loucura\nenquanto pondera sobre a existência", 220);
        itens.addLivro(livroDefault5);
        LivroFisico livroDefault6 = new LivroFisico("18900", "Dom Casmurro",
                "Machado de Assis", "Principis", 2018, "Romance",
                 "Bento narra sua paixão juvenil por Capitu e o ciúme doentio\nque o faz suspeitar de traição com seu melhor amigo. Capitu traiu ou foi\napenas obsessão?", 280);
        itens.addLivro(livroDefault6);


        Revista revistaDefault = new Revista("10010", "Veja", "Julio Verne", 1, "Abril", "11/08/2019");
        itens.addRevista(revistaDefault);
        Dvd dvdDefault = new Dvd("12345","Titanic", "James Cameron", 194, "12+");
        itens.addDvd(dvdDefault);
        Dvd dvdDefault2 = new Dvd("19855","De Volta Para O Futuro", "Robert Zemeckis", 116, "12+");
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

        GerenciadorDeInterface controller = new GerenciadorDeInterface();

        controller.gerenciadorDeInterface();
    
    }
    
}
