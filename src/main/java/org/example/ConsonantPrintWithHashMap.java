package org.example;

import java.util.HashMap;
import java.util.Map;

public class ConsonantPrintWithHashMap {


        private static boolean isConsonant(char ch){
            return Character.isLetter(ch) && !"aeiou".contains(String.valueOf(ch));
        }
        public static void main(String[] args) {
            String[] city = {"Mumbai","Delhi","Dubai","Meerut"};
            Map<Character, Integer> constFreq = new HashMap<>();
            for(String word : city){
                int consonantCount = 0;
                //StringBuilder consonants = new StringBuilder();

                String lowerCaseWord = word.toLowerCase();

                for(char ch : lowerCaseWord.toCharArray()){
                    if(isConsonant(ch)){
                        //consonants.append(ch).append(" ");
                        //consonantCount++;
                        constFreq.put(ch, constFreq.getOrDefault(ch, 0) +1);
                    }
                }



            }
            for(Map.Entry<Character, Integer> entry : constFreq.entrySet()){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }

        }


}
