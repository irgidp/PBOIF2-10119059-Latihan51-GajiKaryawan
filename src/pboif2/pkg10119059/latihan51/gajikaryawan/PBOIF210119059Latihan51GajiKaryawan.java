/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan Gaji Karyawan
 */
package pboif2.pkg10119059.latihan51.gajikaryawan;
/**
 *
 * @author Corazon
 */
import java.util.Scanner;
public class PBOIF210119059Latihan51GajiKaryawan {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Manager manager = new Manager();
      
      
        System.out.println("==== Program Perhitungan Gaji Karyawan ====");
        System.out.print("Masukkan NIK : "); manager.setNik(input.nextLine());
        System.out.print("Masukkan Nama : "); manager.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : "); manager.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : "); manager.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : "); manager.setKehadiran(input.nextInt());
       
        System.out.println("");
        System.out.println("==== Hasil Perhitungan");
        System.out.println("NIK : " +manager.getNik());
        System.out.println("NAMA : " +manager.getNama());
        System.out.println("Golongan : " +manager.getGolongan());
        System.out.println("Jabatan : " +manager.getJabatan());
        
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN  : " +manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   : " +manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : " +manager.tunjanganKehadiran(manager.getKehadiran()));
        
        System.out.println("");
        System.out.println("GAJI TOTAL : " +manager.gajiTotal());
    }
    
}
