import java.util.Scanner;

public class TestPila {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Pila miStack = new Pila();
        
        int op,nro;
        do{
            System.out.println("\t***************************************");
            System.out.println("\t             Pila dinamica             ");
            System.out.println("\t***************************************");
            System.out.println("\t 1. Apilar elemento                    ");
            System.out.println("\t 2. Desapilar elemento                 ");
            System.out.println("\t 3. Mostrar Pila                       ");
            System.out.println("\t 4. Vaciar Pila                        ");
            System.out.println("\t 5. Salir                              ");
            System.out.println("\t***************************************");
            System.out.print("\tIngrese una opcion: ");
            op = entrada.nextInt();
            
            switch(op){
                case 1: System.out.print("\tApilar nro: ");
                        nro = entrada.nextInt();
                        miStack.insertar(nro);
                        break;
                case 2: miStack.quitar();
                        break;
                case 3: System.out.println("\tPila tam: "+miStack.getTam());
                        miStack.mostrarPila();
                        break;
                case 4: miStack.limpiarPila();
                        System.out.println("\tPila vacia: "+miStack.pilaVacia());
                        break;
                case 5: System.out.println("\tGood bye!");
                        break;
                default:
                    System.out.println("\t[msgError]: Opcion no valida.");
            }
            
        }while(op!=5);   
    }
}
