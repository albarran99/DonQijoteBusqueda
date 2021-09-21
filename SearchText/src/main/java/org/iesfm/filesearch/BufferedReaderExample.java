package org.iesfm.filesearch;

import java.util.Scanner;

public class BufferedReaderExample {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
                mainMenu();
    }

    public static void mainMenu() {
        Runnable firstLine = new Runnable() {
            @Override
            public void run() {
                System.out.println("-----------Introduce un numero---------------");
                System.out.println("1.Buscar");
                System.out.println("2.salir");
                int answerNumber = scan.nextInt();


                while (answerNumber != 2) {
                    System.out.println("introduce el texto a buscar ");
                    String text = scan.next();

                    int number = SearchTextExample.search(text);

                    System.out.println("se ha encontrado " + number);

                    System.out.println("¿desea continuar?\n" + "\nBuscar \n" + "\n2.salir");
                    answerNumber = scan.nextInt();
                }
            }
        };

        Thread firstThread = new Thread(firstLine);
        firstThread.start();
    }
}
