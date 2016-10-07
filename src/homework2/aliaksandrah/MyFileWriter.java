package homework2.aliaksandrah;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyFileWriter {
	public static void writeDataFile(List<String> str){
    	try {

            FileWriter myFile2 = new FileWriter("unique.txt");
            BufferedWriter outStream = new BufferedWriter(myFile2);
            for (int k = 0; k < str.size(); k++){
                outStream.write(str.get(k) + "\n");  
            }
            outStream.close();
            //System.out.println("Data saved.");
        } catch(IOException e){
                     e.printStackTrace();
       }
	}
}
