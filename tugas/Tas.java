/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Nafiaaeluv
 */
public class Tas {
    private String warna, model, ukuran, merek;
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public void setUkuran(String ukuran){
        this.ukuran = ukuran;
    }
    
    public void setMerek(String merek){
        this.merek = merek;
    }
    
    public void tampilDeskripsi(){
        System.out.println("Model: " + model);
        System.out.println("Warna: " + warna);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Merek: " + merek);
    }
}