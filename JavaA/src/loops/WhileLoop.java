package loops;

//While : Only Execute if conditions are true

public class WhileLoop {

	public static void main(String[] args) {
		
		int dogs = 1;
		System.out.println("Dogs" );
		while (dogs < 10) {
			System.out.print(dogs++ + " ");
		}
		
		System.out.println("\nCats");
		int cats = 1;
		while (cats < 10) {
			System.out.print(++cats + " ");
		}

	}

}
