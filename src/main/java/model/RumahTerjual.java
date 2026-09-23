/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class RumahTerjual extends Rumah{
    private String tanggalJual;
    
    public RumahTerjual(String idRumah, String unit, String tipeRumah, double harga, String tanggalJual){
        super(idRumah, unit, tipeRumah, harga);
        
        setTanggalJual(tanggalJual);
    }
    
    public String getTanggalJual() {
        return tanggalJual;
    }
    
    public void setTanggalJual(String tanggalJual) {
        this.tanggalJual = tanggalJual;
    }
    
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jumlah Unit Rumah     : " + tanggalJual);
        cetakDataRumah();
    }
    
}
