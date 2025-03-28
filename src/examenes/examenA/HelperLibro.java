package examenes.examenA;

import java.util.Random;

public class HelperLibro {
    public static String generaISB(Idioma idioma) {
        StringBuilder builder = new StringBuilder();
        switch (idioma) {
            case INGLES -> builder.append(new Random().nextInt(2)); //genera un 0 ó 1
            case FRANCES -> builder.append(2);
            case ESPAÑOL -> builder.append(84);
        }
        for (int i = 0; i < 9; i++)
            builder.append(new Random().nextInt(10)); //genera un nº entre 0 y 9 ambos inclusivos
        if (idioma.equals(Idioma.ESPAÑOL))
            builder.delete(builder.length() - 2, builder.length() -1); //en español quitamos el último, pues hemos añadido ya dos nº al principio
        return builder.toString();
    }
    public static Idioma getIdiomaDadoISBN(String isbn) {
        if (isbn.matches("[10][0-9]{9}"))
            return Idioma.INGLES;
        else if (isbn.matches("2[0-9]{9}"))
            return Idioma.FRANCES;
        else if (isbn.matches("84[0-9]{8}"))
            return Idioma.ESPAÑOL;
        else
            return null;
    }
    public static void main(String[] args) {
        String isbn = "";
        for (int i = 0; i < 5; i++) {
            isbn = generaISB(Idioma.INGLES);
            System.out.printf("ISBN inglés: %s%n", isbn); //para comprobar que sale el 0 y el 1
            System.out.printf("Idioma %s: %s%n", isbn, getIdiomaDadoISBN(isbn));
        }
        isbn = generaISB(Idioma.FRANCES);
        System.out.printf("ISBN francés: %s%n", isbn);
        System.out.printf("Idioma %s: %s%n", isbn, getIdiomaDadoISBN(isbn));
        isbn = generaISB(Idioma.ESPAÑOL);
        System.out.printf("ISBN español: %s%n", isbn);
        System.out.printf("Idioma %s: %s%n", isbn, getIdiomaDadoISBN(isbn));
        System.out.printf("Idioma %s: %s%n", "98746543210", getIdiomaDadoISBN("98746543210"));

    }


}
