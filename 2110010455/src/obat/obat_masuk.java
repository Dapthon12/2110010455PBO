/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obat;
/**
 *
 * @author User
 */
public class obat_masuk {

    private String idObat;
    private String kodeObat;
    private String namaObatMasuk;
    private String jenisObatMasuk;
    private String jumlahObatMasuk;
    private String tanggalMasuk;

    public obat_masuk(){}
    
    public obat_masuk(String x){
        setIdObat(x);
    }
    
    public obat_masuk(String x,String y){
        setIdObat(x);
        setKodeObat(y);
    }
    
    public obat_masuk(String x,String y,String z){
        setIdObat(x);
        setKodeObat(y);
        setNamaObatMasuk(z);
    }
    
    public obat_masuk(String x,String y,String z,String a){
        setIdObat(x);
        setKodeObat(y);
        setNamaObatMasuk(z);
        setJenisObatMasuk(a);
    }
    
    public obat_masuk(String x,String y,String z,String a,String b){
        setIdObat(x);
        setKodeObat(y);
        setNamaObatMasuk(z);
        setJenisObatMasuk(a);
        setJumlahObatMasuk(b);
    }
    
    public obat_masuk(String x,String y,String z,String a,String b,String c){
        setIdObat(x);
        setKodeObat(y);
        setNamaObatMasuk(z);
        setJenisObatMasuk(a);
        setJumlahObatMasuk(b);
        setTanggalMasuk(c);
    }
    
    public void setIdObat(String idObat) {
        if(idObat.equals("amoxicillin")) {
            this.idObat = "Id Obat : 1 ";
        }else if(idObat.equals("metformin")) {
            this.idObat = "Id Obat : 2 ";
        }else{
        this.idObat = "Obat Tidak Terdaftar ";
        }
    }
    
    public String getIdObat() {
        return idObat;
    }
    
    public void setKodeObat(String kodeObat) {
        if(kodeObat.equals("amoxicillin")) {
            this.kodeObat = "Kode Obat : 101 ";
        }else if(kodeObat.equals("metformin")) {
            this.kodeObat = "Kode Obat : 102 ";
        }else{
        this.kodeObat = "Kode Tidak Terdaftar ";
        }
    }
    
    public String getKodeObat() {
        return kodeObat;
    }
    
    public void setNamaObatMasuk(String namaObatMasuk) {
        if(namaObatMasuk.equals("amoxicillin")) {
            this.namaObatMasuk = "Nama Obat : amoxicillin ";
        }else if(namaObatMasuk.equals("metformin")) {
            this.namaObatMasuk = "Nama Obat : metformin ";
        }else{
        this.namaObatMasuk = "Obat Tidak Terdaftar ";
        }
    }
    
    public String getNamaObatMasuk() {
        return namaObatMasuk;
    }

    public void setJenisObatMasuk(String jenisObatMasuk) {
        if(jenisObatMasuk.equals("amoxicillin")) {
            this.jenisObatMasuk = "Jenis Obat : antibiotik ";
        }else if(jenisObatMasuk.equals("metformin")) {
            this.jenisObatMasuk = "Jenis Obat : obat mata ";
        }else{
        this.jenisObatMasuk = "Jenis Tidak Terdaftar ";
        }
    }
    
    public String getJenisObatMasuk() {
        return jenisObatMasuk;
    }
    
    public void setJumlahObatMasuk(String jumlahObatMasuk) {
        if(jumlahObatMasuk.equals("amoxicillin")){
            this.jumlahObatMasuk="Jumlah Obat : 85 ";
        }else if(jumlahObatMasuk.equals("metformin")){
            this.jumlahObatMasuk="Jumlah Obat : 25 ";
        }else {
            this.jumlahObatMasuk="Jumlah Obat : 0 ";
        }
    }
    
    public String getJumlahObatMasuk() {
        return jumlahObatMasuk;
    }

    public void setTanggalMasuk(String tanggalMasuk) {
        if(tanggalMasuk.equals("amoxicillin")){
            this.tanggalMasuk="Tanggal Masuk : 12-01-2023 ";
        }else if(tanggalMasuk.equals("metformin")){
            this.tanggalMasuk="Tanggal Masuk : 9-01-2023 ";
        }else {
            this.tanggalMasuk="Tanggal tidak tersedia! ";
        }
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }
    
    public String ObatMasuk(){
        return getIdObat()+getKodeObat()+getNamaObatMasuk()+getJenisObatMasuk()+getJumlahObatMasuk()+getTanggalMasuk();
    }
    
    public String ObatMasuk(String x, String y, String z, String a,String b,String c) {
        setIdObat(x);
        setKodeObat(y);
        setNamaObatMasuk(z);
        setJenisObatMasuk(a);
        setJumlahObatMasuk(b);
        setTanggalMasuk(c);
        return getIdObat()+getKodeObat()+getNamaObatMasuk()+getJenisObatMasuk()+getJumlahObatMasuk()+getTanggalMasuk();
    }   
}