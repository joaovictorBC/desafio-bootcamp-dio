import java.time.LocalDate;

import desafiodio.dominio.Bootcamp;
import desafiodio.dominio.Conteudos;
import desafiodio.dominio.Curso;
import desafiodio.dominio.Dev;
import desafiodio.dominio.Mentoria;



public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Difícil pa garai");
        curso1.setCargaHoraria(2989098);

        Curso curso2 = new Curso();

        curso2.setTitulo("Python");
        curso2.setDescricao("Mais fácil");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Mentoria java, aqui ensinamos a chorar");
        mentoria1.setData(LocalDate.now());

        Conteudos conteudo = new Curso();

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Caos");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJhones = new Dev();
        
        devJhones.setNome("Jhones");
        devJhones.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos" + devJhones.getConteudosInscritos());
        devJhones.progredir();
        System.out.println("--");
        System.out.println("conteudos inscritos" + devJhones.getConteudosInscritos());
        System.out.println("conteudos concluidos" + devJhones.getConteudosConcluidos());
        System.out.println("XP:" + devJhones.calcularTotalXp());

        System.out.println("-----");


        Dev Paulo = new Dev();
        Paulo.setNome("Paulo");
        Paulo.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos" + Paulo.getConteudosInscritos());
        devJhones.progredir();
        System.out.println("--");
        System.out.println("conteudos inscritos" + Paulo.getConteudosInscritos());
        System.out.println("conteudos concluidos" + devJhones.getConteudosConcluidos());
        System.out.println("XP:" + devJhones.calcularTotalXp());

    }
}
