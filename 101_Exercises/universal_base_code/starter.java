import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Ascii art = new Ascii("human");
	Ascii art1 = new Ascii("human", "dog");
	Ascii art2 = new Ascii("cactus", 1);
	Ascii art3 = new Ascii("human", "other", 1);
	
	art.setAscii("**{--__--}**");
	art.printArt();
	art1.printArt();
	art2.printArt();
	art3.printArt();
	}
}
