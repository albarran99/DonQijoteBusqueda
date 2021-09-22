package org.iesfm.filesearch;

public class SearchTask implements Runnable {

    private String text;

    public SearchTask(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        SearchTextExample.search(text);
        int number = SearchTextExample.search(text);
        System.out.println("Numero de veces encontrado: " + number);

    }
}
