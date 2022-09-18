/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Nafiaaeluv
 */
public class PenanakNasi {
    private String warna, merek, ukuran, status;
    private boolean menyala;
    
    public void setAtribut(String warna, String merek, String ukuran){
        this.warna = warna;
        this.merek = merek;
        this.ukuran = ukuran;
    }
    
    public void nyalakan(){
        menyala = true;
        status = "Penanak nasi menyala dan sedang menghangatkan nasi.";
    }
    
    public void matikan(){
        menyala = false;
        status = "Penanak nasi mati. Tidak dapat memasak dan menghangatkan nasi.";
    }
    
    public void masakNasi(boolean tombolMasak){
        if(menyala == true && tombolMasak == true){
            status = "Penanak nasi menyala dan sedang memasak nasi";
        }else if(menyala == true && tombolMasak == false){
            hangatNasi(tombolMasak);
        }else{
            status = "Penanak nasi mati. Tidak dapat memasak nasi.";
        }
    }
    
    public void hangatNasi(boolean tombolMasak){
        if(menyala == true && tombolMasak == false){
            status = "Penanak nasi menyala dan sedang menghangatkan nasi.";
        }else if(menyala == true && tombolMasak == true){
            masakNasi(tombolMasak); 
        }else{
            status = "Penanak nasi mati. Tidak dapat menghangatkan nasi";
        }
    }
    
    public void tampilStatus(){
        System.out.println("=======Penanak Nasi=======");
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Status: " + status);
    }
}