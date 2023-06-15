/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
import obat.*;
/**
 *
 * @author User
 */
public class datasetObatMasuk extends obat_masuk{
    
    private ArrayList<String> idObat;
    private ArrayList<String> kodeObat;
    private ArrayList<String> namaObatMasuk;
    private ArrayList<String> jenisObatMasuk;
    private ArrayList<String> jumlahObatMasuk;
    private ArrayList<String> tanggalMasuk;
    
    public datasetObatMasuk(){
        
        idObat = new ArrayList<String>();
        kodeObat = new ArrayList<String>();
        namaObatMasuk = new ArrayList<String>();
        jenisObatMasuk = new ArrayList<String>();
        jumlahObatMasuk = new ArrayList<String>();
        tanggalMasuk = new ArrayList<String>();
        
    }
    
    public void insertIdObat(String isi){
        this.idObat.add(isi);
    }
    
    public ArrayList<String> getRecordIdObat(){
        return this.idObat;
    }
    
    public void insertKodeObat(String isi){
        this.kodeObat.add(isi);
    }
    
    public ArrayList<String> getRecordKodeObat(){
        return this.kodeObat;
    }
    
    public void insertNamaObatMasuk(String isi){
        this.namaObatMasuk.add(isi);
    }
    
    public ArrayList<String> getRecordNamaObatMasuk(){
        return this.namaObatMasuk;
    }
    
    public void insertJenisObatMasuk(String isi){
        this.jenisObatMasuk.add(isi);
    }
    
    public ArrayList<String> getRecordJenisObatMasuk(){
        return this.jenisObatMasuk;
    }
    
    public void insertJumlahObatMasuk(String isi){
        this.jumlahObatMasuk.add(isi);
    }
    
    public ArrayList<String> getRecordJumlahObatMasuk(){
        return this.jumlahObatMasuk;
    }
    
    public void insertTanggalMasuk(String isi){
        this.tanggalMasuk.add(isi);
    }
    
    public ArrayList<String> getRecordTanggalMasuk(){
        return this.tanggalMasuk;
    }
    
}
