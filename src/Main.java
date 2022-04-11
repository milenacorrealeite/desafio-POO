import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {
public static void main(String[]args){
    Curso curso1 = new Curso();
    curso1.setTitulo("curso Java");
    curso1.setDescricao("Descrição");
    curso1.setCargaHoraria(8);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria");
    mentoria.setDescricao("Descrição Mentoria");
    mentoria.setData(LocalDate.now());


    Conteudo conteudo = new Curso();


    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java");
    bootcamp.setDescricao("Descrição");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(mentoria);

    System.out.println(curso1);
    System.out.println(mentoria);

    Dev devMilena = new Dev();
    devMilena.setNome("Milena");
    devMilena.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos Milena" + devMilena.getConteudosInscritos());
    devMilena.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos" + devMilena.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos" + devMilena.getConteudosConcluidos());
    System.out.println("XP:" + devMilena.calcularXp());

    System.out.println("---------");

    Dev devJoao = new Dev();
    devJoao.setNome("João");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
    devJoao.progredir();
    System.out.println("-");
    System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos" + devJoao.getConteudosConcluidos());
    System.out.println("XP:" + devJoao.calcularXp());

}
}
