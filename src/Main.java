import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean salir = false;
        while (salir== false) {
            System.out.println("introduzca un numero, puede ser decimal");
            Scanner sc = new Scanner(System.in);
            float num = sc.nextFloat();

            ImplementarCola.crearCola(ImplementarCola.length);
            ImplementarCola.enqueue(num);
            for (int i = 0; i<ImplementarCola.data.length; i++) {
                System.out.println(ImplementarCola.data[i]);
            }

            System.out.println("desea eliminar un dato? pulse 1");
            sc = new Scanner(System.in);
            int respuesta = sc.nextInt();
            if (respuesta == 1) {
                ImplementarCola.dequeue();
            }
            System.out.println("desea salir? pulse q");
            sc = new Scanner(System.in);
            String salidaInterna = sc.nextLine();

            if (salidaInterna.equals("q")) {
                salir = true;
            }
        }
        float suma = 0;
        for (int i = 0; i<ImplementarCola.data.length; i++) {
            System.out.println(ImplementarCola.data[i]);
            suma = suma + ImplementarCola.data[i];
        }
        System.out.println("sumados dan: " + suma);
    }
}
