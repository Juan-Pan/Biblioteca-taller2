package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        //iniciamos la lista de recursos
        List<Libro> libros = new ArrayList<>();
        List<Pelicula> peliculas = new ArrayList<>();
        List<Revista> revistas = new ArrayList<>();
        // iniciamos los objetos de cada clase
        Libro libro1 = new Libro("Rebelion en la granja ", 1945, "Una novela sobre el poder", "George orwell", 112, "Novela");
        Pelicula pelicula1 = new Pelicula("El padrino", 1972, "Una pelicula sobre la mafia", "Francis Ford Coppola", 175, "Drama");
        Revista revista1 = new Revista("National Geographic", 2020, "Una revista sobre la naturaleza", "National Geographic Society", 1, "Naturaleza");
        Usuario usuario1 = new Usuario("Pablo Garcia", 21, 1, null);

        // agregamos a una lista recurso para poder mostrar los recursos disponibles
        libros.add(libro1);
        peliculas.add(pelicula1);
        revistas.add(revista1);

        boolean salir = false;
        //iniciamos menu
        do {
            System.out.println("Bienvenido a la bibioteca");
            System.out.println("1. Mostrar recursos disponibles");
            System.out.println("2. Mostrar recursos prestados");
            System.out.println("3. Prestar recurso");
            System.out.println("4. Devolver recurso");
            System.out.println("5. Crear recurso");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Recursos disponibles: ");
                    System.out.println("Libros: ");
                    for (Libro libro : libros) {
                        System.out.println(libro.getTitulo() + " - " + libro.getAñoPublicacion());
                    }
                    System.out.println("Peliculas: ");
                    for (Pelicula pelicula : peliculas) {
                        System.out.println(pelicula.getTitulo() + " - " + pelicula.getAñoPublicacion());
                    }
                    System.out.println("Revistas: ");
                    for (Revista revista : revistas) {
                        System.out.println(revista.getTitulo() + " - " + revista.getAñoPublicacion());
                    }
                    System.out.println("");
                }
                case 2 -> {
                    System.out.println("Recursos prestados: ");
                    if (usuario1.getRecursosPrestados().isEmpty()) {
                        System.out.println("No hay recursos prestados");
                    } else {
                        for (Recurso recurso : usuario1.getRecursosPrestados()) {
                            ;
                            System.out.println(recurso.getTitulo() + " - " + recurso.getAñoPublicacion());
                        }
                    }
                    System.out.println("");
                }
                case 3 -> {
                    System.out.print("Ingrese el titulo del recurso a prestar: ");
                    String titulo = scanner.nextLine().trim();
                    Recurso recursoEncontrado = null;

                    for (Libro libro : libros) {
                        if (titulo.equalsIgnoreCase(libro.getTitulo().trim())) {
                            recursoEncontrado = libro;
                            break;
                        }
                    }
                    if (recursoEncontrado == null) {
                        for (Pelicula pelicula : peliculas) {
                            if (titulo.equalsIgnoreCase(pelicula.getTitulo().trim())) {
                                recursoEncontrado = pelicula;
                                break;
                            }
                        }
                    }
                    if (recursoEncontrado == null) {
                        for (Revista revista : revistas) {
                            if (titulo.equalsIgnoreCase(revista.getTitulo().trim())) {
                                recursoEncontrado = revista;
                                break;
                            }
                        }
                    }

                    if (recursoEncontrado == null) {
                        System.out.println("Recurso no encontrado");
                    } else {
                        usuario1.agregarRecurso(recursoEncontrado);
                        if (recursoEncontrado instanceof Libro) {
                            libros.remove(recursoEncontrado);
                        } else if (recursoEncontrado instanceof Pelicula) {
                            peliculas.remove(recursoEncontrado);
                        } else {
                            revistas.remove(recursoEncontrado);
                        }
                        System.out.println("Recurso prestado correctamente");
                    }
                }
                case 4 -> {
                    System.out.print("Ingrese el titulo a devolver: ");
                    String titulo = scanner.nextLine().trim();
                    boolean encontrado = false;
                    for (Recurso recursoPrestado : usuario1.getRecursosPrestados()) {
                        if (titulo.equalsIgnoreCase(recursoPrestado.getTitulo().trim())) {
                            usuario1.quitarRecurso(recursoPrestado);
                            if (recursoPrestado instanceof Libro) {
                                libros.add((Libro) recursoPrestado);

                            } else if (recursoPrestado instanceof Pelicula) {
                                peliculas.add((Pelicula) recursoPrestado);
                            } else if (recursoPrestado instanceof Revista) {
                                revistas.add((Revista) recursoPrestado);
                            }
                            encontrado = true;
                            System.out.println("Recurso devuelto correctamente");
                            break;
                        }
                    }
                    if (encontrado == false) {
                        System.out.println("Recurso no encontrado");
                    }
                }
                case 5 -> {
                    System.out.print("Seleccione el recurso que quiere crear (libro, pelicula, revista): ");
                    String tipoRecurso = scanner.nextLine().trim().toLowerCase();
                    switch (tipoRecurso) {
                        case "libro" -> {
                            System.out.print("Ingrese el titulo del libro: ");
                            String titulo = scanner.nextLine().trim();
                            System.out.print("Ingrese el año de publicacion del libro: ");
                            int añoPublicacion = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Ingrese el resumen del libro: ");
                            String resumen = scanner.nextLine().trim();
                            System.out.print("Ingrese el autor del libro: ");
                            String autor = scanner.nextLine().trim();
                            System.out.print("Ingrese el numero de paginas del libro: ");
                            int numeroPaginas = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Ingrese el genero del libro: ");
                            String genero = scanner.nextLine().trim();
                            Libro libro = new Libro(titulo, añoPublicacion, resumen, autor, numeroPaginas, genero);
                            libros.add(libro);
                            System.out.println("Libro añadido a la biblioteca");

                        }
                        case "pelicula" -> {
                            System.out.print("Ingrese el titulo de la pelicula: ");
                            String titulo = scanner.nextLine().trim();
                            System.out.print("Ingrese el año de publicacion de la pelicula: ");
                            int añoPublicacion = Integer.parseInt(scanner.nextLine());
                            System.out.print("Ingrese el resumen de la pelicula: ");
                            String resumen = scanner.nextLine().trim();
                            System.out.print("Ingrese el director de la pelicula: ");
                            String director = scanner.nextLine().trim();
                            System.out.print("Ingrese la duracion de la pelicula: ");
                            int duracion = Integer.parseInt(scanner.nextLine());
                            System.out.print("Ingrese el genero de la pelicula: ");
                            String genero = scanner.nextLine().trim();
                            Pelicula pelicula = new Pelicula(titulo, añoPublicacion, resumen, director, duracion, genero);
                            peliculas.add(pelicula);
                            System.out.println("Pelicula añadida a la biblioteca");

                        }
                        case "revista" -> {
                            System.out.print("Ingrese el titulo de la revista: ");
                            String titulo = scanner.nextLine().trim();
                            System.out.print("Ingrese el año de publicacion de la revista: ");
                            int añoPublicacion = Integer.parseInt(scanner.nextLine());
                            System.out.print("Ingrese el resumen de la revista: ");
                            String resumen = scanner.nextLine().trim();
                            System.out.print("Ingrese el editor de la revista: ");
                            String editor = scanner.nextLine().trim();
                            System.out.print("Ingrese el numero de edicion de la revista: ");
                            int numeroEdicion = Integer.parseInt(scanner.nextLine());
                            System.out.print("Ingrese el tema de la revista: ");
                            String tema = scanner.nextLine().trim();
                            Revista revista = new Revista(titulo, añoPublicacion, resumen, editor, numeroEdicion, tema);
                            revistas.add(revista);
                            System.out.print("Revista añadida a la biblioteca");
                        }
                        default -> {
                            System.out.println("Tipo de recurso no valido");
                        }
                    }

                }
                case 6 -> {
                    salir = true;
                    System.out.println("Gracias por usar la biblioteca");
                }
                default -> System.out.println("Opcion no valida");
            }
        } while (salir == false);

    }

}
