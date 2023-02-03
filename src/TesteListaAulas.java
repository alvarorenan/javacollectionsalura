import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteListaAulas {
    public static void main(String[] args) {
        Aula a1 = new Aula("C Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("A Listas de objetos", 20);
        Aula a3 = new Aula("B Relacionamento de listas e objetos", 15);

        List<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        aulas.sort(Comparator.comparing(Aula::getTitulo));
        System.out.println(aulas);

    }
}
