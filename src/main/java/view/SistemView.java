/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import model.Dokumen;
import model.Pembeli;
import model.Pengajuan;
import model.Rumah;

/**
 *
 * @author ACER
 */
public class SistemView {
    
        public void tampilRumah(
            ArrayList<Rumah> daftarRumah){
            System.out.println("=== DATA RUMAH ===");
            for(Rumah r : daftarRumah){
                r.tampilkanData();
            }
        }

        public void tampilPembeli(
            ArrayList<Pembeli> daftarPembeli){
            System.out.println("=== DATA PEMBELI ===");
            for(Pembeli p : daftarPembeli){
                p.tampilkanData();
            }
        }

        public void tampilDokumen(
            ArrayList<Dokumen> daftarDokumen){
            System.out.println("=== DATA DOKUMEN ===");
            for(Dokumen d : daftarDokumen){
                d.tampilkanData();
            }
        }

        public void tampilPengajuan(
            ArrayList<Pengajuan> daftarPengajuan){
            System.out.println("=== DATA PENGAJUAN ===");
            for(Pengajuan p : daftarPengajuan){
                p.tampilkanData();
            }
        }     
}
