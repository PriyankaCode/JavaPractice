package arrays;

import java.util.stream.IntStream;

public class Array {

	public static void main(String[] args) {
		// Array is a list of item like a shopping list ordered and repetitive
		 int[] numbers = {3,5,7,2,3};
		 for(int i=0;i<numbers.length;i++) {
			 System.out.print(numbers[i] + " ");
		 }
		 System.out.println("\n");
		 
		 String[] list = {"rice ", "apple ","orange ", "tomatoes ","rice "};
		 IntStream.range(0, list.length).forEach(i->{
			 System.out.printf("%d. %s\n",i,list[i]);
		 });
		 
	}

}
