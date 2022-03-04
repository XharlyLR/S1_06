package n1exercici4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Objecte> alObj = new ArrayList<Objecte>();
		alObj.add(new Objecte());
		alObj.add(new Objecte());
		
		ArrayList<Integer> alNum = new ArrayList<Integer>();
		alNum.add(1);
		alNum.add(2);
		
		ArrayList<String> alString = new ArrayList<String>();
		alString.add("Hola");
		alString.add("Adéu");
		
		GenericMethods.f(alObj);
		GenericMethods.f(alNum);
		GenericMethods.f(alString);
	}

}

class Objecte {

}
