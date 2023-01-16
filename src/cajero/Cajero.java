/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.util.Scanner;

/**
 *
 * @author RubénEzequiel
 */
public class Cajero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaracion de variables 
        String usuario;
        String usuarioVisible = "Ruben9";
        String usuarioX;
        int contraseña;
        int contraseñaVisible = 2911;
        String contraseñaX;
        int saldoinicial = 10000;
        int saldoactual;
        int depositar;
        int retirar;
        int accion;
        boolean salir = false;
        //desarrollo del programa
        System.out.println("¡BIENVENIDO!");
        System.out.println("Ingrese su nombre de usuario");
        usuario = sc.nextLine();
        System.out.println("");
        do {
            if (usuario.equals(usuarioVisible)) {
                System.out.println("");
                break;
            } else if (usuario.equals("0")) {
                System.out.println("Gracias por usar nuestro sistema");
                System.exit(0);
            } else {
                System.out.println("Usuario incorrecto");
                System.out.println("Ingrese su usuario");
                usuario = sc.nextLine();
                System.out.println("");
            }
        } while (usuario != usuarioVisible);
        do {
            System.out.println("Ingrese su contraseña");
            contraseña = sc.nextInt();
            if (contraseña == 2911) {
            } else {
                System.out.println("Contraseña incorrecta");
                System.out.println("");
            }
        } while (contraseña != 2911);
        System.out.println("");
        System.out.println("Bienvenido " + usuario);
        System.out.println("");
        System.out.println("¿Qué desea realizar? ");
        do { //MENU DE OPCIONES
            System.out.println("1. Depositar ");
            System.out.println("2. Retirar plata ");
            System.out.println("3. Mostrar saldo ");
            System.out.println("4. Salir ");
            accion = sc.nextInt();
            switch (accion) {
                case 1: //DEPOSITAR
                    System.out.println("Depositar ");
                    System.out.println("¿Cuánto desea depositar?");
                    depositar = sc.nextInt();
                    if (depositar <= 0) {
                        System.out.println("Ingrese un saldo valido");
                        System.out.println("-----");
                        System.out.println("¿Qué desea realizar?");
                    } else {
                        saldoactual = saldoinicial + depositar;
                        System.out.println("Dinero depositado");
                        System.out.println("Su saldo actual es de: " + saldoactual);
                        System.out.println("-----");
                        System.out.println("¿Qué desea realizar?");
                        saldoinicial = saldoactual; //para guardar lo que tengo en saldototal en saldoactual
                    }
                    break;
                case 2: //RETIRAR
                    System.out.println("Retirar plata ");
                    System.out.println("¿Cuánto desea retirar?");
                    retirar = sc.nextInt();
                    if (retirar <= 0) {
                        System.out.println("Retire un saldo valido");
                        System.out.println("-----");
                        System.out.println("¿Qué desea realizar?");
                    } else {
                        saldoactual = saldoinicial - retirar;
                        saldoinicial = saldoactual;
                        System.out.println("Usted retiro " + retirar);
                        System.out.println("Su operacion se realizo correctamente ");
                        System.out.println("-----");
                        System.out.println("¿Qué desea realizar?");
                    }
                    break;
                case 3: //MOSTRAR SALDO
                    System.out.println("Mostrar saldo ");
                    System.out.println("Su saldo actual es de: " + saldoinicial);
                    System.out.println("-----");
                    System.out.println("¿Qué desea realizar?");
                    break;
                case 4: //SALIR
                    System.out.println("Ingrese su usuario");
                    sc.nextLine();
                    usuarioX = sc.nextLine();
                    if (usuarioX.equals("0")) {
                        salir = true;
                    } else {
                        System.out.println("Ingrese su contraseña");
                        contraseñaX = sc.nextLine();
                        System.out.println("Bienvenido " + usuarioX);
                        System.out.println("");
                        System.out.println("¿Qué desea realizar?");
                        System.out.println("");
                    }
                    break;
                default: //POR SI SELECCIONA ALGUAN OPCION QUE NO ESTE ENTRE LAS PLANTEADAS
                    System.out.println("No existe esa opcion");
            }
        } while (!salir);
    }
}