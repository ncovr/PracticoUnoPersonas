import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Variables

        // 2 objetos Persona
        Persona eva00 = new Persona("Rei", "Ayanami", "Gonzales", 30, 3, 2001);
        Persona eva01 = new Persona("Shinji", "Ikari", "Torres", 6, 6, 2001);

        // Desplegar nombres de los 2 objetos
        System.out.println(eva00.getNombre());
        System.out.println(eva01.getNombre()+"\n");

        // Desplegar todos los datos de cada uno de los objetos Persona
        System.out.println(eva00.toString());
        System.out.println(eva01.toString());

        // Desplegar si son iguales

    }
}
