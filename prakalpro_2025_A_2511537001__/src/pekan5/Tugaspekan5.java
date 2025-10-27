package pekan5;

public class Tugaspekan5 {

	public static void main(String[] args) {
		        int n = 5; // total baris

		        for (int i = 1; i <= n; i++) {
		            // cetak titik di depan angka
		            for (int j = n; j > i; j--) {
		                System.out.print(".");
		            }

		            // cetak angka
		            System.out.print(i);

		            // cetak titik setelah angka
		            for (int j = 1; j < i; j++) {
		                System.out.print(".");
		            }

		            System.out.println(); // pindah ke baris berikutnya
		        }
		    }
	}


