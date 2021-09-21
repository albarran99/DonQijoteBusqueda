package org.iesfm.filesearch;

import java.util.Scanner;

public class BufferedReaderExample {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Runnable firtsLine = new Runnable() {
            @Override
            public void run() {
                mainMenu();
            }
        };

        Thread firstThread = new Thread(firtsLine);
        firstThread.start();

    }

    public static void mainMenu() {
        Runnable secondLine = new Runnable() {
            @Override
            public void run() {
                System.out.println("-----------Introduce un numero---------------");
                System.out.println("1.Buscar");
                System.out.println("2.salir");
                int answerNumber = scan.nextInt();


                while (answerNumber == 1) {
                    System.out.println("introduce el texto a buscar \n");
                    String text = scan.nextLine();

                    int number = SearchTextExample.Search(text);

                    System.out.println("se ha encontrado " + number);

                    System.out.println("¿desea continuar?\n" + "\nBuscar \n" + "\n2.salir");
                    answerNumber = scan.nextInt();
                }
            }
        };

        Thread secondThread = new Thread(secondLine);
        secondThread.start();
    }
}
