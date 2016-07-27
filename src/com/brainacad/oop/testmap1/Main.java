package com.brainacad.oop.testmap1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        MyTranslator myTranslator = new MyTranslator();

        myTranslator.addNewWord("cat", "кот");
        myTranslator.addNewWord("caught", "поймал");
        myTranslator.addNewWord("mouse", "мышь");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово или предложение...");
        String word = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(word);
        List<String> strings = new ArrayList<>();

        while (stringTokenizer.hasMoreElements()) {
            strings.add((String) stringTokenizer.nextElement());
        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.print(myTranslator.translate(iterator.next()) + " ");
        }
    }
}
