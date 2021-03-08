
public class DiverseArray {

	public static int arraySum(int[] arr)
	{ 	int count = 0;
	for (int x = 0; x < arr.length; x += 1) {
		count += arr[x];
	}
	return count;
	 
	}
	
	/*Uncomment 4 lines below for Part B */
	public static int[] rowSums(int[][] arr2D)
	{
		int[] sums = new int[arr2D.length];


		for (int x = 0; x < sums.length; x += 1) {
			sums[x] = arraySum(arr2D[x]);
		}
		return sums;
	}
	
	/*Uncomment 4 lines below for Part C */
	public static boolean isDiverse(int[][] arr2D)
	{
		boolean sign = false;
		int[] sums = rowSums(arr2D);
		for (int x = 0; x < sums.length; x+= 1) {
			for (int y= 0; y < sums.length; y += 1) {
				if (sums[x] == sums[y] && x != y) {
					return false;
				}
			}
		}

		return true;
	}
}
