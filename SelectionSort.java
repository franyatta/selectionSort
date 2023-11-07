
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {6, 3, 8, 0, 3, 9, 5, 4};
		selectionSort(arr);
			for(int i : arr) 
				System.out.print(i);
		}

	static void selectionSort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}
}
