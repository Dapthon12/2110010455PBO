/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obat;

/**
 *
 * @author User
 */
public class persediaan_obat {
    
    private String idObat;
    private String kodeObat;
    private String namaObat;
    private String jenisObat;
    private String hargaObat;
    private String stokObat;
    
    public persediaan_obat(){} //constructor
    
    public persediaan_obat(String x){
        setIdObat(x);
    }
    
    public persediaan_obat(String x, String y){
        setIdObat(x);
        setKodeObat(y);
    }
    
    public persediaan_obat(String x, String y, String z){
        setIdObat(x);
        setKodeObat(y);
        setNamaObat(z);
    }
    
    public persediaan_obat(String x, String y, String z, String a){
        setIdObat(x);
        setKodeObat(y);
        setNamaObat(z); 
        setJenisObat(a);
    }
    
    public persediaan_obat(String x, String y, String z, String a,String b){
        setIdObat(x);
        setKodeObat(y);
        setNamaObat(z); 
        setJenisObat(a);
        setHargaObat(b);
    }
    
    public persediaan_obat(String x, String y, String z, String a,String b,String c){
        setIdObat(x);
        setKodeObat(y);
        setNamaObat(z); 
        setJenisObat(a);
        setHargaObat(b);
        setStokObat(c);
    }
    
    public persediaan_obat(int says){
        System.out.println( says);
    }
    
    public void setIdObat(String idObat){
        if(idObat.equals("amoxicillin")){
            this.idObat="Id Obat : 1 ";
        }else if(idObat.equals("metformin")){
            this.idObat="Id Obat : 2 ";
        }else {
            this.idObat="Obat tidak terdaftar! ";
        }
    }
    
    public String getIdObat(){
        return this.idObat;
    }
    
    public void setKodeObat(String kodeObat){
        if(kodeObat.equals("amoxicillin")){
            this.kodeObat="Kode Obat : 101 ";
        }else if(kodeObat.equals("metformin")){
            this.kodeObat="Kode Obat : 102 ";
        }else {
            this.kodeObat="Kode tidak terdaftar! ";
        }
    }
    
    public String getKodeObat(){
        return this.kodeObat;
    }
    
    public void setNamaObat(String namaObat){
        if(namaObat.equals("amoxicillin")){
            this.namaObat="Nama Obat : amoxicillin ";
        }else if(namaObat.equals("metformin")){
            this.namaObat="Nama Obat : metformin ";
        }else {
            this.namaObat="Obat tidak terdaftar! ";
        }
    }
    
    public String getNamaObat(){
        return this.namaObat;
    }
    
    public void setJenisObat(String jenisObat){
        if(jenisObat.equals("amoxicillin")){
            this.jenisObat="Jenis Obat : antibiotik ";
        }else if(jenisObat.equals("metformin")){
            this.jenisObat="Jenis Obat : obat mata ";
        }else {
            this.jenisObat="Jenis tidak terdaftar! ";
        }
    }
    
    public String getJenisObat(){
        return this.jenisObat;
    }
    
    public void setHargaObat(String hargaObat){
        if(hargaObat.equals("amoxicillin")){
            this.hargaObat="Harga Obat : 4000 ";
        }else if(hargaObat.equals("metformin")){
            this.hargaObat="Harga Obat : 5000 ";
        }else {
            this.hargaObat="Harga Obat : 0 ";
        }
    }
    
    public String getHargaObat(){
        return this.hargaObat;
    }
    
    public void setStokObat(String stokObat){
        if(stokObat.equals("amoxicillin")){
            this.stokObat="Stok Obat : 80 ";
        }else if(stokObat.equals("metformin")){
            this.stokObat="Stok Obat : 20 ";
        }else {
            this.stokObat="Stok Obat : 0 ";
        }
    }
    
    public String getStokObat(){
        return this.stokObat;
        
    }
    
    public String perObat(){
        return getIdObat()+getKodeObat()+getNamaObat()+getJenisObat()+getHargaObat()+getStokObat();
    }
    
    public String perObat(String x, String y, String z, String a,String b,String c){
        setIdObat(x);
        setKodeObat(y);
        setNamaObat(z);
        setJenisObat(a);
        setHargaObat(b);
        setStokObat(c);
       
        return getIdObat()+getKodeObat()+getNamaObat()+getJenisObat()+getHargaObat()+getStokObat();       
    }
}