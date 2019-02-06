package targilim;

public class BinarySearch {
	public static void main(String[] args) {

		int[] arr = new int[1280];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		int index = arr.length / 2;
		int temp = index;

		while (arr[index] != 1) {
			System.out.println("index: "+index);
			temp = temp / 2;
			if (temp<1) temp=1;
			if (arr[index] > 1) {
				index -= temp;
			} else {
				index += temp;
			}
		}
		
		System.out.println("bingo: " + index);
	}

}
