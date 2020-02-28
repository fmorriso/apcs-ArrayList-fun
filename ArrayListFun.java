import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayListFun {

	public static void main(String[] args) {
//		ArrayList<Integer> grades = new ArrayList<Integer>(Arrays.asList(99, 88, 92));
//		System.out.println(grades);
//
//		List<String> students = List.of("Mary", "Mahindra");
//		System.out.println(students);
//
//		List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);

		int[][] example =
		{
				{15, 5, 9, 10},
				{12, 16, 11, 6},
				{14, 8, 13, 7}
		};
		
		// find max value in each row
		for (int[] row : example) {			
			int max = Arrays.stream(row)			
					.max()
					.getAsInt();
			System.out.format("Largest value in the row is %d%n", max);
		}
		
		// find max value in the entire 2d array by flattening 
		// the 2D array and using the handy statistics class.
		IntSummaryStatistics stats =  Arrays.stream(example)
				                            .flatMapToInt(Arrays::stream)
				                            .summaryStatistics();
		int min = stats.getMin();
		int max = stats.getMax();
		System.out.format("Min = %d, Max = %d %n", min, max);

	}
}
