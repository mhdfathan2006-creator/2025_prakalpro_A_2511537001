package pekan3;
import java.util.Scanner;
public class Hitungvolume {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        // Inisialisasi nilai phi
	        double phi = 3.14;
	        
	        // Input jari-jari dan tinggi
	        System.out.print("Masukkan jari-jari tabung: ");
	        double r = input.nextDouble();
	        
	        System.out.print("Masukkan tinggi tabung: ");
	        double t = input.nextDouble();
	        
	        // Proses menghitung volume tabung
	        double volume = phi * r * r * t;
	        
	        // Output hasil volume tabung
	        System.out.println("Volume tabung = " + volume);
	        
	        input.close();
	    }
	}
       