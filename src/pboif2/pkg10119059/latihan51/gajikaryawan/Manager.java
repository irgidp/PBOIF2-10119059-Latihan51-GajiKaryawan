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
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;
    
    public int getKehadiran(){
        return kehadiran;
    }
    
    public void setKehadiran(int kehadiran){
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int kehadiran){
        return kehadiran * 10000;
    }
    
    public float tunjanganJabatan(String jabatan){
        if("Manager".equals(jabatan)){
            return 2000000;
        } else if ("Kabag".equals(jabatan)) {
            return 1000000;
        } else {
            return 0;
        }
    }
    
    public float tunjanganGolongan(int golongan){
    switch (golongan){
        case 1 : return 500000;
        case 2 : return 1000000;
        case 3 : return 1500000;
        default : return 0;
        }
    }
    
    public float gajiTotal(){
        return tunjanganJabatan(jabatan) + tunjanganGolongan(golongan) + tunjanganKehadiran(kehadiran);
    }
   
}
