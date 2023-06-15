/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obat;
/**
 *
 * @author User
 */
public class obat_keluar {
    
    private String idObat;
    private String kodeObat;
    private String namaObatKeluar;
    private String jenisObatKeluar;
    private String jumlahObatKeluar;
    private String tanggalKeluar;
    
    public obat_keluar(){}
    
    public obat_keluar(String x){
        setIdObat(x);
    }
    
    public obat_keluar(String x,String y){
        setIdObat(x);
        setKodeObat(y);
    }
    
    public obat_keluar(String x,String y,String z){
        setIdObat(x);
        setKodeObat(y);
        setNamaObatKeluar(z);
    }
    
    public obat_keluar(String x,String y,String z,String a){
        setIdObat(x);
        setKodeObat(y);
        setNamaObatKeluar(z);
        setJenisObatKeluar(a);
    }
    
    public obat_keluar(String x,String y,String z,String a,String b){
        setIdObat(x);
        setKodeObat(y);
        setNamaObatKeluar(z);
        setJenisObatKeluar(a);
        setJumlahObatKeluar(b);
    }
    
    public obat_keluar(String x,String y,String z,String a,String b,String c){
        setIdObat(x);
        setKodeObat(y);
        setNamaObatKeluar(z);
        setJenisObatKeluar(a);
        setJumlahObatKeluar(b);
        setTanggalKeluar(c);
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
    
    public void setNamaObatKeluar(String namaObatKeluar) {
        if(namaObatKeluar.equals("amoxicillin")) {
            this.namaObatKeluar = "Nama Obat : amoxicillin ";
        }else if(namaObatKeluar.equals("metformin")) {
            this.namaObatKeluar = "Nama Obat : metformin ";
        }else{
        this.namaObatKeluar = "Obat Tidak Terdaftar ";
        }
    }

    public String getNamaObatKeluar() {
        return namaObatKeluar;
    }
    
    public void setJenisObatKeluar(String jenisObatKeluar) {
        if(jenisObatKeluar.equals("amoxicillin")) {
            this.jenisObatKeluar = "Jenis Obat : antibiotik ";
        }else if(jenisObatKeluar.equals("metformin")) {
            this.jenisObatKeluar = "Jenis Obat : obat mata ";
        }else{
        this.jenisObatKeluar = "Jenis Tidak Terdaftar ";
        }
    }

    public String getJenisObatKeluar() {
        return jenisObatKeluar;
    }

    public void setJumlahObatKeluar(String jumlahObatKeluar) {
        if(jumlahObatKeluar.equals("amoxicillin")){
            this.jumlahObatKeluar="Jumlah Obat : 5 ";
        }else if(jumlahObatKeluar.equals("metformin")){
            this.jumlahObatKeluar="Jumlah Obat : 5 ";
        }else {
            this.jumlahObatKeluar="Jumlah Obat : 0 ";
        }
    }

    public String getJumlahObatKeluar() {
        return jumlahObatKeluar;
    }

    public void setTanggalKeluar(String tanggalKeluar) {
        if(tanggalKeluar.equals("amoxicillin")){
            this.tanggalKeluar="Tanggal Keluar : 22-01-2023 ";
        }else if(tanggalKeluar.equals("metformin")){
            this.tanggalKeluar="Tanggal Keluar : 2-02-2023 ";
        }else {
            this.tanggalKeluar="Tanggal tidak tersedia! ";
        }
    }

    public String getTanggalKeluar() {
        return tanggalKeluar;
    }
    
    public String ObatKeluar(){
        return getIdObat()+getKodeObat()+getNamaObatKeluar()+getJenisObatKeluar()+getJumlahObatKeluar()+getTanggalKeluar();
    }
    
    public String ObatKeluar(String x, String y,String z, String a,String b,String c) {
        setIdObat(x);
        setKodeObat(y);
        setNamaObatKeluar(x);
        setJenisObatKeluar(a);
        setJumlahObatKeluar(b);
        setTanggalKeluar(c);
        return getIdObat()+getKodeObat()+getNamaObatKeluar()+getJenisObatKeluar()+getJumlahObatKeluar()+getTanggalKeluar();
    }
}