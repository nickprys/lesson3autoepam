package com.epam.game;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class HangmanGame {

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
    }

    public void start(){
        System.out.println("Hangman game");


            Path path = Paths.get("C:\\Training_Project\\lesson3\\src\\com\\epam\\game\\wordList.txt");
            List<String> words = new ArrayList<>();
            try {
                BufferedReader reader = File.newBufferReader(path);
                String line;
                while ((line = reader.readLine())) != null) {
                        words.add(Line);
                }

            }catch (IOException e);
        {
            System.out.println("Error" + e.getMessage());}


        }catch (Exception e){
                        System.out.println("Exeption");

                        Integer randomInt = ThreadLocalRandom.current().nextInt(0, words.size());
                        String selectedWorld = words.get(randomInt);
                        char[] selectedWorldChars = selectedWorld.toCharArray();



                String maskedWord = "";
                for (int =1; i <= selectedWorld.length(); i++){
            maskedWord = maskedWord + "_";

        }
                char[] maskedWordChars = maskedWord.toCharArray();

        System.out.println(maskedWord);

        do{
                String character = getChar();

                Integer charPosition = selectedWorld.indexOf(character);
                if (charPosition != -1){
                    maskedWordChars[charPosition] = character.charAt(0);

                }
        System.out.println(maskedWordChars);

                boolean userWin = false;
                for (Character c: maskedWordChars){
                    if (c.equals('_')) {
                        userWin = false;
                        break;
                    } else{
                        userWin = true;

                    }
                    }
                } if (userWin=true){
            System.out.println("You are winner!!!");
        }
    }






      public String getChar(){
            System.out.println();
        }
}
