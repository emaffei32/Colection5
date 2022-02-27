/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario.
 */
package colection5;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Elizabeth Maffei
 */
public class Colection5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<String> paises = new TreeSet<>();
        paises.add("Argentina");
        paises.add("Colombia");
        paises.add("Australia");
        paises.add("Islandia");
        paises.add("Dinamarca");
        paises.add("Islas Faena");
        paises.add("Islandia");
        mostrarLista(paises);
        Iterator<String> it = paises.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals("Argentina")) {
                it.remove();
            }
        }
        System.out.println("");
        mostrarLista(paises);
    }

    public static void mostrarLista(TreeSet<String> paises) {
        for (String aux : paises) {
            System.out.println(aux);
        }
    }
}
// TODO code application logic here

