package number;

//7 6 5 4 3 2 1
//  6 5 4 3 2 1
//    5 4 3 2 1
//      4 3 2 1
//        3 2 1
//          2 1
//            1

public class Patteren15 {

	public static void main(String[] args) {

		int rows = 7;

		for (int i=rows; i>=1; i--) {

			for (int j=2*rows-i; j>i; j--) {
				System.out.print(" ");
			}

			for (int j = i; j >= 1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
