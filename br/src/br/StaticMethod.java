package br;

	
public class StaticMethod {

	static class StaticNestedClass {
        public static void display() {
            System.out.println("This is a static nested class.");
        }
    }

    public static void main(String[] args) {
//    	StaticMethod.StaticNestedClass nested = new StaticMethod.StaticNestedClass();
//        nested.display();
    	StaticNestedClass.display();
    }
}
		 
	

