public class QuickSortAlgorithm {

	public static int[] intArr = null;
	private int compareCounter = 0;
	
	public QuickSortAlgorithm(int[] arr) {
		intArr = arr;
	}
	
	public int getCompareCounter() {
		return compareCounter;
	}

	public int[] sort(int left, int right) {
		int q;
		compareCounter++;
		if (left < right) {
			q = partition(left, right);
			sort(left, q);
			sort(q + 1, right);
		}
		return intArr;
	}

	int partition(int left, int right) {
		int i, j, x = intArr[(left + right) / 2];
		
		i = left - 1;
		j = right + 1;

		do {
			i++;
		} while (intArr[i] < x);

		do {
			j--;
		} while (intArr[j] > x);

		compareCounter++;
		if (i < j) {
			int k = intArr[i];
			intArr[i] = intArr[j];
			intArr[j] = k;
		} else {
			return j;
		}
		return -1;
	}

}
