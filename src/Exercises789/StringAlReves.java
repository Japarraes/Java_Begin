package Exercises789;

public class StringAlReves {

    public static void main(String[] args) {

        String cadenaAlReves = reverse("abcdefghijklmnopqrstuvwxyz");
        System.out.println(cadenaAlReves);

    }

    public static String reverse(String texto) {

        String textoAlReves = "";

        for (int i = 0; i <texto.length(); i++) {
            textoAlReves = texto.charAt(i) + textoAlReves;
        }

        return textoAlReves;
    }
}
