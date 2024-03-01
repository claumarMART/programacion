import java.util.ArrayList;
import java.util.Iterator;

public class main1 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        Iterator iterador;
        lista.add("ana");
        lista.add("sonia");
        lista.add("mateo");
        lista.add("lucia");
        lista.remove("mateo");
        iterador = lista.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
        //version for each
        for (Object o: lista){
            System.out.println(o); //mostrar lista
        }

    }
}
