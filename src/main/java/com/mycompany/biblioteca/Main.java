/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author ronal
 */
public class Main {
    
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Libro> libros = new ArrayList<>();
    static ArrayList<Prestamo> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
   public static void main(String[] args) {
    int opcion;
    
    do {
        System.out.println("\n===== SISTEMA DE GESTION DE BIBLIOTECA =====");
        System.out.println("1. Crear cliente");
        System.out.println("2. Listar clientes");
        System.out.println("3. Buscar cliente");
        System.out.println("4. Actualizar cliente");
        System.out.println("5. Eliminar cliente");
        System.out.println("6. Crear libro");
        System.out.println("7. Listar libros");
        System.out.println("8. Buscar libro");
        System.out.println("9. Actualizar libro");
        System.out.println("10. Eliminar libro");
        System.out.println("11. Registrar prestamo");
        System.out.println("12. Registrar devolucion");
        System.out.println("13. Listar prestamos");
        System.out.println("0. Salir");
        System.out.print("Elija una opcion: ");
        
        opcion = Integer.parseInt(sc.nextLine());
        
        switch (opcion) {
            case 1: crearCliente(); break;
            case 2: listarClientes(); break;
            case 3: buscarCliente(); break;
            case 4: actualizarCliente(); break;
            case 5: eliminarCliente(); break;
            case 6: crearLibro(); break;
            case 7: listarLibros(); break;
            case 8: buscarLibro(); break;
            case 9: actualizarLibro(); break;
            case 10: eliminarLibro(); break;
            case 11: registrarPrestamo(); break;
            case 12: registrarDevolucion(); break;
            case 13: listarPrestamos(); break;
            case 0: System.out.println("Saliendo..."); break;
            default: System.out.println("Opcion invalida.");
        }
        
    } while (opcion != 0);
}
    ///////////////////metodod cliente///////////////////////////////////////////////////////
    public static void crearCliente() {
    System.out.println("--- Crear Cliente ---");
    
    System.out.print("Nombre: ");
    String nombre = sc.nextLine();
    
    System.out.print("Id: ");
    String id = sc.nextLine();
    
    System.out.print("Telefono: ");
    String telefono = sc.nextLine();
    
    System.out.print("Email: ");
    String email = sc.nextLine();
    
    Cliente c = new Cliente(email, nombre, id, telefono);
    clientes.add(c);
    
    System.out.println("Cliente creado exitosamente.");
    }
    //////////////////////////////////////////////////////////////////////////
    public static void listarClientes() {
    System.out.println("--- Lista de Clientes ---");
    
    if (clientes.isEmpty()) {
        System.out.println("No hay clientes registrados.");
        return;
        }
    
    for (Cliente c : clientes) {
        System.out.println("Id: " + c.getId() + " | Nombre: " + c.getNombre() 
                + " | Telefono: " + c.getTelefono() + " | Email: " + c.getEmail());
     }
    
    }
    ////////////////////////////////////////////////////////////////////////////
    public static void buscarCliente() {
    System.out.print("Ingrese el id del cliente a buscar: ");
    String idBuscado = sc.nextLine();
    
    for (Cliente c : clientes) {
        if (c.getId().equals(idBuscado)) {
            System.out.println("Cliente encontrado:");
            System.out.println("Id: " + c.getId() + " | Nombre: " + c.getNombre() 
                    + " | Telefono: " + c.getTelefono() + " | Email: " + c.getEmail());
            return;
         }
    }
    
    System.out.println("Cliente no encontrado.");
    }
    ///////////////////////////////////////////////////////////////////////////////
    public static void actualizarCliente() {
    System.out.print("Ingrese el id del cliente a actualizar: ");
    String idBuscado = sc.nextLine();
    
    for (Cliente c : clientes) {
        if (c.getId().equals(idBuscado)) {
            System.out.print("Nuevo nombre: ");
            String nombre = sc.nextLine();
            
            System.out.print("Nuevo telefono: ");
            String telefono = sc.nextLine();
            
            System.out.print("Nuevo email: ");
            String email = sc.nextLine();
            
            c.setNombre(nombre);
            c.setTelefono(telefono);
            c.setEmail(email);
            
            System.out.println("Cliente actualizado exitosamente.");
            return;
        }
    }
    
    System.out.println("Cliente no encontrado.");
    }
    ///////////////////////////////////////////////////////////////////////////////
    public static void eliminarCliente() {
    System.out.print("Ingrese el id del cliente a eliminar: ");
    String idBuscado = sc.nextLine();
    
    for (Cliente c : clientes) {
        if (c.getId().equals(idBuscado)) {
            clientes.remove(c);
            System.out.println("Cliente eliminado exitosamente.");
            return;
        }
    }
    
    System.out.println("Cliente no encontrado.");
    }
    ////////////////////////metodos de libro////////////////////////////////////////
    public static void crearLibro() {
    System.out.println("--- Crear Libro ---");
    
    System.out.print("Codigo: ");
    String codigo = sc.nextLine();
    
    System.out.print("Titulo: ");
    String titulo = sc.nextLine();
    
    System.out.print("Anio de publicacion: ");
    String anio = sc.nextLine();
    
    System.out.print("Autor: ");
    String autor = sc.nextLine();
    
    Libro l = new Libro(autor, true, codigo, titulo, anio);
    libros.add(l);
    
    System.out.println("Libro creado exitosamente.");
}

public static void listarLibros() {
    System.out.println("--- Lista de Libros ---");
    
    if (libros.isEmpty()) {
        System.out.println("No hay libros registrados.");
        return;
    }
    
    for (Libro l : libros) {
        System.out.println("Codigo: " + l.getCodigo() + " | Titulo: " + l.getTitulo() 
                + " | Autor: " + l.getAutor() + " | Anio: " + l.getAnioPublicacion()
                + " | Disponible: " + l.isDisponible());
    }
}

public static void buscarLibro() {
    System.out.print("Ingrese el codigo del libro a buscar: ");
    String codigoBuscado = sc.nextLine();
    
    for (Libro l : libros) {
        if (l.getCodigo().equals(codigoBuscado)) {
            System.out.println("Libro encontrado:");
            System.out.println("Codigo: " + l.getCodigo() + " | Titulo: " + l.getTitulo() 
                    + " | Autor: " + l.getAutor() + " | Anio: " + l.getAnioPublicacion()
                    + " | Disponible: " + l.isDisponible());
            return;
        }
    }
    
    System.out.println("Libro no encontrado.");
}

public static void actualizarLibro() {
    System.out.print("Ingrese el codigo del libro a actualizar: ");
    String codigoBuscado = sc.nextLine();
    
    for (Libro l : libros) {
        if (l.getCodigo().equals(codigoBuscado)) {
            System.out.print("Nuevo titulo: ");
            String titulo = sc.nextLine();
            
            System.out.print("Nuevo autor: ");
            String autor = sc.nextLine();
            
            System.out.print("Nuevo anio de publicacion: ");
            String anio = sc.nextLine();
            
            l.setTitulo(titulo);
            l.setAutor(autor);
            l.setAnioPublicacion(anio);
            
            System.out.println("Libro actualizado exitosamente.");
            return;
        }
    }
    
    System.out.println("Libro no encontrado.");
}

public static void eliminarLibro() {
    System.out.print("Ingrese el codigo del libro a eliminar: ");
    String codigoBuscado = sc.nextLine();
    
    for (Libro l : libros) {
        if (l.getCodigo().equals(codigoBuscado)) {
            libros.remove(l);
            System.out.println("Libro eliminado exitosamente.");
            return;
        }
    }
    
    System.out.println("Libro no encontrado.");
}
////////////////metodos prestamos//////////////////////////////////////////////////////////
   public static void registrarPrestamo() {
    System.out.println("--- Registrar Prestamo ---");
    
    System.out.print("Id del cliente: ");
    String idCliente = sc.nextLine();
    Cliente clienteEncontrado = null;
    for (Cliente c : clientes) {
        if (c.getId().equals(idCliente)) {
            clienteEncontrado = c;
        }
    }
    if (clienteEncontrado == null) {
        System.out.println("Cliente no encontrado.");
        return;
    }
    
    System.out.print("Codigo del libro: ");
    String codigoLibro = sc.nextLine();
    Libro libroEncontrado = null;
    for (Libro l : libros) {
        if (l.getCodigo().equals(codigoLibro)) {
            libroEncontrado = l;
        }
    }
    if (libroEncontrado == null) {
        System.out.println("Libro no encontrado.");
        return;
    }
    if (!libroEncontrado.isDisponible()) {
        System.out.println("El libro no esta disponible.");
        return;
    }
    
    System.out.print("Id del prestamo: ");
    String idPrestamo = sc.nextLine();
    
    Prestamo p = new Prestamo(idPrestamo, clienteEncontrado, libroEncontrado, LocalDate.now(), "activo");
    prestamos.add(p);
    libroEncontrado.setDisponible(false);
    
    System.out.println("Prestamo registrado exitosamente.");
}
   public static void registrarDevolucion() {
    System.out.print("Id del prestamo a devolver: ");
    String idPrestamo = sc.nextLine();
    
    for (Prestamo p : prestamos) {
        if (p.getIdPrestamo().equals(idPrestamo)) {
            p.setEstado("devuelto");
            p.getLibro().setDisponible(true);
            System.out.println("Devolucion registrada exitosamente.");
            return;
        }
    }
    
    System.out.println("Prestamo no encontrado.");
}
   public static void listarPrestamos() {
    System.out.println("--- Lista de Prestamos ---");
    
    if (prestamos.isEmpty()) {
        System.out.println("No hay prestamos registrados.");
        return;
    }
    
    for (Prestamo p : prestamos) {
        System.out.println("Id Prestamo: " + p.getIdPrestamo() 
                + " | Cliente: " + p.getCliente().getNombre() 
                + " | Libro: " + p.getLibro().getTitulo() 
                + " | Fecha: " + p.getFecha() 
                + " | Estado: " + p.getEstado());
    }
}
}
