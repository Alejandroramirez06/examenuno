package org.example;

import org.example.modulos.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.println("Bienvenido");
        System.out.println("1. Recogiendo datos del usuario: ");
        System.out.println("Digita tus nombres y apellidos: ");
        usuario.setNombres(teclado.nextLine());

        System.out.println("Digita tu correo electronico: ");
        usuario.setCorreoElectronico(teclado.nextLine());
        System.out.println("...................");
        System.out.println(usuario);
    }
}