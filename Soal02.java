import java.util.*;
public class Soal02 {

	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		String vocal = scan.nextLine();
		String text;
		text = scan.next();
		String replace = text.replaceAll(" ",vocal + " ");
		System.out.println(replace);
		scan.close();
		}
		}

