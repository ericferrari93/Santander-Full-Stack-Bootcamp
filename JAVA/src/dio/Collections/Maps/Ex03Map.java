package dio.Collections.Maps;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */


import java.util.*;

public class Ex03Map {
    public static void main(String[] args) {

        System.out.println("Mostre estados do nordeste brasileiro e sua populacao: ");
        Map<String, Integer> estados = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados.toString());

        System.out.println("Substitua a população do estado RN por 3534165: ");
        estados.put("RN", 3534165);
        System.out.println(estados.toString());

        System.out.println("Confira se o estado PB esta no dicionario: " + estados.containsKey("PB"));
        estados.put("PB", 4039277);
        System.out.println(estados);

        System.out.println("Exiba a populacao de PE: " + estados.get("PE"));

        System.out.println(estados.toString());

        System.out.println("Exiba os estados e suas populações em ordem alfabetica: ");
        Map<String,Integer> estados2 = new TreeMap<>(estados);
        System.out.println(estados2.toString());


        System.out.println("Exiba os estados: ");
        Set<String> estados1 = estados.keySet();
        System.out.println(estados1);

        System.out.println("Exiba as populações: ");
        Collection<Integer> populacoes = estados.values();
        System.out.println(populacoes);

        System.out.println("Exiba o estado mais populado e sua população: ");

        Integer maispop = Collections.max(estados.values());
        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        String estadopop = "";

        for (Map.Entry<String, Integer> entry : entries){
            if (entry.getValue().equals(maispop)){
                estadopop = entry.getKey();
                System.out.println("Estado mais populado: " + estadopop + " - " + maispop);
            }
        }

        System.out.println("Exiba o estado menos populado e sua população: ");

        Integer menosPop = Collections.min(estados.values());
        String estadomenospop = "";

        for (Map.Entry<String, Integer> entry : entries){
            if (entry.getValue().equals(menosPop)){
                estadomenospop = entry.getKey();
                System.out.println("Estado menos populado: " + estadomenospop + " - " + menosPop);
            }
        }

        Iterator<Integer> iterator = estados.values().iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma das populacoes: " + soma);

        System.out.println("Exiba a media dos consumos deste dicionario de estados: " + (soma/estados.size()));

        System.out.println("Remova os estados com populacoes menores que 4.000.000: ");
        Iterator<Integer> iterator1 = estados.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() < 4000000){
                iterator1.remove();
            }
        }
        System.out.println(estados);

        System.out.println("Apague o dicionario de estados: ");
        estados.clear();

        System.out.println("Confira se o dicionario esta vazio: " + estados.isEmpty());

    }
}
