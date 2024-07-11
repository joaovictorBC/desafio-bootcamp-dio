package desafiodio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudos{
   
    private LocalDate data;

    public Mentoria(){
    }
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Curso [titulo = " + getTitulo() + ", descricao = " + getDescricao() + ", data = " + data + "]";
    }
}
  



