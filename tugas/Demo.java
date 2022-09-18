/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Nafiaaeluv
 */
public class Demo {
    public static void main(String[] args){
        Tas tas1 = new Tas();
        tas1.setWarna("Biru");
        tas1.setModel("Totebag");
        tas1.setUkuran("Sedang");
        tas1.setMerek("Hijab Alila");
        tas1.tampilDeskripsi();
        
        System.out.println("------------------------------------");
        
        TasRansel tas2 = new TasRansel();
        tas2.setWarna("Hitam");
        tas2.setModel("Ransel");
        tas2.setUkuran("Besar");
        tas2.setMerek("Alto");
        tas2.setPosisiKantungM("Kanan dan Kiri");
        tas2.tampilDeskripsi();
        
        System.out.println("------------------------------------");
        
        TasSelempang tas3 = new TasSelempang();
        tas3.setWarna("Hitam");
        tas3.setModel("Selempang");
        tas3.setUkuran("Kecil");
        tas3.setMerek("Pollo");
        tas3.setJenisS("Crossbody");
        tas3.tampilDeskripsi();
        
        System.out.println("------------------------------------");
        
        PenanakNasi pnns = new PenanakNasi();
        pnns.setAtribut("Putih", "Cosmos", "Kecil");
        pnns.nyalakan();
        pnns.tampilStatus();
        System.out.println("------------------------------------");
        pnns.masakNasi(true);
        pnns.tampilStatus();
        System.out.println("------------------------------------");
        pnns.matikan();
        pnns.tampilStatus();
        System.out.println("------------------------------------");
        pnns.nyalakan();
        pnns.hangatNasi(false);
        pnns.tampilStatus();
        System.out.println("------------------------------------");
        
        Setrika setrika = new Setrika();
        setrika.setAtribut("Merah", "Maspion");
        setrika.nyalakan();
        setrika.tambahSuhu();
        setrika.tampilStatus();
        System.out.println("------------------------------------");
        setrika.kurangSuhu();
        setrika.tampilStatus();
        System.out.println("------------------------------------");
        setrika.matikan();
        setrika.tampilStatus();
        System.out.println("------------------------------------");
    }
}