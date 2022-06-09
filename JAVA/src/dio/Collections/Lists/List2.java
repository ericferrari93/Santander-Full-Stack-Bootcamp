package dio.Collections.Lists;

/*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/

import java.util.LinkedList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {

        List<Double> notas2 = new LinkedList<Double>();
        notas2.add(5.0);
        notas2.add(4.0);
        notas2.add(3.0);
        notas2.add(2.0);

        System.out.println(notas2);

        System.out.println("A primeira nota da nova lista: " + notas2.get(0));
        System.out.println("A primeira nota da nova lsta e removendo: " + notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);



    }
}
