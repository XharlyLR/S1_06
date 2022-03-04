package n1exercici3;

public class GenericMethods {
	
	public static <T> void f(T arg1, T arg2, int arg3) {
//		T arg3 = arg2;
		System.out.println("arg1: " + arg1 + ", arg2: " + arg2 + ", arg3: " + arg3);
	}
}
