import java.util.Scanner;
import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuario {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Introduce el nombre:");
                String nombre = sc.nextLine();

                System.out.println("Introduce tu edad:");
                int edad = sc.nextInt();

                System.out.println("Introduce tu correo electronico:");
                String correo = sc.nextLine();

                boolean correovalido = ProcesadorTexto.esEmailValido(correo);
                boolean edadValida = edad > 0 && edad < 120;
                Boolean nombreValido=nombre.length ( )>2 && nombre.length()<7;

                if (correovalido && edadValida && nombreValido) {
                        new Usuario (nombre, edad, correo);
                } else {
                        System.out.println("El usuario no puede ser creado porque el email introducido no es válido.");

                        String name = "samai";
                        System.out.println("El nombre es:;" + name.substring(0, 1).toUpperCase()
                                        + name.substring(1).toLowerCase());

                        sc.close();

                }
        }
}
