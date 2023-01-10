import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
	Scanner input = new Scanner(System.in);
	int masukan = input.nextInt();
    int[][] numbers = new int[masukan][masukan];

	//Input Value
    for (int i = 0; i < masukan; i++) {
      for (int j = 0; j < masukan; j++) {
        numbers[i][j] = input.nextInt();
      }
    }

	//result
    for (int i = masukan - 1; i >= 0; i--) {
      for (int j = 0; j < masukan; j++) {
        if (j == masukan % 2) {
          System.out.print(numbers[i][j] + " ");
        } else {
          System.out.print(numbers[j][i] + " ");
        }
      }
      System.out.println();
    }
    input.close();
	}
}
