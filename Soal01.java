import java.util.Scanner;

public class Soal01 {

	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int limit = scan.nextInt(); 
		int angka;
		for(int i = 0; i < limit;i++){
			angka = scan.nextInt();

			switch(angka){
				case 1:{
					System.out.println("HIDUP MATI");
				}
				break;
				case 2:{
					System.out.println("HIDUP HIDUP");
				}
				break;
				case 3:{
					System.out.println("MATI HIDUP");
				}
				break;
				case 4:{
					System.out.println("HIDUP MATI");
				}
				break;
				case 5:{
					System.out.println("MATI HIDUP");
				}
				break;
				case 6:{
					System.out.println("HIDUP HIDUP");
				}
				break;
				case 7:{
					System.out.println("MATI MATi");
				}
				break;
				case 8:{
					System.out.println("MATI MATI");
				}
				break;
				case 9:{
					System.out.println("HIDUP MATI");
				}
				break;
				default:{
					System.out.println("DOWN");
				}
			}
		}
	}
	
}
