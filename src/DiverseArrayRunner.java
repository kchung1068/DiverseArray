
public class DiverseArrayRunner {

	public static void main(String[] args) {
		int arr1[] = {1,3,2,7,3};
		
		System.out.print("Should print 16, DiverseArray prints ");
		System.out.println(DiverseArray.arraySum(arr1));

		/*Uncomment lines 11-24 for Part B */
		int mat1[][] =	{	{1,3,2,7,3},
							{10,10,4,6,2},
							{5,3,5,9,6},
							{7,6,4,2,1}	};

		System.out.print("\nShould print {16, 32, 28, 20}, DiverseArray prints {");
		int returnedArray[] = DiverseArray.rowSums(mat1);
		for(int x = 0; x < returnedArray.length;x++) {
			System.out.print(returnedArray[x]);
			if( x != returnedArray.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		
		/*Uncomment lines 27-35 for Part C */
		int mat2[][] =	{	{1,1,5,3,4},
							{12,7,6,1,9},
							{8,11,10,2,5},
							{3,2,3,0,6} };

		System.out.print("\nShould print true, DiverseArray prints ");
		System.out.println(DiverseArray.isDiverse(mat1));
		System.out.print("Should print false, DiverseArray prints ");
		System.out.println(DiverseArray.isDiverse(mat2));
		
	}

}
