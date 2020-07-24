
package mypackage;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class JulesVerneMain {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("C:\\Users\\Tsosman\\Documents\\NetBeansProjects\\FTJ15exercise4\\aJourneyToTheInteriorOfTheEarth.txt");
        Scanner sc = new Scanner(file);
        Map<String, Integer> map = new TreeMap();
        countWords(sc,map);
        userInput(map);
        find500amount(sc,map);
        
    }
   
    public static void countWords(Scanner sc, Map<String, Integer> map){
       
        
        while(sc.hasNext()){
            
            String leksi=sc.next();
            if(map.containsKey(leksi)){
                map.put(leksi, map.get(leksi) + 1);
            }else{
                map.put(leksi,1);
            }
        }
        System.out.println("All the words in the book ---->\n" + map); 
    }
    
    public static void userInput(Map<String, Integer> map){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Which word's report do you want?");
        String leksi = sc.next();
        
        if(map.containsKey(leksi))
            System.out.println("Word report: " + map.get(leksi));
        }
    
    public static void find500amount(Scanner sc, Map<String,Integer> map){
        
        map.entrySet().stream().filter((word500) -> (word500.getValue()>=500)).forEachOrdered((word500) -> {
            System.out.printf("Word: \"%s\" was found %d times.\n",word500.getKey(),word500.getValue());
        });
        
    }
    
    
}
