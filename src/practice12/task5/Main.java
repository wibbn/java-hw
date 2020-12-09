package practice12.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input file name: ");

        String fileName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        catch (IOException e) {
            System.out.println("Read file error: wrong file name");
            return;
        }

        String content;
        try {
            content = Files.readString(Paths.get(fileName));
        }
        catch (IOException e) {
            System.out.println("Read file error");
            return;
        }

        String[] words = content.split(" ");

        var result = getLine(words);
        System.out.println(result);
    }

    public static String getLine(String... words) {
        if (words == null || words.length == 0 || words[0].equals(""))
            return "";
        if (words.length == 1)
            return words[0];

        var wordsList = new ArrayList<>(Arrays.asList(words));

        while (wordsList.contains(""))
            wordsList.remove("");

        while (!isContinues(wordsList)) {
            Collections.shuffle(wordsList);
        }

        var result = new StringBuilder();
        for (var word : wordsList)
            result.append(word).append(" ");

        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

    public static boolean isContinues(ArrayList<String> wordsList) {
        for (int i = 0; i < wordsList.size() - 1; ++i) {
            var firstWord = wordsList.get(i).toLowerCase();
            var secondWord = wordsList.get(i + 1).toLowerCase();

            if (firstWord.toLowerCase().charAt(firstWord.length() - 1) != secondWord.toLowerCase().charAt(0))
                return false;
        }

        return true;
    }
}