/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Nafiaaeluv
 */
public class TasRansel extends Tas{
    private String kantungMinum;
    
    public void setPosisiKantungM(String posisi){
        this.kantungMinum = posisi;
    }
    
    public void tampilDeskripsi(){
        super.tampilDeskripsi();
        System.out.println("Posisi Kantung Minum: " + kantungMinum);
    }
}