/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Nafiaaeluv
 */
public class Setrika {
    private String warna, merek;
    private boolean menyala;
    private int suhu;
    
    public void setAtribut(String warna, String merek){
        this.warna = warna;
        this.merek = merek;
    }
    
    public void nyalakan(){
        menyala = true;
        suhu = 35;
    }
    
    public void matikan(){
        menyala = false;
    }
   
    public void tambahSuhu(){
        if(menyala == true){
            suhu += 5;  
        }
    }
    
    public void kurangSuhu(){
        if(menyala == true && suhu >= 35){
            suhu -= 5;
        }
    }
    
    public void tampilStatus(){
        System.out.println("=======Setrika=======");
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        if(menyala == true){
            System.out.println("Status: Setrika menyala dengan suhu " + suhu);
        }else{
            System.out.println("Status: Setrika mati. Tidak dapat menyetrika.");
        }
    }    
}