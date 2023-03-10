import com.estrutura.fila.Fila;
import com.estrutura.fila.No;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();
        minhaFila.enqueue("Flamengo");
        minhaFila.enqueue("Vasco");
        minhaFila.enqueue("Botafogo");
        minhaFila.enqueue("Fluminense");

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());

    }
}