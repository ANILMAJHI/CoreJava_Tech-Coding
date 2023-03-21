
public class BabulSort {

	public static void main(String[] args) {
		int arr[] = new int[] { 3, 6, 4, 6, 9, 7, 2 };
		bablusort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
	}
	public static void bablusort(int arr[]) {
		int temp = 1;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];

					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
