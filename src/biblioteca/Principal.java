package biblioteca;
import java.util.Scanner;

public class Principal {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int opcion;
        boolean favoritoLibro = false;
        int auxLibros=0;
        int auxOpcion;
        do{

            Libro [] libros= new Libro[10];
            Autor [] autores = new Autor[10];

            System.out.println("\t Mi Biblioteca");
            System.out.println("\t Escoja una opcion");
            System.out.println("\t 1. Ingresar un nuevo libro");
            System.out.println("\t 2. Libros Favoritos");
            System.out.println("\t 3. Libros de cada autor");
            System.out.println("\t 4. Salir");
            opcion= scan.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Cuantos libros desea ingresar: ");
                    auxLibros= scan.nextInt();
                    if(auxLibros>10){
                        System.out.println("No se puede ingresar mas de 10 libros");
                        break;
                    }

                    for(int i=0; i<auxLibros; i++){
                        System.out.println("Ingrese el nombre del libro: ");
                        scan.nextLine();
                        String nombrel = scan.nextLine();
                        System.out.println("Ingrese el año del libro: ");
                        int anio = scan.nextInt();
                        System.out.println("Este es uno de sus libros favoritos:  1 = si 2= no");
                        int favorito= scan.nextInt();

                        if(favorito==1) {
                            favoritoLibro= true;

                        }else if(favorito==2){
                            favoritoLibro= false;
                        }else{
                            System.out.println("Opciion incorrecta");
                            break;
                        }
                        System.out.println("Ingrese el nombre del autor: ");
                        scan.nextLine();
                        String nombreAutor= scan.nextLine();
                        System.out.println("Pais de origen: ");
                        String pais= scan.nextLine();
                        autores[i]= new Autor(nombreAutor,pais);
                        libros[i].setAutor(autores);

                        libros[i]= new Libro(nombrel,autores,anio,favoritoLibro);

                        //System.out.println(libros[i]);
                    }

                    break;
                case 2:
                    for(int j=0; j<1; j++){
                        if(libros[j]==null){
                            System.out.println("No existen libros ingresados");
                            break;
                       }
                        System.out.println("Libros favoritos");
                            for(int i=0; i<libros.length; i++){
                                if(favoritoLibro== true){
                                    System.out.println(libros[i]);
                                }else{
                                    System.out.println("No existen libros favoritos");
                                }
                            }
                    }

                   break;
                case 3:
                    for(int i=0; i<autores.length; i++){
                        System.out.println("Autor" +(i+1)+" " + autores[i] +"\n" );
                    }

                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opccion invalida");
                    break;

            }
        }while(opcion!=4);


    }

}
