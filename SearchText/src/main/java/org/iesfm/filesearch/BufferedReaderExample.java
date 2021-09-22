package org.iesfm.filesearch;

import java.util.Scanner;

public class BufferedReaderExample {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {

        System.out.println("-----------Introduce un numero---------------");
        System.out.println("1.Buscar");
        System.out.println("2.salir");
        int answerNumber = scan.nextInt();
        scan.nextLine();


        while (answerNumber != 2) {
            System.out.println("introduce el texto a buscar ");
            String text = scan.nextLine();

            int number = SearchTextExample.search(text);

            System.out.println("\n" + "se ha encontrado " + number + "\n");

            System.out.println("¿desea continuar?\n" + "\nBuscar \n" + "\n2.salir");
            answerNumber = scan.nextInt();
            scan.nextLine();
        }
    }
}
