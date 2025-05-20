import org.lessons.java.ciclabile.Ciclabile;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Avvio il programma");
        int array[] = { 1, 2, 3, 4, 5 };
        Ciclabile c = new Ciclabile(array);
        System.out.println(c);
        System.out.println("Il primo elemento è: " + c.getElementoSuccessivo());
        System.out.println("Ci sono ancora elementi? " + c.haAncoraElementi());
        System.out.println("Il secondo elemento è: " + c.getElementoSuccessivo());
        System.out.println("Ci sono ancora elementi? " + c.haAncoraElementi());
        System.out.println("Il terzo elemento è: " + c.getElementoSuccessivo());
        System.out.println("Ci sono ancora elementi? " + c.haAncoraElementi());
        System.out.println("Il quarto elemento è: " + c.getElementoSuccessivo());
        System.out.println("Ci sono ancora elementi? " + c.haAncoraElementi());
        System.out.println("Il quinto elemento è: " + c.getElementoSuccessivo());
        System.out.println("Ci sono ancora elementi? " + c.haAncoraElementi());
        Ciclabile c2 = new Ciclabile();
        System.out.println("il primo elemento è: " + c2.getElementoSuccessivo());
        System.out.println("Ci sono ancora elementi? " + c2.haAncoraElementi());
        System.out.println("il secondo elemento è: " + c2.getElementoSuccessivo());
        System.out.println("Ci sono ancora elementi? " + c2.haAncoraElementi());
        c2.addElemento(100);
        System.out.println("Ci sono ancora elementi? " + c2.haAncoraElementi());
        System.out.println("il terzo elemento è: " + c2.getElementoSuccessivo());
        System.out.println("Ci sono ancora elementi? " + c2.haAncoraElementi());
    }
}
