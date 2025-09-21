package pekan2;

public class tugasAlproPekan2 {
    public static void main(String[] args) {
        // Data guru ngaji
        String nama = "Fathan";        // menggunakan String untuk nama
        float nilaikinerja = 82.5f; // float
        
 

        // Tentukan kelulusan dan insentif
        if (nilaikinerja >= 80) {
        	char kodevoucher = '1'; //char
            boolean lulus = true; //boolean
            int bonus = 500000; //int
            System.out.println("Nama Guru Ngaji  : " + nama);
            System.out.println("Nilai Kinerja    : " + nilaikinerja);
            System.out.println("Kode voucher     : " + kodevoucher);
            System.out.println("Lulus            : " + lulus);
            System.out.println("Keterangan       :Anda lulus");
            System.out.println("Bonus            : " +bonus);
        } else {
        	char kodevoucher = '2'; //char
            boolean lulus = false; //boolean
            int bonus = 0; //int
            System.out.println("Nama Guru Ngaji  : " + nama);
            System.out.println("Nilai Kinerja    : " + nilaikinerja);
            System.out.println("Kode voucher     : " + kodevoucher);
            System.out.println("Lulus            : " + lulus);
            System.out.println("Keterangan       :Anda tidak lulus");
            System.out.println("Bonus            : " +bonus);      
        }     
    }
}
