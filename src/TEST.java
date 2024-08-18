
public class TEST {

	public static boolean smallEnough(int[] a, int limit) {
		boolean value = true;

		for (int i = 0; i < a.length; i++) {
			if (a[i] <= limit) {
				value = true;
			} else {
				value = false;
				break;

			}
		}
		System.out.println(value);
		return value;
	}

	public static void main(String[] args) {
		smallEnough(new int[] {1,0}, 0);
	}

}
