import org.lessons.java.ciclabile.Ciclabile;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Avvio il programma");
        int array[] = { 1, 2, 3, 4, 5 };
        Ciclabile c = new Ciclabile(array);
        System.out.println("Il primo elemento è: " + c.getElementoSuccessivo());
        System.out.println("Ci sono ancora elementi? " + c.haAncoraElementi());
        System.out.println("Il secondo elemento è: " + c.getElementoSuccessivo());
        System.out.println("Ci sono ancora elementi? " + c.haAncoraElementi());
    }
}
