/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;

/**
 *
 * @author User
 */
public class pegawai {
    
    public String idPegawai;
    public String kodePegawai;
    public String namaPegawai;
    public String alamat;
    public String telpon;
    
    public pegawai(){}
    
    public pegawai(String x){
        setIdPegawai(x);
    }
    
    public pegawai(String x,String y){
        setIdPegawai(x);
        setKodePegawai(y);
    }
    
    public pegawai(String x,String y,String z){
        setIdPegawai(x);
        setKodePegawai(y);
        setNamaPegawai(z);
    }
    
    public pegawai(String x, String y,String z,String a){
        setIdPegawai(x);
        setKodePegawai(y);
        setNamaPegawai(z);
        setAlamat(a);
    }
    
    public pegawai(String x, String y,String z,String a,String b){
        setIdPegawai(x);
        setKodePegawai(y);
        setNamaPegawai(z);
        setAlamat(a);
        setTelpon(b);
    }
    
    public void setIdPegawai(String idPegawai){
        if(idPegawai.equals("Ahmad")) {
            this.idPegawai = "Id Pegawai : 1 ";
        }else if(idPegawai.equals("Daud")) {
            this.idPegawai = "Id Pegawai : 2 ";
        }else if(idPegawai.equals("Naufal")) {
            this.idPegawai = "Id Pegawai : 3 ";
        }else{
        this.idPegawai = "Pegawai Tidak Terdaftar ";
        }
    }
    
    public String getIdPegawai(){
        return idPegawai;
    }
    
    public void setKodePegawai(String kodePegawai){
        if(kodePegawai.equals("Ahmad")) {
            this.kodePegawai = "Kode Pegawai : 001 ";
        }else if(kodePegawai.equals("Daud")) {
            this.kodePegawai = "Kode Pegawai : 002 ";
        }else if(kodePegawai.equals("Naufal")) {
            this.kodePegawai = "Kode Pegawai : 003 ";
        }else{
        this.kodePegawai = "Kode Tidak Terdaftar ";
        }
    }
    
    public String getKodePegawai(){
        return kodePegawai;
    }
    
    public void setNamaPegawai(String namaPegawai){
        if(namaPegawai.equals("Ahmad")) {
            this.namaPegawai = "Nama : Ahmad ";
        }else if(namaPegawai.equals("Daud")) {
            this.namaPegawai = "Nama : Daud ";
        }else if(namaPegawai.equals("Naufal")) {
            this.namaPegawai = "Nama : Naufal ";
        }else{
        this.namaPegawai = "Pegawai Tidak Terdaftar ";
        }
    }
    
    public String getNamaPegawai(){
        return namaPegawai;
    }
    
    public void setAlamat(String alamat){
        if(alamat.equals("Ahmad")) {
            this.alamat = "Alamat : Jl.Ahmad Yani No.12 ";
        }else if(alamat.equals("Daud")) {
            this.alamat = "Alamat : Jl.Sungai Andai No.11 ";
        }else if(alamat.equals("Naufal")) {
            this.alamat = "Alamat : Jl.Sungai Miai No.9 ";
        }else{
        this.alamat = "Alamat Tidak Terdaftar ";
        }
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setTelpon(String telpon){
        if(telpon.equals("Ahmad")) {
            this.telpon = "Telpon : 08112308231";
        }else if(telpon.equals("Daud")) {
            this.telpon = "Telpon : 08111028249";
        }else if(telpon.equals("Naufal")) {
            this.telpon = "Telpon : 08118564388";
        }else{
        this.telpon = "Telpon Tidak Terdaftar ";
        }
    }
    
    public String getTelpon(){
        return telpon;
    }
    
    public String dataPegawai(){
        return getIdPegawai()+getKodePegawai()+getNamaPegawai()+getAlamat()+getTelpon();
    }
    
    public String dataPegawai(String x,String y,String z,String a,String b){
        setIdPegawai(x);
        setKodePegawai(y);
        setNamaPegawai(z);
        setAlamat(a);
        setTelpon(b);
        return getIdPegawai()+getKodePegawai()+getNamaPegawai()+getAlamat()+getTelpon();
    }
}