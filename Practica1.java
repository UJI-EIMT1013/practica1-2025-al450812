package practica1;

import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos(Iterator<Integer> it) {

        Set<Integer> res = new HashSet<>();

        List<Integer> Lista = new ArrayList<>();

        while (it.hasNext()) {
            Lista.add(it.next());
        }
        for (Integer a : Lista) {
            if (a == 0) continue;
            for (Integer b : Lista) {
                if (a == b || b == 0) continue;
                if (a % b == 0) {
                    res.add(a);
                }
            }
        }
        return res;
    }

    //EJERCICIO2
    public static void separate(Set<Integer> cuadrados, Set<Integer> noCuadrados) {

        Set<Integer> total = new HashSet<>();
        total.addAll(cuadrados);
        total.addAll(noCuadrados);

        Set<Integer> posiCuadrados = new HashSet<>();
        for (int i : total) {
            posiCuadrados.add(i *i);

        }
        Set<Integer> todos = new HashSet<>(total);

        Set<Integer> nuNoCuadrados = new HashSet<>();
        Set<Integer> nuCuadrados = new HashSet<>();

        for (Integer i : todos){
         if (posiCuadrados.contains(i)){
            nuCuadrados.add(i);
            }else{
            nuNoCuadrados.add(i);
            }

        }
        cuadrados.clear();
        cuadrados.addAll(nuCuadrados);

        noCuadrados.clear();
        noCuadrados.addAll(nuNoCuadrados);
    }



    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
