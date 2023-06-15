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
public class datasetObatKeluar extends obat_keluar{
    
    private ArrayList<String> idObat;
    private ArrayList<String> kodeObat;
    private ArrayList<String> namaObatKeluar;
    private ArrayList<String> jenisObatKeluar;
    private ArrayList<String> jumlahObatKeluar;
    private ArrayList<String> tanggalKeluar;
    
    public datasetObatKeluar(){
        
        idObat = new ArrayList<String>();
        kodeObat = new ArrayList<String>();
        namaObatKeluar = new ArrayList<String>();
        jenisObatKeluar = new ArrayList<String>();
        jumlahObatKeluar = new ArrayList<String>();
        tanggalKeluar = new ArrayList<String>();
        
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
    
    public void insertNamaObatKeluar(String isi){
        this.namaObatKeluar.add(isi);
    }
    
    public ArrayList<String> getRecordNamaObatKeluar(){
        return this.namaObatKeluar;
    }
    
    public void insertJenisObatKeluar(String isi){
        this.jenisObatKeluar.add(isi);
    }
    
    public ArrayList<String> getRecordJenisObatKeluar(){
        return this.jenisObatKeluar;
    }
    
    public void insertJumlahObatKeluar(String isi){
        this.jumlahObatKeluar.add(isi);
    }
    
    public ArrayList<String> getRecordJumlahObatKeluar(){
        return this.jumlahObatKeluar;
    }
    
    public void insertTanggalKeluar(String isi){
        this.tanggalKeluar.add(isi);
    }
    
    public ArrayList<String> getRecordTanggalKeluar(){
        return this.tanggalKeluar;
    }
}
