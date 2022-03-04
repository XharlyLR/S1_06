package n1exercici2;

public class GenericMethods {

	public static <T> void f(T arg1, T arg2, T arg3) {
		System.out.println("arg1: " + arg1 + ", arg2: " + arg2 + ", arg3: " + arg3);
	}
}
