import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Variables

        // 2 objetos Persona
        Persona eva00 = new Persona("Rei", "Ayanami", "Gonzales", 30, 3, 2001);
        Persona eva01 = new Persona("Shinji", "Ikari", "Torres", 6, 6, 2001);

        // Desplegar nombres de los 2 objetos
            System.out.println("\n-Desplegar nombres de los dos objetos");
        System.out.println(eva00.getNombre());
        System.out.println(eva01.getNombre()+"\n");

        // Desplegar todos los datos de cada uno de los objetos Persona
            System.out.println("\n-Desplegar todos los datos de cada objeto creado");
        System.out.println(eva00.toString());
        System.out.println(eva01.toString());

        // Desplegar si son iguales
            System.out.println("\n-Desplegar si eva00 y eva01 son iguales");
        if(eva00.iguales(String.valueOf(eva01))){ // Llama al metodo "iguales". ojo con String.valueof(eva01)
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }

        // Replicar el primer objeto creado
        Persona eva00_2 = new Persona("Rei","Ayanami", "Gonzales",30,3,2001);
        // Consultar si la primera persona y latercera persona son iguales entre si
            System.out.println("\n-Desplegar si la primera persona y la tercera son iguales");
        if(eva00.iguales(String.valueOf(eva00_2))){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintos");
        }

        // Comparar eva00 y eva01 para ver quien es mayor

    }
}
