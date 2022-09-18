/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Nafiaaeluv
 */
public class TasSelempang extends Tas{
    private String jenisSelempang;
    
    public void setJenisS(String jenisSelempang){
        this.jenisSelempang = jenisSelempang;
    }
    
    public void tampilDeskripsi(){
        super.tampilDeskripsi();
        System.out.println("Jenis Selempang: " + jenisSelempang);
    }
}