package n1exercici1;

public class Main {

	public static void main(String[] args) {
		NoGenericMethods<String> ngm = new NoGenericMethods<String>("arg1", "arg2", "arg3");
		
		System.out.println(ngm.getObj1());
		
		ngm = new NoGenericMethods<String>("arg2", "arg3", "arg1");
		
		System.out.println(ngm.getObj1());

	}

}
