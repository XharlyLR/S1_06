package n1exercici2;

public class Main {

	public static void main(String[] args) {
		GenericMethods.f(1, 2, 3);
		GenericMethods.f(true, 'H', "Hola");
		GenericMethods.f(1, new Objecte(), "Hola");
	}

}

class Objecte {

}
