package homework2.aliaksandrah;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WorkingWithStrings {
	
    public static void main(String[] args){
    	StringBuffer buffer = new StringBuffer();
    	FileReader.readFile(buffer);
        String myString = buffer.toString();
        // Remove all punctuation
        String newLine = StringManipulator.manipulateString(myString);
    	String[] word = newLine.split(" ");
    	// Capitalize each word
    	WordCapitalizer.capitalizeWords(word);
    	List<String> wordList = Arrays.asList(word);
    	// HashSet Removes Duplicates
    	Set<String> uniqueWordsSet = new HashSet<String>(wordList);
    	List<String> uniqueWordsList = new ArrayList<String>(uniqueWordsSet);
    	Collections.sort(uniqueWordsList);
    	// Remove words that have 3 or less letters
    	MyIterator.iterate(uniqueWordsList);
    	uniqueWordsList.forEach(uniqueWord->System.out.println(uniqueWord)); 
    	// write to the file
    	MyFileWriter.writeDataFile(uniqueWordsList);   	
    } 
   
}