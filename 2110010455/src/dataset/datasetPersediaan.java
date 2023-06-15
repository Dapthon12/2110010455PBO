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
public class datasetPersediaan extends persediaan_obat{
    
    private ArrayList<String> idObat;
    private ArrayList<String> kodeObat;
    private ArrayList<String> namaObat;
    private ArrayList<String> jenisObat;
    private ArrayList<String> hargaObat;
    private ArrayList<String> stokObat;
    
    public datasetPersediaan(){
        
        idObat = new ArrayList<String>();
        kodeObat = new ArrayList<String>();
        namaObat = new ArrayList<String>();
        jenisObat = new ArrayList<String>();
        hargaObat = new ArrayList<String>();
        stokObat = new ArrayList<String>();
        
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
    
    public void insertNamaObat(String isi){
        this.namaObat.add(isi);
    }
    
    public ArrayList<String> getRecordNamaObat(){
        return this.namaObat;
    }
    
    public void insertJenisObat(String isi){
        this.jenisObat.add(isi);
    }
    
    public ArrayList<String> getRecordJenisObat(){
        return this.jenisObat;
    }
    
    public void insertHargaObat(String isi){
        this.hargaObat.add(isi);
    }
    
    public ArrayList<String> getRecordHargaObat(){
        return this.hargaObat;
    }
    
    public void insertStokObat(String isi){
        this.stokObat.add(isi);
    }
    
    public ArrayList<String> getRecordStokObat(){
        return this.stokObat;
    }
}
