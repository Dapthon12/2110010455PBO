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
public class datasetJenis extends jenis_obat{
    
    private ArrayList<String> namaObat;
    private ArrayList<String> jenisObat;
    
    public datasetJenis(){
        
        namaObat = new ArrayList<String>();
        jenisObat = new ArrayList<String>();
        
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
}
