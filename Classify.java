// 13707293
// robertjohnhill1@gmail.com

import java.io.*;
import java.util.*;

public class Classify { 

	public static String classify( char c )
	{
		int numb = c;
		String ret_value = "";

		if (numb > 90 & numb < 97 | numb < 65 | numb > 122){
		 return "";
		}
		else {
			Boolean lowercase = false;
			Boolean vowel = false;

			if (numb > 96 & numb < 123) {
				lowercase = true;
			}

			ArrayList<Character> vowels = new ArrayList<Character>();
			vowels.add('a');
			vowels.add('e');
			vowels.add('i');
			vowels.add('o');
			vowels.add('u');
			vowels.add('A');
			vowels.add('E');
			vowels.add('I');
			vowels.add('O');
			vowels.add('U');

			for (char i : vowels) {
				if (i == c) {
					vowel = true;
				}
			}


			if (lowercase == true & vowel == true){
				ret_value = "lowercase vowel";
			}
			else if (lowercase == false & vowel == false){
				ret_value = "uppercase consonant";
			}
			else if (lowercase == true & vowel == false){
				ret_value = "lowercase consonant";
			}
			else if (lowercase == false & vowel == true){
				ret_value = "uppercase vowel";
			}

		}
		return ret_value;
	}

    public static void main( String[] args ) 
    { 
 	String x = classify('a');
    }
}
