

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary{
     
    private String input[];
    List<String> words= new ArrayList<String>();
    public String wordsarray [];

    public Dictionary(){
        input = load("words/words.txt");  
    }
   
    public String[] makenewarray() throws FileNotFoundException {
Scanner sc = new Scanner(new File("words/words.txt"));
   
    while (sc.hasNextLine()) {
     words.add(sc.nextLine());
    }
    wordsarray = words.toArray(new String[0]);
    return wordsarray;
}
   
    public int getSize(){
        return input.length;
    }
   
    public String getWord(int n){
        //return input[n].trim();
        return input[(int)(Math.random()*n)];
    }
   
    private String[] load(String file) {
        File aFile = new File(file);    
        StringBuffer contents = new StringBuffer();
        BufferedReader input = null;
        try {
            input = new BufferedReader( new FileReader(aFile) );
            String line = null;
            int i = 0;
            while (( line = input.readLine()) != null){
                contents.append(line);
                i++;
                contents.append(System.getProperty("line.separator"));
            }
        }catch (FileNotFoundException ex){
            System.out.println("Can't find the file - are you sure the file is in this location: "+file);
            ex.printStackTrace();
        }catch (IOException ex){
            System.out.println("Input output exception while processing file");
            ex.printStackTrace();
        }finally{
            try {
                if (input!= null) {
                    input.close();
                }
            }catch (IOException ex){
                System.out.println("Input output exception while processing file");
                ex.printStackTrace();
            }
        }
        String[] array = contents.toString().split("\n");
        for(String s: array){
            s.trim();
        }
        return array;
    }

	

	
}

