import java.time.LocalDate;

import desafiodio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }
}
