/*
*Your mission is to write a small Java program that proves whether Green Eggs and Ham 
*really uses only 50 different words. You’ll start with two things: an empty Main class 
and a text file that contains the entire story. Your job is to read the file line by 
line and use appropriate skills to see count the number of words. How you do this is up to you!
*/

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
   

    public static void main(String[] args) throws Exception {
        String file = "greenEggsAndHam.txt";
        int amount = 0;
        
    // }
    // public static ArrayList<String> readRecordsFromFile(String file) {
       
      ArrayList<String> list = new ArrayList<>();
        
        try (Scanner data = new Scanner(Paths.get(file))) {
       
    // we read the file until all lines have been read
    while (data.hasNextLine()) {
        // we read one line
        String row = data.nextLine();
        // we print the line that we read
        
        String[] parts = row.split(" ");
        for (String word : parts){
            String[] split = word.split("-");
            for(String splits : split){
                String one = splits.toLowerCase();
                String two = one.replace("!", "");
                String three = two.replace(",", "");
                String four = three.replace(".", "");
                String five = four.replace("?", "");
                String six = five.replace("", "");
              
            if(!list.contains(six) && !six.isEmpty()){
             list.add(six);
               System.out.println(six);
             amount++;
           
         }
 
          
            }
            
        
       
        }
       
     
       
         
        
    }
    

} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
System.out.println(list.size());
 

    }

}
