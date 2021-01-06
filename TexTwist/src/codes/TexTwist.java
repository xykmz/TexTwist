package codes;
import java.util.Scanner;
import java.awt.Robot;
import java.io.File;
import java.awt.event.KeyEvent;

public class TexTwist{
	
	public static boolean canBeMade (String word, String madeFrom){
    	
    	char [] wordLetters = new char [word.length()];
    	char [] madeFromLetters = new char [madeFrom.length()];
    	
    	for (int i = 0; i < word.length(); i++) {
        	for (int j = 0; j < madeFromLetters.length; j++) {
           	
        		wordLetters[i] = word.charAt(i);
            	madeFromLetters[j] = madeFrom.charAt(j);
        	}
    	}
    	
    	
    	int counter = 0;
    	for (int i = 0; i < word.length(); i++) {
        	for (int j = 0; j < madeFrom.length(); j++) {
            	if (wordLetters [i] == madeFromLetters [j]) {
            		madeFromLetters [j] = 0;
                	counter ++;
                	break;
            	}
        	}
    	}
    	
    	if (counter == word.length()) 
        	return true;
    	
        return false;
    	
    	
   /* 	System.out.println("");
    	System.out.println("Displaying givenLetters.");
    	System.out.println("");
    	for(int i = 0; i < givenLetters.length; i++) {
      	
        	System.out.print("\t" + givenLetters[i]); //Put a tab between each element
    	}
    	System.out.println("");
	
    	System.out.println("");
    	System.out.println("Displaying madeLetters.");
    	System.out.println("");
    	for(int i = 0; i < madeLetters.length; i++) {
      	
        	System.out.print("\t" + madeLetters[i]); //Put a tab between each element
    	}
    	System.out.println("");
    	
    	System.out.println(counter); */
    	
	}
	
	
	public static void main(String[] args) throws Exception{
    	
    	System.out.println("Enter letters.");
    	
    	Scanner userInput = new Scanner(System.in); //Player inputs a guess
    	String madeFrom = userInput.next();
    	
    	if (madeFrom.length() != 6) {
    		System.out.println("Input is invalid.");
    	}
    	
    	File dictionary = new File ("dictionary.txt");
    	Scanner file = new Scanner (dictionary);
    	
		Thread.sleep(5000);

    	
    	while (file.hasNext()) {
    		
    		String word = file.next();
    		
    		if (canBeMade(word, madeFrom) == true) {
    			System.out.println(word);
		    	
    		
    			Robot player = new Robot();
    			

    			for (int i = 0; i < word.length(); i++) {
    				
    				Thread.sleep(200);    				
    				
    		    	if(word.charAt(i) == 'a')
    		    		player.keyPress(KeyEvent.VK_A);
    				else if (word.charAt(i) == 'b')
    					player.keyPress(KeyEvent.VK_B);
    		    	else if (word.charAt(i) == 'c')
    		        	player.keyPress(KeyEvent.VK_C);
    		        else if (word.charAt(i) == 'd')
    		        	player.keyPress(KeyEvent.VK_D);
    		        else if (word.charAt(i) == 'e')
    		        	player.keyPress(KeyEvent.VK_E);
    		        else if (word.charAt(i) == 'f')
    		        	player.keyPress(KeyEvent.VK_F);
    		        else if (word.charAt(i) == 'g')
    		        	player.keyPress(KeyEvent.VK_G);
    		        else if (word.charAt(i) == 'h')
    		        	player.keyPress(KeyEvent.VK_H);
    		        else if (word.charAt(i) == 'i')
    		        	player.keyPress(KeyEvent.VK_I);
    		        else if (word.charAt(i) == 'j')
    		        	player.keyPress(KeyEvent.VK_J);
    		        else if (word.charAt(i) == 'k')
    		        	player.keyPress(KeyEvent.VK_K);
    		        else if (word.charAt(i) == 'l')
    		        	player.keyPress(KeyEvent.VK_L);
    		       	else if (word.charAt(i) == 'm')
    		        	player.keyPress(KeyEvent.VK_M);
    		        else if (word.charAt(i) == 'n')
    		        	player.keyPress(KeyEvent.VK_N);
    		        else if (word.charAt(i) == 'o')
    		        	player.keyPress(KeyEvent.VK_O);
    		        else if (word.charAt(i) == 'p')
    		        	player.keyPress(KeyEvent.VK_P);
    		        else if (word.charAt(i) == 'q')
    		        	player.keyPress(KeyEvent.VK_Q);
    		        else if (word.charAt(i) == 'r')
    		        	player.keyPress(KeyEvent.VK_R);
    		        else if (word.charAt(i) == 's')
    		        	player.keyPress(KeyEvent.VK_S);
    		        else if (word.charAt(i) == 't')
    		        	player.keyPress(KeyEvent.VK_T);
    		        else if (word.charAt(i) == 'u')
    		        	player.keyPress(KeyEvent.VK_U);
    		       	else if (word.charAt(i) == 'v')
    		        	player.keyPress(KeyEvent.VK_V);
    		        else if (word.charAt(i) == 'w')
    		        	player.keyPress(KeyEvent.VK_W);
    		        else if (word.charAt(i) == 'x')
    		        	player.keyPress(KeyEvent.VK_X);
    		        else if (word.charAt(i) == 'y')
    		        	player.keyPress(KeyEvent.VK_Y);
    		        else if (word.charAt(i) == 'z') 
    		        	player.keyPress(KeyEvent.VK_Z);
    			
    				
    			} 
    			
				player.keyPress(KeyEvent.VK_ENTER); 
				
    		}
    		
    	}
    	
	}
}


