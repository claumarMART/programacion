import java.util.ArrayList;
import java.util.Scanner;

public class menu2 {
    public static int mostrar_menu() {
        Scanner in = new Scanner(System.in);
        int resp = 0;
        boolean salir = false;
        do {
            try {
                System.out.println(
                        "1. Añadir nombre\n" +
                               "2. Quitar nombre\n" +
                                "3. Listar nombre\n" +
                                "4. Buscar nombre\n" +
                                "5. Salir"
                );
                System.out.println("Elige la opción deseada");
                resp = Integer.parseInt(in.nextLine());
                salir = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Ya existe el número añadido");
                in.nextLine();
            }
        }while (!salir) ;
            return resp;

        }
        public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int resp;
        ArrayList lista = new ArrayList();
        String aux;
        do{
            resp=mostrar_menu();
            switch (resp){
                case 1:
                    System.out.println("Introduce un nombre:");
                    aux = in.nextLine();
                    lista.add(aux);
                    break;

                case 2:
                    System.out.println("Quitar un nombre");
                    aux= in.nextLine();
                    lista.remove(aux);
                    break;

                case 3:
                    System.out.println("Listar nombres");
                    aux=in.nextLine();
                    public void sublist (int )

            }
        }


        }


    }

