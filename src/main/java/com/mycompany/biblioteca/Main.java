/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ronal
 */
public class Main {
    
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
    }
    //////////////////////////////////////////////////////////////////////////
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
    
}
