package homework2.aliaksandrah;

public class StringManipulator {
	public static String manipulateString(String myString){
    	String regEx = "\n";
    	String replacement = " ";
    	String newLine = myString.replaceAll(regEx, replacement);
    	String regEx2 = ",|;|\\(|\\)|:|\"|\\d|-";
    	String replacement2 = "";
    	String newLine2 = newLine.replaceAll(regEx2, replacement2);
    	System.out.println(newLine2);
    	String regEx3 = "\\.[^A-Z]|\\.$";
//    	String regEx3 = "\\p{Punct}[^\\.w\\w.]";
    	String replacement3 = " ";
    	String newLine3 = newLine2.replaceAll(regEx3, replacement3);
//    	String newLine3 = myString.replaceAll(regEx3, replacement3);
    	return newLine3;
    	//System.out.println(newLine3);
    }
}
