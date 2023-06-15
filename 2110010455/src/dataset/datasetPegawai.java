/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class datasetPegawai {
    
    private ArrayList<String> idPegawai;
    private ArrayList<String> kodePegawai;
    private ArrayList<String> namaPegawai;
    private ArrayList<String> alamat;
    private ArrayList<String> telpon;
    
    public datasetPegawai(){
        
        idPegawai = new ArrayList<String>();
        kodePegawai = new ArrayList<String>();
        namaPegawai = new ArrayList<String>();
        alamat = new ArrayList<String>();
        telpon = new ArrayList<String>();
        
    }
    
    public void insertIdPegawai(String isi){
        this.idPegawai.add(isi);
    }
    
    public ArrayList<String> getRecordIdPegawai(){
        return this.idPegawai;
    }
    
    public void insertKodePegawai(String isi){
        this.kodePegawai.add(isi);
    }
    
    public ArrayList<String> getRecordKodePegawai(){
        return this.kodePegawai;
    }
    
    public void insertNamaPegawai(String isi){
        this.namaPegawai.add(isi);
    }
    
    public ArrayList<String> getRecordNamaPegawai(){
        return this.namaPegawai;
    }
    
    public void insertAlamat(String isi){
        this.alamat.add(isi);
    }
    
    public ArrayList<String> getRecordAlamat(){
        return this.alamat;
    }
    
    public void insertTelpon(String isi){
        this.telpon.add(isi);
    }
    
    public ArrayList<String> getRecordTelpon(){
        return this.telpon;
    }
    
}
